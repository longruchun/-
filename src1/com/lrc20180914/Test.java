package com.lrc20180914;

public class Test {
  public static void main(String[] args) {
	DVD dvd1=DVD.get_dvd();
	dvd1.setFilmNam("����");
	
	DVD dvd2=DVD.get_dvd();
	dvd1.setFilmNam("�䵱");
	dvd1.playing();
	dvd2.playing();
	
	
}
}
