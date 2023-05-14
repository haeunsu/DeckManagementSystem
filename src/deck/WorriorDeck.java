package deck;

import java.util.Scanner;

public class WorriorDeck extends Deck implements DeckInput{
	
	public WorriorDeck(DeckKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("deck number: ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("deck name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("deck price: ");
		int price = input.nextInt();
		this.setPrice(price);
		
		System.out.print("deck type: ");
		String type = input.next();
		this.setType(type);
	}
	
	public void printInfo() {
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
		System.out.println("kind:" + skind + " number:" + number + " name:" +name + " price:"+ price +" type:" + type);
	}

}
