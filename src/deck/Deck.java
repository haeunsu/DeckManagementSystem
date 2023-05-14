package deck;

import java.util.Scanner;

public abstract class Deck {
	
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

	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void printInfo();

}
