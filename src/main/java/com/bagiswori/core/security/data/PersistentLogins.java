package com.bagiswori.core.security.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author RajaramPakur
 *
 */
@Entity
@Table(name = "PERSISTENT_LOGINS")
public class PersistentLogins implements Serializable {

	private static final long serialVersionUID = 3726310599895603911L;

	@Id
	@Column(name = "series", nullable = false)
	private String series;
	@Column
	private String username;
	@Column
	private String token;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date last_used;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getLast_used() {
		return last_used;
	}

	public void setLast_used(Date last_used) {
		this.last_used = last_used;
	}

}
