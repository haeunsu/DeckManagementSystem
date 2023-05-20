package deck;

import java.util.Scanner;

public abstract class HearthstoneDeck extends Deck {
	
	public HearthstoneDeck(DeckKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);
	

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " number:" + number + " name:" +name + " price:"+ price +" type:" + type);
	}
	
	public void setDeckNamewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know a deck name? (y/n): ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("deck name: ");
				String name = input.next();
				this.setName(name);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setName(" ");
				break;
			} else {

			}
		}
	}

}
