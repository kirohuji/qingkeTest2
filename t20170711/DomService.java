package t20170711;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomService {
	public static List<Map<String,String>> readXML(String url,String nodeName) throws ParserConfigurationException, SAXException, IOException{
		List<Map<String,String>> result=new ArrayList<Map<String,String>>();
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder parser=factory.newDocumentBuilder();
		Document document=parser.parse(url);
		Element root=document.getDocumentElement();
		NodeList nodeList=root.getElementsByTagName(nodeName);
		for(int i=0;i<nodeList.getLength();i++){
			
			String id=root.getAttributes().getNamedItem("id").getNodeValue();
//			student.put()
			
		}
		return result;
	}
}
