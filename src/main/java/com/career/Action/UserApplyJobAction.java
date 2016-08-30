/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Action;

import com.career.Bo.ApplyJobBo;
import com.career.Bo.EducationalDetailsBo;
import com.career.Bo.JobPostBo;
import com.career.Bo.LoginDetailBo;
import com.career.Bo.PersonalDetailsBo;
import com.career.Bo.SkillsBo;
import com.career.DTO.ApplyJobDTO;
import com.career.mail.Emailer;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author beenabasanthi
 */
public class UserApplyJobAction extends ActionSupport implements SessionAware {

    String jobid;
    String userId;
    Map session;
    protected ApplyJobDTO applyJobDTO = new ApplyJobDTO();
    private ApplyJobBo applyJobBo;
    private EducationalDetailsBo educationalDetailsBo;
    private PersonalDetailsBo personalDetailsBo;
    private SkillsBo skillsBo;
    private JobPostBo jobPostBo;
    LoginDetailBo loginDetailBo;

    public UserApplyJobAction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        personalDetailsBo = (PersonalDetailsBo) context.getBean("personalDetailsBoProxy");
        educationalDetailsBo = (EducationalDetailsBo) context.getBean("educationalDetailsBoProxy");
        skillsBo = (SkillsBo) context.getBean("skillsBoProxy");
        jobPostBo = (JobPostBo) context.getBean("jobPostBoProxy");
        loginDetailBo = (LoginDetailBo) context.getBean("loginDetailBoProxy");
        applyJobBo = (ApplyJobBo) context.getBean("ApplyJobBoProxy");
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public Map getSession() {
        return session;
    }

    @Override
    public void setSession(Map session) {
        this.session = session;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApplyJobBo getApplyJobBo() {
        return applyJobBo;
    }

    public void setApplyJobBo(ApplyJobBo applyJobBo) {
        this.applyJobBo = applyJobBo;
    }

    public EducationalDetailsBo getEducationalDetailsBo() {
        return educationalDetailsBo;
    }

    public void setEducationalDetailsBo(EducationalDetailsBo educationalDetailsBo) {
        this.educationalDetailsBo = educationalDetailsBo;
    }

    public JobPostBo getJobPostBo() {
        return jobPostBo;
    }

    public void setJobPostBo(JobPostBo jobPostBo) {
        this.jobPostBo = jobPostBo;
    }

    public LoginDetailBo getLoginDetailBo() {
        return loginDetailBo;
    }

    public void setLoginDetailBo(LoginDetailBo loginDetailBo) {
        this.loginDetailBo = loginDetailBo;
    }

    public PersonalDetailsBo getPersonalDetailsBo() {
        return personalDetailsBo;
    }

    public void setPersonalDetailsBo(PersonalDetailsBo personalDetailsBo) {
        this.personalDetailsBo = personalDetailsBo;
    }

    public SkillsBo getSkillsBo() {
        return skillsBo;
    }

    public void setSkillsBo(SkillsBo skillsBo) {
        this.skillsBo = skillsBo;
    }

    public boolean isSessionAlive() {
        if (session.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String execute() {
        if (isSessionAlive()) {
            
            userId = (String) session.get("userid");
            String mail = loginDetailBo.getMail(userId);
            System.out.println("mail Id:" + mail);
            String jobrole = jobPostBo.getJobRole(jobid);
            System.out.println("Job role from db:" + jobrole);
            if (personalDetailsBo.fetchPersonalDetails(userId) != null) {
                if (educationalDetailsBo.retrieveEducationalDetails(userId) != null) {
                    if (skillsBo.getSkillsDetails(userId) != null) {
                        applyJobDTO.setJobrole(jobrole);
                        applyJobDTO.setJobid(jobid);
                        applyJobDTO.setUserId(userId);
                        if (applyJobBo.insert(applyJobDTO)) {
                            System.out.println("Inserted Successfully");
                            Emailer.sendmailwhileapply(mail, jobrole);
                        } else {
                            addActionError("You have already applied for this job");
                        }
                    } else {
                        addActionError("Please fill your Skills and Achievements details before applying any job.");
                    }
                } else {
                    addActionError("Please fil your Educational details before applying any job.");
                }
            } else {
                addActionError("Please fill your Personal details before applying any job.");
            }
        } else {
            addActionError("session expired");
            return "ERROR";
        }
        return "success";
    }
}
