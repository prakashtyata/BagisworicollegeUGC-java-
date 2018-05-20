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

import com.bagiswori.core.mis.controller.IUserServiceController;
import com.bagiswori.core.security.data.User;
import com.bagiswori.core.security.service.IUserService;

/**
 * 
 * @author RajaramPakur
 *
 */
@Service
public class UserServiceControllerImpl implements IUserServiceController {

	private final Logger logger = LoggerFactory.getLogger(UserServiceControllerImpl.class);

	@Autowired
	private IUserService userService;

	public ModelAndView newUserForm() {
		logger.debug("newUserForm()");
		ModelAndView mav = new ModelAndView("userRegForm", "user", new User());
		return mav;
	}

	public String processStudentFormSubmit(@ModelAttribute("user") User user, BindingResult result, ModelMap model) {
		logger.debug("processStudentFormSubmit()");
		if (result.hasErrors()) {
			return "errorPage";
		}
		userService.createUser(user);
		model.addAttribute("user", user);
		return "userHome";
	}

	public ModelAndView userListPage() {
		logger.debug("userListPage()");
		ModelAndView mav = new ModelAndView("userList");
		List<User> studentList = userService.findAll();
		mav.addObject("userList", studentList);
		return mav;
	}

	public ModelAndView editUserPage(@PathVariable Long id) {
		logger.debug("editUserPage() " + id);
		ModelAndView mav = new ModelAndView("userEdit");
		User user = userService.findById(id);
		mav.addObject("user", user);
		return mav;
	}

	public ModelAndView editUser(@ModelAttribute User user, @PathVariable Long id,
			final RedirectAttributes redirectAttributes) {
		logger.debug("editUser() " + id);
		ModelAndView mav = new ModelAndView("redirect:/user");
		String message = new StringBuilder().append("User ").append(user.getFirstName())
				.append("was successfully updated.").toString();
		userService.update(user);
		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	public ModelAndView deleteUser(@PathVariable Long id, final RedirectAttributes redirectAttributes) {
		logger.debug("deleteUser() " + id);
		ModelAndView mav = new ModelAndView("redirect:/user");
		User user = userService.deleteById(id);
		String message = "The user " + user.getFirstName() + " was successfully deleted.";

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

}
