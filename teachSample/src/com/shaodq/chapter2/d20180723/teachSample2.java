package com.shaodq.chapter2.d20180723;

import java.util.Arrays;

public class teachSample2 {

	public static void main(String[] args) {
		char[] chars={'A','b','C',' ','@','^','#','G','a'};
		System.out.println("‘≠–Ú–Ú¡–:");
		for(int i=0;i<chars.length;i++){
			System.out.print(chars[i]+"("+(int)chars[i]+")"+" ");
		}
		
		Arrays.sort(chars);
		
		System.out.println("\n…˝–Ú–Ú¡–:");
		
		for(int i=0;i<chars.length;i++){
			System.out.print(chars[i]+"("+(int)chars[i]+")"+" ");
		}
		
        System.out.println("\nΩµ–Ú–Ú¡–:");
		
		for(int i=chars.length-1;i>=0;i--){
			System.out.print(chars[i]+"("+(int)chars[i]+")"+" ");
		}
	}

}
