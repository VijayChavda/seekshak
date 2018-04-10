package seekshak;

import seekshak.dbwrapper.DbEntity;
import seekshak.dbwrapper.DbWrapper;
import seekshak.dbwrapper.entities.Admin;
import seekshak.dbwrapper.entities.Experience;
import seekshak.dbwrapper.entities.Institute;
import seekshak.dbwrapper.entities.JobRequirement;
import seekshak.dbwrapper.entities.Jobs;
import seekshak.dbwrapper.entities.Jobsdetails;
import seekshak.dbwrapper.entities.Research;
import seekshak.dbwrapper.entities.Userinfo;

/**
 *
 * @author Vijay
 */
public class Main {

    public static void main(String[] args) {
        DbWrapper db = new DbWrapper() {
            @Override
            public <T extends DbEntity> String getTableName(Class<T> type) {

                if (type.equals(Admin.class)) return "admin";
                if (type.equals(Experience.class)) return "experience";
                if (type.equals(Institute.class)) return "institute";
                if (type.equals(JobRequirement.class)) return "job_requirement";
                if (type.equals(Jobs.class)) return "jobs";
                if (type.equals(Jobsdetails.class)) return "jobsdetails";
                if (type.equals(Research.class)) return "research";
                if (type.equals(Userinfo.class)) return "userinfo";

                throw new UnsupportedOperationException();
            }

        };

        for (Admin a : db.selectAll(Admin.class)) System.out.println(a);

        Admin admin = new Admin();
        admin.setIdadmin(4);
        admin.setPassword("secure");
        admin.setUsername("anonymous");
        db.insert(admin);

        for (Admin a : db.selectAll(Admin.class)) System.out.println(a);

        admin.password = "new-password-more-secure";
        db.update(admin);

        for (Admin a : db.selectAll(Admin.class)) System.out.println(a);

        db.delete(admin);

        for (Admin a : db.selectAll(Admin.class)) System.out.println(a);

    }
}
