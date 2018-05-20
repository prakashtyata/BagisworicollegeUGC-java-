package com.bagiswori.core.mis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bagiswori.core.mis.data.Student;
/**
 * 
 * @author RajaramPakur
 *
 */
@Controller
@RequestMapping(value = "/admin/student")
public interface IStudentServiceController {

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView newStudentForm();

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String processStudentFormSubmit(@ModelAttribute("student") Student student, BindingResult result,
			ModelMap model);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView studentListPage();

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editStudentPage(@PathVariable Long id);

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editStudent(@ModelAttribute Student student, @PathVariable Long id,
			final RedirectAttributes redirectAttributes);

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteStudent(@PathVariable Long id, final RedirectAttributes redirectAttributes);

}
