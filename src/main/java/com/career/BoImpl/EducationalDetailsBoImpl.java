/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.BoImpl;

import com.career.DTO.EducationalDetailsDTO;
import com.career.Bo.EducationalDetailsBo;
import com.career.DAO.EducationalDetailsDAO;
import com.career.Model.EducationalDetails;

/**
 *
 * @author beenabasanthi
 */
public class EducationalDetailsBoImpl implements EducationalDetailsBo {

    EducationalDetailsDAO educationalDetailsDAO;

    public void setEducationalDetailsDAO(EducationalDetailsDAO educationalDetailsDAO) {
        this.educationalDetailsDAO = educationalDetailsDAO;
    }

    @Override
    public EducationalDetailsDTO retrieveEducationalDetails(String userId) {

        EducationalDetails educationalDetails = educationalDetailsDAO.retrieveEducationalDetails(userId);
        if (educationalDetails != null) {

            EducationalDetailsDTO educationalDetailsDTO = new EducationalDetailsDTO();

            educationalDetailsDTO.setUserId(educationalDetails.getUserId());

            educationalDetailsDTO.setPgdegree(educationalDetails.getPgdegree());
            educationalDetailsDTO.setPgbranch(educationalDetails.getPgbranch());
            educationalDetailsDTO.setPginstitute(educationalDetails.getPginstitute());
            educationalDetailsDTO.setPguniversity(educationalDetails.getPguniversity());
            educationalDetailsDTO.setPgstate(educationalDetails.getPgstate());
            educationalDetailsDTO.setPglocation(educationalDetails.getPglocation());
            educationalDetailsDTO.setPgaggregate(educationalDetails.getPgaggregate());
            educationalDetailsDTO.setPgyearofpass(String.valueOf(educationalDetails.getPgyearofpass()));

            educationalDetailsDTO.setUgdegree(educationalDetails.getUgdegree());
            educationalDetailsDTO.setUgbranch(educationalDetails.getUgbranch());
            educationalDetailsDTO.setUginstitute(educationalDetails.getUginstitute());
            educationalDetailsDTO.setUguniversity(educationalDetails.getUguniversity());
            educationalDetailsDTO.setUgstate(educationalDetails.getUgstate());
            educationalDetailsDTO.setUglocation(educationalDetails.getUglocation());
            educationalDetailsDTO.setUgaggregate(educationalDetails.getUgaggregate());
            educationalDetailsDTO.setUgyearofpass(String.valueOf(educationalDetails.getUgyearofpass()));

            educationalDetailsDTO.setIntdegree(educationalDetails.getIntdegree());
            educationalDetailsDTO.setIntbranch(educationalDetails.getIntbranch());
            educationalDetailsDTO.setIntinstitute(educationalDetails.getIntinstitute());
            educationalDetailsDTO.setIntuniversity(educationalDetails.getIntuniversity());
            educationalDetailsDTO.setIntstate(educationalDetails.getIntstate());
            educationalDetailsDTO.setIntlocation(educationalDetails.getIntlocation());
            educationalDetailsDTO.setIntaggregate(educationalDetails.getIntaggregate());
            educationalDetailsDTO.setIntyearofpass(String.valueOf(educationalDetails.getIntyearofpass()));

            educationalDetailsDTO.setTenthinstitute(educationalDetails.getTenthinstitute());
            educationalDetailsDTO.setTenthuniversity(educationalDetails.getTenthuniversity());
            educationalDetailsDTO.setTenthstate(educationalDetails.getTenthstate());
            educationalDetailsDTO.setTenthlocation(educationalDetails.getTenthlocation());
            educationalDetailsDTO.setTenthaggregate(educationalDetails.getTenthaggregate());
            educationalDetailsDTO.setTenthyearofpass(String.valueOf(educationalDetails.getTenthyearofpass()));

            return educationalDetailsDTO;
        } else {
            return null;
        }

    }

    @Override
    public void saveEducationalDetails(EducationalDetailsDTO educationalDetailsDTO) {
        EducationalDetails educationalDetails = new EducationalDetails();

        educationalDetails.setUserId(educationalDetailsDTO.getUserId());
        educationalDetails.setPgdegree(educationalDetailsDTO.getPgdegree());
        educationalDetails.setPgbranch(educationalDetailsDTO.getPgbranch());
        educationalDetails.setPginstitute(educationalDetailsDTO.getPginstitute());
        educationalDetails.setPguniversity(educationalDetailsDTO.getPguniversity());
        educationalDetails.setPgstate(educationalDetailsDTO.getPgstate());
        educationalDetails.setPglocation(educationalDetailsDTO.getPglocation());
        educationalDetails.setPgaggregate(educationalDetailsDTO.getPgaggregate());
        if (educationalDetailsDTO.getPgyearofpass() != null) {
            educationalDetails.setPgyearofpass(Integer.valueOf(educationalDetailsDTO.getPgyearofpass()));
        }

        educationalDetails.setUgdegree(educationalDetailsDTO.getUgdegree());
        educationalDetails.setUgbranch(educationalDetailsDTO.getUgbranch());
        educationalDetails.setUginstitute(educationalDetailsDTO.getUginstitute());
        educationalDetails.setUguniversity(educationalDetailsDTO.getUguniversity());
        educationalDetails.setUgstate(educationalDetailsDTO.getUgstate());
        educationalDetails.setUglocation(educationalDetailsDTO.getUglocation());
        educationalDetails.setUgaggregate(educationalDetailsDTO.getUgaggregate());
        educationalDetails.setUgyearofpass(Integer.valueOf(educationalDetailsDTO.getUgyearofpass()));

        educationalDetails.setIntdegree(educationalDetailsDTO.getIntdegree());
        educationalDetails.setIntbranch(educationalDetailsDTO.getIntbranch());
        educationalDetails.setIntinstitute(educationalDetailsDTO.getIntinstitute());
        educationalDetails.setIntuniversity(educationalDetailsDTO.getIntuniversity());
        educationalDetails.setIntstate(educationalDetailsDTO.getIntstate());
        educationalDetails.setIntlocation(educationalDetailsDTO.getIntlocation());
        educationalDetails.setIntaggregate(educationalDetailsDTO.getIntaggregate());
        educationalDetails.setIntyearofpass(Integer.valueOf(educationalDetailsDTO.getIntyearofpass()));

        educationalDetails.setTenthinstitute(educationalDetailsDTO.getTenthinstitute());
        educationalDetails.setTenthuniversity(educationalDetailsDTO.getTenthuniversity());
        educationalDetails.setTenthstate(educationalDetailsDTO.getTenthstate());
        educationalDetails.setTenthlocation(educationalDetailsDTO.getTenthlocation());
        educationalDetails.setTenthaggregate(educationalDetailsDTO.getTenthaggregate());
        educationalDetails.setTenthyearofpass(Integer.valueOf(educationalDetailsDTO.getTenthyearofpass()));

        educationalDetailsDAO.saveEducationalDetails(educationalDetails);
    }
}
