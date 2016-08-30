/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.BoImpl;

import com.career.Bo.ApplyJobBo;
import com.career.DAO.ApplyJobDAO;
import com.career.DTO.ApplyJobDTO;
import com.career.Model.JobRoles;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BeenaBasanthi
 */
public class ApplyJobBoImpl implements ApplyJobBo {

    ApplyJobDAO applyJobDAO;

    public void setApplyJobDAO(ApplyJobDAO applyJobDAO) {
        this.applyJobDAO = applyJobDAO;
    }

    @Override
    public boolean insert(ApplyJobDTO applyJobDTO) {
        JobRoles applyjob = new JobRoles();
        applyjob.setEmpid(applyJobDTO.getUserId());
        applyjob.setJobid(applyJobDTO.getJobid());
        applyjob.setJobname(applyJobDTO.getJobrole());
        return applyJobDAO.insert(applyjob);
    }

    @Override
    public List<ApplyJobDTO> fetchjobrole(String JobRole) {

        List<ApplyJobDTO> list1 = new ArrayList<ApplyJobDTO>();
        List<JobRoles> details = new ArrayList<JobRoles>();
        details = applyJobDAO.fetchjobrole(JobRole);
        for (int i = 0; i < details.size(); i++) {
            JobRoles jobRoles = details.get(i);
            ApplyJobDTO applyJobdto = new ApplyJobDTO();

            applyJobdto.setJobid(jobRoles.getJobid());
            applyJobdto.setJobrole(jobRoles.getJobname());
            applyJobdto.setUserId(jobRoles.getEmpid());
            list1.add(applyJobdto);
        }
        return list1;
    }
    
    @Override
    public ApplyJobDTO fetchalluserdetails(String id1) {
        JobRoles jobRoles= applyJobDAO.fetchalluserdetails(id1);
        ApplyJobDTO applyJobdto=new  ApplyJobDTO();
        if(jobRoles != null){
        applyJobdto.setJobid(jobRoles.getJobid());
       applyJobdto.setJobrole(jobRoles.getJobname());
       applyJobdto.setUserId(jobRoles.getEmpid());}
       return applyJobdto;
    }

}
