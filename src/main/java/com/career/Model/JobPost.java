package com.career.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobposts")
public class JobPost implements Serializable {

    @Id
    @Column(name = "jobid")
    String jobid;
    @Column(name = "jobpostdate")
    String jobPostDate;
    @Column(name = "jobfield")
    String jobField;
    @Column(name = "jobtype")
    String jobType;
    @Column(name = "jobRole")
    String jobRole;
    @Column(name = "Qualification")
    String educationQualification;
    @Column(name = "experience")
    String experience;
    @Column(name = "yearOfPassing")
    String yearOfPassing;
    @Column(name = "jobDescription")
    String jobDescription;
    @Column(name = "salaryPay")
    String salaryPay;
    @Column(name = "Location")
    String jobLocation;
    @Column(name = "noOfVacancies")
    String noOfVacancies;
    @Column(name = "skill")
    String skills;
    @Column(name = "contact")
    String contactno;

    public String getNoOfVacancies() {
        return noOfVacancies;
    }

    public void setNoOfVacancies(String noOfVacancies) {
        this.noOfVacancies = noOfVacancies;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobField() {
        return jobField;
    }

    public void setJobField(String jobField) {
        this.jobField = jobField;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobPostDate() {
        return jobPostDate;
    }

    public void setJobPostDate(String jobPostDate) {
        this.jobPostDate = jobPostDate;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getSalaryPay() {
        return salaryPay;
    }

    public void setSalaryPay(String salaryPay) {
        this.salaryPay = salaryPay;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(String yearOfPassing) {
        this.yearOfPassing = yearOfPassing;

    }
}
