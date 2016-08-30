/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.BoImpl;

import com.career.Bo.SkillsBo;
import com.career.DAO.SkillsDAO;
import com.career.DTO.SkillsDTO;
import com.career.Model.Skills;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manikanta
 */
public class SkillsBoImpl implements SkillsBo {

    private SkillsDAO skillsDAO;

    public void setSkillsDAO(SkillsDAO skillsDAO) {
        this.skillsDAO = skillsDAO;
    }

    @Override
    public SkillsDTO getSkillsDetails(String userId) {

        SkillsDTO skillsDTO = new SkillsDTO();
        Skills skills;
        skills = skillsDAO.getSkillsDetails(userId);
        if(skills != null){
        skillsDTO.setUserId(skills.getUserId());
        skillsDTO.setCprogramming(skills.getCprogramming());
        skillsDTO.setCpp(skills.getCpp());
        skillsDTO.setJava(skills.getJava());
        skillsDTO.setUnix(skills.getUnix());
        skillsDTO.setHTML(skills.getHTML());
        skillsDTO.setXML(skills.getXML());
        skillsDTO.setDataBases(skills.getDataBases());
        skillsDTO.setSoftwareEngineering(skills.getSoftwareEngineering());
        skillsDTO.setTestingMethodologies(skills.getTestingMethodologies());
        skillsDTO.setHardwareconcepts(skills.getHardwareconcepts());
        skillsDTO.setNetworking(skills.getNetworking());
        skillsDTO.setExperience_or_fresher(skills.getExperience_or_fresher());
        skillsDTO.setExperience_in_years(Integer.toString(skills.getExperience_in_years()));
        skillsDTO.setOrgname(skills.getOrgname());
        skillsDTO.setIndname(skills.getIndname());
        skillsDTO.setJobrole1(skills.getJobrole1());
        skillsDTO.setCursal(skills.getCursal());
        skillsDTO.setExpsal(skills.getExpsal());
        skillsDTO.setExperience_in_months(Integer.toString(skills.getExperience_in_months()));
        skillsDTO.setAcademic_achievements(skills.getAcademic_achievements());
        skillsDTO.setCocurricular_achievements(skills.getCocurricular_achievements());
        skillsDTO.setUploadFileFileName(skills.getUploadFileFileName());}
        return skillsDTO;
    }

    @Override
    public void insertSkillsDetails(SkillsDTO skillsDTO) {

        Skills skills = new Skills();
        skills.setUserId(skillsDTO.getUserId());
        skills.setCprogramming(skillsDTO.getCprogramming());
        skills.setCpp(skillsDTO.getCpp());
        skills.setJava(skillsDTO.getJava());
        skills.setUnix(skillsDTO.getUnix());
        skills.setHTML(skillsDTO.getHTML());
        skills.setXML(skillsDTO.getXML());
        skills.setDataBases(skillsDTO.getDataBases());
        skills.setSoftwareEngineering(skillsDTO.getSoftwareEngineering());
        skills.setTestingMethodologies(skillsDTO.getTestingMethodologies());
        skills.setHardwareconcepts(skillsDTO.getHardwareconcepts());
        skills.setNetworking(skillsDTO.getNetworking());
        skills.setExperience_or_fresher(skillsDTO.getExperience_or_fresher());
        if (skillsDTO.getExperience_in_years() != null) {
            skills.setExperience_in_years(Integer.parseInt(skillsDTO.getExperience_in_years()));
        }
        if (skillsDTO.getExperience_in_months() != null) {
            skills.setExperience_in_months(Integer.parseInt(skillsDTO.getExperience_in_months()));
        }
        skills.setOrgname(skillsDTO.getOrgname());
        skills.setIndname(skillsDTO.getIndname());
        skills.setJobrole1(skillsDTO.getJobrole1());
        skills.setCursal(skillsDTO.getCursal());
        skills.setExpsal(skillsDTO.getExpsal());
        skills.setAcademic_achievements(skillsDTO.getAcademic_achievements());
        skills.setCocurricular_achievements(skillsDTO.getCocurricular_achievements());
        skills.setUploadFileFileName(skillsDTO.getUploadFileFileName());
        skillsDAO.insertSkillsDetails(skills);
    }

    @Override
    public List<SkillsDTO> getexpSkillsDetails(String experience_or_fresher) {
        List<SkillsDTO> list1 = new ArrayList<SkillsDTO>();
        List<Skills> details = new ArrayList<Skills>();
        details = skillsDAO.getexpSkillsDetails(experience_or_fresher);
        for (int i = 0; i < details.size(); i++) {
            Skills skills = details.get(i);
            SkillsDTO skillsDTO = new SkillsDTO();
            skillsDTO.setUserId(skills.getUserId());
            skillsDTO.setCprogramming(skills.getCprogramming());
            skillsDTO.setCpp(skills.getCpp());
            skillsDTO.setJava(skills.getJava());
            skillsDTO.setUnix(skills.getUnix());
            skillsDTO.setHTML(skills.getHTML());
            skillsDTO.setXML(skills.getXML());
            skillsDTO.setDataBases(skills.getDataBases());
            skillsDTO.setSoftwareEngineering(skills.getSoftwareEngineering());
            skillsDTO.setTestingMethodologies(skills.getTestingMethodologies());
            skillsDTO.setHardwareconcepts(skills.getHardwareconcepts());
            skillsDTO.setNetworking(skills.getNetworking());
            skillsDTO.setExperience_or_fresher(skills.getExperience_or_fresher());
            skillsDTO.setExperience_in_years(Integer.toString(skills.getExperience_in_years()));
            skillsDTO.setOrgname(skills.getOrgname());
            skillsDTO.setIndname(skills.getIndname());
            skillsDTO.setJobrole1(skills.getJobrole1());
            skillsDTO.setCursal(skills.getCursal());
            skillsDTO.setExpsal(skills.getExpsal());
            skillsDTO.setExperience_in_months(Integer.toString(skills.getExperience_in_months()));
            skillsDTO.setAcademic_achievements(skills.getAcademic_achievements());
            skillsDTO.setCocurricular_achievements(skills.getCocurricular_achievements());
            skillsDTO.setUploadFileFileName(skills.getUploadFileFileName());
            list1.add(skillsDTO);
        }
        return list1;
    }
}
