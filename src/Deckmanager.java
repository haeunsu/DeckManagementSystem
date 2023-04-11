
import java.util.Scanner;

public class Deckmanager {
	Decks decks;
	Scanner input;
	
	Deckmanager(Scanner input){
		this.input = input;
	}
	public void addDeck() {
		decks = new Decks();
		System.out.print("deck number");
		decks.number = input.nextInt();
		System.out.print("deck name");
		decks.name = input.next();
		System.out.print("deck price");
		decks.price = input.nextInt();
		System.out.print("deck type");
		decks.type = input.next();
	}
	public void deleteDeck() {
		System.out.print("deck number");
		int deckNumber = input.nextInt();
		if (decks == null) {
			System.out.println("the deck has not been registered");
			return;
		}
		if(decks.number == deckNumber) {
			decks = null;
			System.out.println("the deck is deleted");
		}
	}
	public void editDeck() {
		System.out.print("deck number");
		int deckNumber = input.nextInt();
		if(decks.number == deckNumber) {
			System.out.println("the deck to be edited is" + deckNumber);
		}
	}
	public void viewDeck() {
		System.out.print("deck number");
		int deckNumber = input.nextInt();
		if(decks.number == deckNumber) {
			decks.printInfo();
		}
	}

}
