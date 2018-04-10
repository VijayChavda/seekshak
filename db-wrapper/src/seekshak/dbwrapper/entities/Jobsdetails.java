package seekshak.dbwrapper.entities;

import seekshak.dbwrapper.DbEntity;

public class Jobsdetails implements DbEntity {

    private Integer idjobs;
    private String affiliateduniversity;
    private int idinstitute;
    private String institutecategory;
    private String institutename;
    private String institutetype;
    private String institutewebsite;
    private String jobdescription;
    private String joblocation;
    private String jobtitle;
    private String lastdate;
    private String location;
    private String postedby;
    private String ranking;
    private String requiredqualification;
    private String salary;
    private String selectioncriteria;

    public Jobsdetails() {
    }

    public Jobsdetails(Integer idjobs) {
        this.idjobs = idjobs;
    }

    public Jobsdetails(Integer idjobs, String affiliateduniversity, int idinstitute, String institutecategory, String institutename, String institutetype, String institutewebsite, String jobdescription, String joblocation, String jobtitle, String lastdate, String location, String postedby, String ranking, String requiredqualification, String salary, String selectioncriteria) {
        this.idjobs = idjobs;
        this.affiliateduniversity = affiliateduniversity;
        this.idinstitute = idinstitute;
        this.institutecategory = institutecategory;
        this.institutename = institutename;
        this.institutetype = institutetype;
        this.institutewebsite = institutewebsite;
        this.jobdescription = jobdescription;
        this.joblocation = joblocation;
        this.jobtitle = jobtitle;
        this.lastdate = lastdate;
        this.location = location;
        this.postedby = postedby;
        this.ranking = ranking;
        this.requiredqualification = requiredqualification;
        this.salary = salary;
        this.selectioncriteria = selectioncriteria;
    }

    public Integer getIdjobs() {
        return idjobs;
    }

    public void setIdjobs(Integer idjobs) {
        this.idjobs = idjobs;
    }

    public String getAffiliateduniversity() {
        return affiliateduniversity;
    }

    public void setAffiliateduniversity(String affiliateduniversity) {
        this.affiliateduniversity = affiliateduniversity;
    }

    public int getIdinstitute() {
        return idinstitute;
    }

    public void setIdinstitute(int idinstitute) {
        this.idinstitute = idinstitute;
    }

    public String getInstitutecategory() {
        return institutecategory;
    }

    public void setInstitutecategory(String institutecategory) {
        this.institutecategory = institutecategory;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getInstitutetype() {
        return institutetype;
    }

    public void setInstitutetype(String institutetype) {
        this.institutetype = institutetype;
    }

    public String getInstitutewebsite() {
        return institutewebsite;
    }

    public void setInstitutewebsite(String institutewebsite) {
        this.institutewebsite = institutewebsite;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public String getJoblocation() {
        return joblocation;
    }

    public void setJoblocation(String joblocation) {
        this.joblocation = joblocation;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getLastdate() {
        return lastdate;
    }

    public void setLastdate(String lastdate) {
        this.lastdate = lastdate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getRequiredqualification() {
        return requiredqualification;
    }

    public void setRequiredqualification(String requiredqualification) {
        this.requiredqualification = requiredqualification;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSelectioncriteria() {
        return selectioncriteria;
    }

    public void setSelectioncriteria(String selectioncriteria) {
        this.selectioncriteria = selectioncriteria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjobs != null ? idjobs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Jobsdetails)) {
            return false;
        }
        Jobsdetails other = (Jobsdetails) object;
        return !((this.idjobs == null && other.idjobs != null) || (this.idjobs != null && !this.idjobs.equals(other.idjobs)));
    }

    @Override
    public String toString() {
        return String.format("idjobs='%d'", idjobs);
    }

    @Override
    public String getTableName() {
        return "jobsdetails";
    }

    @Override
    public String getIdentifyingSQLClause() {
        return this.toString();
    }

}
