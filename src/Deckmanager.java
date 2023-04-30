import java.util.ArrayList;
import java.util.Scanner;
import deck.Deck;
import deck.ShamanDeck;

public class Deckmanager {
	ArrayList<Deck> decks = new ArrayList<Deck>();
	Scanner input;
	
	Deckmanager(Scanner input){
		this.input = input;
	}
	
	public void addDeck() {
		int kind = 0;
		Deck deck;
		while (kind != 1 && kind !=2 ){
			System.out.print("1 for Worrior");
			System.out.print("2 for Shamman");
			System.out.print("Select num for deck Kind between 1 and 2:");
			kind = input.nextInt();
			if (kind == 1) {
				deck = new Deck();
				deck.getUserInput(input);
				decks.add(deck);
				break;
			}
			else if (kind == 2) {
				deck = new ShamanDeck();
				deck.getUserInput(input);
				decks.add(deck);
				break;
			}
			else {
				System.out.print("Select num for Deck Kind between 1 and 2:");
			}
		}

	}
	public void deleteDeck() {
		System.out.print("deck number: ");
		int deckNumber = input.nextInt();
		int index = -1;
		for (int i = 0; i<decks.size(); i++) {
			if(decks.get(i).getNumber() == deckNumber) {
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
			Deck deck = decks.get(i);
			if(deck.getNumber() == deckNumber) {
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
					int Number = input.nextInt();
					deck.setNumber(Number);
				}
				else if (num==2) {
					System.out.print("Deck Name: ");
					String name = input.next();
					deck.setName(name);
				}
				else if (num==3) {
					System.out.print("Deck Price: ");
					int price = input.nextInt();
					deck.setPrice(price);
				}
				else if (num==4) {
					System.out.print("Deck Type: ");
					String type = input.next();
					deck.setType(type);
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
		System.out.println("# of registered decks:" + decks.size());
		for (int i = 0; i<decks.size(); i++) {
			decks.get(i).printInfo();
		}
	}

}
