
import java.util.ArrayList;
import java.util.Scanner;

public class Deckmanager {
	ArrayList<Decks> decks = new ArrayList<Decks>();
	Scanner input;
	
	Deckmanager(Scanner input){
		this.input = input;
	}
	public void addDeck() {
		Decks deck = new Decks();
		System.out.print("deck number: ");
		deck.number = input.nextInt();
		System.out.print("deck name: ");
		deck.name = input.next();
		System.out.print("deck price: ");
		deck.price = input.nextInt();
		System.out.print("deck type: ");
		deck.type = input.next();
		decks.add(deck);
	}
	public void deleteDeck() {
		System.out.print("deck number: ");
		int deckNumber = input.nextInt();
		int index = -1;
		for (int i = 0; i<decks.size(); i++) {
			if(decks.get(i).number == deckNumber) {
				index = i;
				break;
			}			
		}
		
		if (index >=0 ) {
			decks.remove(index);
			System.out.println("the deck " + deckNumber + " is deleted");
			
		}
		else {
			System.out.println("the deck has not been registered");
			return;
		}
	}
	public void editDeck() {
		System.out.print("deck number: ");
		int deckNumber = input.nextInt();
		for (int i = 0; i<decks.size(); i++) {
			Decks deck = decks.get(i);
			if(deck.number == deckNumber) {
			int num = -1;
			while(num != 5) {
				System.out.println("*** Deck Management System Menu ***");
				System.out.println("1. Add Decks");
				System.out.println("2. Delete Decks");
				System.out.println("3. Edit Decks");
				System.out.println("4. View Decks");
				System.out.println("5. Exit");
				System.out.println("Select one number between 1-5: ");
				num = input.nextInt();
				if (num==1) {
					System.out.print("Deck Number: ");
					deck.number = input.nextInt();
				}
				else if (num==2) {
					System.out.print("Deck Name: ");
					deck.name = input.next();
				}
				else if (num==3) {
					System.out.print("Deck Price: ");
					deck.price = input.nextInt();
				}
				else if (num==4) {
					System.out.print("Deck Type: ");
					deck.type = input.next();
				}
				else {
					continue;
					} // if
				} //while
			break;
		} //if

		} //for
	}
	public void viewDeck() {
//		System.out.print("deck number");
//		int deckNumber = input.nextInt();
		for (int i = 0; i<decks.size(); i++) {
			decks.get(i).printInfo();
		}
	}

}
