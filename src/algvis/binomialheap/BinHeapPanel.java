package algvis.binomialheap;

import algvis.core.DataStructure;
import algvis.core.MeldablePQButtons;
import algvis.core.VisPanel;
import algvis.internationalization.Languages;

public class BinHeapPanel extends VisPanel {
	private static final long serialVersionUID = 2070258718656241421L;
	public static Class<? extends DataStructure> DS = BinomialHeap.class;

	public BinHeapPanel(Languages L) {
		super(L);
	}

	@Override
	public void initDS() {
		D = new BinomialHeap(this);
		B = new MeldablePQButtons(this);
	}
}