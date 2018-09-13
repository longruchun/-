package com.lrc20180913;

/**
 * 使用throw在方法内抛出异常。
 * @author 北大青鸟
 */
public class Person {
	private String name = "";// 姓名
	private int age = 0;// 年龄
	private String sex = "男";// 性别
	/**
	 * 设置性别。
	 * @param sex 性别
	 * @throws Exception
	 */
	public void setSex(String sex) throws Exception {
		if ("男".equals(sex) || "女".equals(sex))
			this.sex = sex;
		else {
			throw new Exception("性别必须是“男”或者“女”！");
		}
	}
	
	public void setAge(int age) throws Exception {
		if (age>=1 && age<=100)
			this.age = age;
		else {
			throw new Exception("年龄必须在1到100之间！");
		}
	}

	/**
	 * 打印基本信息。
	 */
	public void print() {
		System.out.println(this.name + "（" + this.sex 
				+ "，" + this.age + "岁）");
	}
}