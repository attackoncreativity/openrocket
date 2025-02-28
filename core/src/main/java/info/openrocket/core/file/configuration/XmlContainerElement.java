package info.openrocket.core.file.configuration;

import java.util.ArrayList;
import java.util.List;

public class XmlContainerElement extends XmlElement {

	private final ArrayList<XmlElement> subelements = new ArrayList<XmlElement>();

	public XmlContainerElement(String name) {
		super(name);
	}

	public void addElement(XmlElement element) {
		subelements.add(element);
	}

	@SuppressWarnings("unchecked")
	public List<XmlElement> getElements() {
		return (List<XmlElement>) subelements.clone();
	}

}
