/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAO;
import com.career.Model.EducationalDetails;

/**
 *
 * @author beenabasanthi
 */
public interface EducationalDetailsDAO {
 
     public EducationalDetails retrieveEducationalDetails(String userId);
    
     
     public void saveEducationalDetails(EducationalDetails educationalDetails);
     
}
