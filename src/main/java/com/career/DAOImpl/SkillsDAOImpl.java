/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAOImpl;

import com.career.DAO.SkillsDAO;
import com.career.Model.Skills;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author manikanta
 */
public class SkillsDAOImpl extends HibernateDaoSupport implements SkillsDAO {

    @Override
    public Skills getSkillsDetails(String userId) {
        Skills skills = (Skills) getHibernateTemplate().get(Skills.class, userId);
        return skills;
    }

    @Override
    public void insertSkillsDetails(Skills skills) {
        getHibernateTemplate().saveOrUpdate(skills);
    }
    
     @Override
    public List<Skills> getexpSkillsDetails(String experience_or_fresher) {
        List<Skills> skills = (List<Skills>) getHibernateTemplate().find("from Skills s where s.experience_or_fresher='"+experience_or_fresher+"'");
        return skills;
    }

}
