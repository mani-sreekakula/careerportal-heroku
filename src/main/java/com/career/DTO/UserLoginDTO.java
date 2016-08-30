/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.DTO;

/**
 *
 * @author alokkumar
 */
public class UserLoginDTO {

    private String userpassword;
    private String username;
     String id1;
    private String verify;

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
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
}
