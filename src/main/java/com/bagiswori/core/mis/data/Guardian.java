package com.bagiswori.core.mis.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.bagiswori.core.data.LongBase;
import com.bagiswori.core.security.data.User;

/**
 * 
 * @author RajaramPakur
 *
 */
@XmlRootElement
@Entity
@Table(name = "GUARDIAN")
public class Guardian extends LongBase {

	private static final long serialVersionUID = -4326016590978909352L;

	@Column(name = "FULLNAME", nullable = false)
	private String fullName;

	@Column(name = "MOBILENO")
	private Long mobileNo;

	@Column(name = "RELATION", nullable = false)
	private String state = StudentGuardianRelation.FATHER.getRelation();

	@OneToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_ID")
	private User user;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_ID", nullable = false)
	private Student student;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Guardian [fullName=" + fullName + ", mobileNo=" + mobileNo + ", user=" + user + ", student=" + student
				+ ", id=" + id + "]";
	}

}
