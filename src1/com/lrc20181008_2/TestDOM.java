package com.lrc20181008_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestDOM {
	public static void main(String[] args) {
		// 1、得到DOM解析器的工厂实例
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			
			
			// 2、从DOM工厂获得DOM解析器
			DocumentBuilder db = dbf.newDocumentBuilder();
			// 3、解析XML文档，得到一个Document，即DOM树
			Document doc = db.parse("myschool.xml");
			// 4、得到所有<DOG>节点列表信息
			NodeList GradeList = doc.getElementsByTagName("grade");
			NodeList SubjectList = doc.getElementsByTagName("subject");
			System.out.println("xml文档中共有" + 
					 GradeList.getLength() + "个班级的信息"
					 		+ "");
			
			
			
			
			//循环输出班级信息
			for (int i = 0; i < GradeList.getLength(); i++) {
			
				Node grade=  GradeList.item(i);
				
				Element element = (Element)  grade;//将节点强转为一个元素 
				String attrValue = element.getAttribute("gradeid");//Attribute是属性的意思
				//System.out.println("gradeid:" + attrValue);
				
				for (Node node =grade.getFirstChild(); node != null;node = node.getNextSibling()) { 
											
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						String name = node.getNodeName();
						String value = node.getFirstChild().getNodeValue();
						System.out.print(name + ":" + value + "\t");
					}
				}
				System.out.println();
			}
			
			System.out.println( );
			//循环输出科目的信息
			System.out.println("xml文档中共有" + 
					SubjectList.getLength() + "个科目的信息");
			for (int j = 0; j <SubjectList.getLength(); j++) {
				
				Node Subject=  SubjectList.item(j);
				
				Element element = (Element)  Subject;//将节点强转为一个元素 
				String attrValue = element.getAttribute("subjectName");//attrvaule是属性值的意思
				//System.out.println("subjectName:" + attrValue);
				
				for (Node node =Subject.getFirstChild(); node != null;node = node.getNextSibling()) { 
											
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						String name = node.getNodeName();
						String value = node.getFirstChild().getNodeValue();
						System.out.print(name + ":" + value + "\t");
					}
				}
				System.out.println();
			}
			
			
			
			
			
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
