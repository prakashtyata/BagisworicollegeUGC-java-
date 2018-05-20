package com.bagiswori.core.mis.service;

import java.util.List;

import com.bagiswori.core.mis.data.Student;

/**
 * 
 * @author RajaramPakur
 *
 */
public interface IStudentService {

	public Student createStudent(Student student);

	public Student deleteById(Long id);

	public List<Student> findAll();

	public Student update(Student student);

	public Student findById(Long id);

	public List<Student> findByFirstName(String firstName);

}
