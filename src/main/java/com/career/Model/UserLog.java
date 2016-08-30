/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ulogin")

public class UserLog implements Serializable {

    @Id
    @Column(name = "username")
    String username;
    @Column(name = "userpassword")
    String userpassword;
    @Column(name = "verify")
    String verify;
    @Column(name = "id1")
    String id1;

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
