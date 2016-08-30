package com.career.Model;

import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skills_and_achievements")
public class Skills extends ActionSupport implements Serializable {

    @Column(name = "Cprogramming")
    int Cprogramming;
    @Column(name = "Cpp")
    int Cpp;
    @Column(name = "Java")
    int Java;
    @Column(name = "Unix")
    int Unix;
    @Column(name = "HTML")
    int HTML;
    @Column(name = "XML")
    int XML;
    @Column(name = "DataBases")
    int DataBases;
    @Column(name = "SoftwareEngineering")
    int SoftwareEngineering;
    @Column(name = "TestingMethodologies")
    int TestingMethodologies;
    @Column(name = "Hardwareconcepts")
    int Hardwareconcepts;
    @Column(name = "Networking")
    int Networking;
    @Column(name = "experience_or_fresher")
    String experience_or_fresher;
    @Column(name = "experience_in_years")
    int experience_in_years;
    @Column(name = "experience_in_months")
    int experience_in_months;
    @Column(name = "academic_achievements")
    String academic_achievements;
    @Column(name = "cocurricular_achievements")
    String cocurricular_achievements;
    @Id
    @Column(name = "userId")
    String userId;
    @Column(name = "orgname")
    String orgname;
    @Column(name = "indname")
    String indname;
    @Column(name = "jobrole1")
    String jobrole1;
    @Column(name = "cursal")
    String cursal;
    @Column(name = "expsal")
    String expsal;
    @Column(name = "uploadFileFileName")
    String uploadFileFileName;

    public int getCpp() {
        return Cpp;
    }

    public void setCpp(int Cpp) {
        this.Cpp = Cpp;
    }

    public int getCprogramming() {
        return Cprogramming;
    }

    public void setCprogramming(int Cprogramming) {
        this.Cprogramming = Cprogramming;
    }

    public int getDataBases() {
        return DataBases;
    }

    public void setDataBases(int DataBases) {
        this.DataBases = DataBases;
    }

    public int getHTML() {
        return HTML;
    }

    public void setHTML(int HTML) {
        this.HTML = HTML;
    }

    public int getHardwareconcepts() {
        return Hardwareconcepts;
    }

    public void setHardwareconcepts(int Hardwareconcepts) {
        this.Hardwareconcepts = Hardwareconcepts;
    }

    public int getNetworking() {
        return Networking;
    }

    public void setNetworking(int Networking) {
        this.Networking = Networking;
    }

    public int getSoftwareEngineering() {
        return SoftwareEngineering;
    }

    public void setSoftwareEngineering(int SoftwareEngineering) {
        this.SoftwareEngineering = SoftwareEngineering;
    }

    public int getTestingMethodologies() {
        return TestingMethodologies;
    }

    public void setTestingMethodologies(int TestingMethodologies) {
        this.TestingMethodologies = TestingMethodologies;
    }

    public int getUnix() {
        return Unix;
    }

    public int getJava() {
        return Java;
    }

    public void setJava(int Java) {
        this.Java = Java;
    }

    public String getJobrole1() {
        return jobrole1;
    }

    public void setJobrole1(String jobrole1) {
        this.jobrole1 = jobrole1;
    }

    public void setUnix(int Unix) {
        this.Unix = Unix;
    }

    public int getXML() {
        return XML;
    }

    public void setXML(int XML) {
        this.XML = XML;
    }

    public String getAcademic_achievements() {
        return academic_achievements;
    }

    public void setAcademic_achievements(String academic_achievements) {
        this.academic_achievements = academic_achievements;
    }

    public String getCocurricular_achievements() {
        return cocurricular_achievements;
    }

    public void setCocurricular_achievements(String cocurricular_achievements) {
        this.cocurricular_achievements = cocurricular_achievements;
    }

    public String getCursal() {
        return cursal;
    }

    public void setCursal(String cursal) {
        this.cursal = cursal;
    }

    public int getExperience_in_months() {
        return experience_in_months;
    }

    public void setExperience_in_months(int experience_in_months) {
        this.experience_in_months = experience_in_months;
    }

    public int getExperience_in_years() {
        return experience_in_years;
    }

    public void setExperience_in_years(int experience_in_years) {
        this.experience_in_years = experience_in_years;
    }

    public String getExperience_or_fresher() {
        return experience_or_fresher;
    }

    public void setExperience_or_fresher(String experience_or_fresher) {
        this.experience_or_fresher = experience_or_fresher;
    }

    public String getExpsal() {
        return expsal;
    }

    public void setExpsal(String expsal) {
        this.expsal = expsal;
    }

    public String getIndname() {
        return indname;
    }

    public void setIndname(String indname) {
        this.indname = indname;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getUploadFileFileName() {
        return uploadFileFileName;
    }

    public void setUploadFileFileName(String uploadFileFileName) {
        this.uploadFileFileName = uploadFileFileName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
