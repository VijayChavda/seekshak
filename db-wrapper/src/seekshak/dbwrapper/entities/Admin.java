package seekshak.dbwrapper.entities;

import seekshak.dbwrapper.DbEntity;

public class Admin implements DbEntity {

    public Integer idadmin;
    public String username;
    public String password;

    public Admin() {
    }

    public Admin(Integer idadmin) {
        this.idadmin = idadmin;
    }

    public Integer getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(Integer idadmin) {
        this.idadmin = idadmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idadmin != null ? idadmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        return !((this.idadmin == null && other.idadmin != null) || (this.idadmin != null && !this.idadmin.equals(other.idadmin)));
    }

    @Override
    public String toString() {
        return String.format("idadmin='%d'", idadmin);
    }

    @Override
    public String getTableName() {
        return "admin";
    }

    @Override
    public String getIdentifyingSQLClause() {
        return this.toString();
    }

}
