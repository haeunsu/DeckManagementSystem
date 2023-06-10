package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class DeckAdder extends JPanel{
	
	WindowFrame frame;

	
	public DeckAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("NUMBER: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("NAME: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPrice = new JLabel("PRICE: ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelID.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		JLabel labelType = new JLabel("TYPE: ", JLabel.TRAILING);
		JTextField fieldType = new JTextField(10);
		labelID.setLabelFor(fieldType);
		panel.add(labelType);
		panel.add(fieldType);
		
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
		
	}
	

}
