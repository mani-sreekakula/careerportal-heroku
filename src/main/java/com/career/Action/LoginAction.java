/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Action;

import com.career.Bo.LoginDetailBo;
import com.career.DTO.UserLoginDTO;
import com.career.mail.Emailer;
import com.career.security.Encrypt;
import com.opensymphony.xwork2.ActionSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author alok kumar
 */
public class LoginAction extends ActionSupport implements SessionAware {

    private String userpassword;
    private String username;
    private String userType;
    private String newid;
    private String verify;
    private String oldpassword;
    private String newpassword;
    private String confirmpassword;
    private String userId;
    Map session;
    LoginDetailBo loginDetailBo;
    protected UserLoginDTO userLoginDTO = new UserLoginDTO();

    public LoginAction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        loginDetailBo = (LoginDetailBo) context.getBean("loginDetailBoProxy");
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public LoginDetailBo getLoginDetailBo() {
        return loginDetailBo;
    }

    public void setLoginDetailBo(LoginDetailBo loginDetailBo) {
        this.loginDetailBo = loginDetailBo;
    }

    public String getNewid() {
        return newid;
    }

    public void setNewid(String newid) {
        this.newid = newid;
    }

    public Map getSession() {
        return session;
    }

    @Override
    public void setSession(Map session) {
        this.session = session;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public boolean isSessionAlive() {
        if (session.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String retrivechangepwd() {
        if (isSessionAlive()) {
            try {
                String check;
                userId = (String) session.get("userid");
                String hashtext = Encrypt.encrypt(oldpassword);
                userLoginDTO = loginDetailBo.retrivechangePassword(userId);
                check = userLoginDTO.getUserpassword();
                if (check.equals(hashtext)) {
                    String newpwd = Encrypt.encrypt(newpassword);
                    userLoginDTO.setUserpassword(newpwd);
                    loginDetailBo.updatechangePassword(userLoginDTO);
                    addActionMessage("Your password has been changed successfully.");
                    return "success";
                }
                addActionMessage("Wrong password typed");
            } catch (Exception ex) {
                Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            return "passwordwrong";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }

    public String LoginAction() {
        try {
            String hashtext = Encrypt.encrypt(userpassword);
            if (userType.equals("User")) {
                userLoginDTO = loginDetailBo.retriveFromulogin(username, hashtext);
                if ((userLoginDTO.getUserpassword()).equals(hashtext) && (userLoginDTO.getUsername()).equals(username) && (userLoginDTO.getVerify()).equals("yes")) {
                    String uname = userLoginDTO.getUsername();
                    session.put("uname", uname);
                    userId = userLoginDTO.getId1();
                    session.put("userid", userId);
                    return "SUCCESS";
                } else {
                    addActionError("Invalid User");
                    return "ERROR";
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (userType.equals("Administrator") && username.equals("trainees@sysbiz.net") && userpassword.equals("Avinash123")) {
            String aname = "trainees@sysbiz.net";
            session.put("aname", aname);
            return "SUCCESSFUL";
        } else {
            addActionError("Invalid User");
            return "ERROR";
        }
    }

    public String insertNewUser() {

        try {
            String pass = Encrypt.encrypt(userpassword);
            userLoginDTO.setId1(userId);
            userLoginDTO.setUsername(username);
            userLoginDTO.setUserpassword(pass);
            userLoginDTO.setVerify("no");
            if (loginDetailBo.insertNewUser(userLoginDTO)) {
                Emailer.execute(userId, username, userpassword);
            } else {
                addActionError("You have already registed. Please login with your credentials.Please click on Home to Login.");
                return "alreadyreg";
            }
            return "success";
        } catch (Exception e) {
            System.out.println("IN Userlistinsertaction exception:" + e);
            return "error";
        }
    }

    public String updateuserbymail() {
        try {
            userLoginDTO = loginDetailBo.retrivechangePassword(userId);
            userLoginDTO.setVerify("yes");
            loginDetailBo.updatechangePassword(userLoginDTO);
            return "success";
        } catch (Exception e) {
            System.out.print(e);
        }
        System.out.println("<--in action class-->" + userId);
        return "success";
    }
}
