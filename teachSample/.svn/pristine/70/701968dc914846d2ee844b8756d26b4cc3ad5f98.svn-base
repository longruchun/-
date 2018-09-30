package com.shaodq.chapter2.d20180720;

import java.util.Random;
import java.util.Scanner;

public class teachSample3 {

	public static void main(String[] args) {
		//任意给定字符串，长度不限，统计字符串中出现的大写字母、小写字母
		//各多少个
		String s1="OOOaaasdfjhasdfJHGIUrsadklmnfgsadlkfjlTYT6545874541OIUYIUsdfjhasdfJHGIUrsadklmnfgsadlkfjlTYT6545874541OIUYIUOOIHJKLJNLKJHOIUY(*&^&6987";
        
		int len=s1.length();
		
		int[] small=new int[26];
		int[] big=new int[26];
		
		for(int i=0;i<len;i++){
			char ch=s1.charAt(i);
			
			if(ch>='a'&&ch<='z'){
				small[ch-97]++;
			}else if(ch>='A'&&ch<='Z'){
				big[ch-65]++;
			}
		}
		
		System.out.println("字符串中有小写字母:");
		for(int i=0;i<26;i++){
			if(small[i]!=0){
				System.out.print((char)(i+97)+":"+small[i]+" ");
			}
		}
		
		System.out.println("\n\n字符串中有大写字母:");
		for(int i=0;i<26;i++){
			if(big[i]!=0){
				System.out.print((char)(i+65)+":"+big[i]+" ");
			}
		}
		
		
	}

}
