package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.Deckmanager;

public class WindowFrame extends JFrame{
	
	Deckmanager deckmanager;
	
	MenuSelection menuselection;
	DeckAdder deckadder;
	DeckViewer deckviewer;
	

	public WindowFrame(Deckmanager deckmanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		this.deckmanager = deckmanager;
		menuselection = new MenuSelection(this);
		deckadder = new DeckAdder(this);
		deckviewer = new DeckViewer(this, this.deckmanager);
		
		
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
