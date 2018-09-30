package com.shaodq.chapter2.d20180802.objectArray;

import java.util.Scanner;

/**
 * operation:����
 * �������һ��ѧԱ����Ĳ����࣬���� �˶�ѧԱ���������������ɾ���ġ���ķ���
 * һ�㣬 ���Ƕ����������еĲ�����ҪҲ��������ɾ���ġ��飬ѧϰ���ݿ�֮�� ���ǻ��������һ��
 * @author Administrator
 *
 */
public class operationForStudent {
   
	//���һ����������¼�� �����ʼ�������Ƿ������
	boolean isInitial=false;
	Scanner input = new Scanner(System.in);
   //����һ����Ա����---��һ���������飬���鳤��Ϊ10������Ԫ����ѧԱ��student�Ķ������
   Student[] stus=new Student[10];//�˴���stus�Ƕ������������ ,��������֣�����������Ӧ�ö�������ĵ�һ��
   
   //�����˵�
   public void putMenu(){
	   System.out.println("************ѧԱ������������˵�*************");
	   System.out.println("* 1. �����ʼ��");
	   System.out.println("* 2. ����ѧԱ");
	   System.out.println("* 3. �޸�ѧԱ");
	   System.out.println("* 4. ɾ��ѧԱ");
	   System.out.println("* 5. ���ѧԱ");
	   System.out.println("* 0. ��        ��");
	   System.out.println("*************************************");
 
   }
   
   public void Start(){
	   while (true) {
		   
		    int index=-1;
		    Student stu=new Student();
			
		    putMenu();
			System.out.print("��ѡ��");
			int choice=input.nextInt();
			
			switch(choice){
			   case 0:
				   break;
			   case 1:
				   init();
				   show();
				   continue;
			   case 2 :
				   //����ѧԱ
				   
				   System.out.println("������Ҫ���ҵ�ѧԱ����:");
				   stu.name=input.next();
				   System.out.println("������Ҫ���ҵ�ѧԱ����:");
				   stu.password=input.next();
				   
				   index=search(stu);
				   if(index!=-1){
					   System.out.println("��Ҫ�ҵ�ѧԱ��λ��:"+index+"�ҵ�");
				   }else{
					   System.out.println("���޴���.");
				   }
				   show();
				   continue;
			   case 3:
				   //�޸�ѧԱ
				   
				   System.out.println("������Ҫ�޸ĵ�ѧԱ����:");
				   stu.name=input.next();
				   System.out.println("������Ҫ�޸ĵ�ѧԱ����:");
				   stu.password=input.next();
				   
				   index=search(stu);
				   if(index!=-1){
					   System.out.println("��Ҫ�ҵ�ѧԱ��λ��:"+index+"�ҵ�");
					   
					   System.out.println("������Ҫ�޸ĵ�ѧԱ������:");
					   String new_name=input.next();
					   System.out.println("������Ҫ�޸ĵ�ѧԱ������:");
					   String new_password=input.next();
					   
					   boolean flag=edit(stu,new_name,new_password);
					   if(flag){
						   System.out.println("�޸ĳɹ�");
					   }else{
						   System.out.println("�޸�ʧ��");
					   }
					   
					   
				   }else{
					   System.out.println("���޴���.");
				   }
				   show();
				   continue;
			   case 4:
                   //ɾ��ѧԱ
				   
				   System.out.println("������Ҫɾ����ѧԱ����:");
				   stu.name=input.next();
				   System.out.println("������Ҫɾ����ѧԱ����:");
				   stu.password=input.next();
				   
				   index=search(stu);
				   if(index!=-1){
					   boolean flag=delete(stu);
					   if(flag){
						   System.out.println("ɾ���ɹ�");
					   }else{
						   System.out.println("ɾ��ʧ��");
					   }
				   }else{
					   System.out.println("���޴���.");
				   }
				   show();
				   continue;
			   case 5:
                   //���ѧԱ
				   
				    System.out.println("������ѧԱ����:");
					stu.name = input.next();

					System.out.println("������ѧԱ����:");
					stu.password = input.next();

					System.out.println("������ѧԱ���:");
					stu.height = input.nextInt();

					System.out.println("������ѧԱ����:");
					stu.weight = input.nextInt();

					if (addElement(stu)) {//������ӷ������������顣�����棬������ӳɹ�
						System.out.println("��ӳɹ�");
					}else{
						System.out.println("���ʧ��");
					}
					show();
				    continue;
			   default:
				   System.out.println("ѡ�����");
				   continue;
			}
			break;
	   }
	   
	   System.out.println("�������.");
   }
   
   
   /**
    * init------һ��������ʼ�������ķ��������� ���˴����Գ�ʼ��stus���飬��֮���ɳ�ʼ����
    */
   public void init(){
	   if (!isInitial) {//��ʼ��û���������������������߼�
		
		int count = 0;//�����������������ѧԱ���������ܴ������鳤��
		while (count < stus.length) {//stus.length------stus����ĳ���
			Student stu = new Student();//ʵ�� ��һ��ѧԱ����

			System.out.println("������ѧԱ����:");
			stu.name = input.next();

			System.out.println("������ѧԱ����:");
			stu.password = input.next();

			System.out.println("������ѧԱ���:");
			stu.height = input.nextInt();

			System.out.println("������ѧԱ����:");
			stu.weight = input.nextInt();

			if (addElement(stu)) {//������ӷ������������顣�����棬������ӳɹ�
				System.out.println("��ӳɹ�");
				count++;//����������1

				System.out.println("Ҫ���������?(y OR n)");
				if (input.next().equals("n")) {
					break;
				}
			} else {
				System.out.println("���ʧ��");
				break;
			}

		}
		if (count == stus.length) {
			System.out.println("ʮ�����λ����.");
		}
		
		isInitial=true;//�ó�ʼ��λΪ�棬������ʼ���Ѿ���ɣ������ظ���ʼ��
	}else{
		System.out.println("��ʼ������ɣ������ظ���ʼ��");
	}
   }
   
   
   
   
   
