package com.bagiswori.core.mis.service.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bagiswori.core.mis.data.Address;
import com.bagiswori.core.mis.data.Student;
import com.bagiswori.core.security.data.User;
import com.bagiswori.core.security.data.UserProfile;

public class StudentServiceTest {

	public static Student getStudentObject(Student student) {
		student.setDateOfBirth("25/02/1994");
		student.setEthnicGroup("Janajati");
		student.setFirstName("Raja");
		student.setGender("femalet");
		student.setImageDir("D:\\eclipse-workspace\\mis-bagiswori-college\\src\\main\\resources");
		student.setLastName("Pakur");
		student.setMiddleName("Ram");
		student.setNationality("Nepali");
		student.setReligion("Hindu");
		student.setCollegeRollNo("28");
		student.setRegistrationNo("23232323");
		student.setUser(getUser());
		return student;
	}

	public static User getUser() {
		User user = new User();
		user.setEmail("raja@gmail.com");
		user.setFirstName("Rajaram");
		user.setLastName("Pakur");
		user.setNickName("Pakur");
		UserProfile userProfile = new UserProfile();
		Set<UserProfile> userProfileSet = new HashSet<>();
		userProfile.setId(1L);
		userProfileSet.add(userProfile);
		System.out.println("test");
		user.setUserProfiles(userProfileSet);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode("pakur"));
		user.setSsoId("hello");
//		user.setStudent(getStudentObject(student));
		user.setAddressList(getAddress());
		return user;
	}

	private static List<Address> getAddress() {
		List<Address> addressList = new ArrayList<>();
		Address address = new Address();
		address.setCountry("Nepal");
		address.setDistrict("Bhaktapur");
		address.setMuncipalityVdc("Suryabinayak");
		address.setState("3");
		address.setZone("Bagmati");
		address.setWardNo(10);
		addressList.add(address);
		return addressList;
	}

}
