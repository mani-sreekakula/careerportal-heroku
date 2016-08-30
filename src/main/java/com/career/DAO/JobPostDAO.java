/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAO;

import com.career.Model.JobPost;
import java.util.List;

/**
 *
 * @author manikanta
 */
public interface JobPostDAO {

    public void insertJobPost(JobPost jobpost);

    public void deleteJobPost(String jobId);
    
    public List<JobPost> fetchJobs();
    
    public JobPost fetchJob(String jobId);

    public List<JobPost> searchByJobRole(String jobRole);

    public List<JobPost> searchByLocation(String jobLocation);

    public String getJobRole(String jobid);
}
