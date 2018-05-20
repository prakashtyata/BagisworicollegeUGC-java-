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

import com.bagiswori.core.security.data.User;

/**
 * 
 * @author RajaramPakur
 *
 */
@Controller
@RequestMapping(value = "/admin/user")
public interface IUserServiceController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView newUserForm();

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String processStudentFormSubmit(@ModelAttribute("user") User user, BindingResult result, ModelMap model);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView userListPage();

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editUserPage(@PathVariable Long id);

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editUser(@ModelAttribute User user, @PathVariable Long id,
			final RedirectAttributes redirectAttributes);

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable Long id, final RedirectAttributes redirectAttributes);
}
