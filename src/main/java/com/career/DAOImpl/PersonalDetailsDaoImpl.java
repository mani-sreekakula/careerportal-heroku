/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAOImpl;

import com.career.DAO.PersonalDetailsDao;

import com.career.Model.PersonalDetails;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author avinashkumar
 */
public class PersonalDetailsDaoImpl extends HibernateDaoSupport implements PersonalDetailsDao {

    @Override
    public void insertPersonalDetails(PersonalDetails personals) {
       getHibernateTemplate().saveOrUpdate(personals);
    }

   

    @Override
    public PersonalDetails fetchPersonalDetails(String userId) {
        PersonalDetails personals=(PersonalDetails)getHibernateTemplate().get(PersonalDetails.class,userId);
        return personals;
    }

    
    
}
