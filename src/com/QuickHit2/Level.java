package com.QuickHit2;

public class Level {
    int levelNo;//������
    int strLength;//������ַ�������
    int strTimes;//�ü���Ҫ������ַ�������
    int perScore;//ÿ��ȷ����һ���������
    int limitTime;//ʱ������
	
    
    
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
