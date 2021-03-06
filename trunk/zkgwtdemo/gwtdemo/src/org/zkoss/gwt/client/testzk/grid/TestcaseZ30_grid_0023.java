package org.zkoss.gwt.client.testzk.grid;

import org.zkoss.gwt.client.testzk.TestcaseWrapper;
import org.zkoss.gwt.client.zul.grid.Column;
import org.zkoss.gwt.client.zul.grid.Columns;
import org.zkoss.gwt.client.zul.grid.Foot;
import org.zkoss.gwt.client.zul.grid.Footer;
import org.zkoss.gwt.client.zul.grid.Grid;
import org.zkoss.gwt.client.zul.grid.Row;
import org.zkoss.gwt.client.zul.grid.Rows;
import org.zkoss.gwt.client.zul.wgt.Label;
import org.zkoss.gwt.client.zul.wnd.Window;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.Widget;

public class TestcaseZ30_grid_0023 extends TestcaseWrapper {
			
	public Widget getInstance() {	
		
		Window win = new Window();
/*		
 * put original zul here. 
<grid>
	<columns sizable="true">
		<column width="30%" label="Left : width 30%" align="left"/><column label="Center" align="center"/>
		<column width="100px" label="Right : width 100px" align="right"/><column label="Column 4"/>
		<column label="Column 5"/><column label="Column 6"/>
	</columns>
	<rows>
		<row spans="2,3">
			<label value="(2,3)"/>
			<label value="Item B.5"/><label value="Item B.6"/>
		</row>
		<row spans="3">
			<label value="(3)"/><label value="Item C.4"/>
			<label value="Item C.5"/><label value="Item C.6"/>
		</row>
		<row spans=",,1,2">
			<label value="(,,1,2)"/><label value="Item D.2"/>
			<label value="Item D.3"/><label value="Item D.4"/>
			<label value="Item D.5"/>
		</row>
	</rows>
	<foot>
		<footer>Left</footer>
		<footer>Center</footer>
		<footer>Right</footer>
		<footer>Column 4</footer>
		<footer>Column 5</footer>
		<footer>Column 6</footer>
	</foot>
</grid>

*/		
	
		/*
		 * put generated code here
		 * */
		Grid grid_1 = new Grid();
		win.add(grid_1);
		Columns columns_11 = new Columns();
		grid_1.add(columns_11);
		columns_11.setSizable(true);
		Column column_111 = new Column();
		columns_11.add(column_111);
		column_111.setAlign("left");
		column_111.setLabel("Left : width 30%");
		column_111.setWidth("30%");
		Column column_112 = new Column();
		columns_11.add(column_112);
		column_112.setAlign("center");
		column_112.setLabel("Center");
		Column column_113 = new Column();
		columns_11.add(column_113);
		column_113.setAlign("right");
		column_113.setLabel("Right : width 100px");
		column_113.setWidth("100px");
		Column column_114 = new Column();
		columns_11.add(column_114);
		column_114.setLabel("Column 4");
		Column column_115 = new Column();
		columns_11.add(column_115);
		column_115.setLabel("Column 5");
		Column column_116 = new Column();
		columns_11.add(column_116);
		column_116.setLabel("Column 6");
		Rows rows_12 = new Rows();
		grid_1.add(rows_12);
		Row row_121 = new Row();
		rows_12.add(row_121);
		row_121.setSpans("2,3");
		Label label_1211 = new Label();
		row_121.add(label_1211);
		label_1211.setValue("(2,3)");
		Label label_1212 = new Label();
		row_121.add(label_1212);
		label_1212.setValue("Item B.5");
		Label label_1213 = new Label();
		row_121.add(label_1213);
		label_1213.setValue("Item B.6");
		Row row_122 = new Row();
		rows_12.add(row_122);
		row_122.setSpans("3");
		Label label_1221 = new Label();
		row_122.add(label_1221);
		label_1221.setValue("(3)");
		Label label_1222 = new Label();
		row_122.add(label_1222);
		label_1222.setValue("Item C.4");
		Label label_1223 = new Label();
		row_122.add(label_1223);
		label_1223.setValue("Item C.5");
		Label label_1224 = new Label();
		row_122.add(label_1224);
		label_1224.setValue("Item C.6");
		Row row_123 = new Row();
		rows_12.add(row_123);
		row_123.setSpans(",,1,2");
		Label label_1231 = new Label();
		row_123.add(label_1231);
		label_1231.setValue("(,,1,2)");
		Label label_1232 = new Label();
		row_123.add(label_1232);
		label_1232.setValue("Item D.2");
		Label label_1233 = new Label();
		row_123.add(label_1233);
		label_1233.setValue("Item D.3");
		Label label_1234 = new Label();
		row_123.add(label_1234);
		label_1234.setValue("Item D.4");
		Label label_1235 = new Label();
		row_123.add(label_1235);
		label_1235.setValue("Item D.5");
		Foot foot_13 = new Foot();
		grid_1.add(foot_13);
		Footer footer_131 = new Footer();
		foot_13.add(footer_131);
		Label label_1311= new Label();
		footer_131.add(label_1311);
		label_1311.setValue("Left");
		Footer footer_132 = new Footer();
		foot_13.add(footer_132);
		Label label_1321= new Label();
		footer_132.add(label_1321);
		label_1321.setValue("Center");
		Footer footer_133 = new Footer();
		foot_13.add(footer_133);
		Label label_1331= new Label();
		footer_133.add(label_1331);
		label_1331.setValue("Right");
		Footer footer_134 = new Footer();
		foot_13.add(footer_134);
		Label label_1341= new Label();
		footer_134.add(label_1341);
		label_1341.setValue("Column4");
		Footer footer_135 = new Footer();
		foot_13.add(footer_135);
		Label label_1351= new Label();
		footer_135.add(label_1351);
		label_1351.setValue("Column5");
		Footer footer_136 = new Footer();
		foot_13.add(footer_136);
		Label label_1361= new Label();
		footer_136.add(label_1361);
		label_1361.setValue("Column6");
	

	
			
		
		return win;
	}
	
	
}
