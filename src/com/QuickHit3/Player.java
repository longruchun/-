
package com.QuickHit3;

import java.util.Date;

public class Player {
	String name;// 姓名
	int LevelNo;// 当前玩家所处级别
	long beginDate;// 本级别开始时间
	int score;//玩家当前积分
	
	

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Player(String name, int levelNo) {
		this.name = name;
		LevelNo = levelNo;
	}

	

	public Player(String name, int levelNo, long beginDate, int score) {
		super();
		this.name = name;
		LevelNo = levelNo;
		this.beginDate = beginDate;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevelNo() {
		return LevelNo;
	}

	public void setLevelNo(int levelNo) {
		LevelNo = levelNo;
	}

	public long getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(long beginDate) {
		this.beginDate = beginDate;
	}

	
	
	boolean isPassLevel() {
		int times=score/LevelHelper.levels[LevelNo-1].getPerScore();
		return times>=LevelHelper.levels[LevelNo-1].getStrTimes();
	}

}
