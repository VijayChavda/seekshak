package seekshak;

import java.util.List;
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

//        for (Admin a : db.selectAll(Admin.class)) System.out.println(a);
//
//        Admin admin = new Admin();
//        admin.setIdadmin(4);
//        admin.setPassword("secure");
//        admin.setUsername("anonymous");
//        db.insert(admin);
//
//        for (Admin a : db.selectAll(Admin.class)) System.out.println(a);
//
//        admin.password = "new-password-more-secure";
//        db.update(admin);
//
//        for (Admin a : db.selectAll(Admin.class)) System.out.println(a);
//
//        db.delete(admin);
//
//        for (Admin a : db.selectAll(Admin.class)) System.out.println(a);
        List<Research> x = db.selectAll(Research.class);
        for (Research research : x) {
            System.out.println(research);
        }

        Research r1 = db.selectWhere(Research.class, "idresearch=1").get(0);
        JobRequirement jr = db.selectWhere(JobRequirement.class, "idjob_requirement").get(0);
        int ans = lr(jr, r1);
        System.out.println(ans);
    }

    private static int lr(JobRequirement j, Research r) {
        double[] x = new double[7];
        double[] w = new double[7];

        w[0] = j.getW_tenth();
        w[1] = j.getW_twelve();
        w[2] = j.getW_graduation();
        w[3] = j.getW_postGrad();
        w[4] = j.getW_doctorate();
        w[5] = j.getW_experience();
        w[6] = r.getImpactFactor();

        x[0] = j.getTenth();
        x[1] = j.getTwelve();
        x[2] = j.getGraduation();
        x[3] = j.getPostGrad();
        x[4] = j.getDoctorate();
        x[5] = j.getExperience();
        x[6] = j.getResearch();

        int total = 0;
        for (int i = 0; i < 7; i++)
            total += w[i] * x[i];

        return total;
    }
}
