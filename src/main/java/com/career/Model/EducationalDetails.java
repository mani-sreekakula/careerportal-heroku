/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Model;

import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author beenabasanthi
 */
@Entity
@Table(name = "EDU_DETAILS")
public class EducationalDetails extends ActionSupport implements Serializable{

    @Id
    @Column(name = "userId")
    String userId;
    @Column(name = "pgdegree")
    String pgdegree;
    @Column(name = "pgbranch")
    String pgbranch;
    @Column(name = "pginstitute")
    String pginstitute;
    @Column(name = "pguniversity")
    String pguniversity;
    @Column(name = "pgstate")
    String pgstate;
    @Column(name = "pglocation")
    String pglocation;
    @Column(name = "pgaggregate")
    float pgaggregate;
    @Column(name = "pgyearofpass")
    int pgyearofpass;
    @Column(name = "ugdegree")
    String ugdegree;
    @Column(name = "ugbranch")
    String ugbranch;
    @Column(name = "uginstitute")
    String uginstitute;
    @Column(name = "uguniversity")
    String uguniversity;
    @Column(name = "ugstate")
    String ugstate;
    @Column(name = "uglocation")
    String uglocation;
    @Column(name = "ugaggregate")
    float ugaggregate;
    @Column(name = "ugyearofpass")
    int ugyearofpass;
    @Column(name = "tenthinstitute")
    String tenthinstitute;
    @Column(name = "tenthuniversity")
    String tenthuniversity;
    @Column(name = "tenthstate")
    String tenthstate;
    @Column(name = "tenthlocation")
    String tenthlocation;
    @Column(name = "tenthaggregate")
    float tenthaggregate;
    @Column(name = "tenthyearofpass")
    int tenthyearofpass;
    @Column(name = "intdegree")
    String intdegree;
    @Column(name = "intbranch")
    String intbranch;
    @Column(name = "intinstitute")
    String intinstitute;
    @Column(name = "intuniversity")
    String intuniversity;
    @Column(name = "intstate")
    String intstate;
    @Column(name = "intlocation")
    String intlocation;
    @Column(name = "intaggregate")
    float intaggregate;
    @Column(name = "intyearofpass")
    int intyearofpass;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public float getIntaggregate() {
        return intaggregate;
    }

    public void setIntaggregate(float intaggregate) {
        this.intaggregate = intaggregate;
    }

    public String getIntbranch() {
        return intbranch;
    }

    public void setIntbranch(String intbranch) {
        this.intbranch = intbranch;
    }

    public String getIntdegree() {
        return intdegree;
    }

    public void setIntdegree(String intdegree) {
        this.intdegree = intdegree;
    }

    public String getIntinstitute() {
        return intinstitute;
    }

    public void setIntinstitute(String intinstitute) {
        this.intinstitute = intinstitute;
    }

    public String getIntlocation() {
        return intlocation;
    }

    public void setIntlocation(String intlocation) {
        this.intlocation = intlocation;
    }

    public String getIntstate() {
        return intstate;
    }

    public void setIntstate(String intstate) {
        this.intstate = intstate;
    }

    public String getIntuniversity() {
        return intuniversity;
    }

    public void setIntuniversity(String intuniversity) {
        this.intuniversity = intuniversity;
    }

    public int getIntyearofpass() {
        return intyearofpass;
    }

    public void setIntyearofpass(int intyearofpass) {
        this.intyearofpass = intyearofpass;
    }

    public float getPgaggregate() {
        return pgaggregate;
    }

    public void setPgaggregate(float pgaggregate) {
        this.pgaggregate = pgaggregate;
    }

    public String getPgbranch() {
        return pgbranch;
    }

    public void setPgbranch(String pgbranch) {
        this.pgbranch = pgbranch;
    }

    public String getPgdegree() {
        return pgdegree;
    }

    public void setPgdegree(String pgdegree) {
        this.pgdegree = pgdegree;
    }

    public String getPginstitute() {
        return pginstitute;
    }

    public void setPginstitute(String pginstitute) {
        this.pginstitute = pginstitute;
    }

    public String getPglocation() {
        return pglocation;
    }

    public void setPglocation(String pglocation) {
        this.pglocation = pglocation;
    }

    public String getPgstate() {
        return pgstate;
    }

    public void setPgstate(String pgstate) {
        this.pgstate = pgstate;
    }

    public String getPguniversity() {
        return pguniversity;
    }

    public void setPguniversity(String pguniversity) {
        this.pguniversity = pguniversity;
    }

    public int getPgyearofpass() {
        return pgyearofpass;
    }

    public void setPgyearofpass(int pgyearofpass) {
        this.pgyearofpass = pgyearofpass;
    }

    public float getTenthaggregate() {
        return tenthaggregate;
    }

    public void setTenthaggregate(float tenthaggregate) {
        this.tenthaggregate = tenthaggregate;
    }

    public String getTenthinstitute() {
        return tenthinstitute;
    }

    public void setTenthinstitute(String tenthinstitute) {
        this.tenthinstitute = tenthinstitute;
    }

    public String getTenthlocation() {
        return tenthlocation;
    }

    public void setTenthlocation(String tenthlocation) {
        this.tenthlocation = tenthlocation;
    }

    public String getTenthstate() {
        return tenthstate;
    }

    public void setTenthstate(String tenthstate) {
        this.tenthstate = tenthstate;
    }

    public String getTenthuniversity() {
        return tenthuniversity;
    }

    public void setTenthuniversity(String tenthuniversity) {
        this.tenthuniversity = tenthuniversity;
    }

    public int getTenthyearofpass() {
        return tenthyearofpass;
    }

    public void setTenthyearofpass(int tenthyearofpass) {
        this.tenthyearofpass = tenthyearofpass;
    }

    public float getUgaggregate() {
        return ugaggregate;
    }

    public void setUgaggregate(float ugaggregate) {
        this.ugaggregate = ugaggregate;
    }

    public String getUgbranch() {
        return ugbranch;
    }

    public void setUgbranch(String ugbranch) {
        this.ugbranch = ugbranch;
    }

    public String getUgdegree() {
        return ugdegree;
    }

    public void setUgdegree(String ugdegree) {
        this.ugdegree = ugdegree;
    }

    public String getUginstitute() {
        return uginstitute;
    }

    public void setUginstitute(String uginstitute) {
        this.uginstitute = uginstitute;
    }

    public String getUglocation() {
        return uglocation;
    }

    public void setUglocation(String uglocation) {
        this.uglocation = uglocation;
    }

    public String getUgstate() {
        return ugstate;
    }

    public void setUgstate(String ugstate) {
        this.ugstate = ugstate;
    }

    public String getUguniversity() {
        return uguniversity;
    }

    public void setUguniversity(String uguniversity) {
        this.uguniversity = uguniversity;
    }

    public int getUgyearofpass() {
        return ugyearofpass;
    }

    public void setUgyearofpass(int ugyearofpass) {
        this.ugyearofpass = ugyearofpass;
    }
}

