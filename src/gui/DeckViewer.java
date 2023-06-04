package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DeckViewer extends JFrame{

	public DeckViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUMBER");
		model.addColumn("NAME");
		model.addColumn("PRICE");
		model.addColumn("TYPE");

		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
