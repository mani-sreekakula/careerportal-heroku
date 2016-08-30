/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.BoImpl;

import com.career.Bo.LoginDetailBo;
import com.career.DAO.LoginDetailDAO;
import com.career.DTO.UserLoginDTO;
import com.career.Model.UserLog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alokkumar
 */
public class LoginDetailBoImpl implements LoginDetailBo {

    LoginDetailDAO loginDetailDao;

    public LoginDetailDAO getLoginDetailDao() {
        return loginDetailDao;
    }

    public void setLoginDetailDao(LoginDetailDAO loginDetailDao) {
        this.loginDetailDao = loginDetailDao;
    }

    @Override
    public UserLoginDTO retriveFromulogin(String username, String userpassword) {
        
        UserLog userlog = loginDetailDao.retriveFromulogin(username, userpassword);
        if (userlog != null) {
            UserLoginDTO userLoginDTO = new UserLoginDTO();
            userLoginDTO.setUsername(userlog.getUsername());
            userLoginDTO.setUserpassword(userlog.getUserpassword());
            userLoginDTO.setVerify(userlog.getVerify());
            userLoginDTO.setId1(userlog.getId1());
            return userLoginDTO;
        } else {
            return null;
        }
    }

    @Override
    public UserLoginDTO retrivechangePassword(String userId) {

        UserLoginDTO userLoginDTO = new UserLoginDTO();
        UserLog userLog;
        userLog = loginDetailDao.retriveChangePassword(userId);
        userLoginDTO.setUsername(userLog.getUsername());
        userLoginDTO.setUserpassword(userLog.getUserpassword());
        userLoginDTO.setVerify(userLog.getVerify());
        userLoginDTO.setId1(userLog.getId1());
        return userLoginDTO;
    }

    @Override
    public void updatechangePassword(UserLoginDTO userLoginDTO) {
        UserLog userLog = new UserLog();
        userLog.setUsername(userLoginDTO.getUsername());
        userLog.setUserpassword(userLoginDTO.getUserpassword());
        userLog.setVerify(userLoginDTO.getVerify());
        userLog.setId1(userLoginDTO.getId1());
        loginDetailDao.updatechangePassword(userLog);
    }

    @Override
    public String getMail(String userId) {        
        return loginDetailDao.getMail(userId);
    }

    @Override
    public boolean insertNewUser(UserLoginDTO userLoginDTO) {
        UserLog userLog = new UserLog();
        userLog.setUsername(userLoginDTO.getUsername());
        userLog.setUserpassword(userLoginDTO.getUserpassword());
        userLog.setVerify(userLoginDTO.getVerify());
        userLog.setId1(userLoginDTO.getId1());
        return loginDetailDao.insertNewUser(userLog);
    }
    
    @Override
    public List<UserLoginDTO> fetchalluserdetails() {
         List<UserLoginDTO> userLogdto =new ArrayList<UserLoginDTO>();
         List<UserLog> details= new ArrayList<UserLog>();
        details=loginDetailDao.fetchalluserdetails();
        for(int i=0; i<details.size(); i++){
        UserLog userlog=details.get(i);
        UserLoginDTO userlogdto=new UserLoginDTO();
        userlogdto.setId1(userlog.getId1());
        userlogdto.setUsername(userlog.getUsername());
        userlogdto.setUserpassword(userlog.getUserpassword());
        userlogdto.setVerify(userlog.getVerify());
        userLogdto.add(userlogdto);
        }
        return userLogdto;
    }

}