   /**
    * �����������Ԫ�ص���ӷ���������,������һ��ѧԱ����
    * ����ֵ��boolean���� ����������Ƿ�ɹ�
    * @param stu ---ѧԱ����,Ҳ����Ҫ��ӽ������Ԫ��
    */
   
   public boolean addElement(Student stu){
	   boolean flag=false;
	   
	   for(int i=0;i<stus.length;i++){
		   if(stus[i]==null){//˵��λ��i�ǿյģ�������ӵ����λ�� 
			   stus[i]=stu;
			   flag=true;//�ҵ�λ�ò�����ˣ����ñ���λΪ��
			   break;
		   }
	   }
  
	   return flag;
   }
   
   /**
    * �������в��Ҳ�����ָ����ѧԱ������ѧԱ������������Ϊ��������
    * @param stu :ѧԱ����
    * @return : �ҵ���ѧԱλ�������е�����λ�� ,������ֵΪ-1 ���Ա���δ�ҵ�
    */
   public int search(Student stu){
	   int index=-1;
	   for(int i=0;i<stus.length&&stus[i]!=null;i++){
		   //i<stus.length&&stus[i]!=null ���������ʽ������1 �����鳤�ȷ�Χ�ڽ��в���   2 һ������ĳλ��Ϊ�գ�null��,˵�������
		   //λ�ö�δ�����Ԫ�أ�������������λ�ÿ��Խ���ѭ ��
		   if(stus[i].name.equals(stu.name)&&stus[i].password.equals(stu.password)){//������﷨���ص�����֪ʶ���
			   //stus[i]---��������ĵ�i������λ�� �����ڸ�λ�ô����һ��ѧԱ�������Ըñ��ʽstus[i]�Ϳɿ�����һ��ѧԱ����
			   //��ˣ� ���ǿ����Դ˱��ʽstus[i]ֱ�Ӽ��ϳ�Ա�����".",�����ö���ĳ�Ա���Ժͳ�Ա����:stus[i].name
			   //stu.name--- stu �˴��Ǵ�����β�stu,��һ��ѧԱ�������ó�Ա�������������name����
			   //���if���������е������������ʽ�������ж��Ƿ�������ȣ��������
			   index=i;//��ȣ����¼��λ����λ����index������������һ�����ѭ ��break
			   break;
		   }
	   }
	   return index;
   }
   
   /**
    * ɾ����������������Ѱ���β���ָ���Ķ����ҵ���ɾ��
    * @param stu---�βΣ� ����Ҫɾ����ѧԱ����
    * @return��boolean �ɹ��򷵻��棬ʧ���򷵻ؼ�
    */
   public boolean delete(Student stu){
	   boolean flag=false;
	   //�����ж�����������Ҫɾ���Ķ���
	   int index=search(stu);//���ñ����е�search��������Ҫɾ���Ķ��󴫵� �����������������Ƿ���Ҫɾ���Ķ���
	   if(index==-1){//����-1������δ�ҵ�Ҫɾ���Ķ���
		   System.out.println("������û����Ҫɾ����ѧԱ����");
	   }else{//����ֵ����-1�������ʹ���Ҫɾ����λ�� ��ɾ����λ�ò�˳��ǰ��
		   //stus[index]=null;
		   for(int i=index;i<stus.length-1;i++){
			   stus[i]=stus[i+1];
			   if(stus[i+1]==null){
				   break;
			   }
		   }
		   flag=true;
		   
	   }
	   
	   
	   return flag;
   }
   
   /**
    * 
    * @param stu  Ҫ�޸ĵ�ѧԱ����
    * @param name  ѧԱ��������
    * @param pass  ѧԱ��������
    * @return  �޸ĳɹ��������棬�����
    */
   public boolean edit(Student stu,String name,String pass){
	   boolean flag=false;
	   int index=search(stu);
	   if(index==-1){//����-1������δ�ҵ�Ҫ�޸ĵĶ���
		   System.out.println("������û����Ҫ�޸ĵ�ѧԱ����");
	   }else{//����ֵ����-1�������ʹ���Ҫ�޸ĵ�λ�� ���޸ĸ�λ�� 
		   stus[index].name=name;//�޸�����
		   stus[index].password=pass;//�޸�����
		   
		   flag=true;
	   }
	   return flag;
   }
   
   //��ӡ��ʾ������Ϣ
   public void show(){
	  for(Student stu:stus){//foreach�﷨,stu ����ѧԱ������������
		  System.out.println(stu);//ֱ�Ӵ�ӡ���󣬻��������toString()����
	  } 
   }
	
}
