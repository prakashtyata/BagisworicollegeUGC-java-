package com.bagiswori.core.security.service;

import java.util.List;

import com.bagiswori.core.security.data.User;

public interface IUserService {

	public User createUser(User user);

	public User deleteById(Long id);

	public List<User> findAll();

	public User update(User user);

	public User findById(Long userId);

	public User findBySSO(String ssoId);
}
