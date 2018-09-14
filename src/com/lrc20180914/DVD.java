package com.lrc20180914;

public class DVD {
   String filmNam;
   String  status;
   static DVD  _dvd;
   
   
private DVD() {
	super();
	// TODO Auto-generated constructor stub
}

public  static DVD get_dvd() {
	
	if (_dvd==null) {
		_dvd=new DVD();
	}
	
	return _dvd;
}

 public void playing() {
	 
	 
	 System.out.println("ÕýÔÚ²¥·Å"+this.filmNam);
 }
 









public String getFilmNam() {
	return filmNam;
}
public void setFilmNam(String filmNam) {
	this.filmNam = filmNam;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private DVD(String filmNam) {
	super();
	this.filmNam = filmNam;
}
   
   
	
}
