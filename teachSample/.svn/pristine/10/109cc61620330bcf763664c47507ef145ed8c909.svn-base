package com.shaodq.chapter2.d20180720;

import java.util.Random;

public class teachSample {

	public static void main(String[] args) {
		/*
		          以上带  _1 的数组是课程名称及对应学时
                _2 的数组是选修课名称及对应学时
                                  要求：学员可以根据随机数，从选修课数组中筛选一门课程进行学习，
                                  被选出的课程要插入到_1 的数组中去，对应学时也要插入进学时数组，
                                  假设课程数组的课程名称是按由小到大排好序的，选修课程 须插到正确位置，最后，统计出选修课插入后的总学时

		 */
		
		String[]  Books_1={"Html Css Js 前端","Java 语言基础逻辑","数据库高级设计知识","Java 面向对象","Jsp & Servlet","Java 企业级框架",""};
		int[] Hours_1={48,60,32,75,70,120,0};

		String[]  Books_2={"jQuery 前端高级框架","Ajax 高级交互模式","微信公众号、小程序开发","vue.js 前端流行框架"};
		int[] Hours_2={20,32,16,10};
		
		//思路：产生随机数，随机数要落在0-3的范围  int choice=rd.nextInt(4);
        //随机数产生后，就可以从选修课数组中，获取选修课及选修学时   
		//String courceName=Books_2[choice]---插入课程 
		//int courceHours=Hours_2[choice]---插入课时
		
		//定位要在已排序的课程 数组中插入选修课的位置 
		//int index=Books_1.length-1
		//index 位置找到后，课程要在这个位置 插入，课时也是在课时数组的index 位置插入
		
		Random rd=new Random();
		int choice=rd.nextInt(4);
		
		String courceName=Books_2[choice];//插入课程名称 
		int courceHours=Hours_2[choice];//插入课时
		
		//以选修课名称 ，去找课程 表中对应的插入位置 
	    int index=Books_1.length-1;
	    
	    for(int i=0;i<Books_1.length;i++){
	    	if(Books_1[i].compareTo(courceName)>0){
	    		index=i;
	    		break;
	    	}
	    }
	    
	    //index 就是我们要插入的位置 
	    //具体完成插入逻辑的代码
	    if(index==Books_1.length-1){
	    	//课程 名称 和课时要同步在同位置插入两个数组
	    	Books_1[index]=courceName;
	    	Hours_1[index]=courceHours;
	    }else{//往中间位置插，则要顺序移动，腾出插入位，注意两个数组同步移动，以避免出错
	    	for(int i=Books_1.length-2;i>=index;i--){
	    		Books_1[i+1]=Books_1[i];
	    		Hours_1[i+1]=Hours_1[i];
	    	}
	    	Books_1[index]=courceName;
	    	Hours_1[index]=courceHours;
	    }
	    
	    //输出结果的代码段
	    int totalHours=0;
	    for(int i=0;i<Hours_1.length;i++){
	    	totalHours+=Hours_1[i];
	    }
	    
	    System.out.println("选修课插入后，总课时为:"+totalHours);
	    
	    System.out.println("课程 情况如下:");
	    for(int i=0;i<Books_1.length-1;i++){
	    	System.out.println("\""+Books_1[i]+"("+Hours_1[i]+")\"");
	    }
	   
	    
		

	}

}
