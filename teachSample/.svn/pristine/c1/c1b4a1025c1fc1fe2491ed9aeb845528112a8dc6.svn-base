package com.shaodq.chapter2.d20180802.objectArray;

import java.util.Scanner;

/**
 * operation:操作
 * 这个类是一个学员数组的操作类，包含 了对学员对象数组进行增、删、改、查的方法
 * 一般， 我们对数据所进行的操作主要也就是增、删、改、查，学习数据库之后， 我们会更明白这一点
 * @author Administrator
 *
 */
public class operationForStudent {
   
	//设计一个变量来记录， 数组初始化工作是否已完成
	boolean isInitial=false;
	Scanner input = new Scanner(System.in);
   //定义一个成员变量---是一个对象数组，数组长度为10，数组元素是学员类student的对象变量
   Student[] stus=new Student[10];//此处，stus是对象数组的名称 ,分清楚名字，是我们熟炼应用对象数组的第一步
   
   //操作菜单
   public void putMenu(){
	   System.out.println("************学员对象数组操作菜单*************");
	   System.out.println("* 1. 数组初始化");
	   System.out.println("* 2. 查找学员");
	   System.out.println("* 3. 修改学员");
	   System.out.println("* 4. 删除学员");
	   System.out.println("* 5. 添加学员");
	   System.out.println("* 0. 退        出");
	   System.out.println("*************************************");
 
   }
   
   public void Start(){
	   while (true) {
		   
		    int index=-1;
		    Student stu=new Student();
			
		    putMenu();
			System.out.print("请选择：");
			int choice=input.nextInt();
			
			switch(choice){
			   case 0:
				   break;
			   case 1:
				   init();
				   show();
				   continue;
			   case 2 :
				   //查找学员
				   
				   System.out.println("请输入要查找的学员姓名:");
				   stu.name=input.next();
				   System.out.println("请输入要查找的学员密码:");
				   stu.password=input.next();
				   
				   index=search(stu);
				   if(index!=-1){
					   System.out.println("你要找的学员在位置:"+index+"找到");
				   }else{
					   System.out.println("查无此人.");
				   }
				   show();
				   continue;
			   case 3:
				   //修改学员
				   
				   System.out.println("请输入要修改的学员姓名:");
				   stu.name=input.next();
				   System.out.println("请输入要修改的学员密码:");
				   stu.password=input.next();
				   
				   index=search(stu);
				   if(index!=-1){
					   System.out.println("你要找的学员在位置:"+index+"找到");
					   
					   System.out.println("请输入要修改的学员新姓名:");
					   String new_name=input.next();
					   System.out.println("请输入要修改的学员新密码:");
					   String new_password=input.next();
					   
					   boolean flag=edit(stu,new_name,new_password);
					   if(flag){
						   System.out.println("修改成功");
					   }else{
						   System.out.println("修改失败");
					   }
					   
					   
				   }else{
					   System.out.println("查无此人.");
				   }
				   show();
				   continue;
			   case 4:
                   //删除学员
				   
				   System.out.println("请输入要删除的学员姓名:");
				   stu.name=input.next();
				   System.out.println("请输入要删除的学员密码:");
				   stu.password=input.next();
				   
				   index=search(stu);
				   if(index!=-1){
					   boolean flag=delete(stu);
					   if(flag){
						   System.out.println("删除成功");
					   }else{
						   System.out.println("删除失败");
					   }
				   }else{
					   System.out.println("查无此人.");
				   }
				   show();
				   continue;
			   case 5:
                   //添加学员
				   
				    System.out.println("请输入学员姓名:");
					stu.name = input.next();

					System.out.println("请输入学员密码:");
					stu.password = input.next();

					System.out.println("请输入学员身高:");
					stu.height = input.nextInt();

					System.out.println("请输入学员体重:");
					stu.weight = input.nextInt();

					if (addElement(stu)) {//调用添加方法，插入数组。返回真，表明添加成功
						System.out.println("添加成功");
					}else{
						System.out.println("添加失败");
					}
					show();
				    continue;
			   default:
				   System.out.println("选择出错");
				   continue;
			}
			break;
	   }
	   
	   System.out.println("程序结束.");
   }
   
   
   /**
    * init------一般用作初始化操作的方法的名称 ，此处用以初始化stus数组，这之生成初始数据
    */
   public void init(){
	   if (!isInitial) {//初始化没有做过，才能运行以下逻辑
		
		int count = 0;//计数器，控制输入的学员个数，不能大于数组长度
		while (count < stus.length) {//stus.length------stus数组的长度
			Student stu = new Student();//实例 化一个学员对象

			System.out.println("请输入学员姓名:");
			stu.name = input.next();

			System.out.println("请输入学员密码:");
			stu.password = input.next();

			System.out.println("请输入学员身高:");
			stu.height = input.nextInt();

			System.out.println("请输入学员体重:");
			stu.weight = input.nextInt();

			if (addElement(stu)) {//调用添加方法，插入数组。返回真，表明添加成功
				System.out.println("添加成功");
				count++;//计数器自增1

				System.out.println("要继续添加吗?(y OR n)");
				if (input.next().equals("n")) {
					break;
				}
			} else {
				System.out.println("添加失败");
				break;
			}

		}
		if (count == stus.length) {
			System.out.println("十个添加位已满.");
		}
		
		isInitial=true;//置初始化位为真，表明初始化已经完成，控制重复初始化
	}else{
		System.out.println("初始化已完成，不可重复初始化");
	}
   }
   
   
   
   
   
