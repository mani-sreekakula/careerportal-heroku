/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAO;

import com.career.Model.JobRoles;
import java.util.List;

/**
 *
 * @author BeenaBasanthi
 */
public interface ApplyJobDAO {

    public boolean insert(JobRoles applyJob);

    public List<JobRoles> fetchjobrole(String JobRole);

    public JobRoles fetchalluserdetails(String id1);
}
