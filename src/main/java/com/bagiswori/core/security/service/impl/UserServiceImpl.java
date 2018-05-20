package com.bagiswori.core.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bagiswori.core.security.dao.IUserDAO;
import com.bagiswori.core.security.data.User;
import com.bagiswori.core.security.service.IUserService;

@Service("iUserService")
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDAO userDAO;

	@Override
	public User findById(Long userId) {
		return userDAO.findOne(userId);
	}

	@Override
	public User findBySSO(String ssoId) {
		return userDAO.findBySsoId(ssoId);
	}

	@Override
	public User createUser(User user) {
		return userDAO.save(user);
	}

	@Override
	public User deleteById(Long id) {
		User user = findById(id);
		if (user != null) {
			userDAO.delete(id);
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public User update(User user) {
		if (findById(user.getId()) != null) {
			userDAO.save(user);
		}
		return user;
	}

}
