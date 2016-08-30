/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Bo;

import com.career.DTO.SkillsDTO;
import java.util.List;

/**
 *
 * @author manikanta
 */
public interface SkillsBo {

    public SkillsDTO getSkillsDetails(String userId);

    public void insertSkillsDetails(SkillsDTO skillsDTO);

    public List<SkillsDTO> getexpSkillsDetails(String experience_or_fresher);
}
