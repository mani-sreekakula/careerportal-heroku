/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DTO;

/**
 *
 * @author BeenaBasanthi
 */
public class ApplyJobDTO {
    private String jobid;
    private String jobrole;
    private String userId;
    private String mailid;

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getJobrole() {
        return jobrole;
    }

    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
}
