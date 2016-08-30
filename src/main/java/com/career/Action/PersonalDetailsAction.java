/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Action;

import com.career.Bo.PersonalDetailsBo;
import com.career.DTO.PersonalDetailsDto;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author avinashkumar
 */
public class PersonalDetailsAction extends ActionSupport implements SessionAware {

    String userId;
    String firstName;
    String lastName;
    String birthDate;
    String mStatus;
    String sex;
    String uEmail;
    String mobileNum;
    String AddrLine1;
    String AddrLine2;
    String Dist;
    String city;
    String state;
    String pin;
    String ch1;
    String AddrLine12;
    String AddrLine22;
    String Dist2;
    String city2;
    String state2;
    String pin2;
    Map session;
    protected PersonalDetailsDto personal = new PersonalDetailsDto();
    PersonalDetailsBo personalDetailsBo;

    public PersonalDetailsAction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");           
        personalDetailsBo = (PersonalDetailsBo)context.getBean("personalDetailsBoProxy");
    }

    public PersonalDetailsBo getPersonalDetailsBo() {
        return personalDetailsBo;
    }

    public void setPersonalDetailsBo(PersonalDetailsBo personalDetailsBo) {
        this.personalDetailsBo = personalDetailsBo;
    }

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

    public Map getSession() {
        return session;
    }

    @Override
    public void setSession(Map session) {
        this.session = session;
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

    public boolean isSessionAlive() {
        if (session.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String insertPersonalDetails() {

        if (isSessionAlive()) {
            userId = (String) session.get("userid");
            System.out.println("<-- Personal Details -->");
            personal.setUserId(userId);
            personal.setFirstName(firstName);
            personal.setLastName(lastName);
            personal.setBirthDate(birthDate);
            personal.setmStatus(mStatus);
            personal.setSex(sex);
            personal.setuEmail(uEmail);
            personal.setMobileNum(mobileNum);
            personal.setAddrLine1(AddrLine1);
            personal.setAddrLine2(AddrLine2);
            personal.setDist(Dist);
            personal.setCity(city);
            personal.setState(state);
            personal.setPin(pin);
            personal.setCh1(ch1);
            personal.setAddrLine12(AddrLine12);
            personal.setAddrLine22(AddrLine22);
            personal.setDist2(Dist2);
            personal.setCity2(city2);
            personal.setState2(state2);
            personal.setPin2(pin2);
            personalDetailsBo.insertPersonalDetails(personal);
            System.out.println("Insert personaldetails"+userId);
            addActionMessage("Personal details saved successfully. ");
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }

    public String fetchPersonalDetails() {
        if (isSessionAlive()) {
            userId = (String) session.get("userid");
            System.out.println("<-- Fetch Personal Details -->");
            personal = personalDetailsBo.fetchPersonalDetails(userId);
            firstName = personal.getFirstName();
            lastName = personal.getLastName();
            birthDate = personal.getBirthDate();
            mStatus = personal.getmStatus();
            sex = personal.getSex();
            uEmail = personal.getuEmail();
            mobileNum = personal.getMobileNum();
            AddrLine1 = personal.getAddrLine1();
            AddrLine2 = personal.getAddrLine2();
            Dist = personal.getDist();
            city = personal.getCity();
            state = personal.getState();
            pin = personal.getPin();
            ch1 = personal.getCh1();
            AddrLine12 = personal.getAddrLine12();
            AddrLine22 = personal.getAddrLine22();
            Dist2 = personal.getDist2();
            city2 = personal.getCity2();
            state2 = personal.getState2();
            pin2 = personal.getPin2();
            System.out.println("fetch personaldetails"+userId);
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }


    }
}
