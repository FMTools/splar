package splar.core.fm;

public class RootNode extends FeatureTreeNode {

	private static final long serialVersionUID = 1L;

	public RootNode(  String id, String name, IFNodeRenderer nodeRenderer ) {		
		super(id,name,nodeRenderer);
//		value = FeatureTreeNode.SELECTED;
//		super.setImmutable(true);
	}
	
	public String toString() {
		return ":r " + super.toString();
	}
}
