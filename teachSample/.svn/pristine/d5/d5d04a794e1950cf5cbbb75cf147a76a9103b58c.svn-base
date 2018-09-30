package com.shaodq.chapter2.d20180730.parameterDemo;

public class Customer {
   String[] cus=new String[10];
   
   public void add_cus(String name){
	   //方法的用途：就是将形参所规定的name存入数组
	   for(int i=0;i<cus.length;i++){
		   if(cus[i]==null){
			   cus[i]=name;
			   break;
		   }
	   }
	   
   }
   
   public void modify(String oldName,String newName){
	   //1 要在数组中找到oldName,如果没找到，要报未找到,若找到，记录位置索引
	   //2判断若是找到，则用newName替代oldName
	   int index=-1;
	   for(int i=0;i<cus.length&&cus[i]!=null;i++){
		   if(cus[i].equals(oldName)){
			   index=i;
			   break;
		   }
	   }
	   
	   if(index!=-1){
		   cus[index]=newName;
		   show();
	   }else{
		   System.out.println("你要修改的值在数组中未找到.");
	   }
	   
   }
   
   public void show(){
	   for(int i=0;i<cus.length;i++){
		   if(cus[i]==null){
			   break;
		   }   
	        
		   System.out.println(cus[i]);
		   
	   }
   }
}
