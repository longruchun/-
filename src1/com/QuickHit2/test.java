package com.QuickHit2;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //��ϷҪ��������棬��������ʵ�� ��һ�����
		Player player=new Player("����Ԫ˧",1);
		
		
		//ʵ����һ����Ϸ�࣬����playing����������ʼ��Ϸ
		Game game=new Game(player);
		
		game.playing();
	}

}
