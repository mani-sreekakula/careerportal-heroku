/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.BoImpl;

import com.career.Bo.JobPostBo;
import com.career.DAO.JobPostDAO;
import com.career.DTO.JobPostDTO;
import com.career.Model.JobPost;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manikanta
 */
public class JobPostBoImpl implements JobPostBo {

    private JobPostDAO jobPostDAO;

    public void setJobPostDAO(JobPostDAO jobPostDAO) {
        this.jobPostDAO = jobPostDAO;
    }

    @Override
    public void insertJobPost(JobPostDTO jobPostDTO) {
        JobPost jobpost = new JobPost();
        jobpost.setJobPostDate(jobPostDTO.getJobPostDate());
        jobpost.setJobField(jobPostDTO.getJobField());
        jobpost.setJobType(jobPostDTO.getJobType());
        jobpost.setJobRole(jobPostDTO.getJobRole());
        jobpost.setEducationQualification(jobPostDTO.getEducationQualification());
        jobpost.setExperience(jobPostDTO.getExperience());
        jobpost.setYearOfPassing(jobPostDTO.getYearOfPassing());
        jobpost.setJobDescription(jobPostDTO.getJobDescription());
        jobpost.setSalaryPay(jobPostDTO.getSalaryPay());
        jobpost.setJobLocation(jobPostDTO.getJobLocation());
        jobpost.setNoOfVacancies(jobPostDTO.getNoOfVacancies());
        jobpost.setSkills(jobPostDTO.getSkills());
        jobpost.setContactno(jobPostDTO.getContactno());
        jobpost.setJobid(jobPostDTO.getJobid());

        jobPostDAO.insertJobPost(jobpost);
    }

    @Override
    public void deleteJobPost(String jobId) {
        jobPostDAO.deleteJobPost(jobId);
    }

    @Override
    public List<JobPostDTO> fetchJobs() {

        List<JobPostDTO> list1 = new ArrayList<JobPostDTO>();
        List<JobPost> jobposts = new ArrayList<JobPost>();
        jobposts = jobPostDAO.fetchJobs();
        for (int i = 0; i < jobposts.size(); i++) {
            JobPost jobpost = jobposts.get(i);
            JobPostDTO jobPostDTO = new JobPostDTO();
            jobPostDTO.setJobPostDate(jobpost.getJobPostDate());
            jobPostDTO.setJobField(jobpost.getJobField());
            jobPostDTO.setJobType(jobpost.getJobType());
            jobPostDTO.setJobRole(jobpost.getJobRole());
            jobPostDTO.setEducationQualification(jobpost.getEducationQualification());
            jobPostDTO.setExperience(jobpost.getExperience());
            jobPostDTO.setYearOfPassing(jobpost.getYearOfPassing());
            jobPostDTO.setJobDescription(jobpost.getJobDescription());
            jobPostDTO.setSalaryPay(jobpost.getSalaryPay());
            jobPostDTO.setJobLocation(jobpost.getJobLocation());
            jobPostDTO.setNoOfVacancies(jobpost.getNoOfVacancies());
            jobPostDTO.setSkills(jobpost.getSkills());
            jobPostDTO.setContactno(jobpost.getContactno());
            jobPostDTO.setJobid(jobpost.getJobid());
            System.out.println("JOB ID:"+jobpost.getJobid());
            list1.add(jobPostDTO);
        }
        return list1;
    }

