package com.QuickHit;
public class Test {

	public static void main(String[] args) {
		Player player=new Player("����",1);
		
		
		Game game=new Game(player);
		
		game.playing();
	}

}
