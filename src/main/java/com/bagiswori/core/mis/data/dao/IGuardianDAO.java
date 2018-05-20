package com.bagiswori.core.mis.data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bagiswori.core.mis.data.Guardian;

/**
 * 
 * @author RajaramPakur
 *
 */
public interface IGuardianDAO extends JpaRepository<Guardian, Long> {

	public List<Guardian> findByFullNameContainingIgnoreCase(String fullName);
	
	public List<Guardian> findByMobileNo(Long mobileNo);
	

}
