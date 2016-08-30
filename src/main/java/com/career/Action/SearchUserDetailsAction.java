/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Action;

import com.career.Bo.ApplyJobBo;
import com.career.Bo.EducationalDetailsBo;
import com.career.Bo.JobPostBo;
import com.career.Bo.LoginDetailBo;
import com.career.Bo.PersonalDetailsBo;
import com.career.Bo.SkillsBo;
import com.career.DTO.ApplyJobDTO;
import com.career.DTO.EducationalDetailsDTO;
import com.career.DTO.JobPostDTO;
import com.career.DTO.PersonalDetailsDto;
import com.career.DTO.SkillsDTO;
import com.career.DTO.UserLoginDTO;
import com.career.DTO.wholedetailsDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author avinash kumar
 */
public class SearchUserDetailsAction extends ActionSupport implements SessionAware {

    Map session;
    private String userId;
    private String empid;
    private String select;
    private String experience_or_fresher;
    private String jobRole;
    private String filename;
    private InputStream fileInputStream;
    wholedetailsDTO innerlist = new wholedetailsDTO();
    List<wholedetailsDTO> list1 = new ArrayList<wholedetailsDTO>();
    protected wholedetailsDTO wholeDetailsDTO = new wholedetailsDTO();
    private PersonalDetailsBo personalDetailsBo;
    private SkillsBo skillsBo;
    protected List<SkillsDTO> skillsDTO = new ArrayList<SkillsDTO>();
    protected List<PersonalDetailsDto> personal = new ArrayList<PersonalDetailsDto>();
    protected List<EducationalDetailsDTO> educationalDetailsDTO = new ArrayList<EducationalDetailsDTO>();
    protected JobPostDTO jobPostDTO = new JobPostDTO();
    private JobPostBo jobPostBo;
    EducationalDetailsBo educationalDetailsBo;
    protected List<ApplyJobDTO> applyjobdto = new ArrayList<ApplyJobDTO>();
    private ApplyJobBo applyJobBo;
    protected List<UserLoginDTO> userlogindto = new ArrayList<UserLoginDTO>();
    LoginDetailBo loginDetailBo;

