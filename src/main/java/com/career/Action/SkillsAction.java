/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.Action;

import com.career.Bo.SkillsBo;
import com.career.DTO.SkillsDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author manikanta
 */
public class SkillsAction extends ActionSupport implements SessionAware {
    
    private String userId;
    private List skills = new ArrayList();
    private List selectedskills = new ArrayList();
    private int Cprogramming;
    private int Cpp;
    private int Java;
    private int Unix;
    private int HTML;
    private int XML;
    private int DataBases;
    private int SoftwareEngineering;
    private int TestingMethodologies;
    private int Hardwareconcepts;
    private int Networking;
    private String experience_or_fresher;
    private String experience_in_years;
    private String orgname;
    private String indname;
    private String jobrole1;
    private String cursal;
    private String expsal;
    private String experience_in_months;
    private String academic_achievements;
    private String cocurricular_achievements;
    private String uploadFileFileName;
    private File uploadFile; // The actual file
    private String uploadFileContentType;// The content type of the file
    private String displayfile;
    Map session;
    protected SkillsDTO skillsDTO = new SkillsDTO();
    private SkillsBo skillsBo;

    public SkillsAction() {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");           
        skillsBo = (SkillsBo)context.getBean("skillsBoProxy");
    }
    
    public int getCpp() {
        return Cpp;
    }
    
    public void setCpp(int Cpp) {
        this.Cpp = Cpp;
    }
    
    public int getCprogramming() {
        return Cprogramming;
    }
    
    public void setCprogramming(int Cprogramming) {
        this.Cprogramming = Cprogramming;
    }
    
    public int getDataBases() {
        return DataBases;
    }
    
    public void setDataBases(int DataBases) {
        this.DataBases = DataBases;
    }
    
    public int getHTML() {
        return HTML;
    }
    
    public void setHTML(int HTML) {
        this.HTML = HTML;
    }
    
    public int getHardwareconcepts() {
        return Hardwareconcepts;
    }
    
    public void setHardwareconcepts(int Hardwareconcepts) {
        this.Hardwareconcepts = Hardwareconcepts;
    }
    
    public int getJava() {
        return Java;
    }
    
    public void setJava(int Java) {
        this.Java = Java;
    }
    
    public int getNetworking() {
        return Networking;
    }
    
    public void setNetworking(int Networking) {
        this.Networking = Networking;
    }
    
    public int getSoftwareEngineering() {
        return SoftwareEngineering;
    }
    
    public void setSoftwareEngineering(int SoftwareEngineering) {
        this.SoftwareEngineering = SoftwareEngineering;
    }
    
    public int getTestingMethodologies() {
        return TestingMethodologies;
    }
    
    public void setTestingMethodologies(int TestingMethodologies) {
        this.TestingMethodologies = TestingMethodologies;
    }
    
    public int getUnix() {
        return Unix;
    }
    
    public void setUnix(int Unix) {
        this.Unix = Unix;
    }
    
    public int getXML() {
        return XML;
    }
    
    public void setXML(int XML) {
        this.XML = XML;
    }
    
    public String getAcademic_achievements() {
        return academic_achievements;
    }
    
    public void setAcademic_achievements(String academic_achievements) {
        this.academic_achievements = academic_achievements;
    }
    
    public String getCocurricular_achievements() {
        return cocurricular_achievements;
    }
    
    public void setCocurricular_achievements(String cocurricular_achievements) {
        this.cocurricular_achievements = cocurricular_achievements;
    }
    
    public String getCursal() {
        return cursal;
    }
    
    public void setCursal(String cursal) {
        this.cursal = cursal;
    }
    
    public String getExperience_in_months() {
        return experience_in_months;
    }
    
    public void setExperience_in_months(String experience_in_months) {
        this.experience_in_months = experience_in_months;
    }
    
    public String getExperience_in_years() {
        return experience_in_years;
    }
    
    public void setExperience_in_years(String experience_in_years) {
        this.experience_in_years = experience_in_years;
    }
    
    public String getExperience_or_fresher() {
        return experience_or_fresher;
    }
    
    public void setExperience_or_fresher(String experience_or_fresher) {
        this.experience_or_fresher = experience_or_fresher;
    }
    
    public String getExpsal() {
        return expsal;
    }
    
    public void setExpsal(String expsal) {
        this.expsal = expsal;
    }
    
    public String getIndname() {
        return indname;
    }
    
    public void setIndname(String indname) {
        this.indname = indname;
    }
    
    public String getJobrole1() {
        return jobrole1;
    }
    
    public void setJobrole1(String jobrole1) {
        this.jobrole1 = jobrole1;
    }
    
