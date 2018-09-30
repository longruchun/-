package com.shaodq.chapter2.d20180730;

public class mobile {
    public void download(){
    	System.out.println("手机在下载音乐...");
    }
    
    public void playMusic(){
    	System.out.println("手机在播放音乐.");
    }
    
    public void charge(){
    	cell c1=new cell();
    	c1.brand="高级锂电池";
        c1.charge();
    }
}