    public SearchUserDetailsAction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        personalDetailsBo = (PersonalDetailsBo) context.getBean("personalDetailsBoProxy");
        educationalDetailsBo = (EducationalDetailsBo) context.getBean("educationalDetailsBoProxy");
        skillsBo = (SkillsBo) context.getBean("skillsBoProxy");
        jobPostBo = (JobPostBo) context.getBean("jobPostBoProxy");
        applyJobBo = (ApplyJobBo) context.getBean("ApplyJobBoProxy");
        loginDetailBo = (LoginDetailBo) context.getBean("loginDetailBoProxy");
    }

    public wholedetailsDTO getWholeDetailsDTO() {
        return wholeDetailsDTO;
    }

    public void setWholeDetailsDTO(wholedetailsDTO wholeDetailsDTO) {
        this.wholeDetailsDTO = wholeDetailsDTO;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public ApplyJobBo getApplyJobBo() {
        return applyJobBo;
    }

    public void setApplyJobBo(ApplyJobBo applyJobBo) {
        this.applyJobBo = applyJobBo;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public JobPostBo getJobPostBo() {
        return jobPostBo;
    }

    public void setJobPostBo(JobPostBo jobPostBo) {
        this.jobPostBo = jobPostBo;
    }

    public String getExperience_or_fresher() {
        return experience_or_fresher;
    }

    public void setExperience_or_fresher(String experience_or_fresher) {
        this.experience_or_fresher = experience_or_fresher;
    }

    public EducationalDetailsBo getEducationalDetailsBo() {
        return educationalDetailsBo;
    }

    public void setEducationalDetailsBo(EducationalDetailsBo educationalDetailsBo) {
        this.educationalDetailsBo = educationalDetailsBo;
    }

    public PersonalDetailsBo getPersonalDetailsBo() {
        return personalDetailsBo;
    }

    public void setPersonalDetailsBo(PersonalDetailsBo personalDetailsBo) {
        this.personalDetailsBo = personalDetailsBo;
    }

    public SkillsBo getSkillsBo() {
        return skillsBo;
    }

    public void setSkillsBo(SkillsBo skillsBo) {
        this.skillsBo = skillsBo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public wholedetailsDTO getInnerlist() {
        return innerlist;
    }

    public void setInnerlist(wholedetailsDTO innerlist) {
        this.innerlist = innerlist;
    }

    public List<wholedetailsDTO> getList1() {
        return list1;
    }

    public void setList1(List<wholedetailsDTO> list1) {
        this.list1 = list1;
    }

    public Map getSession() {
        return session;
    }

    @Override
    public void setSession(Map session) {
        this.session = session;
    }

    public InputStream getFileInputStream() {
        return fileInputStream;
    }

    public void setFileInputStream(InputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public boolean isSessionAlive() {
        if (session.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String fetchuserexperience() {

        if (isSessionAlive()) {
            userId = (String) session.get("userid");

            skillsDTO = skillsBo.getexpSkillsDetails(select);
            for (int i = 0; i < skillsDTO.size(); i++) {
                innerlist = new wholedetailsDTO();
                SkillsDTO skillsDTO1 = skillsDTO.get(i);
                innerlist.setEmpid(skillsDTO1.getUserId());
                PersonalDetailsDto personal1 = new PersonalDetailsDto();
                personal1 = personalDetailsBo.fetchPersonalDetails(skillsDTO1.getUserId());
                EducationalDetailsDTO educationalDetailsDTO1 = new EducationalDetailsDTO();

                educationalDetailsDTO1 = educationalDetailsBo.retrieveEducationalDetails(skillsDTO1.getUserId());

                if (personal1 != null && educationalDetailsDTO1 != null && skillsDTO1 != null) {
                    innerlist.setExporfre(skillsDTO1.getExperience_or_fresher());
                    innerlist.setExpyears(skillsDTO1.getExperience_in_years());
                    innerlist.setEmpid(skillsDTO1.getUserId());
                    innerlist.setPgdegree(educationalDetailsDTO1.getPgdegree());
                    innerlist.setUgdegree(educationalDetailsDTO1.getUgdegree());
                    innerlist.setFirstName(personal1.getFirstName());
                    innerlist.setEmail(personal1.getuEmail());
                    innerlist.setMobileNum(personal1.getMobileNum());

                    list1.add(innerlist);
                }
            }

            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }

    public String fetchuserbyjobrole() {

        if (isSessionAlive()) {
            userId = (String) session.get("userid");
            applyjobdto = applyJobBo.fetchjobrole(jobRole);
            for (int i = 0; i < applyjobdto.size(); i++) {
                ApplyJobDTO applyjobdto1 = new ApplyJobDTO();
                applyjobdto1 = applyjobdto.get(i);
                innerlist = new wholedetailsDTO();
                innerlist.setEmpid(applyjobdto1.getUserId());
                PersonalDetailsDto personal1 = new PersonalDetailsDto();
                personal1 = personalDetailsBo.fetchPersonalDetails(applyjobdto1.getUserId());
                EducationalDetailsDTO educationalDetailsDTO1 = new EducationalDetailsDTO();

                educationalDetailsDTO1 = educationalDetailsBo.retrieveEducationalDetails(applyjobdto1.getUserId());
                SkillsDTO skillsDTO1 = new SkillsDTO();
                skillsDTO1 = skillsBo.getSkillsDetails(applyjobdto1.getUserId());
                if (personal1 != null && educationalDetailsDTO1 != null && skillsDTO1 != null) {
                    innerlist.setJobrole(applyjobdto1.getJobrole());
                    innerlist.setEmpid(applyjobdto1.getUserId());
                    innerlist.setFirstName(personal1.getFirstName());
                    innerlist.setEmail(personal1.getuEmail());
                    innerlist.setMobileNum(personal1.getMobileNum());
                    innerlist.setUgdegree(educationalDetailsDTO1.getUgdegree());
                    innerlist.setPgdegree(educationalDetailsDTO1.getPgdegree());
                    innerlist.setExporfre(skillsDTO1.getExperience_or_fresher());
                    innerlist.setExpyears(skillsDTO1.getExperience_in_years());
                    list1.add(innerlist);

                }
            }
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }

    }

    public String fetchindividualuser() {

        if (isSessionAlive()) {
            userId = empid;
            System.out.println("userId:"+userId);
            PersonalDetailsDto personal1 = new PersonalDetailsDto();
            personal1 = personalDetailsBo.fetchPersonalDetails(userId);
            wholeDetailsDTO.setEmpid(personal1.getUserId());
            wholeDetailsDTO.setFirstName(personal1.getFirstName());
            wholeDetailsDTO.setLastName(personal1.getLastName());
            wholeDetailsDTO.setDob(personal1.getBirthDate());
            wholeDetailsDTO.setmStatus(personal1.getmStatus());
            wholeDetailsDTO.setSex(personal1.getSex());
            wholeDetailsDTO.setEmail(personal1.getuEmail());
            wholeDetailsDTO.setMobileNum(personal1.getMobileNum());
            wholeDetailsDTO.setPerAddr(personal1.getAddrLine1());
            wholeDetailsDTO.setTempAddr(personal1.getAddrLine12());

            EducationalDetailsDTO educationalDetailsDTO1 = new EducationalDetailsDTO();

            educationalDetailsDTO1 = educationalDetailsBo.retrieveEducationalDetails(userId);
            wholeDetailsDTO.setPgdegree(educationalDetailsDTO1.getPgbranch());
            wholeDetailsDTO.setPgbranch(educationalDetailsDTO1.getPgbranch());
            wholeDetailsDTO.setPginstitute(educationalDetailsDTO1.getPginstitute());
            wholeDetailsDTO.setPguniversity(educationalDetailsDTO1.getPguniversity());
            wholeDetailsDTO.setPgstate(educationalDetailsDTO1.getPgstate());
            wholeDetailsDTO.setPglocation(educationalDetailsDTO1.getPglocation());
            wholeDetailsDTO.setPgaggregate(Float.toString(educationalDetailsDTO1.getPgaggregate()));
            wholeDetailsDTO.setPgyearofpass(educationalDetailsDTO1.getPgyearofpass());
            wholeDetailsDTO.setUgdegree(educationalDetailsDTO1.getUgdegree());
            wholeDetailsDTO.setUgbranch(educationalDetailsDTO1.getUgbranch());
            wholeDetailsDTO.setUginstitute(educationalDetailsDTO1.getUginstitute());
            wholeDetailsDTO.setUguniversity(educationalDetailsDTO1.getUguniversity());
            wholeDetailsDTO.setUgstate(educationalDetailsDTO1.getUgstate());
            wholeDetailsDTO.setUglocation(educationalDetailsDTO1.getUglocation());
            wholeDetailsDTO.setUgaggregate(Float.toString(educationalDetailsDTO1.getUgaggregate()));
            wholeDetailsDTO.setUgyearofpass(educationalDetailsDTO1.getUgyearofpass());
            wholeDetailsDTO.setIntdegree(educationalDetailsDTO1.getIntdegree());
            wholeDetailsDTO.setIntbranch(educationalDetailsDTO1.getIntbranch());
            wholeDetailsDTO.setIntinstitute(educationalDetailsDTO1.getIntstate());
            wholeDetailsDTO.setIntuniversity(educationalDetailsDTO1.getIntuniversity());
            wholeDetailsDTO.setIntstate(educationalDetailsDTO1.getIntstate());
            wholeDetailsDTO.setIntlocation(educationalDetailsDTO1.getIntlocation());
            wholeDetailsDTO.setIntaggregate(Float.toString(educationalDetailsDTO1.getIntaggregate()));
            wholeDetailsDTO.setIntyearofpass(educationalDetailsDTO1.getIntyearofpass());
            wholeDetailsDTO.setTenthinstitute(educationalDetailsDTO1.getTenthinstitute());
            wholeDetailsDTO.setTenthuniversity(educationalDetailsDTO1.getTenthuniversity());
            wholeDetailsDTO.setTenthstate(educationalDetailsDTO1.getTenthstate());
            wholeDetailsDTO.setTenthlocation(educationalDetailsDTO1.getTenthlocation());
            wholeDetailsDTO.setTenthaggregate(Float.toString(educationalDetailsDTO1.getTenthaggregate()));
            wholeDetailsDTO.setTenthyearofpass(educationalDetailsDTO1.getTenthyearofpass());


            SkillsDTO skillsDTO1 = new SkillsDTO();
            skillsDTO1 = skillsBo.getSkillsDetails(userId);
            wholeDetailsDTO.setSkills(getskillsclass(userId));
            wholeDetailsDTO.setAcacheive(skillsDTO1.getAcademic_achievements());
            wholeDetailsDTO.setCoacheive(skillsDTO1.getCocurricular_achievements());
            wholeDetailsDTO.setExporfre(skillsDTO1.getExperience_or_fresher());
            wholeDetailsDTO.setExpyears(skillsDTO1.getExperience_in_years());
            wholeDetailsDTO.setExpmonths(skillsDTO1.getExperience_in_months());
            wholeDetailsDTO.setOrgname(skillsDTO1.getOrgname());
            wholeDetailsDTO.setIndname(skillsDTO1.getIndname());

            wholeDetailsDTO.setCurjobrole(skillsDTO1.getJobrole1());
            wholeDetailsDTO.setCursal(skillsDTO1.getCursal());

            wholeDetailsDTO.setExpsal(skillsDTO1.getExpsal());

            return "success";

        } else {
            addActionError("session expired");
            return "ERROR";
        }

    }

    public String getskillsclass(String userId) {
        String res = "\0";
        try {
            SkillsDTO skillsDTO1 = new SkillsDTO();
            skillsDTO1 = skillsBo.getSkillsDetails(userId);

            if (skillsDTO1.getCprogramming() == 1) {
                res = res.concat("C-programming");
            }
            if (skillsDTO1.getCpp() == 1) {
                res = res.concat(",\n");
                res = res.concat("C++");
            }
            if (skillsDTO1.getJava() == 1) {
                res = res.concat(",\n");
                res = res.concat("Java");
            }
            if (skillsDTO1.getUnix() == 1) {
                res = res.concat(",\n");
                res = res.concat("Unix");
            }
            if (skillsDTO1.getHTML() == 1) {
                res = res.concat(",\n");
                res = res.concat("HTML");
            }
            if (skillsDTO1.getXML() == 1) {
                res = res.concat(",\n");
                res = res.concat("XML");
            }
            if (skillsDTO1.getDataBases() == 1) {
                res = res.concat(",\n");
                res = res.concat("DataBases");
            }
            if (skillsDTO1.getSoftwareEngineering() == 1) {
                res = res.concat(",\n");
                res = res.concat("software engineering");
            }
            if (skillsDTO1.getTestingMethodologies() == 1) {
                res = res.concat(",\n");
                res = res.concat("Testing Methodologies");
            }
            if (skillsDTO1.getHardwareconcepts() == 1) {
                res = res.concat(",\n");
                res = res.concat("Hardware concepts");
            }
            if (skillsDTO1.getNetworking() == 1) {
                res = res.concat(",\n");
                res = res.concat("Networking");
            }
            res = res.concat(".");
        } catch (Exception ex) {
            System.out.println("Skills in DAOJobs exception:" + ex);
        }
        return res;
    }

    public String fetchalluserdetails() {
        if (isSessionAlive()) {

            userlogindto = loginDetailBo.fetchalluserdetails();
            if (userlogindto != null) {
                for (int i = 0; i < userlogindto.size(); i++) {
                    UserLoginDTO userlogindto1 = userlogindto.get(i);
                    innerlist = new wholedetailsDTO();
                    innerlist.setEmpid(userlogindto1.getId1());
                    PersonalDetailsDto personal1 = new PersonalDetailsDto();
                    personal1 = personalDetailsBo.fetchPersonalDetails(userlogindto1.getId1());
                    EducationalDetailsDTO educationalDetailsDTO1 = new EducationalDetailsDTO();

                    educationalDetailsDTO1 = educationalDetailsBo.retrieveEducationalDetails(userlogindto1.getId1());
                    SkillsDTO skillsDTO1 = new SkillsDTO();
                    skillsDTO1 = skillsBo.getSkillsDetails(userlogindto1.getId1());
                    ApplyJobDTO applyjobdto1 = new ApplyJobDTO();
                    applyjobdto1 = applyJobBo.fetchalluserdetails(userlogindto1.getId1());
                    if (personal1 != null && educationalDetailsDTO1 != null && skillsDTO1 != null) {
                        innerlist.setFirstName(personal1.getFirstName());
                        innerlist.setEmail(personal1.getuEmail());
                        innerlist.setMobileNum(personal1.getMobileNum());
                        innerlist.setUgdegree(educationalDetailsDTO1.getUgdegree());
                        innerlist.setPgdegree(educationalDetailsDTO1.getPgdegree());
                        innerlist.setExporfre(skillsDTO1.getExperience_or_fresher());
                        innerlist.setExpyears(skillsDTO1.getExperience_in_years());
                        if (applyjobdto1 != null) {
                            innerlist.setJobrole(applyjobdto1.getJobrole());
                        }
                        list1.add(innerlist);
                        System.out.println("ID:" + innerlist.getEmpid());
                        System.out.println("Size of list:" + list1.size());
                    }
                }
                System.out.println("List id:" + list1.get(0).getEmpid());
                System.out.println("List id:" + list1.get(1).getEmpid());
                System.out.println("List id:" + list1.get(2).getEmpid());
                System.out.println("List id:" + list1.get(3).getEmpid());
            }

            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }

    public String downloadResume() {
        try {
            userId=empid;
            SkillsDTO skillsDTO1 = new SkillsDTO();
            skillsDTO1 = skillsBo.getSkillsDetails(userId);
            System.out.println("File Name:" + skillsDTO1.getUploadFileFileName());
            filename = skillsDTO1.getUploadFileFileName();
            String filepath = "C:\\temp\\";
            filepath = filepath.concat(filename);
            fileInputStream = new FileInputStream(new File(filepath));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchUserDetailsAction.class.getName()).log(Level.SEVERE, null, ex);
            return "error";
        }
        return "success";
    }
}
