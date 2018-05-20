package com.bagiswori.core.mis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bagiswori.core.mis.data.Student;
import com.bagiswori.core.mis.data.dao.IStudentDAO;
import com.bagiswori.core.mis.service.IStudentService;

/**
 * 
 * @author RajaramPakur
 *
 */
@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDAO studentDAO;

	@Override
	public Student createStudent(Student student) {
		studentDAO.save(student);
		return student;
	}

	@Override
	public Student deleteById(Long id) {
		Student student = findById(id);
		if (student != null) {
			studentDAO.delete(id);
		}
		return student;
	}

	@Override
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	@Override
	public Student update(Student student) {
		if (findById(student.getId()) != null) {
			studentDAO.save(student);
		}
		return student;
	}

	@Override
	public Student findById(Long id) {
		return studentDAO.findOne(id);
	}

	@Override
	public List<Student> findByFirstName(String firstName) {
		return studentDAO.findByFirstNameContainingIgnoreCase(firstName);
	}

}
