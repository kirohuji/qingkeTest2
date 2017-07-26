package t20170711;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Inventory {
	public List<Animal> animal=new ArrayList<>();
}
