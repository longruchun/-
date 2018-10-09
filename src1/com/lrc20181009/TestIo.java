package com.lrc20181009;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class TestIo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader fr=null; 
		FileWriter fw=null;
		
		
		try {
			 fr=new FileReader("demo1.html");//先创建字符输入流的对象
			StringBuffer sb=new StringBuffer();
			char[] ch=new char[1024];//创建中转站数组
			int length=fr.read(ch);//读取文件内容
			
			while (length!=-1) {
				 sb.append(ch);
				
				 length=fr.read(ch);
				
			}
			
			
			System.out.println(sb);
			fw=new FileWriter("demo_1.html");
			fw.write(sb.toString());
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if (null!=fr) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (null!=fw) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		
	}

}
