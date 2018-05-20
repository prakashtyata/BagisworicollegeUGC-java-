package com.bagiswori.core.mis.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bagiswori.core.mis.controller.IStudentServiceController;
import com.bagiswori.core.mis.data.Student;
import com.bagiswori.core.mis.service.IStudentService;
import com.bagiswori.core.mis.service.test.StudentServiceTest;

/**
 * 
 * @author RajaramPakur
 *
 */
@Service
public class StudentServiceControllerImpl implements IStudentServiceController {

	private final Logger logger = LoggerFactory.getLogger(StudentServiceControllerImpl.class);

	@Autowired
	private IStudentService studentService;

	@Override
	public ModelAndView newStudentForm() {
		logger.debug("newStudentForm()");
		return new ModelAndView("studentRegForm", "student", new Student());

	}

	@Override
	public String processStudentFormSubmit(@ModelAttribute("student") Student student, BindingResult result,
			ModelMap model) {
		logger.debug("processStudentFormSubmit()");
		if (result.hasErrors()) {
			return "create";
		}
		StudentServiceTest.getStudentObject(student);
		studentService.createStudent(student);
		model.addAttribute("student", student);
		return "studentHome";
	}

	@Override
	public ModelAndView studentListPage() {
		logger.debug("studentListPage()");
		ModelAndView mav = new ModelAndView("studentList");
		List<Student> studentList = studentService.findAll();
		mav.addObject("studentList", studentList);
		return mav;
	}

	@Override
	public ModelAndView editStudentPage(@PathVariable Long id) {
		logger.debug("editStudentPage()" + id);
		ModelAndView mav = new ModelAndView("studentEdit");
		Student student = studentService.findById(id);
		mav.addObject("student", student);
		return mav;
	}

	@Override
	public ModelAndView editStudent(@ModelAttribute Student student, @PathVariable Long id,
			final RedirectAttributes redirectAttributes) {
		logger.debug("editStudent()" + id);
		ModelAndView mav = new ModelAndView("redirect:/student");
		String message = "Student was successfully updated.";
		studentService.update(student);
		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	@Override
	public ModelAndView deleteStudent(@PathVariable Long id, final RedirectAttributes redirectAttributes) {
		logger.debug("deleteStudent()" + id);
		ModelAndView mav = new ModelAndView("redirect:/student");
		Student student = studentService.deleteById(id);
		String message = "The student " + student.getFirstName() + " was successfully deleted.";

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

}
