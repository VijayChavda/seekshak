package seekshak.dbwrapper.entities;

import seekshak.dbwrapper.DbEntity;

public class JobRequirement implements DbEntity {

    public Integer idjob_requirement;
    public Double tenth;
    public Double twelve;
    public Double graduation;
    public Double post_grad;
    public Double doctorate;
    public Double research;
    public Double experience;
    public Double age_limit;
    public String specialization;
    public String grad_branch;
    public Double w_tenth;
    public Double w_twelve;
    public Double w_graduation;
    public Double w_post_grad;
    public Double w_doctorate;
    public Double w_experience;

    public JobRequirement() {
    }

    public JobRequirement(Integer idjobRequirement) {
        this.idjob_requirement = idjobRequirement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdjobRequirement() != null ? getIdjobRequirement().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof JobRequirement)) {
            return false;
        }
        JobRequirement other = (JobRequirement) object;
        return !((this.idjob_requirement == null && other.idjob_requirement != null) || (this.idjob_requirement != null && !this.idjob_requirement.equals(other.idjob_requirement)));
    }

    @Override
    public String toString() {
        return String.format("idjobRequirement='%d'", getIdjobRequirement());
    }

    @Override
    public String getTableName() {
        return "job_requirement";
    }

    @Override
    public String getIdentifyingSQLClause() {
        return this.toString();
    }

    public Integer getIdjobRequirement() {
        return idjob_requirement;
    }

    public void setIdjobRequirement(Integer idjobRequirement) {
        this.idjob_requirement = idjobRequirement;
    }

    public Double getTenth() {
        return tenth;
    }

    public void setTenth(Double tenth) {
        this.tenth = tenth;
    }

    public Double getTwelve() {
        return twelve;
    }

    public void setTwelve(Double twelve) {
        this.twelve = twelve;
    }

    public Double getGraduation() {
        return graduation;
    }

    public void setGraduation(Double graduation) {
        this.graduation = graduation;
    }

    public Double getPostGrad() {
        return post_grad;
    }

    public void setPostGrad(Double postGrad) {
        this.post_grad = postGrad;
    }

    public Double getDoctorate() {
        return doctorate;
    }

    public void setDoctorate(Double doctorate) {
        this.doctorate = doctorate;
    }

    public Double getResearch() {
        return research;
    }

    public void setResearch(Double research) {
        this.research = research;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }

    public Double getAgeLimit() {
        return age_limit;
    }

    public void setAgeLimit(Double ageLimit) {
        this.age_limit = ageLimit;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGradBranch() {
        return grad_branch;
    }

    public void setGradBranch(String gradBranch) {
        this.grad_branch = gradBranch;
    }

    public Double getW_tenth() {
        return w_tenth;
    }

    public void setW_tenth(Double w_tenth) {
        this.w_tenth = w_tenth;
    }

    public Double getW_twelve() {
        return w_twelve;
    }

    public void setW_twelve(Double w_twelve) {
        this.w_twelve = w_twelve;
    }

    public Double getW_graduation() {
        return w_graduation;
    }

    public void setW_graduation(Double w_graduation) {
        this.w_graduation = w_graduation;
    }

    public Double getW_postGrad() {
        return w_post_grad;
    }

    public void setW_postGrad(Double w_postGrad) {
        this.w_post_grad = w_postGrad;
    }

    public Double getW_doctorate() {
        return w_doctorate;
    }

    public void setW_doctorate(Double w_doctorate) {
        this.w_doctorate = w_doctorate;
    }

    public Double getW_experience() {
        return w_experience;
    }

    public void setW_experience(Double w_experience) {
        this.w_experience = w_experience;
    }

}
