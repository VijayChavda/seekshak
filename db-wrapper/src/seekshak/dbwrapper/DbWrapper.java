package seekshak.dbwrapper;

import java.lang.reflect.Field;
import java.sql.*;
import java.text.MessageFormat;
import java.util.*;
import java.util.logging.*;

public abstract class DbWrapper {

    private static Connection conn;

    public DbWrapper() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seekshak", "root", "sql");
        } catch (SQLException ex) {
            Logger.getLogger(DbWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void query(String sql) {
        try (Statement stmt = conn.createStatement()) {
            System.out.println("Executing: " + sql);
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DbWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public <T extends DbEntity> List<T> selectAll(Class<T> type, String... attrs) {
        return DbWrapper.this.selectWhere(type, "1=1", attrs);
    }

    public <T extends DbEntity> List<T> selectWhere(Class<T> type, String where, String... attrs) {
        ArrayList<T> entities = new ArrayList<>();

        try {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT ");
            if (attrs.length == 0)
                sb.append("*");
            else
                for (int i = 0; i < attrs.length; i++) {
                    sb.append(attrs[i]);
                    if (i != attrs.length - 1) sb.append(", ");
                }
            sb.append(" FROM ");
            sb.append(getTableName(type));
            sb.append(" WHERE ");
            sb.append(where);
            sb.append(";");

            String sql = sb.toString();
            System.out.println("Executing: " + sql);

            ArrayList<Field> fields = new ArrayList<>();
            for (String field : attrs) {
                fields.add(type.getField(field));
            }
            if (fields.isEmpty())
                fields.addAll(Arrays.asList(type.getFields()));

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                T newInstance = (T) type.newInstance();
                for (Field field : fields) {
                    field.set(newInstance, result.getObject(field.getName()));
                }
                entities.add(newInstance);
            }

        } catch (SQLException | InstantiationException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException ex) {
            Logger.getLogger(DbWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }

        return entities;
    }

    public <T extends DbEntity> void insert(T... entities) {
        for (T entity : entities) {
            String tname = getTableName(entity.getClass());
            Field[] fields = entity.getClass().getFields();

            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO ");
            sb.append(tname);

            sb.append("(");
            for (int i = 0; i < fields.length; i++) {
                sb.append(fields[i].getName());
                if (i != fields.length - 1) sb.append(", ");
            }
            sb.append(")");

            sb.append(" VALUES ");

            sb.append("(");
            for (int i = 0; i < fields.length; i++) {
                try {
                    sb.append("'");
                    sb.append(fields[i].get(entity));
                    sb.append("'");
                    if (i != fields.length - 1) sb.append(", ");
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(DbWrapper.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            sb.append(");");

            String sql = sb.toString();
            System.out.println("Executing: " + sql);

            query(sql);
        }
    }

    public <T extends DbEntity> void update(T... entities) {
        for (T entity : entities) {
            String tname = getTableName(entity.getClass());
            Field[] fields = entity.getClass().getFields();

            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append(tname);
            sb.append(" SET ");

            for (int i = 0; i < fields.length; i++) {
                try {
                    sb.append(fields[i].getName());
                    sb.append(" = ");
                    sb.append("'");
                    sb.append(fields[i].get(entity));
                    sb.append("'");
                    if (i != fields.length - 1) sb.append(", ");
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(DbWrapper.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            sb.append(" WHERE ");
            sb.append(entity);
            sb.append(";");

            String sql = sb.toString();
            System.out.println("Executing: " + sql);

            query(sql);
        }
    }

    public <T extends DbEntity> void delete(T... entities) {
        for (T entity : entities) {
            String tname = getTableName(entity.getClass());
            String sql = MessageFormat.format("DELETE FROM {0} WHERE {1};", tname, entity);
            query(sql);

        }
    }

    public abstract <T extends DbEntity> String getTableName(Class<T> type);

}
