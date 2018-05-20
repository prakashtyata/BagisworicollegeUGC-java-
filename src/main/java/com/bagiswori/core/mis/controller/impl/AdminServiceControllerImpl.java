package com.bagiswori.core.mis.controller.impl;

import org.springframework.stereotype.Service;

import com.bagiswori.core.mis.controller.IAdminServiceController;

/**
 * 
 * @author RajaramPakur
 *
 */
@Service
public class AdminServiceControllerImpl implements IAdminServiceController {

	public String adminPage() {
		return "adminHome";
	}
}
