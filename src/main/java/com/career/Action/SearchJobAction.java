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
public class SearchJobAction extends ActionSupport implements SessionAware {

    private String userId;
    private String jobRole;
    private String jobLocation;
    Map session;
    private List<JobPostDTO> list = new ArrayList<JobPostDTO>();
    protected JobPostDTO jobPostDTO = new JobPostDTO();
    private JobPostBo jobPostBo;

    public SearchJobAction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");           
        jobPostBo = (JobPostBo)context.getBean("jobPostBoProxy");
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public List<JobPostDTO> getList() {
        return list;
    }

    public void setList(List<JobPostDTO> list) {
        this.list = list;
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

    public JobPostBo getJobPostBo() {
        return jobPostBo;
    }

    public void setJobPostBo(JobPostBo jobPostBo) {
        this.jobPostBo = jobPostBo;
    }

    public boolean isSessionAlive() {
        if (session.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String searchByJobRole() {
        if (isSessionAlive()) {
            userId = (String) session.get("userid");
            list = jobPostBo.searchByJobRole(jobRole);
            return "success";        
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }
    
    public String searchByLocation() {
        if (isSessionAlive()) {
            userId = (String) session.get("userid");
            list = jobPostBo.searchByLocation(jobLocation);
            return "success";        
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }
}
