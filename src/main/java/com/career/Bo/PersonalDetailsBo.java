/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Bo;

import com.career.DTO.PersonalDetailsDto;


/**
 *
 * @author avinash kumar
 */
public interface PersonalDetailsBo {
   
    public void insertPersonalDetails(PersonalDetailsDto personal);
    public PersonalDetailsDto  fetchPersonalDetails(String userId);
    
    
}
