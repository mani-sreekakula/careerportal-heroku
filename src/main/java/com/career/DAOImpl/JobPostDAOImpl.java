/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAOImpl;

import com.career.DAO.JobPostDAO;
import com.career.Model.JobPost;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author manikanta
 */
public class JobPostDAOImpl extends HibernateDaoSupport implements JobPostDAO {

    @Override
    public void insertJobPost(JobPost jobpost) {
        getHibernateTemplate().saveOrUpdate(jobpost);
    }

    @Override
    public void deleteJobPost(String jobId) {
        JobPost jobpost = (JobPost) getHibernateTemplate().get(JobPost.class, jobId);
        getHibernateTemplate().delete(jobpost);
    }

    @Override
    public List<JobPost> fetchJobs() {
        List<JobPost> jobposts = (List<JobPost>) getHibernateTemplate().find("from JobPost");
        return jobposts;
    }

    @Override
    public JobPost fetchJob(String jobId) {
       return getHibernateTemplate().get(JobPost.class, jobId);
    }

    @Override
    public List<JobPost> searchByJobRole(String jobRole) {
        List<JobPost> jobposts = (List<JobPost>) getHibernateTemplate().find("from JobPost j where j.jobRole='"+jobRole+"'" );
        return jobposts;
    }

    @Override
    public List<JobPost> searchByLocation(String jobLocation) {
        List<JobPost> jobposts = (List<JobPost>) getHibernateTemplate().find("from JobPost j where j.jobLocation='"+jobLocation+"'" );
        return jobposts;
    }

    @Override
    public String getJobRole(String jobid) {
        JobPost jobpost = getHibernateTemplate().get(JobPost.class, jobid);
        return jobpost.getJobRole();
    }
}
