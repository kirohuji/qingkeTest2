package t20170711;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class XmlParserSample {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		long start=System.currentTimeMillis();
		List<Map<String,String>> domList=DomService.readXML("sample.xml","student");
		System.out.println(domList.size());
		System.out.println("Parse the xml by dom in"+(System.currentTimeMillis()-start));
//		start=System.currentTimeMillis();
//		List<Map<String,String>> domList=DomService.readXML("sample.xml","student");
//		System.out.println(domList.size());
//		System.out.println("Parse the xml by dom in"+(System.currentTimeMillis()-start));
	}
}
