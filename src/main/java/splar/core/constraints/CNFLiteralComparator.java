package splar.core.constraints;

import java.util.Comparator;

public class CNFLiteralComparator implements Comparator<CNFLiteral> {
	
	public int compare(CNFLiteral obj1, CNFLiteral obj2) {
		return obj1.getVariable().getID().compareTo(obj2.getVariable().getID());
	}
	
}


