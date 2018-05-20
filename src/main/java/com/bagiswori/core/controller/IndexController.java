package com.bagiswori.core.controller;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bagiswori.core.exception.DataNotFoundException;

/**
 * 
 * @author RajaramPakur
 *
 */
@Controller
public class IndexController {

	@Autowired
	private AuthenticationTrustResolver authenticationTrustResolver;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String dbaPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());
		return "userHome";
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String studentPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());
		return "studentHome";
	}

	@RequestMapping(value = "/staff", method = RequestMethod.GET)
	public String staffPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());
		return "staffHome";
	}

	@RequestMapping(value = "/default", method = RequestMethod.GET)
	public String defaultLoginPage(ModelMap model) {
		Set<String> role = getPrincipalRole();
		if (role.contains("ROLE_ADMIN")) {
			return "redirect:/admin";
		} else if (role.contains("ROLE_ADMIN") || role.contains(("ROLE_USER"))) {
			return "redirect:/user";
		} else if (role.contains("ROLE_STUDENT")) {
			return "redirect:/student";
		} else if (role.contains("ROLE_STAFF")) {
			return "redirect:/staff";
		} else {
			return "redirect:/login?error";
		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPagePost() {
		if (isCurrentAuthenticationAnonymous()) {
			return "login";
		} else {
			return "redirect:/default";
		}
	}

	@RequestMapping("/runtimetest")
	public void testHandler() {
		throw new RuntimeException("run time testing");
	}

	@RequestMapping("/notfoundtest")
	public void notFoundTestHandler() {
		throw new DataNotFoundException(444, "Data not found testing");
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
			request.getSession().invalidate();
		}
		return "redirect:/login?logout";
	}

	private String getPrincipal() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

	private Set<String> getPrincipalRole() {
		Set<String> role = new HashSet<>();
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			((UserDetails) principal).getAuthorities().stream().forEach(map -> role.add(map.getAuthority()));
		}
		return role;
	}

	/**
	 * This method returns true if users is already authenticated [logged-in], else
	 * false.
	 */
	private boolean isCurrentAuthenticationAnonymous() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authenticationTrustResolver.isAnonymous(authentication);
	}
}
