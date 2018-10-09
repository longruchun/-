package com.lrc20181009;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import com.hxzy.biz_implements.gradeBiz_jdbcImpl;
import com.hxzy.entity.grade;

public class TestIo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("HTML/demo1.tmp");// 先创建字符输入流的对象
			StringBuffer sb = new StringBuffer();
			char[] ch = new char[1024];// 创建中转站数组
			int length = fr.read(ch);// 读取文件内容

			while (length != -1) {
				sb.append(ch);

				length = fr.read(ch);

			}

			/*
			 * System.out.println(sb); fw=new FileWriter("demo_1.html");
			 * fw.write(sb.toString());
			 */
			// 获取年级数据集
			List<grade> list = getGrade();
			Iterator<grade> it = list.iterator();

			int index = 0;
			String sb_ = sb.toString();

			while (it.hasNext()) {
				grade gr = it.next();

				sb_ = sb_.replace("{greadeid}", String.valueOf(gr.getGradeId()) + "");
				sb_ = sb_.replace("{greadeName}", String.valueOf(gr.getGradeName()) + "");

				fw = new FileWriter("static/gr" + (index++) + ".html");
				fw.write(sb_);
				fw.close();
				sb_ = " ";

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (null != fr) {
				try {
					fr.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (null != fw) {
				try {
					fw.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	private static List<grade> getGrade() {
		// TODO Auto-generated method stub

		return (new gradeBiz_jdbcImpl()).getAll();
	}

}
