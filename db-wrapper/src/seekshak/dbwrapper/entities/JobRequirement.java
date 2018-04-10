package seekshak.dbwrapper.entities;

import seekshak.dbwrapper.DbEntity;

public class JobRequirement implements DbEntity {

    private Integer idjobRequirement;
    private Integer tenth;
    private Integer twelve;
    private Integer graduation;
    private Integer postGrad;
    private Integer doctorate;
    private Integer research;
    private Integer experience;
    private Integer ageLimit;
    private String specialization;
    private String gradBranch;

    public JobRequirement() {
    }

    public JobRequirement(Integer idjobRequirement) {
        this.idjobRequirement = idjobRequirement;
    }

    public Integer getIdjobRequirement() {
        return idjobRequirement;
    }

    public void setIdjobRequirement(Integer idjobRequirement) {
        this.idjobRequirement = idjobRequirement;
    }

    public Integer getTenth() {
        return tenth;
    }

    public void setTenth(Integer tenth) {
        this.tenth = tenth;
    }

    public Integer getTwelve() {
        return twelve;
    }

    public void setTwelve(Integer twelve) {
        this.twelve = twelve;
    }

    public Integer getGraduation() {
        return graduation;
    }

    public void setGraduation(Integer graduation) {
        this.graduation = graduation;
    }

    public Integer getPostGrad() {
        return postGrad;
    }

    public void setPostGrad(Integer postGrad) {
        this.postGrad = postGrad;
    }

    public Integer getDoctorate() {
        return doctorate;
    }

    public void setDoctorate(Integer doctorate) {
        this.doctorate = doctorate;
    }

    public Integer getResearch() {
        return research;
    }

    public void setResearch(Integer research) {
        this.research = research;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGradBranch() {
        return gradBranch;
    }

    public void setGradBranch(String gradBranch) {
        this.gradBranch = gradBranch;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjobRequirement != null ? idjobRequirement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof JobRequirement)) {
            return false;
        }
        JobRequirement other = (JobRequirement) object;
        return !((this.idjobRequirement == null && other.idjobRequirement != null) || (this.idjobRequirement != null && !this.idjobRequirement.equals(other.idjobRequirement)));
    }

    @Override
    public String toString() {
        return String.format("idjobRequirement='%d'", idjobRequirement);
    }

    @Override
    public String getTableName() {
        return "job_requirement";
    }

    @Override
    public String getIdentifyingSQLClause() {
        return this.toString();
    }

}
