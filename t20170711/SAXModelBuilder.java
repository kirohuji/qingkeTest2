package t20170711;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXModelBuilder extends DefaultHandler {
	Stack<Object> stack = new Stack<>();

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		Object element;
		try {
			String className = Character.toUpperCase(qName.charAt(0)) + qName.substring(1);
			element = Class.forName("t20170711."+className).newInstance();
		} catch (Exception e) {
			element = new StringBuffer();
		}
		for (int i = 0; i < attributes.getLength(); i++) {
			try {
				setProperty(attributes.getQName(i), element, attributes.getValue(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		stack.push(element);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		if (stack.size() > 1) {
			Object element = stack.pop();
			try {
				setProperty(qName, stack.peek(), element);
			} catch (Exception e) {
				throw new SAXException("Error:", e);
			}
		}
		
	}

	private void setProperty(String qName, Object peek, Object element)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Field field = peek.getClass().getField(qName);
		if (element instanceof StringBuffer) {
			element = element.toString();
		}
		if (field.getType() == Double.class) {
			element = Double.parseDouble(element.toString());
		}
		if (Enum.class.isAssignableFrom(field.getType())) {
			element = Enum.valueOf((Class<Enum>) field.getType(), element.toString());
		}
		if (field.getType() == element.getClass()) {
			field.set(peek, element);
		} else {
			if (Collection.class.isAssignableFrom(field.getType())) {
				Collection collection = (Collection) field.get(peek);
				collection.add(element);
			} else {
				throw new RuntimeException("Unable to set Property...");
			}
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		String text = new String(ch, start, length);
		if (text.trim().length() == 0) {
			return;
		}
		((StringBuffer) stack.peek()).append(text);
		
	}
	public Object getModel(){
		return stack.pop();
	}
}
