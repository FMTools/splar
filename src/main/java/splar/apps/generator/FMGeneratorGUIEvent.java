package splar.apps.generator;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

//TODO: Check types for the Comparable
@SuppressWarnings("rawtypes")
public class FMGeneratorGUIEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	
	protected Map<String,Comparable> attributes;
	
	public FMGeneratorGUIEvent(Object source) {
		super(source);
		attributes = new HashMap<String, Comparable>();
	}
	
	public void addAttribute(String name, Comparable value) {
		attributes.put(name, value);
	}
	
	public Comparable getAttribute(String name) {
		return attributes.get(name);
	}
}
