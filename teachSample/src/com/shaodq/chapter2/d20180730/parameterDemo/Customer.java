package com.shaodq.chapter2.d20180730.parameterDemo;

public class Customer {
   String[] cus=new String[10];
   
   public void add_cus(String name){
	   //��������;�����ǽ��β����涨��name��������
	   for(int i=0;i<cus.length;i++){
		   if(cus[i]==null){
			   cus[i]=name;
			   break;
		   }
	   }
	   
   }
   
   public void modify(String oldName,String newName){
	   //1 Ҫ���������ҵ�oldName,���û�ҵ���Ҫ��δ�ҵ�,���ҵ�����¼λ������
	   //2�ж������ҵ�������newName���oldName
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
		   System.out.println("��Ҫ�޸ĵ�ֵ��������δ�ҵ�.");
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
