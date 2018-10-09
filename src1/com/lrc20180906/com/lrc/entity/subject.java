package com.lrc.entity;

public class subject {
   int subjectNo;
   String subjectName;
   int classHour;
   int gradeId;
public int getSubjectNo() {
	return subjectNo;
}
public void setSubjectNo(int subjectNo) {
	this.subjectNo = subjectNo;
}
public String getSubjectName() {
	return subjectName;
}
public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}
public int getClassHour() {
	return classHour;
}
public void setClassHour(int classHour) {
	this.classHour = classHour;
}
public int getGradeId() {
	return gradeId;
}
public void setGradeId(int gradeId) {
	this.gradeId = gradeId;
}
/**
 * @param subjectNo
 * @param subjectName
 * @param classHour
 * @param gradeId
 */
public subject(int subjectNo, String subjectName, int classHour, int gradeId) {
	super();
	this.subjectNo = subjectNo;
	this.subjectName = subjectName;
	this.classHour = classHour;
	this.gradeId = gradeId;
}
/**
 * 
 */
public subject() {
	super();
	// TODO Auto-generated constructor stub
}

public subject(String subjectName, int classHour, int gradeId) {
	super();
	this.subjectName = subjectName;
	this.classHour = classHour;
	this.gradeId = gradeId;
}
   
   
}
