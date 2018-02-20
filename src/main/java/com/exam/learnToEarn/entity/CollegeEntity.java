package com.exam.learnToEarn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class CollegeEntity {
	@Id
	@GeneratedValue
	@Column(name="collegeid")
	private Long collegeId;
	@Column(name="collegename")
	private String collegeName;
	@Column(name="collegeyear")
	private String collegeYear;
	@Column(name="branchname")
	private String branchName;
	@Column(name="address",length=2000)
	private String collegeLocation;
	
	public Long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeYear() {
		return collegeYear;
	}
	public void setCollegeYear(String collegeYear) {
		this.collegeYear = collegeYear;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}
	@Override
	public String toString() {
		return "CollegeEntity [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeYear=" + collegeYear
				+ ", branchName=" + branchName + ", collegeLocation=" + collegeLocation + "]";
	}
	
}
