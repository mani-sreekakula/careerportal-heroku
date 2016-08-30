package com.career.Model;


import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perdet")
public class PersonalDetails extends ActionSupport implements Serializable {

    @Id
    @Column(name = "userId")
    String userId;
    @Column(name = "firstName")
    String firstName;
    @Column(name = "lastName")
    String lastName;
    @Column(name = "birthDate")
    String birthDate;
    @Column(name = "mStatus")
    String mStatus;
    @Column(name = "sex")
    String sex;
    @Column(name = "uEmail")
    String uEmail;
    @Column(name = "mobileNum")
    String mobileNum;
    @Column(name = "AddrLine1")
    String AddrLine1;
    @Column(name = "AddrLine2")
    String AddrLine2;
    @Column(name = "Dist")
    String Dist;
    @Column(name = "city")
    String city;
    @Column(name = "states")
    String state;
    @Column(name = "pin")
    String pin;
    @Column(name = "ch1")
    String ch1;
    @Column(name = "AddrLine12")
    String AddrLine12;
    @Column(name = "AddrLine22")
    String AddrLine22;
    @Column(name = "Dist2")
    String Dist2;
    @Column(name = "city2")
    String city2;
    @Column(name = "state2")
    String state2;
    @Column(name = "pin2")
    String pin2;

    public String getAddrLine1() {
        return AddrLine1;
    }

    public void setAddrLine1(String AddrLine1) {
        this.AddrLine1 = AddrLine1;
    }

    public String getAddrLine12() {
        return AddrLine12;
    }

    public void setAddrLine12(String AddrLine12) {
        this.AddrLine12 = AddrLine12;
    }

    public String getAddrLine2() {
        return AddrLine2;
    }

    public void setAddrLine2(String AddrLine2) {
        this.AddrLine2 = AddrLine2;
    }

    public String getAddrLine22() {
        return AddrLine22;
    }

    public void setAddrLine22(String AddrLine22) {
        this.AddrLine22 = AddrLine22;
    }

    public String getDist() {
        return Dist;
    }

    public void setDist(String Dist) {
        this.Dist = Dist;
    }

    public String getDist2() {
        return Dist2;
    }

    public void setDist2(String Dist2) {
        this.Dist2 = Dist2;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCh1() {
        return ch1;
    }

    public void setCh1(String ch1) {
        this.ch1 = ch1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin2() {
        return pin2;
    }

    public void setPin2(String pin2) {
        this.pin2 = pin2;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
