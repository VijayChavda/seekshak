package seekshak.dbwrapper.entities;

import seekshak.dbwrapper.DbEntity;

public class Userinfo implements DbEntity {

    private Integer iduserinfo;
    private String username;
    private String password;
    private String fullname;
    private String emailid;
    private String mobileno;
    private String location;
    private String tagline;
    private String qualification;
    private String dob;
    private String experience;
    private String researchPaperId;

    public Userinfo() {
    }

    public Userinfo(Integer iduserinfo) {
        this.iduserinfo = iduserinfo;
    }

    public Integer getIduserinfo() {
        return iduserinfo;
    }

    public void setIduserinfo(Integer iduserinfo) {
        this.iduserinfo = iduserinfo;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getResearchPaperId() {
        return researchPaperId;
    }

    public void setResearchPaperId(String researchPaperId) {
        this.researchPaperId = researchPaperId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduserinfo != null ? iduserinfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Userinfo)) {
            return false;
        }
        Userinfo other = (Userinfo) object;
        return !((this.iduserinfo == null && other.iduserinfo != null) || (this.iduserinfo != null && !this.iduserinfo.equals(other.iduserinfo)));
    }

    @Override
    public String toString() {
        return String.format("iduserinfo='%d'", iduserinfo);
    }

    @Override
    public String getTableName() {
        return "userinfo";
    }

    @Override
    public String getIdentifyingSQLClause() {
        return this.toString();
    }

}
