package com.bagiswori.core.mis.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "STUDENT")
public class Student extends LongBase {

	private static final long serialVersionUID = 5519530856055982952L;

	@Column(name = "FIRST_NAME", nullable = false, length = 100)
	private String firstName;

	@Column(name = "MIDDLE_NAME", nullable = true, length = 100)
	private String middleName;

	@Column(name = "LAST_NAME", nullable = false, length = 100)
	private String lastName;

	@Column(name = "GENDER", nullable = false)
	private String gender = Gender.MALE.getGender();

	@Column(name = "DATE_OF_BIRTH", nullable = false)
	private String dateOfBirth;

	@Column(name = "NATIONALITY", nullable = true)
	private String nationality;

	@Column(name = "ETHNIC_GROUP", nullable = true)
	private String ethnicGroup;

	@Column(name = "RELIGION", nullable = true)
	private String religion;

	@Column(name = "REGISTRATION_NO", nullable = false, unique = true)
	private String registrationNo;

	@Column(name = "COLLEGE_ROLL_NO", nullable = false, unique = true, length = 7)
	private String collegeRollNo;

	@Column(name = "IMAGE_DIR")
	private String imageDir;

	@OneToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL, CascadeType.REMOVE }, optional = false)
	@JoinColumn(name = "USER_ID")
	private User user;

	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, targetEntity = Guardian.class)
	private List<Guardian> guardian;

	public static class Builder {

		private final Student student = new Student();

		public Builder create() {
			return new Builder();
		}

		public Student build() {
			return this.student;
		}

		public Builder setFirstName(String firstName) {
			this.setFirstName(firstName);
			return this;
		}

		public Builder setMiddlename(String middleName) {
			this.setMiddlename(middleName);
			return this;
		}

		public Builder setLastName(String lastName) {
			this.setLastName(lastName);
			return this;
		}

		public Builder setGender(String gender) {
			this.setGender(gender);
			return this;
		}

		public Builder setDateOfBirth(String dateOfBirth) {
			this.setDateOfBirth(dateOfBirth);
			return this;
		}

		public Builder setNationality(String nationality) {
			this.setNationality(nationality);
			return this;
		}

		public Builder setEthnicGroup(String ethnicGroup) {
			this.setEthnicGroup(ethnicGroup);
			return this;
		}

		public Builder setReligion(String religion) {
			this.setReligion(religion);
			return this;
		}

		public Builder setRegistrationNo(String registrationNo) {
			this.setRegistrationNo(registrationNo);
			return this;
		}

		public Builder setCollegeRollNo(String collegeRollNo) {
			this.setCollegeRollNo(collegeRollNo);
			return this;
		}

		public Builder setImageDir(String imageDir) {
			this.setImageDir(imageDir);
			return this;
		}

		public Builder setUser(User user) {
			this.setUser(user);
			return this;
		}
	}

	// public List<Guardian> getGuardian() {
	// return guardian;
	// }
	//
	// public void setGuardian(List<Guardian> guardian) {
	// this.guardian = guardian;
	// }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEthnicGroup() {
		return ethnicGroup;
	}

	public void setEthnicGroup(String ethnicGroup) {
		this.ethnicGroup = ethnicGroup;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getCollegeRollNo() {
		return collegeRollNo;
	}

	public void setCollegeRollNo(String collegeRollNo) {
		this.collegeRollNo = collegeRollNo;
	}

	public String getImageDir() {
		return imageDir;
	}

	public void setImageDir(String imageDir) {
		this.imageDir = imageDir;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// @Override
	// public String toString() {
	// return "Student [firstName=" + firstName + ", middleName=" + middleName + ",
	// lastName=" + lastName + ", gender="
	// + gender + ", dateOfBirth=" + dateOfBirth + ", nationality=" + nationality +
	// ", ethnicGroup="
	// + ethnicGroup + ", religion=" + religion + ", registrationNo=" +
	// registrationNo + ", collegeRollNo="
	// + collegeRollNo + ", imageDir=" + imageDir + ", user=" + user + ", guardian="
	// + guardian + ", id=" + id
	// + "]";
	// }

}
