package com.bagiswori.core.mis.data.utils;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.bagiswori.core.mis.data.Guardian;
import com.bagiswori.core.mis.data.Student;
import com.bagiswori.core.security.data.User;

/**
 * 
 * @author RajaramPakur
 *
 */
@XmlRootElement
public class UserDetails {

	private User user;

	private Student student;

	private List<Guardian> guardianList;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Guardian> getGuardianList() {
		return guardianList;
	}

	public void setGuardianList(List<Guardian> guardianList) {
		this.guardianList = guardianList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