    public String getOrgname() {
        return orgname;
    }
    
    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }
    
    public List getSelectedskills() {
        return selectedskills;
    }
    
    public void setSelectedskills(List selectedskills) {
        this.selectedskills = selectedskills;
    }
    
    public Map getSession() {
        return session;
    }
    
    @Override
    public void setSession(Map session) {
        this.session = session;
    }
    
    public List getSkills() {
        return skills;
    }
    
    public void setSkills(List skills) {
        this.skills = skills;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public SkillsBo getSkillsBo() {
        return skillsBo;
    }
    
    public void setSkillsBo(SkillsBo skillsBo) {
        this.skillsBo = skillsBo;
    }
    
    public String getUploadFileFileName() {
        return uploadFileFileName;
    }
    
    public void setUploadFileFileName(String uploadFileFileName) {
        this.uploadFileFileName = uploadFileFileName;
    }
    
    public File getUploadFile() {
        return uploadFile;
    }
    
    public void setUploadFile(File uploadFile) {
        this.uploadFile = uploadFile;
    }
    
    public String getUploadFileContentType() {
        return uploadFileContentType;
    }
    
    public void setUploadFileContentType(String uploadFileContentType) {
        this.uploadFileContentType = uploadFileContentType;
    }
    
    public String getDisplayfile() {
        return displayfile;
    }
    
    public void setDisplayfile(String displayfile) {
        this.displayfile = displayfile;
    }
    
    public boolean isSessionAlive() {
        if (session.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
    public String getSkillsDetails() {
        if (isSessionAlive()) {
            userId = (String) session.get("userid");
            System.out.println("<--Fetch Skills Details -->");
            skillsDTO = skillsBo.getSkillsDetails(userId);
            Cprogramming = skillsDTO.getCprogramming();
            Cpp = skillsDTO.getCpp();
            Java = skillsDTO.getJava();
            Unix = skillsDTO.getUnix();
            HTML = skillsDTO.getHTML();
            XML = skillsDTO.getXML();
            DataBases = skillsDTO.getDataBases();
            SoftwareEngineering = skillsDTO.getSoftwareEngineering();
            TestingMethodologies = skillsDTO.getTestingMethodologies();
            Hardwareconcepts = skillsDTO.getHardwareconcepts();
            Networking = skillsDTO.getNetworking();
            experience_or_fresher = skillsDTO.getExperience_or_fresher();
            experience_in_years = skillsDTO.getExperience_in_years();
            experience_in_months = skillsDTO.getExperience_in_months();
            academic_achievements = skillsDTO.getAcademic_achievements();
            cocurricular_achievements = skillsDTO.getCocurricular_achievements();
            orgname = skillsDTO.getOrgname();
            indname = skillsDTO.getIndname();
            jobrole1 = skillsDTO.getJobrole1();
            cursal = skillsDTO.getCursal();
            expsal = skillsDTO.getExpsal();
            uploadFileFileName = skillsDTO.getUploadFileFileName();
            getSkillsList();
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }
    
    public void getSkillsList() {
        
        if (Cprogramming == 1) {
            selectedskills.add("C-programming");
            System.out.println("C-programming");
        } else {
            skills.add("C-programming");
        }
        
        if (Cpp == 1) {
            selectedskills.add("C++");
        } else {
            skills.add("C++");
        }
        if (Java == 1) {
            selectedskills.add("Java");
        } else {
            skills.add("Java");
        }
        if (Unix == 1) {
            selectedskills.add("Unix");
        } else {
            skills.add("Unix");
        }
        if (HTML == 1) {
            selectedskills.add("HTML");
        } else {
            skills.add("HTML");
        }
        if (XML == 1) {
            selectedskills.add("XML");
        } else {
            skills.add("XML");
        }
        if (DataBases == 1) {
            selectedskills.add("DataBases");
        } else {
            skills.add("DataBases");
        }
        if (SoftwareEngineering == 1) {
            selectedskills.add("software engineering");
        } else {
            skills.add("software engineering");
        }
        if (TestingMethodologies == 1) {
            selectedskills.add("Testing Methodologies");
        } else {
            skills.add("Testing Methodologies");
        }
        if (Hardwareconcepts == 1) {
            selectedskills.add("Hardware Concepts");
        } else {
            skills.add("Hardware Concepts");
        }
        if (Networking == 1) {
            selectedskills.add("Networking");
        } else {
            skills.add("Networking");
        }
    }
    
    public String insertSkillsDetails() {
        if (isSessionAlive()) {
            userId = (String) session.get("userid");
            System.out.println("<-- Insert Skills Details -->");
            setSkillsfromList();
            try {
                String filePath = "c:/temp";
                System.out.println("Server path:" + filePath);
                System.out.println("checking   :" + uploadFileFileName);
                File fileToCreate = new File(filePath, uploadFileFileName);
                if (fileToCreate.exists()) {
                    addFieldError("uploadFile", "Filename already exists,Please specify another name");
                    return "input";
                } else {
                    FileUtils.copyFile(uploadFile, fileToCreate);
                }
            } catch (Exception e) {
                System.out.println("Exception in Skills and achievements:" + e);
                addActionError(e.getMessage());
                return "input";
            }
            skillsDTO.setCprogramming(Cprogramming);
            skillsDTO.setCpp(Cpp);
            skillsDTO.setJava(Java);
            skillsDTO.setUnix(Unix);
            skillsDTO.setHTML(HTML);
            skillsDTO.setXML(XML);
            skillsDTO.setDataBases(DataBases);
            skillsDTO.setSoftwareEngineering(SoftwareEngineering);
            skillsDTO.setTestingMethodologies(TestingMethodologies);
            skillsDTO.setHardwareconcepts(Hardwareconcepts);
            skillsDTO.setNetworking(Networking);
            skillsDTO.setExperience_or_fresher(experience_or_fresher);
            skillsDTO.setExperience_in_years(experience_in_years);
            skillsDTO.setExperience_in_months(experience_in_months);
            skillsDTO.setAcademic_achievements(academic_achievements);
            skillsDTO.setCocurricular_achievements(cocurricular_achievements);
            skillsDTO.setUserId(userId);
            skillsDTO.setOrgname(orgname);
            skillsDTO.setIndname(indname);
            skillsDTO.setJobrole1(jobrole1);
            skillsDTO.setCursal(cursal);
            skillsDTO.setExpsal(expsal);
            skillsDTO.setUploadFileFileName(uploadFileFileName);
            System.out.println("Test:--> POJO UserId:" + skillsDTO.getUserId());
            skillsBo.insertSkillsDetails(skillsDTO);
            System.out.println("Skills Inserted Successfully");
            addActionMessage("Skills Saved Successfully");
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }
    
    public void setSkillsfromList() {
        int i;
        if (selectedskills != null) {
            int k = selectedskills.size();
            Object[] skillselection = selectedskills.toArray();
            for (i = 0; i < selectedskills.size(); i++) {
                System.out.println(skillselection[i]);
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("C-programming")) {
                    Cprogramming = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("C++")) {
                    Cpp = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("HTML")) {
                    HTML = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("Unix")) {
                    Unix = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("Java")) {
                    Java = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("XML")) {
                    XML = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("software engineering")) {
                    SoftwareEngineering = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("Testing Methodologies")) {
                    TestingMethodologies = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("DataBases")) {
                    DataBases = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("Hardware Concepts")) {
                    Hardwareconcepts = 1;
                }
            }
            for (i = 0; i < k; i++) {
                if (skillselection[i].equals("Networking")) {
                    Networking = 1;
                }
            }
        }
    }
    
    public String updateSkillsDetails() {
        if (isSessionAlive()) {
            if (uploadFileFileName != null) {
                String ret = insertSkillsDetails();
                return ret;
            }
            userId = (String) session.get("userid");
            System.out.println("<-- Update Skills Details -->");
            setSkillsfromList();
            skillsDTO.setCprogramming(Cprogramming);
            skillsDTO.setCpp(Cpp);
            skillsDTO.setJava(Java);
            skillsDTO.setUnix(Unix);
            skillsDTO.setHTML(HTML);
            skillsDTO.setXML(XML);
            skillsDTO.setDataBases(DataBases);
            skillsDTO.setSoftwareEngineering(SoftwareEngineering);
            skillsDTO.setTestingMethodologies(TestingMethodologies);
            skillsDTO.setHardwareconcepts(Hardwareconcepts);
            skillsDTO.setNetworking(Networking);
            skillsDTO.setExperience_or_fresher(experience_or_fresher);
            skillsDTO.setExperience_in_years(experience_in_years);
            skillsDTO.setExperience_in_months(experience_in_months);
            skillsDTO.setAcademic_achievements(academic_achievements);
            skillsDTO.setCocurricular_achievements(cocurricular_achievements);
            skillsDTO.setUserId(userId);
            skillsDTO.setOrgname(orgname);
            skillsDTO.setIndname(indname);
            skillsDTO.setJobrole1(jobrole1);
            skillsDTO.setCursal(cursal);
            skillsDTO.setExpsal(expsal);
            skillsDTO.setUploadFileFileName(displayfile);
            uploadFileFileName = displayfile;
            skillsBo.insertSkillsDetails(skillsDTO);
            System.out.println("Skills Saved Successfully");
            addActionMessage("Skills Saved Successfully");
            return "success";
        } else {
            addActionError("session expired");
            return "ERROR";
        }
    }
}
