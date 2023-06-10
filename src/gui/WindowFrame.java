package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	DeckAdder deckadder;
	DeckViewer deckviewer;

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.deckadder = new DeckAdder(this);
		this.deckviewer = new DeckViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public DeckAdder getDeckadder() {
		return deckadder;
	}

	public void setDeckadder(DeckAdder deckadder) {
		this.deckadder = deckadder;
	}

	public DeckViewer getDeckviewer() {
		return deckviewer;
	}

	public void setDeckviewer(DeckViewer deckviewer) {
		this.deckviewer = deckviewer;
	}

}
