package com.shaodq.chapter2.d20180730.showfist;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Game {
     //记录总对战次数
	 Player player;
	 Computer computer;
	 
	 public int count=0;
	 Scanner input=new Scanner(System.in);
	 
	 public void showMenu(){
		 System.out.println("**************");
		 System.out.println("* 大英难对战系统     *");
		 System.out.println("**************");
		 
	 }
	 
	 //用来初始化（实例化玩家类与电脑类的对象）
	 public void init(){
		 showMenu();
		 
		 player=new Player();
		 System.out.print("请输入玩家姓名:");
		 player.name=input.next();
		 
		 computer=new Computer();
		 System.out.print("请选择对战方姓名:1 孙权  2 刘备 3 曹操 ");
		 switch(input.nextInt()){
		     case 1:
		        System.out.println("您选择与孙权对战");
		        computer.name="孙权";
		        break;
		     case 2:
		    	 System.out.println("您选择与刘备对战");
			     computer.name="刘备";
			     break;
		     case 3:
		    	 System.out.println("您选择与曹操对战");
			     computer.name="曹操";
			     break;
			 default:
				 System.out.println("选择出错，默认与曹操对战");
			     computer.name="曹操";
			     break;
		 }
		 
		 
	 }

     //开始对战的方法
	 public void start(){
		 init();
		 
		 //可以开始循环，进入对战状态
		 while(true){
			 
			 System.out.println("准备好开始一轮对战了吗?(y OR n)");
			 if("n".equals(input.next())){
				 break;
			 }
			 
			 count++;
			 System.out.println("出拳规则:1. 剪刀    2. 石头   3. 布");
			
			 int play_fist=player.ShowFist();//玩家出拳
			 
			 int computer_fist=computer.ShowFist();//电脑出拳
			 
			 jugewin(play_fist,computer_fist);
			 
		 }
		 
		 //循环结束后，打印对战结果
		 
	 }
	 
	 public void jugewin(int play_fist,int computer_fist){
		 //判断胜负
		 int dif=play_fist-computer_fist;
		 
		 if(dif==0){
			 //平局
		 }else if(dif==1||dif==-2){
			 player.score++;
			 System.out.println("牛!");
		 }else{
			 computer.score++;
			 System.out.println("摇头!");
		 }
		 
	 }
	 
	 //对战战报
	 public void fireReport(){
		 System.out.println(player.name+" VS "+computer.name+":");
		 System.out.println("********************************");
		 System.out.println("共对战："+count+" 局");
		 System.out.println("玩家胜:"+player.score+"局");
		 System.out.println("电脑胜:"+computer.score+"局");
		 
	 }

}
