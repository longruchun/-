package com.lrc20180912ploymorphism;

public class Kid implements I_her_father, I_her_mother {

	@Override
	public void dance() {
		// TODO Auto-generated method stub
           System.out.println("小孩和他妈妈一样会跳舞");
	}

	@Override
	public void play_basketball() {
		// TODO Auto-generated method stub
             System.out.println("小孩和他爸爸一样孩子会打篮球");
	}

}
