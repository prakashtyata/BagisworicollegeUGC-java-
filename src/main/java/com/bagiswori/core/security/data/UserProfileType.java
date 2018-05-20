package com.bagiswori.core.security.data;

/**
 * 
 * @author RajaramPakur
 *
 */
public enum UserProfileType {

	USER("USER"), STUDENT("STUDENT"), ADMIN("ADMIN"), STAFF("STAFF"), GUARDIAN("GUARDIAN");

	private String userProfileType;

	private UserProfileType(String userProfileType) {
		this.userProfileType = userProfileType;
	}

	public String getUserProfileType() {
		return userProfileType;
	}

}
