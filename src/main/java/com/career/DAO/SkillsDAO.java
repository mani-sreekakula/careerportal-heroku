/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAO;

import com.career.Model.Skills;
import java.util.List;

/**
 *
 * @author manikanta
 */
public interface SkillsDAO {

    public Skills getSkillsDetails(String userId);

    public void insertSkillsDetails(Skills skills);
    
    public List<Skills> getexpSkillsDetails(String experience_or_fresher);

}
