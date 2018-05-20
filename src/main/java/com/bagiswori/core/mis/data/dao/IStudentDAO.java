package com.bagiswori.core.mis.data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bagiswori.core.mis.data.Student;

/**
 * 
 * @author RajaramPakur
 *
 */
public interface IStudentDAO extends JpaRepository<Student, Long> {
	
	public List<Student> findByFirstNameContainingIgnoreCase(String firstName);
	
	public List<Student> findByFirstNameOrLastNameContainingIgnoreCase(String firstName, String lastName);
	
	public List<Student> findByEthnicGroupContainingIgnoreCase(String ethnicGroup);
	
	public List<Student> findByReligionContainingIgnoreCase(String religion);
	
	public Student findByRegistrationNo(String registrationNo);
	
	public Student findByCollegeRollNo(String collegeRollNo);

}
