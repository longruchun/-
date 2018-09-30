package com.jb.minidvd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DVDMgr {
	/**
	 * 创建DVD对象
	 */
	DVDSet dvd = new DVDSet();
	/**
	 * 初始三个DVD	 
	 */
    public void initial() {
    	
    	dvd.name[0] = "罗马假日";
    	dvd.state[0] = 0; 
    	dvd.date[0]="2010-7-1";
    	dvd.count[0]=15;
    	
    	dvd.name[1] = "风声鹤唳";
    	dvd.state[1] = 1;  
    	dvd.count[1]=12;
    	
    	dvd.name[2] = "浪漫满屋";
    	dvd.state[2] = 1;
    	dvd.count[2]=30;
    }	
	/**
	 * 开始菜单
	 */
	public void startMenu(){
		 System.out.println("欢 迎 使 用 迷 你 DVD 管 理 器");
	   	 System.out.println("-------------------------------------");
	   	 System.out.println("0. 借出排行榜");
	   	 System.out.println("1. 新 增 DVD");
	   	 System.out.println("2. 查 看 DVD");
	   	 System.out.println("3. 删 除 DVD");
	   	 System.out.println("4. 借 出 DVD");
	     System.out.println("5. 归 还 DVD");	     
	   	 System.out.println("6. 退         出 ");
	   	 
	   	 System.out.print("--------------------------------------\n");
	
	   	 System.out.print("请选择： ");
	   	 Scanner input = new Scanner(System.in);
	   	 int choice = input.nextInt();
	   	 switch(choice){
	   	 	case 0:
	   	    	list();
	   	    	break;
	   	 	case 1:
	   	    	add();
	   	    	break;
	   	    case 2: 
	   	    	search();
	   	    	break;
	   	    case 3:
	   	    	delete();
	   	    	break;
	   	    case 4:
	   	    	lend();
	   	    	break;
	   	    case 5:
	   	    	returnDvd();
	   	    	break;
	   	    case 6:
	   	    	System.out.println("\n谢谢 使 用！");
	   	    	break;
	   	 }
    }
	/**
     * 返回主菜单
     */
    public void returnMain(){
   	 Scanner input = new Scanner(System.in); 
   	 System.out.print("输入0返回：");
        if(input.nextInt() == 0){
       	 startMenu();
        }else{
       	 System.out.println("输入错误, 异常终止！");
        }
    }
    /**
     * 查看DVD
     */
    public void search(){
    	System.out.println("---> 查看DVD\n");
    	System.out.println("序号\t状 态\t名称\t\t借出日期");
    	for(int i = 0 ; i < dvd.name.length; i++){
   		    if(dvd.name[i]==null){
   			    break;
   		    }else if(dvd.state[i] == 0){
   			    System.out.println((i+1)+"\t已借出\t"+"<<"+ dvd.name[i]+ ">>\t" + dvd.date[i]);
   		    }else if(dvd.state[i] == 1){
   			    System.out.println((i+1)+"\t可 借\t"+"<<"+dvd.name[i]+">>");
   		    }
   	    }
    	System.out.println("**************************");
    	returnMain(); 	 
    }
    /**
     * 新增DVD
     */
    public void add(){
     Scanner input = new Scanner(System.in);
   	 System.out.println("---> 新增DVD\n");    	
   	 System.out.print("请输入DVD名称： ");
   	 String name = input.next();  
   	 for(int i = 0; i < dvd.name.length; i++){   		 
   		 if(dvd.name[i] == null){    //查询最后一个空位置插入
   			dvd.name[i]=name;
   			dvd.state[i]=1;//置新增的DVD可借状态
   			 System.out.println("新增《"+name+"》成功！");
   			 break;
   		 }
   	 }
   	 System.out.println("**************************");
   	 returnMain();   
    }    
    /**
     * 删除DVD
     */
    public void delete(){
    	Scanner input = new Scanner(System.in);
    	boolean flag=false;//标识删除成功与否
    	System.out.println("---> 删除DVD\n");
    	System.out.print("请输入DVD名称： ");
      	String name = input.next();  
      	//遍历数组，查找匹配信息
      	for(int i = 0 ; i < dvd.name.length; i++){
      		//查找到，每个元素前移一位
      		if(dvd.name[i]!=null &&dvd.name[i].equalsIgnoreCase(name)&&dvd.state[i]==1){
      			int j=i;
      			while(dvd.name[j+1]!=null){
      				dvd.name[j]=dvd.name[j+1];
      				dvd.state[j]=dvd.state[j+1];
      				dvd.date[j]=dvd.date[j+1];
      				j++;
      			}
      			//最后一个不为空的元素置空
   				dvd.name[j]=null;   				
   				dvd.date[j]=null; 
   			 System.out.println("删除《"+name+"》成功！");
   			 flag=true;//置位，表示删除成功
   			 break;
      		}else if(dvd.name[i]!=null &&dvd.name[i].equalsIgnoreCase(name)&&dvd.state[i]==0){
      			System.out.println("《"+name+"》为借出状态，不能删除！"); 
      			flag=true;//置位
      			break;
      		}
      	}
      	if(!flag){
      		System.out.println("没有找到匹配信息！");
      	}
      	System.out.println("**************************");
      	returnMain(); 	 
    }
    /**
     * 借出DVD
     */
    public void lend(){
   	 System.out.println("---> 借出DVD\n");
   	 
   	 Scanner input = new Scanner(System.in);
   	 System.out.print("请输入DVD名称： ");
   	 String want = input.next();  //要借出的DVD名称 
   	 for(int i = 0; i < dvd.name.length; i++){   		 
   		 if(dvd.name[i] == null){    //无匹配
   			 System.out.println("没有找到匹配信息！");
   			 break;
   		 }else if(dvd.name[i].equals(want)&& dvd.state[i]==1){  //找到匹配可借	 
   			 dvd.state[i] = 0;
   			 System.out.print("请输入借出日期（年-月-日）：");
   			 dvd.date[i]=input.next();
   			 System.out.println("借出《"+want+"》成功!");   			
   			 dvd.count[i]++;
   			 break;
   		 }else if(dvd.name[i].equals(want)&& dvd.state[i]==0){  //找到匹配已被借出 			
   			 System.out.println("《"+want+"》已被借出！");
   			 break;
   		 }   		 
   	 }
   	 System.out.println("**************************");
   	 returnMain();
    }
    /**
     * 归还DVD并计算租金
     */
    public void returnDvd(){
   	 System.out.println("---> 归还DVD\n");
   	 
   	 Scanner input = new Scanner(System.in);
   	 long loan=0;//租金
   	 System.out.print("请输入DVD名称： ");
   	 String want = input.next();
   	 for(int i = 0; i < dvd.name.length; i++){   		 
   		 if(dvd.name[i] == null){    //无匹配
   			 System.out.println("没有找到匹配信息！");
   			 break;
   		 }else if(dvd.name[i].equals(want) && dvd.state[i]==0){  //找到匹配	 
   			 dvd.state[i] = 1;
   			 System.out.print("请输入归还日期（年-月-日）：");
   			 String redate=input.next();
   			 //计算租金
   			 loan=charge(dvd.date[i],redate);
   			 System.out.println("\n归还《"+want+"》成功!");
   			 System.out.println("借出日期为："+dvd.date[i]);
   			 System.out.println("归还日期为："+redate);
   			 System.out.println("应付租金（元）："+loan);
   			 break;
   		 }  else if(dvd.name[i].equals(want) && dvd.state[i]==1){ //找到匹配但没有借出
   			System.out.println("该DVD没有被借出！无法进行归还操作。");
   			break;
   		 }
   	 }
   	 System.out.println("**************************");
   	 returnMain();
    }
    /**
     * 计算日期差
     * @param dstr1 第一个日期
     * @param dstr2 第二个日期
     * 
     */
    public long charge(String dstr1,String dstr2){
    	long charge=0;
    	SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
    	try {
			Date d1=sd.parse(dstr1);
			Date d2=sd.parse(dstr2);
			charge=(d2.getTime()-d1.getTime())/(24*60*60*1000);
		} catch (ParseException e) {			
			e.printStackTrace();			
		}    	
    	return charge;
    }
    /**
     * 借出排行榜
     */
    public void list(){
    	//定义新数组，用来存放排序后DVD信息
    	String[] newname = new String[50];   //       
        int[] newcount=new int[50];  
        for(int k=0;k<dvd.name .length;k++){
        	 newname[k]=dvd.name[k];
             newcount[k]=dvd.count[k];
        }
          	
    	//利用冒泡排序算法进行排序
    	for(int i=0;i<newname.length;i++){
    		for(int j=i+1;j<newname.length;j++){
    			if(newcount[i]>newcount[j]){
    				int tempc=newcount[i];
    				newcount[i]=newcount[j];
    				newcount[j]=tempc;
    				String tempn=newname[i];
    				newname[i]=newname[j];
    				newname[j]=tempn;
    			}    			
    		}    		
    	}
    	System.out.println("---> 排行榜\n");
    	System.out.println("**************************");
    	System.out.println("次数\t名称");
    	//显示排行榜信息
    	for(int i=newname.length-1;i>=0;i--){
    		if(newname[i]!=null){
    			System.out.println(newcount[i]+"\t<<"+ newname[i]+ ">>" );
    		}
    	}      
      	 System.out.println("**************************");
      	 returnMain();
       }
}
