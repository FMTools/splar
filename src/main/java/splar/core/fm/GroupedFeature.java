package splar.core.fm;

public class GroupedFeature extends FeatureTreeNode {

	private static final long serialVersionUID = 1L;

//	private boolean isOptional = false;
	
	public GroupedFeature(  String id, String name, IFNodeRenderer nodeRenderer ) {		
		super(id,name,nodeRenderer);
	}
	
	public FeatureGroup getGroup() {
		return (FeatureGroup)getParent();
	}
	
	public String toString() {
		return ": " + super.toString();
	}
	
}