package deck;

import java.util.Scanner;

public class ShamanDeck extends Deck {
	
	public ShamanDeck(DeckKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("deck number:");
		int number = input.nextInt();
		this.setNumber(number);

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
		System.out.print("deck price: ");
		int price = input.nextInt();
		this.setPrice(price);

		System.out.print("deck type: ");
		String type = input.next();
		this.setType(type);
	}

}
