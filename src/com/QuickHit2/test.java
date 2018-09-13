package com.QuickHit2;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //游戏要由玩家来玩，我们首先实例 化一个玩家
		Player player=new Player("天蓬元帅",1);
		
		
		//实例化一个游戏类，调用playing（）方法开始游戏
		Game game=new Game(player);
		
		game.playing();
	}

}
