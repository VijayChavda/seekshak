package seekshak.dbwrapper.entities;

import seekshak.dbwrapper.DbEntity;

public class Institute implements DbEntity {

    private Integer idinstitute;
    private String institutename;
    private String institutecategory;
    private String institutewebsite;
    private String affiliateduniversity;
    private String ranking;
    private String institutetype;
    private String active;
    private String city;
    private String state;
    private String address;
    private String contactno;
    private String email;
    private String password;
    private String location;

    public Institute() {
    }

    public Institute(Integer idinstitute) {
        this.idinstitute = idinstitute;
    }

    public Institute(Integer idinstitute, String location) {
        this.idinstitute = idinstitute;
        this.location = location;
    }

    public Integer getIdinstitute() {
        return idinstitute;
    }

    public void setIdinstitute(Integer idinstitute) {
        this.idinstitute = idinstitute;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getInstitutecategory() {
        return institutecategory;
    }

    public void setInstitutecategory(String institutecategory) {
        this.institutecategory = institutecategory;
    }

    public String getInstitutewebsite() {
        return institutewebsite;
    }

    public void setInstitutewebsite(String institutewebsite) {
        this.institutewebsite = institutewebsite;
    }

    public String getAffiliateduniversity() {
        return affiliateduniversity;
    }

    public void setAffiliateduniversity(String affiliateduniversity) {
        this.affiliateduniversity = affiliateduniversity;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getInstitutetype() {
        return institutetype;
    }

    public void setInstitutetype(String institutetype) {
        this.institutetype = institutetype;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinstitute != null ? idinstitute.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Institute)) {
            return false;
        }
        Institute other = (Institute) object;
        return !((this.idinstitute == null && other.idinstitute != null) || (this.idinstitute != null && !this.idinstitute.equals(other.idinstitute)));
    }

    @Override
    public String toString() {
        return String.format("idinstitute='%d'", idinstitute);
    }

    @Override
    public String getTableName() {
        return "institute";
    }

    @Override
    public String getIdentifyingSQLClause() {
        return this.toString();
    }

}
