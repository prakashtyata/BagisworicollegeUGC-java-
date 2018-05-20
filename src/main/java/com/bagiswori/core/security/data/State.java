package com.bagiswori.core.security.data;

/**
 * 
 * @author RajaramPakur
 *
 */
public enum State {

	ACTIVE("Active"), INACTIVE("Inactive"), DELETED("Deleted"), LOCKED("Locked");

	private String state;

	private State(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	@Override
	public String toString() {
		return this.state;
	}

}
