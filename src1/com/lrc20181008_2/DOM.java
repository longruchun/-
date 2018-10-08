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

public class DOM {
	public static void main(String[] args) {
		// 1���õ�DOM�������Ĺ���ʵ��
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			// 2����DOM�������DOM������
			DocumentBuilder db = dbf.newDocumentBuilder();
			// 3������XML�ĵ����õ�һ��Document����DOM��
			Document doc = db.parse("pet2.xml");
			// 4���õ�����<DOG>�ڵ��б���Ϣ
			NodeList dogList = doc.getElementsByTagName("dog");
			System.out.println("xml�ĵ��й���" + 
					  dogList.getLength() + "��������Ϣ");
			// 5����ѭ������Ϣ
			for (int i = 0; i < dogList.getLength(); i++) {
				// 5.1����ȡ��i������Ԫ����Ϣ
				Node dog = dogList.item(i);
				// 5.2����ȡ��i������Ԫ�ص�id���Ե�ֵ�����
				Element element = (Element) dog;//���ڵ�ǿתΪһ��Ԫ�� 
				String attrValue = element.getAttribute("id");
				System.out.println("id:" + attrValue);
				// 5.3����ȡ��i������Ԫ�ص�������Ԫ�ص����ƺ�ֵ�����
				for (Node node = dog.getFirstChild(); node != null;node = node.getNextSibling()) { 
											
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
