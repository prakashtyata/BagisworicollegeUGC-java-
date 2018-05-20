package com.bagiswori.core.mis.data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bagiswori.core.mis.data.Address;
import com.bagiswori.core.security.data.User;

/**
 * 
 * @author RajaramPakur
 *
 */
public interface IAddressDAO extends JpaRepository<Address, Long> {

	public List<User> findByState(String stateName);

	public List<User> findByDistrict(String district);

	public List<User> findByMuncipalityVdc(String muncipalityVdc);

	public List<User> findByDistrictAndMuncipalityVdcAndWardNo(String district, String muncipalityVdc, String wardNo);

}
