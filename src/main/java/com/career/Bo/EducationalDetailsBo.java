/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Bo;
import com.career.DTO.EducationalDetailsDTO;

public interface EducationalDetailsBo {
    
     public EducationalDetailsDTO retrieveEducationalDetails(String userId);
     
     public void saveEducationalDetails(EducationalDetailsDTO educationalDetailsDTO);
     
     
  
}
