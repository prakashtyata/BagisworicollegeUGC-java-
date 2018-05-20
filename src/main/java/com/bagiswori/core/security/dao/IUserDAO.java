package com.bagiswori.core.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bagiswori.core.security.data.User;

/**
 * 
 * @author RajaramPakur
 *
 */
public interface IUserDAO extends JpaRepository<User, Long> {

	public User findBySsoId(String ssoId);
}
