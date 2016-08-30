/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAOImpl;

import com.career.DAO.EducationalDetailsDAO;
import com.career.Model.EducationalDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 *
 * @author beenabasanthi
 */
public class EducationalDetailsDAOImpl extends HibernateDaoSupport implements EducationalDetailsDAO {

  
    @Override
    public void saveEducationalDetails(EducationalDetails educationalDetails ) {
       getHibernateTemplate().saveOrUpdate(educationalDetails);
    }

   

    @Override
    public EducationalDetails retrieveEducationalDetails(String userId) {
        EducationalDetails educationalDetails=(EducationalDetails)getHibernateTemplate().get(EducationalDetails.class,userId);
        return educationalDetails;
    }

 
}
