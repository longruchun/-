package com.lrcgrade;

public class grade {
	int gradeid;
	String gradeName;
	
	

	/**
	 * 
	 */
	public grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public grade(String gradeName) {

		this.gradeName = gradeName;
	}
	
	

	/**
	 * @param gradeid
	 * @param gradeName
	 */
	public grade(int gradeid, String gradeName) {
		super();
		this.gradeid = gradeid;
		this.gradeName = gradeName;
	}



	public int getGradeid() {
		return gradeid;
	}

	public void setGradeid(int gradeid) {
		this.gradeid = gradeid;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

}
