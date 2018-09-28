package kr.co.rtst.autosar.common.ui.util;

import org.eclipse.swt.layout.GridLayout;

public class UiUtil {

	public static GridLayout getGridLayoutWithMargin(int numColumns, boolean makeColumnsEqualWidth, int margin) {
		GridLayout layout = new GridLayout(numColumns, makeColumnsEqualWidth);
		layout.marginBottom = margin;
		layout.marginHeight = margin;
		layout.marginLeft = margin;
		layout.marginRight = margin;
		layout.marginTop = margin;
		layout.marginWidth = margin;
		return layout;
	}
	
	public static GridLayout getGridLayoutDefault(int numColumns, boolean makeColumnsEqualWidth) {
		GridLayout layout = new GridLayout(numColumns, makeColumnsEqualWidth);
		return layout;
	}
	
}
