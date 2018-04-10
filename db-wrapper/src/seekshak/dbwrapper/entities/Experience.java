package seekshak.dbwrapper.entities;

import seekshak.dbwrapper.DbEntity;

public class Experience implements DbEntity {

    Integer idusername;
    Double salary;
    String designation;
    String institute;
    String jobDescription;

    public Experience() {
    }

    public Experience(Integer idusername) {
        this.idusername = idusername;
    }

    public Integer getIdusername() {
        return idusername;
    }

    public void setIdusername(Integer idusername) {
        this.idusername = idusername;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusername != null ? idusername.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Experience)) {
            return false;
        }
        Experience other = (Experience) object;
        return !((this.idusername == null && other.idusername != null) || (this.idusername != null && !this.idusername.equals(other.idusername)));
    }

    @Override
    public String toString() {
        return String.format("idusername='%d'", idusername);
    }

    @Override
    public String getTableName() {
        return "experience";
    }

    @Override
    public String getIdentifyingSQLClause() {
        return this.toString();
    }

}
