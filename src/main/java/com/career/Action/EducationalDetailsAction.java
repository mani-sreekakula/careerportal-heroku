/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Action;

import com.career.Bo.EducationalDetailsBo;
import com.career.DTO.EducationalDetailsDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EducationalDetailsAction extends ActionSupport implements SessionAware {

    Map session;
    String pgdegree;
    String pgbranch;
    String pginstitute;
    String pguniversity;
    String pgstate;
    String pglocation;
    float pgaggregate;
    String pgyearofpass;
    String ugdegree;
    String ugbranch;
    String uginstitute;
    String uguniversity;
    String ugstate;
    String uglocation;
    float ugaggregate;
    String ugyearofpass;
    String tenthinstitute;
    String tenthuniversity;
    String tenthstate;
    String tenthlocation;
    float tenthaggregate;
    String tenthyearofpass;
    String intdegree;
    String intbranch;
    String intinstitute;
    String intuniversity;
    String intstate;
    String intlocation;
    float intaggregate;
    String intyearofpass;
    String userId;

    protected EducationalDetailsDTO educationalDetailsDTO = new EducationalDetailsDTO();
    EducationalDetailsBo educationalDetailsBo;

    public EducationalDetailsAction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");           
        educationalDetailsBo = (EducationalDetailsBo)context.getBean("educationalDetailsBoProxy");
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

    public String getIntyearofpass() {
        return intyearofpass;
    }

    public void setIntyearofpass(String intyearofpass) {
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

    public String getPgyearofpass() {
        return pgyearofpass;
    }

    public void setPgyearofpass(String pgyearofpass) {
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

    public String getTenthyearofpass() {
        return tenthyearofpass;
    }

    public void setTenthyearofpass(String tenthyearofpass) {
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

    public String getUgyearofpass() {
        return ugyearofpass;
    }

    public void setUgyearofpass(String ugyearofpass) {
        this.ugyearofpass = ugyearofpass;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public EducationalDetailsBo getEducationalDetailsBo() {
        return educationalDetailsBo;
    }

    public void setEducationalDetailsBo(EducationalDetailsBo educationalDetailsBo) {
        this.educationalDetailsBo = educationalDetailsBo;
    }

    public EducationalDetailsDTO getEducationalDetailsDTO() {
        return educationalDetailsDTO;
    }

    public void setEducationalDetailsDTO(EducationalDetailsDTO educationalDetailsDTO) {
        this.educationalDetailsDTO = educationalDetailsDTO;
    }

    public Map getSession() {
        return session;
    }

    public boolean isSessionAlive() {
        if (session.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void setSession(Map session) {
        this.session = session;
    }

    public String saveEducationalDetails() {

        if (isSessionAlive()) {
            
            userId = (String) session.get("userid");
            educationalDetailsDTO.setUserId(userId);
            educationalDetailsDTO.setPgdegree(pgdegree);
            educationalDetailsDTO.setPgbranch(pgbranch);
            educationalDetailsDTO.setPginstitute(pginstitute);
            educationalDetailsDTO.setPguniversity(pguniversity);
            educationalDetailsDTO.setPgstate(pgstate);
            educationalDetailsDTO.setPglocation(pglocation);
            educationalDetailsDTO.setPgaggregate(pgaggregate);
            educationalDetailsDTO.setPgyearofpass(pgyearofpass);
            
            educationalDetailsDTO.setUgdegree(ugdegree);
            educationalDetailsDTO.setUgbranch(ugbranch);
            educationalDetailsDTO.setUginstitute(uginstitute);
            educationalDetailsDTO.setUguniversity(uguniversity);
            educationalDetailsDTO.setUgstate(ugstate);
            educationalDetailsDTO.setUglocation(uglocation);
            educationalDetailsDTO.setUgaggregate(ugaggregate);
            educationalDetailsDTO.setUgyearofpass(ugyearofpass);
            
            educationalDetailsDTO.setIntdegree(intdegree);
            educationalDetailsDTO.setIntbranch(intbranch);
            educationalDetailsDTO.setIntinstitute(intinstitute);
            educationalDetailsDTO.setIntuniversity(intuniversity);
            educationalDetailsDTO.setIntstate(intstate);
            educationalDetailsDTO.setIntlocation(intlocation);
            educationalDetailsDTO.setIntaggregate(intaggregate);
            educationalDetailsDTO.setIntyearofpass(intyearofpass);
            
            educationalDetailsDTO.setTenthinstitute(tenthinstitute);
            educationalDetailsDTO.setTenthuniversity(tenthuniversity);
            educationalDetailsDTO.setTenthstate(tenthstate);
            educationalDetailsDTO.setTenthlocation(tenthlocation);
            educationalDetailsDTO.setTenthaggregate(tenthaggregate);
            educationalDetailsDTO.setTenthyearofpass(tenthyearofpass);
            
            educationalDetailsBo.saveEducationalDetails(educationalDetailsDTO);
            System.out.println("Insert Educational details" + userId);
            addActionMessage("Educational details saved successfully.");
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }
    
    
    public String retrieveEducationalDetails() {
        if (isSessionAlive()) {
            userId = (String) session.get("userid");
           
            educationalDetailsDTO = educationalDetailsBo.retrieveEducationalDetails(userId);
            pgdegree=educationalDetailsDTO.getPgdegree();
            pgbranch=educationalDetailsDTO.getPgbranch();
            pginstitute=educationalDetailsDTO.getPginstitute();
            pguniversity=educationalDetailsDTO.getPguniversity();
            pgstate=educationalDetailsDTO.getPgstate();
            pglocation=educationalDetailsDTO.getPglocation();
            pgaggregate=educationalDetailsDTO.getPgaggregate();
            pgyearofpass=educationalDetailsDTO.getPgyearofpass();
            
            ugdegree=educationalDetailsDTO.getUgdegree();
            ugbranch=educationalDetailsDTO.getUgbranch();
            uginstitute=educationalDetailsDTO.getUginstitute();
            uguniversity=educationalDetailsDTO.getUguniversity();
            ugstate=educationalDetailsDTO.getUgstate();
            uglocation=educationalDetailsDTO.getUglocation();
            ugaggregate=educationalDetailsDTO.getUgaggregate();
            ugyearofpass=educationalDetailsDTO.getUgyearofpass();
            
            intdegree=educationalDetailsDTO.getIntdegree();
            intbranch=educationalDetailsDTO.getIntbranch();
            intinstitute=educationalDetailsDTO.getIntinstitute();
            intuniversity=educationalDetailsDTO.getIntuniversity();
            intstate=educationalDetailsDTO.getIntstate();
            intlocation=educationalDetailsDTO.getIntlocation();
            intaggregate=educationalDetailsDTO.getIntaggregate();
            intyearofpass=educationalDetailsDTO.getIntyearofpass();
            
            tenthinstitute=educationalDetailsDTO.getTenthinstitute();
            tenthuniversity=educationalDetailsDTO.getTenthuniversity();
            tenthstate=educationalDetailsDTO.getTenthstate();
            tenthlocation=educationalDetailsDTO.getTenthlocation();
            tenthaggregate=educationalDetailsDTO.getTenthaggregate();
            tenthyearofpass=educationalDetailsDTO.getTenthyearofpass();
           
            System.out.println("Retrieved Educational details of the user :"+userId);
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }


    }

    
    
}
