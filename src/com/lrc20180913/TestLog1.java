/*package com.lrc20180913;

import java.util.Scanner;
import org.apache.log4j.Logger;
*//**
 * 使用log4j输出异常信息到控制台。
 * @author 北大青鸟
 *//*
public class TestLog1{
	private static Logger logger=
		Logger.getLogger(TestLog1.class.getName());
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("请输入被除数:");
			int num1 = in.nextInt();
			System.out.print("请输入除数:");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d",
					num1, num2, num1/ num2));		
		} catch (Exception e) {
			logger.error("出现异常",e);
			
		} finally {
			System.out.println("感谢使用本程序！");
		}
	}
}
*/