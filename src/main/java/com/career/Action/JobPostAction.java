/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Action;

import com.career.Bo.JobPostBo;
import com.career.DTO.JobPostDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author manikanta
 */
public class JobPostAction extends ActionSupport implements SessionAware {

    private String jobPostDate;
    private String jobField;
    private String jobType;
    private String jobRole;
    private String Qualification;
    private String experience;
    private String yearOfPassing;
    private String jobDescription;
    private String salaryPay;
    private String Location;
    private String noOfVacancies;
    private String skill;
    private String contact;
    private String jobid;
    private String userId;
    Map session;
    JobPostDTO innerlist = null;
    List<JobPostDTO> list1 = new ArrayList<JobPostDTO>();
    protected JobPostDTO jobPostDTO = new JobPostDTO();
    private JobPostBo jobPostBo;

    public JobPostDTO getInnerlist() {
        return innerlist;
    }

    public void setInnerlist(JobPostDTO innerlist) {
        this.innerlist = innerlist;
    }

    public JobPostAction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");           
        jobPostBo = (JobPostBo)context.getBean("jobPostBoProxy");
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobField() {
        return jobField;
    }

    public void setJobField(String jobField) {
        this.jobField = jobField;
    }

    public String getJobPostDate() {
        return jobPostDate;
    }

    public void setJobPostDate(String jobPostDate) {
        this.jobPostDate = jobPostDate;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getNoOfVacancies() {
        return noOfVacancies;
    }

    public void setNoOfVacancies(String noOfVacancies) {
        this.noOfVacancies = noOfVacancies;
    }

    public String getSalaryPay() {
        return salaryPay;
    }

    public void setSalaryPay(String salaryPay) {
        this.salaryPay = salaryPay;
    }

    public Map getSession() {
        return session;
    }

    @Override
    public void setSession(Map session) {
        this.session = session;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(String yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public JobPostBo getJobPostBo() {
        return jobPostBo;
    }

    public void setJobPostBo(JobPostBo jobPostBo) {
        this.jobPostBo = jobPostBo;
    }

    public List<JobPostDTO> getList1() {
        return list1;
    }

    public void setList1(List<JobPostDTO> list1) {
        this.list1 = list1;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isSessionAlive() {
        if (session.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String insertJobPost() {
        if (isSessionAlive()) {

            jobPostDTO.setJobPostDate(jobPostDate);
            jobPostDTO.setJobField(jobField);
            jobPostDTO.setJobType(jobType);
            jobPostDTO.setJobRole(jobRole);
            jobPostDTO.setEducationQualification(Qualification);
            jobPostDTO.setExperience(experience);
            jobPostDTO.setYearOfPassing(yearOfPassing);
            jobPostDTO.setJobDescription(jobDescription);
            jobPostDTO.setSalaryPay(salaryPay);
            jobPostDTO.setJobLocation(Location);
            jobPostDTO.setNoOfVacancies(noOfVacancies);
            jobPostDTO.setSkills(skill);
            jobPostDTO.setContactno(contact);
            jobPostDTO.setJobid(jobid);
            System.out.println("get jobid" + jobPostDTO.getJobid());

            jobPostBo.insertJobPost(jobPostDTO);
            System.out.println("Job Posted Successfully");
            addActionMessage("Job Posted Successfully");
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }

    public String deleteJob() {
        if (isSessionAlive()) {

            jobPostBo.deleteJobPost(jobid);
            System.out.println("Job Deleted Successfully");
            addActionMessage("Job Deleted Successfully");
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }

    public String UpdateJob() {
        if (isSessionAlive()) {

            jobPostDTO.setJobPostDate(jobPostDate);
            jobPostDTO.setJobField(jobField);
            jobPostDTO.setJobType(jobType);
            jobPostDTO.setJobRole(jobRole);
            jobPostDTO.setEducationQualification(Qualification);
            jobPostDTO.setExperience(experience);
            jobPostDTO.setYearOfPassing(yearOfPassing);
            jobPostDTO.setJobDescription(jobDescription);
            jobPostDTO.setSalaryPay(salaryPay);
            jobPostDTO.setJobLocation(Location);
            jobPostDTO.setNoOfVacancies(noOfVacancies);
            jobPostDTO.setSkills(skill);
            jobPostDTO.setContactno(contact);
            jobPostDTO.setJobid(jobid);
            System.out.println("get jobid" + jobPostDTO.getJobid());

            jobPostBo.insertJobPost(jobPostDTO);
            System.out.println("Job Updated Successfully");
            addActionMessage("Job Updated Successfully");
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }

    public String fetchJobs() {
        if (isSessionAlive()) {
            userId = (String) session.get("userid");
            list1 = jobPostBo.fetchJobs();
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }

    public String fetchJob() {
        if (isSessionAlive()) {
            userId = (String) session.get("userid");
            innerlist = jobPostBo.fetchJob(jobid);
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
        
    }
}
