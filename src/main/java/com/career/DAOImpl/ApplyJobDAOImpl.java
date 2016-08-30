/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAOImpl;

import com.career.DAO.ApplyJobDAO;
import com.career.Model.JobRoles;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author BeenaBasanthi
 */
public class ApplyJobDAOImpl extends HibernateDaoSupport implements ApplyJobDAO {

    @Override
    public boolean insert(JobRoles applyJob) {
        if (getHibernateTemplate().contains(applyJob)) {
            return false;
        } else {
            getHibernateTemplate().save(applyJob);
            return true;
        }
    }

    @Override
    public List<JobRoles> fetchjobrole(String JobRole) {
        List<JobRoles> jobRoles = (List<JobRoles>) getHibernateTemplate().find("from JobRoles j where j.jobname='" + JobRole+"'");
        return jobRoles;
    }

    @Override
    public JobRoles fetchalluserdetails(String id1) {
        List<JobRoles> jobRoles = new ArrayList<JobRoles>();
        jobRoles = (List<JobRoles>) getHibernateTemplate().find("from JobRoles j where j.empid='" + id1 + "'");
        if (jobRoles.isEmpty()) {
            return null;
        } else {
            return jobRoles.get(0);
        }
    }
}
