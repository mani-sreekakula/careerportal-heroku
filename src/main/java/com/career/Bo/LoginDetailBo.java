/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Bo;

import com.career.DTO.UserLoginDTO;
import java.util.List;

/**
 *
 * @author alokkumar
 */
public interface LoginDetailBo {

    public UserLoginDTO retriveFromulogin(String username, String upassword);

    public UserLoginDTO retrivechangePassword(String userId);

    public void updatechangePassword(UserLoginDTO userLoginDTO);

    public String getMail(String userId);

    public boolean insertNewUser(UserLoginDTO userLoginDTO);

    public List<UserLoginDTO> fetchalluserdetails();
}