   /**
    * 往数组中天加元素的添加方法，带参,参数是一个学员对象
    * 返回值是boolean类型 ，表明添加是否成功
    * @param stu ---学员对象,也就是要天加进数组的元素
    */
   
   public boolean addElement(Student stu){
	   boolean flag=false;
	   
	   for(int i=0;i<stus.length;i++){
		   if(stus[i]==null){//说明位置i是空的，可以添加到这个位置 
			   stus[i]=stu;
			   flag=true;//找到位置并添加了，设置标致位为真
			   break;
		   }
	   }
  
	   return flag;
   }
   
   /**
    * 在数组中查找参数所指定的学员对象，以学员姓名和密码作为查找条件
    * @param stu :学员对象
    * @return : 找到的学员位于数组中的索引位置 ,若返回值为-1 可以表明未找到
    */
   public int search(Student stu){
	   int index=-1;
	   for(int i=0;i<stus.length&&stus[i]!=null;i++){
		   //i<stus.length&&stus[i]!=null 该条件表达式表明：1 在数组长度范围内进行查找   2 一旦出现某位置为空（null）,说明其后面
		   //位置都未存入过元素，则遇到这样的位置可以结束循 环
		   if(stus[i].name.equals(stu.name)&&stus[i].password.equals(stu.password)){//★这句语法是重点理解的知识点★
			   //stus[i]---代表数组的第i个索引位置 ，由于该位置存的是一个学员对象，所以该表达式stus[i]就可看作是一个学员对象
			   //因此， 我们可以以此表达式stus[i]直接加上成员运算符".",来调用对象的成员属性和成员方法:stus[i].name
			   //stu.name--- stu 此处是传入的形参stu,是一个学员对象，利用成员运算符，调用其name属性
			   //因此if后面括号中的整个条件表达式，就是判断是否姓名相等，密码相等
			   index=i;//相等，则记录当位索引位置于index变量，并于下一句结束循 环break
			   break;
		   }
	   }
	   return index;
   }
   
   /**
    * 删除方法，在数组中寻找形参所指定的对象，找到则删除
    * @param stu---形参， 代表要删除的学员对象
    * @return：boolean 成功则返回真，失败则返回假
    */
   public boolean delete(Student stu){
	   boolean flag=false;
	   //首先判断数组中有无要删除的对象
	   int index=search(stu);//调用本类中的search方法，将要删除的对象传递 给它，查找数组中是否有要删除的对象
	   if(index==-1){//返回-1，表明未找到要删除的对象
		   System.out.println("数组中没有你要删除的学员对象");
	   }else{//返回值不是-1，则它就代表要删除的位置 ，删除该位置并顺次前移
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
    * @param stu  要修改的学员对象
    * @param name  学员的新姓名
    * @param pass  学员的新密码
    * @return  修改成功，返回真，否则假
    */
   public boolean edit(Student stu,String name,String pass){
	   boolean flag=false;
	   int index=search(stu);
	   if(index==-1){//返回-1，表明未找到要修改的对象
		   System.out.println("数组中没有你要修改的学员对象");
	   }else{//返回值不是-1，则它就代表要修改的位置 ，修改该位置 
		   stus[index].name=name;//修改姓名
		   stus[index].password=pass;//修改密码
		   
		   flag=true;
	   }
	   return flag;
   }
   
   //打印显示数组信息
   public void show(){
	  for(Student stu:stus){//foreach语法,stu 代表学员，而不是索引
		  System.out.println(stu);//直接打印对象，会调用它的toString()方法
	  } 
   }
	
}
