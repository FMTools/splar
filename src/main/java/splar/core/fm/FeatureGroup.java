package splar.core.fm;


public class FeatureGroup extends FeatureTreeNode {

	private static final long serialVersionUID = 1L;
	
//	private boolean isOptional = false;
	private int min=1, max=1;
	
	public FeatureGroup( String id, String name, int min, int max, IFNodeRenderer nodeRenderer ) {		
		super(id,name,nodeRenderer);
		this.min = min;
		this.max = max;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
	public int getMax() {
		return max;
	}

	public String getDescription() {
		String name = "";
		if ( !getName().startsWith("_")) {
			name = getName();
		}
		return name + " [" + getMin() + "," + (getMax()==-1?"*":getMax()) + "] ";
	}

	public String toString() {
		return ":g "+ super.toString() + " [" + getMin() + "," + (getMax()==-1?"*":getMax()) + "] ";
	}
}