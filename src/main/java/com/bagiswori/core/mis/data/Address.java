package com.bagiswori.core.mis.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.bagiswori.core.data.LongBase;
import com.bagiswori.core.security.data.User;

/**
 * 
 * @author RajaramPakur
 *
 */
@XmlRootElement
@Entity
@Table(name = "ADDRESS")
public class Address extends LongBase {

	private static final long serialVersionUID = -4946577646168411411L;

	@Column(name = "COUNTRY", nullable = false)
	private String country;

	@Column(name = "STATE", nullable = false)
	private String state;

	@Column(name = "ZONE", nullable = false)
	private String zone;

	@Column(name = "DISTRICT", nullable = false)
	private String district;

	@Column(name = "MUNCIPALORVDC", nullable = false)
	private String muncipalityVdc;

	@Column(name = "WARDNO", nullable = false)
	private int wardNo;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "addressList", targetEntity = User.class)
	private List<User> user = new ArrayList<>();

	public static class Builder {

		private final Address address = new Address();

		public Builder create() {
			return new Builder();
		}

		public Address build() {
			return this.address;
		}

		public Builder setCountry(String country) {
			this.setCountry(country);
			return this;
		}

		public Builder setState(String state) {
			this.setState(state);
			return this;
		}

		public Builder setZone(String zone) {
			this.setZone(zone);
			return this;
		}

		public Builder setDistrict(String district) {
			this.setDistrict(district);
			return this;
		}

		public Builder setMuncipalityVdc(String muncipalityVdc) {
			this.setMuncipalityVdc(muncipalityVdc);
			return this;
		}

		public Builder setWardNo(int wardNo) {
			this.setWardNo(wardNo);
			return this;
		}

	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMuncipalityVdc() {
		return muncipalityVdc;
	}

	public void setMuncipalityVdc(String muncipalityVdc) {
		this.muncipalityVdc = muncipalityVdc;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

}
