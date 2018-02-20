package com.exam.learnToEarn.entity;

import static javax.persistence.FetchType.LAZY;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class StudentEntity {
	
	@Id
	@GeneratedValue
	@Column(name="studentId")
	private Long studentId;
	
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "dob")
	private LocalDate dateOfBirth;
	
	@Column(name = "mobile")
	private Integer contactNumber;
	 
	@Column(name = "email")
	private String emailId;
	 
	@Column(name = "fathername")
	private String fathersName;
	 
	@Column(name = "mothername")
	private String mothersName;
	 
	@Column(name = "address")
	private String address;
	 
	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "collegeid")
	private CollegeEntity collegeEntity;
	 
	@Column(name = "collegeid")
	private String collegeId;
	 
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zipcode")
	private String zipCode;
	
	@Column(name = "gender")
	private char gender;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CollegeEntity getCollegeEntity() {
		return collegeEntity;
	}

	public void setCollegeEntity(CollegeEntity collegeEntity) {
		this.collegeEntity = collegeEntity;
	}

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", contactNumber=" + contactNumber + ", emailId=" + emailId
				+ ", fathersName=" + fathersName + ", mothersName=" + mothersName + ", address=" + address
				+ ", collegeEntity=" + collegeEntity + ", collegeId=" + collegeId + ", state=" + state + ", country="
				+ country + ", zipCode=" + zipCode + ", gender=" + gender + "]";
	}
	
	
}
