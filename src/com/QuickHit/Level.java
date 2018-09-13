package com.QuickHit;

public class Level {
   private  int levelno;//级别号
   private  int strLength;//字符串的长度
   private int   strTimes;//字符串的次数
   private int    timeLimit;//时间限制
   private int    perScore;//正确输入一次得分
public int getLevelno() {
	return levelno;
}
public void setLevelno(int levelno) {
	this.levelno = levelno;
}
public int getStrLength() {
	return strLength;
}
public void setStrLength(int strLength) {
	this.strLength = strLength;
}
public int getStrTimes() {
	return strTimes;
}
public void setStrTimes(int strTimes) {
	this.strTimes = strTimes;
}
public int getTimeLimit() {
	return timeLimit;
}
public void setTimeLimit(int timeLimit) {
	this.timeLimit = timeLimit;
}
public int getPerScore() {
	return perScore;
}
public void setPerScore(int perScore) {
	this.perScore = perScore;
}
public Level(int levelno, int strLength, int strTimes, int timeLimit, int perScore) {
	super();
	this.levelno = levelno;
	this.strLength = strLength;
	this.strTimes = strTimes;
	this.timeLimit = timeLimit;
	this.perScore = perScore;
}
public Level() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
	
	
	
	
}
