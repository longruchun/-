package com.shaodq.chapter2.d20180730.showfist;

import java.util.Scanner;

public class Player {
    public String name;//用来记录玩家姓名
    public int score;//用来记录玩家的获胜次数
    
    
    /**
     * 
     * @return  玩家的出拳  1 剪刀    2  石头   3 布
     */
    //玩家出拳方法
    public int ShowFist(){
    	int fist=0;
    	Scanner input=new Scanner(System.in);
    	System.out.println("玩家请出拳(1. 剪刀    2. 石头   3. 布)");
    	fist=input.nextInt();
    	
    	switch(fist){
    	    case 1:
    	    	System.out.println("玩家出拳:剪刀");
    	    	break;
    	    case 2:
    	    	System.out.println("玩家出拳:石头");
    	    	break;
    	    case 3:
    	    	System.out.println("玩家出拳:布");
    	    	break;
    		default:
    			System.out.println("选择错误，默认玩家出剪刀");
    			fist=1;
    			break;
    	}
 
    	return fist;
    }
}
