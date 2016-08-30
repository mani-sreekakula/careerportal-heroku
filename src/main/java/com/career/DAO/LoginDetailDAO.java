/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DAO;

import com.career.Model.UserLog;
import java.util.List;

/**
 *
 * @author alokkumar
 */
public interface LoginDetailDAO {

    public UserLog retriveFromulogin(String username, String upassword);

    public UserLog retriveChangePassword(String userId);

    public void updatechangePassword(UserLog userLog);

    public String getMail(String userId);

    public boolean insertNewUser(UserLog userLog);

    public List<UserLog> fetchalluserdetails();
}
