package com.shaodq.chapter2.d20180718;

import java.util.Scanner;

public class teachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //此案例训练要点:是顺序表上的插入算法
		//数据结构与算法---数据在内存中的存放方式，以及可以在这种存方式是施加的各种运算，称之为算法
		//数据结构课程 可以有效提升学习者的编码综合实力
		
		//1  定义一个数组，数组中存放已排好序的歌曲
        String[] songs={"阿里山的姑娘","不得不爱","唱支山歌给党听","第一次流泪","绿岛小夜曲",""};
        
        //首先将插入前的数组打印显示出来
        System.out.println("新歌插入前:");
        for(int i=0;i<songs.length;i++){
        	System.out.print(songs[i]+"   ");
        }
        
        //Scanner  输入一首歌，
        Scanner input=new Scanner(System.in);
        
        System.out.println("\n请输入要插入的歌名:");
        String song=input.next(); 
        
        //position 初始位置有讲究，不能设为0位置 ,而应设为数组的最大索引位置 
        int position=songs.length-1;
        
        //进入插入算法的步骤:
        //1  找到要在数组中插入的正确位置 ，并记录下来
        for(int i=0;i<songs.length;i++){
        	//拿出i位置的歌曲与输入歌曲比，如果输入的歌 曲更小，输入歌曲就该插入到i位置 
        	//我们记录下i位置，并break
        	
        	//字符串的大小比较，不能象整型数据那样，直接用大小比较运算符（ >   <   ==）来比
        	//而是要用compare()方法来比.
        	
        	if(songs[i].compareTo(song)<0){
        		//如果条件成立，则该位置就是要插入的位置，将之记录下来
        		position=i;
        		break;
        	}
        }
        
        
        //循 环结束后， 无论如何， 我的输入歌曲就插入到position位置 
        //为了实现插入，我们再次构造一个循 环去遍历数组
       
        	//插入分两种情形：1  往最大索引位置插入  2 往中间位置插入(涉及到顺次腾移其它元素)
            if(position==songs.length-1){
            	songs[position]=song;
            }else{
            	//顺次移动其它元素，给要插入的位置腾出来
            	//顺次移动元素， 我们要用循环来顺次移动
            	for(int j=songs.length-2;j>=position;j--){
            		songs[j+1]=songs[j];
            	}
            	
            	songs[position]=song;
            }
        
       
        
        System.out.println("歌曲插入后:");
        for(int i=0;i<songs.length;i++){
        	System.out.print(songs[i]+"   ");
        } 
	  
	}

}