    @Override
    public JobPostDTO fetchJob(String jobId) {

        JobPostDTO jobPostDTO = new JobPostDTO();
        JobPost jobpost = jobPostDAO.fetchJob(jobId);
        jobPostDTO.setJobPostDate(jobpost.getJobPostDate());
        jobPostDTO.setJobField(jobpost.getJobField());
        jobPostDTO.setJobType(jobpost.getJobType());
        jobPostDTO.setJobRole(jobpost.getJobRole());
        jobPostDTO.setEducationQualification(jobpost.getEducationQualification());
        jobPostDTO.setExperience(jobpost.getExperience());
        jobPostDTO.setYearOfPassing(jobpost.getYearOfPassing());
        jobPostDTO.setJobDescription(jobpost.getJobDescription());
        jobPostDTO.setSalaryPay(jobpost.getSalaryPay());
        jobPostDTO.setJobLocation(jobpost.getJobLocation());
        jobPostDTO.setNoOfVacancies(jobpost.getNoOfVacancies());
        jobPostDTO.setSkills(jobpost.getSkills());
        jobPostDTO.setContactno(jobpost.getContactno());
        jobPostDTO.setJobid(jobpost.getJobid());
        return jobPostDTO;
    }

    @Override
    public List<JobPostDTO> searchByJobRole(String jobRole) {

        List<JobPostDTO> list1 = new ArrayList<JobPostDTO>();
        List<JobPost> jobposts = new ArrayList<JobPost>();
        jobposts = jobPostDAO.searchByJobRole(jobRole);
        for (int i = 0; i < jobposts.size(); i++) {
            JobPost jobpost = jobposts.get(i);
            JobPostDTO jobPostDTO = new JobPostDTO();
            jobPostDTO.setJobPostDate(jobpost.getJobPostDate());
            jobPostDTO.setJobField(jobpost.getJobField());
            jobPostDTO.setJobType(jobpost.getJobType());
            jobPostDTO.setJobRole(jobpost.getJobRole());
            jobPostDTO.setEducationQualification(jobpost.getEducationQualification());
            jobPostDTO.setExperience(jobpost.getExperience());
            jobPostDTO.setYearOfPassing(jobpost.getYearOfPassing());
            jobPostDTO.setJobDescription(jobpost.getJobDescription());
            jobPostDTO.setSalaryPay(jobpost.getSalaryPay());
            jobPostDTO.setJobLocation(jobpost.getJobLocation());
            jobPostDTO.setNoOfVacancies(jobpost.getNoOfVacancies());
            jobPostDTO.setSkills(jobpost.getSkills());
            jobPostDTO.setContactno(jobpost.getContactno());
            jobPostDTO.setJobid(jobpost.getJobid());
            list1.add(jobPostDTO);
        }
        return list1;
    }

    @Override
    public List<JobPostDTO> searchByLocation(String jobLocation) {

        List<JobPostDTO> list1 = new ArrayList<JobPostDTO>();
        List<JobPost> jobposts = new ArrayList<JobPost>();
        jobposts = jobPostDAO.searchByLocation(jobLocation);
        for (int i = 0; i < jobposts.size(); i++) {
            JobPost jobpost = jobposts.get(i);
            JobPostDTO jobPostDTO = new JobPostDTO();
            jobPostDTO.setJobPostDate(jobpost.getJobPostDate());
            jobPostDTO.setJobField(jobpost.getJobField());
            jobPostDTO.setJobType(jobpost.getJobType());
            jobPostDTO.setJobRole(jobpost.getJobRole());
            jobPostDTO.setEducationQualification(jobpost.getEducationQualification());
            jobPostDTO.setExperience(jobpost.getExperience());
            jobPostDTO.setYearOfPassing(jobpost.getYearOfPassing());
            jobPostDTO.setJobDescription(jobpost.getJobDescription());
            jobPostDTO.setSalaryPay(jobpost.getSalaryPay());
            jobPostDTO.setJobLocation(jobpost.getJobLocation());
            jobPostDTO.setNoOfVacancies(jobpost.getNoOfVacancies());
            jobPostDTO.setSkills(jobpost.getSkills());
            jobPostDTO.setContactno(jobpost.getContactno());
            jobPostDTO.setJobid(jobpost.getJobid());
            list1.add(jobPostDTO);
        }
        return list1;
    }

    @Override
    public String getJobRole(String jobid) {
       return jobPostDAO.getJobRole(jobid);
    }
}
