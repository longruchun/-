package com.shaodq.chapter2.d20180802;

public class Height {
    public float getAvg(Student[] stus){
    	float avg=0;
    	float sum=0;
    	for(int i=0;i<stus.length;i++){
    		sum+=stus[i].height;
    	}
    	
    	
    	return sum/stus.length;
    }
}
