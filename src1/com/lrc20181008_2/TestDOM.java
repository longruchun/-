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
		// 1���õ�DOM�������Ĺ���ʵ��
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			
			
			// 2����DOM�������DOM������
			DocumentBuilder db = dbf.newDocumentBuilder();
			// 3������XML�ĵ����õ�һ��Document����DOM��
			Document doc = db.parse("myschool.xml");
			// 4���õ�����<DOG>�ڵ��б���Ϣ
			NodeList GradeList = doc.getElementsByTagName("grade");
			NodeList SubjectList = doc.getElementsByTagName("subject");
			System.out.println("xml�ĵ��й���" + 
					 GradeList.getLength() + "���༶����Ϣ"
					 		+ "");
			
			
			
			
			//ѭ������༶��Ϣ
			for (int i = 0; i < GradeList.getLength(); i++) {
			
				Node grade=  GradeList.item(i);
				
				Element element = (Element)  grade;//���ڵ�ǿתΪһ��Ԫ�� 
				String attrValue = element.getAttribute("gradeid");//Attribute�����Ե���˼
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
			//ѭ�������Ŀ����Ϣ
			System.out.println("xml�ĵ��й���" + 
					SubjectList.getLength() + "����Ŀ����Ϣ");
			for (int j = 0; j <SubjectList.getLength(); j++) {
				
				Node Subject=  SubjectList.item(j);
				
				Element element = (Element)  Subject;//���ڵ�ǿתΪһ��Ԫ�� 
				String attrValue = element.getAttribute("subjectName");//attrvaule������ֵ����˼
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
