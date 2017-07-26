package t20170712;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jTest {
	public static void main(String[] args) throws DocumentException{
		SAXReader reader=new SAXReader();
		Document document=reader.read("zooinventory.xml");
		Element root=document.getRootElement();
		for(Object obj:root.elements()){
			Element child=(Element)obj;
			if(!"animal".equals(child.getName())){
				continue;
			}
			System.out.println(child.elementText("name"));
		}
	}
}
