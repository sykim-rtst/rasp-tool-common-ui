package kr.co.rtst.autosar.common.ui.util;

import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class UiUtil {

	public static GridLayout getGridLayoutDefault(int numColumns, boolean makeColumnsEqualWidth) {
		GridLayout layout = new GridLayout(numColumns, makeColumnsEqualWidth);
		return layout;
	}
	
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
	
	public static GridLayout getGridLayoutNoMargin(int numColumns, boolean makeColumnsEqualWidth) {
		return getGridLayoutWithMargin(numColumns, makeColumnsEqualWidth, 0);
	}
	
	public static Table createTable(Composite parent, int style, String[] columnTitle, int[] colomnWidth, int[] align, boolean[] applyColumnListener, SelectionListener listener){
		Table table = new Table(parent, style);
	
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn column = null;
		for (int i = 0; i < columnTitle.length; i++) {
			column = new TableColumn(table, align[i]);
			column.setText(columnTitle[i]);
			column.setWidth(colomnWidth[i]);
			column.setResizable(true);
			if(listener != null && applyColumnListener[i])
				column.addSelectionListener(listener);
		}
		
		return table;
	}
	
}
