/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Bo;

import com.career.DTO.ApplyJobDTO;
import java.util.List;

public interface ApplyJobBo {

    public boolean insert(ApplyJobDTO applyJobDTO);
    
    public List<ApplyJobDTO> fetchjobrole(String JobRole);

    public ApplyJobDTO fetchalluserdetails(String id1);

}
