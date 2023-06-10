package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import deck.DeckInput;
import manager.Deckmanager;

public class DeckViewer extends JPanel{
	
	WindowFrame frame;
	
	Deckmanager deckmanager;


	public DeckViewer(WindowFrame frame, Deckmanager deckmanager) {
		this.frame = frame;
		this.deckmanager = deckmanager;
		
		System.out.println("***" + deckmanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUMBER");
		model.addColumn("NAME");
		model.addColumn("PRICE");
		model.addColumn("TYPE");

		for (int i=0; i< deckmanager.size(); i++) {
			Vector row = new Vector();
			DeckInput si = deckmanager.get(i);
			row.add(si.getNumber());
			row.add(si.getName());
			row.add(si.getPrice());
			row.add(si.getType());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
