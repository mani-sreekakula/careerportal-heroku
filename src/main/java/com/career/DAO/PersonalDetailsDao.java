/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAO;


import com.career.Model.PersonalDetails;

/**
 *
 * @author avinashkumar
 */
public interface PersonalDetailsDao {
    
     public void insertPersonalDetails(PersonalDetails personals);
     public PersonalDetails fetchPersonalDetails(String userId);
  
    
}
