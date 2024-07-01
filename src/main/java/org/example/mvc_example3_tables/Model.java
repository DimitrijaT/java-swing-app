package org.example.mvc_example3_tables;

import javax.swing.table.DefaultTableModel;

/**
 * @author ashraf
 *
 */
@SuppressWarnings("serial")
public class Model extends DefaultTableModel {

	public Model() {
		super(Constants.DATA, Constants.TABLE_HEADER);
	}

}
