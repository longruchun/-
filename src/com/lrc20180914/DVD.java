package com.lrc20180914;

public class DVD {
   String filmNam;//电影名字
   String  status;//电影的状态
   static DVD  _dvd;//实例化一个静态DVD对象
   
   
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
	 
	 
	 System.out.println("正在播放"+this.filmNam);
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
