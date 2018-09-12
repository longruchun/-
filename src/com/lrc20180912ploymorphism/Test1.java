package com.lrc20180912ploymorphism;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        I_her_father _kids=new Kid();     
        _kids.play_basketball();
        
        I_her_mother k=( I_her_mother)_kids;
        k.dance();
        
		
		
		
	}

}
