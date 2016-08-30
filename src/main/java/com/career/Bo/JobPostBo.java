/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Bo;

import com.career.DTO.JobPostDTO;
import java.util.List;

/**
 *
 * @author manikanta
 */
public interface JobPostBo {

    public void insertJobPost(JobPostDTO jobPostDTO);

    public void deleteJobPost(String jobId);

    public List<JobPostDTO> fetchJobs();
    
    public JobPostDTO fetchJob(String jobId);
    
    public List<JobPostDTO> searchByJobRole(String jobRole);

    public List<JobPostDTO> searchByLocation(String jobLocation);

    public String getJobRole(String jobid);
}
