package deck;

import java.util.Scanner;

public class WorriorDeck extends Deck{
	
	public WorriorDeck(DeckKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setDeckNumber(input);
		setDeckName(input);
		setDeckPrice(input);
		setDeckType(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " number:" + number + " name:" +name + " price:"+ price +" type:" + type);
	}

}
