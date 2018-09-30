package com.lrc.Subject;

import java.util.List;

import com.lrc.until.IBaseDao;

public interface Isubject extends IBaseDao<Subject> {
     int add(Subject sb);
     int update(Subject sb);
	 int  delete(int subjectid);
	 
	 List getAll();
	
	
	
	
	
}
