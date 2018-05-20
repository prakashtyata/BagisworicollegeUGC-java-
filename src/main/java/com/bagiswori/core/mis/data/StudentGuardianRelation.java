package com.bagiswori.core.mis.data;

/**
 * 
 * @author RajaramPakur
 *
 */
public enum StudentGuardianRelation {

	FATHER("FATHER"), MOTHER("MOTHER"), BROTHER("BROTHER"), SISTER("SISTER"), UNCLE("UNCLE");

	private String relationType;

	private StudentGuardianRelation(String relationType) {
		this.relationType = relationType;
	}

	public String getRelation() {
		return relationType;
	}

}
