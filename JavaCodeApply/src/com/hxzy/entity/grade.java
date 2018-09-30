package com.hxzy.entity;

public class grade {
	int gradeId;
	String gradeName;

	/**
	 * @param gradeId
	 * @param gradeName
	 */
	public grade(int gradeId, String gradeName) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
	}

	/**
	 * 
	 */
	public grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public grade(String gradeName) {
		super();
		this.gradeName = gradeName;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

}
