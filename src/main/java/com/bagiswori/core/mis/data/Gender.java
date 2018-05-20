package com.bagiswori.core.mis.data;

/**
 * 
 * @author RajaramPakur
 *
 */
public enum Gender {
	
	MALE("MALE"), FEMALE("FEMALE"), OTHER("OTHER");
	
	private String gender;
	
	private Gender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}


}
