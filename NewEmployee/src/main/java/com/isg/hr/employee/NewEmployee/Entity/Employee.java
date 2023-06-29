package com.isg.hr.employee.NewEmployee.Entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    String empcode;
    
    int postingid;
    String onsiteothercountry;
    String onsiteothercountrydesc;
    String probation;
    String status;
    String role;
    int reportingto;
    int designationid;
    int division;
    int bandid;
    String createdby;
    Date createddate;
    String modifiedby;
    Date modifieddate;




    
    public Employee() {
    }
    public Employee(String empCode, int postingid, String onsiteothercountry, String onsiteothercountrydesc,
            String probation, String status, String role, int reportingto, int designationid, int division, int bandid,
            String createdby, Date createddate, String modifiedby, Date modifieddate) {
        this.empcode = empCode;
        this.postingid = postingid;
        this.onsiteothercountry = onsiteothercountry;
        this.onsiteothercountrydesc = onsiteothercountrydesc;
        this.probation = probation;
        this.status = status;
        this.role = role;
        this.reportingto = reportingto;
        this.designationid = designationid;
        this.division = division;
        this.bandid = bandid;
        this.createdby = createdby;
        this.createddate = createddate;
        this.modifiedby = modifiedby;
        this.modifieddate = modifieddate;
    }
    public String getEmpCode() {
        return empcode;
    }
    public int getPostingid() {
        return postingid;
    }
    public String getOnsiteothercountry() {
        return onsiteothercountry;
    }
    public String getOnsiteothercountrydesc() {
        return onsiteothercountrydesc;
    }
    public String getProbation() {
        return probation;
    }
    public String getStatus() {
        return status;
    }
    public String getRole() {
        return role;
    }
    public int getReportingto() {
        return reportingto;
    }
    public int getDesignationid() {
        return designationid;
    }
    public int getDivision() {
        return division;
    }
    public int getBandid() {
        return bandid;
    }
    public String getCreatedby() {
        return createdby;
    }
    public Date getCreateddate() {
        return createddate;
    }
    public String getModifiedby() {
        return modifiedby;
    }
    public Date getModifieddate() {
        return modifieddate;
    }
    public void setEmpCode(String empCode) {
        this.empcode = empCode;
    }
    public void setPostingid(int postingid) {
        this.postingid = postingid;
    }
    public void setOnsiteothercountry(String onsiteothercountry) {
        this.onsiteothercountry = onsiteothercountry;
    }
    public void setOnsiteothercountrydesc(String onsiteothercountrydesc) {
        this.onsiteothercountrydesc = onsiteothercountrydesc;
    }
    public void setProbation(String probation) {
        this.probation = probation;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setReportingto(int reportingto) {
        this.reportingto = reportingto;
    }
    public void setDesignationid(int designationid) {
        this.designationid = designationid;
    }
    public void setDivision(int division) {
        this.division = division;
    }
    public void setBandid(int bandid) {
        this.bandid = bandid;
    }
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }
    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }
    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }
    @Override
    public String toString() {
        return "Employee [empCode=" + empcode + ", postingid=" + postingid + ", onsiteothercountry="
                + onsiteothercountry + ", onsiteothercountrydesc=" + onsiteothercountrydesc + ", probation=" + probation
                + ", status=" + status + ", role=" + role + ", reportingto=" + reportingto + ", designationid="
                + designationid + ", division=" + division + ", bandid=" + bandid + ", createdby=" + createdby
                + ", createddate=" + createddate + ", modifiedby=" + modifiedby + ", modifieddate=" + modifieddate
                + "]";
    }

}
