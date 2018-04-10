package seekshak.dbwrapper.entities;

import seekshak.dbwrapper.DbEntity;

public class Jobs implements DbEntity {

    private Integer idjobs;
    private String jobtitle;
    private String jobdescription;
    private String requiredqualification;
    private String selectioncriteria;
    private String joblocation;
    private String salary;
    private String lastdate;
    private String postedby;
    private String postedbyid;
    private String active;
    private String jobRequirement;

    public Jobs() {
    }

    public Jobs(Integer idjobs) {
        this.idjobs = idjobs;
    }

    public Integer getIdjobs() {
        return idjobs;
    }

    public void setIdjobs(Integer idjobs) {
        this.idjobs = idjobs;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public String getRequiredqualification() {
        return requiredqualification;
    }

    public void setRequiredqualification(String requiredqualification) {
        this.requiredqualification = requiredqualification;
    }

    public String getSelectioncriteria() {
        return selectioncriteria;
    }

    public void setSelectioncriteria(String selectioncriteria) {
        this.selectioncriteria = selectioncriteria;
    }

    public String getJoblocation() {
        return joblocation;
    }

    public void setJoblocation(String joblocation) {
        this.joblocation = joblocation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLastdate() {
        return lastdate;
    }

    public void setLastdate(String lastdate) {
        this.lastdate = lastdate;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }

    public String getPostedbyid() {
        return postedbyid;
    }

    public void setPostedbyid(String postedbyid) {
        this.postedbyid = postedbyid;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getJobRequirement() {
        return jobRequirement;
    }

    public void setJobRequirement(String jobRequirement) {
        this.jobRequirement = jobRequirement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjobs != null ? idjobs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Jobs)) {
            return false;
        }
        Jobs other = (Jobs) object;
        return !((this.idjobs == null && other.idjobs != null) || (this.idjobs != null && !this.idjobs.equals(other.idjobs)));
    }

    @Override
    public String toString() {
        return String.format("idjobs='%d'", idjobs);
    }

    @Override
    public String getTableName() {
        return "jobs";
    }

    @Override
    public String getIdentifyingSQLClause() {
        return this.toString();
    }

}
