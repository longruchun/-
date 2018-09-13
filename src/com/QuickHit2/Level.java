package com.QuickHit2;

public class Level {
    int levelNo;//级别编号
    int strLength;//输出的字符串长度
    int strTimes;//该级别要输出的字符串次数
    int perScore;//每正确输入一次所获积分
    int limitTime;//时间限制
	
    
    
    public Level() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Level(int levelNo, int strLength, int strTimes, int perScore, int limitTime) {
		super();
		this.levelNo = levelNo;
		this.strLength = strLength;
		this.strTimes = strTimes;
		this.perScore = perScore;
		this.limitTime = limitTime;
	}
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
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
	public int getPerScore() {
		return perScore;
	}
	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}
	public int getLimitTime() {
		return limitTime;
	}
	public void setLimitTime(int limitTime) {
		this.limitTime = limitTime;
	}
    
    
}
