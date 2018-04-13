package seekshak.dbwrapper.entities;

import seekshak.dbwrapper.DbEntity;

public class Research implements DbEntity {

    public Integer idresearch;
    public String title;
    public String paper_type;
    public String issn;
    public Double impact_factor;
    public String year;
    public String volume;
    public String pageno;

    public Research() {
    }

    public Research(Integer idresearch) {
        this.idresearch = idresearch;
    }

    public Integer getIdresearch() {
        return idresearch;
    }

    public void setIdresearch(Integer idresearch) {
        this.idresearch = idresearch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPaperType() {
        return paper_type;
    }

    public void setPaperType(String paperType) {
        this.paper_type = paperType;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public Double getImpactFactor() {
        return impact_factor;
    }

    public void setImpactFactor(Double impactFactor) {
        this.impact_factor = impactFactor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPageno() {
        return pageno;
    }

    public void setPageno(String pageno) {
        this.pageno = pageno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresearch != null ? idresearch.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Research)) {
            return false;
        }
        Research other = (Research) object;
        return !((this.idresearch == null && other.idresearch != null) || (this.idresearch != null && !this.idresearch.equals(other.idresearch)));
    }

    @Override
    public String toString() {
        return String.format("idresearch='%d'", idresearch);
    }

    @Override
    public String getTableName() {
        return "research";
    }

    @Override
    public String getIdentifyingSQLClause() {
        return this.toString();
    }

}
