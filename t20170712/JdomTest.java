package t20170712;

import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class JdomTest {

	public static void main(String[] args) throws JDOMException, IOException {
		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build("zooinventory.xml");
		Element root = document.getRootElement();
		List<Element> children = root.getChildren();
		for (Element child : children) {
			if (!"animal".equals(child.getName()))
				continue;
			System.out.println("id:" + child.getValue());
		}
	}

}
