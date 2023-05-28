package deck;

import java.io.Serializable;
import java.util.Scanner;

import exception.DeckTypeFormatException;

public abstract class Deck implements DeckInput, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6559295725464435489L;
	protected DeckKind kind = DeckKind.Warrior;
	protected int number;
	protected int price;
	protected String name;
	protected String type;
	
	public Deck() {
	}
	
	public Deck(DeckKind kind) {
		this.kind = kind;
	}
	
	public Deck(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Deck(DeckKind kind, int number, String name, int price, String type) {
		this.kind = kind;
		this.number = number;
		this.name = name;
		this.price = price;
		this.type = type;
	} 
	
	public DeckKind getKind() {
		return kind;
	}

	public void setKind(DeckKind kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) throws DeckTypeFormatException{
		if (!type.contains("#")&&!type.equals("")) {
			throw new DeckTypeFormatException();
		}
		
		this.type = type;
	}
	
	public abstract void printInfo();
	
	public void setDeckNumber(Scanner input) {
		System.out.print(" Deck Number: ");
		int Number = input.nextInt();
		this.setNumber(Number);
	}
	
	public void setDeckName(Scanner input) {
		System.out.print(" Deck Name: ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setDeckPrice(Scanner input) {
		System.out.print(" Deck Price: ");
		int price = input.nextInt();
		this.setPrice(price);
	}
	
	public void setDeckType(Scanner input) {
		String type = "";
		while (!type.contains("#")) {
		System.out.print(" Deck Type: ");
		type = input.next();
		try {
			this.setType(type);
		} catch (DeckTypeFormatException e) {
			System.out.println("When specifying the deck type, put # in front. ");
		}
		}
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Warrior:
			skind = "War.";
			break;
		case Shaman:
			skind = "Sha.";
			break;
		case Paladin:
			skind = "Pal.";
			break;
		case Mage:
			skind = "Mag.";
			break;
		default:	
		}
		return skind;
	}

}
