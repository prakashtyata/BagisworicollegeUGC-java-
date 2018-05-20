package com.bagiswori.core.security.data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.bagiswori.core.data.LongBase;

/**
 * 
 * @author RajaramPakur
 *
 */
@XmlRootElement
@Entity
@Table(name = "USER_PROFILE")
public class UserProfile extends LongBase {

	private static final long serialVersionUID = 6312586653024971695L;

	@Column(name = "TYPE", length = 15, unique = true, nullable = false)
	private String type = UserProfileType.USER.getUserProfileType();

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "userProfiles", targetEntity = User.class)
	private Set<User> user = new HashSet<User>();

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "UserProfile [type=" + type + ", id=" + id + "]";
	}

}
