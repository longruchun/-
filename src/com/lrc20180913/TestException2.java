package com.lrc20180913;


/**
 * 捕获throw抛出的异常。
 * @author 北大青鸟
 */
public class TestException2{
	public static void main(String[] args) {
		Person person = new Person();
		try {
			person.setAge(110);
			person.print();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
