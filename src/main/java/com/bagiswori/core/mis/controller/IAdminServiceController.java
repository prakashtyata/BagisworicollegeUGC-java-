package com.bagiswori.core.mis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author RajaramPakur
 *
 */
@Controller
@RequestMapping(value = "/admin")
public interface IAdminServiceController {

	@RequestMapping(method = RequestMethod.GET)
	public String adminPage();

}
