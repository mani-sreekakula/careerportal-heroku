/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.BoImpl;

import com.career.Bo.PersonalDetailsBo;
import com.career.DAO.PersonalDetailsDao;
import com.career.DTO.PersonalDetailsDto;

import com.career.Model.PersonalDetails;

/**
 *
 * @author avinashkumar
 */
public class PersonalDetailsBoImpl implements PersonalDetailsBo {

    private PersonalDetailsDao personalDetailsDao;

    public void setPersonalDetailsDao(PersonalDetailsDao personalDetailsDao) {
        this.personalDetailsDao = personalDetailsDao;
    }

    @Override
    public PersonalDetailsDto fetchPersonalDetails(String userId) {
        PersonalDetailsDto personal = new PersonalDetailsDto();
        PersonalDetails personals;
        personals = personalDetailsDao.fetchPersonalDetails(userId);
        if(personals != null){
        personal.setUserId(personals.getUserId());
        personal.setFirstName(personals.getFirstName());
        personal.setLastName(personals.getLastName());
        personal.setBirthDate(personals.getBirthDate());
        personal.setmStatus(personals.getmStatus());
        personal.setSex(personals.getSex());
        personal.setuEmail(personals.getuEmail());
        personal.setMobileNum(personals.getMobileNum());
        personal.setAddrLine1(personals.getAddrLine1());
        personal.setAddrLine2(personals.getAddrLine2());
        personal.setDist(personals.getDist());
        personal.setCity(personals.getCity());
        personal.setState(personals.getState());
        personal.setPin(personals.getPin());
        personal.setCh1(personals.getCh1());
        personal.setAddrLine12(personals.getAddrLine12());
        personal.setAddrLine22(personals.getAddrLine22());
        personal.setDist2(personals.getDist2());
        personal.setCity2(personals.getCity2());
        personal.setState2(personals.getState2());
        personal.setPin2(personals.getPin2());
        }
        return personal;


    }

    @Override
    public void insertPersonalDetails(PersonalDetailsDto personal) {
        PersonalDetails personals = new PersonalDetails();
        personals.setUserId(personal.getUserId());
        personals.setFirstName(personal.getFirstName());
        personals.setLastName(personal.getLastName());
        personals.setBirthDate(personal.getBirthDate());
        personals.setmStatus(personal.getmStatus());
        personals.setSex(personal.getSex());
        personals.setuEmail(personal.getuEmail());
        personals.setMobileNum(personal.getMobileNum());
        personals.setAddrLine1(personal.getAddrLine1());
        personals.setAddrLine2(personal.getAddrLine2());
        personals.setDist(personal.getDist());
        personals.setCity(personal.getCity());
        personals.setState(personal.getState());
        personals.setPin(personal.getPin());
        personals.setCh1(personal.getCh1());
        personals.setAddrLine12(personal.getAddrLine12());
        personals.setAddrLine22(personal.getAddrLine22());
        personals.setDist2(personal.getDist2());
        personals.setCity2(personal.getCity2());
        personals.setState2(personal.getState2());
        personals.setPin2(personal.getPin2());
        personalDetailsDao.insertPersonalDetails(personals);

    }
}
