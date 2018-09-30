package com.shaodq.chapter2.d20180719;

import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //定义一个数组，存放原先的歌曲
		String[] names={"陈航军","杨莎","王士串","孟杰","庹本稳","朱磊","罗振耘","龙如春","王凯"};
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入要退出比赛的人员名字:");
		String name=input.next();
		
		//1 在数组中查找name 这个名字的索引位置 
		int index=-1;//用index 来记录找到的要删除元素的位置 ，给初值为-1，使得该值不在数组的索引范围内
		//所以此外index 有两个用途：1 表明是否找到   2 如果找到，那么是在哪个位置找到的
		for(int i=0;i<names.length;i++){
			if(names[i].equals(name)){//找到了
				index=i;
				break;//找到了，就退出循环，不再找了
			}
		}
		
		if(index!=-1){//说明找到了
			//names[index]=null;
			for(int j=index;j<names.length-1;j++){
				names[j]=names[j+1];
			}
			names[names.length-1]=null;
		}
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		}
		

}
