import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import deck.Deck;
import deck.DeckInput;
import deck.DeckKind;
import deck.MageDeck;
import deck.ShamanDeck;
import deck.WorriorDeck;

public class Deckmanager {
	ArrayList<DeckInput> decks = new ArrayList<DeckInput>();
	Scanner input;
	
	Deckmanager(Scanner input){
		this.input = input;
	}
	
	public void addDeck() {
		int kind = 0;
		DeckInput deckInput;
		while (kind != 1 && kind !=2 ){
			try {
			System.out.println("1 for Worrior ");
			System.out.println("2 for Shamman ");
			System.out.println("3 for Mage ");
			System.out.print("Select num 1, 2, or 3 for Deck Kind: ");
			kind = input.nextInt();
			if (kind == 1) {
				deckInput = new WorriorDeck(DeckKind.Warrior);
				deckInput.getUserInput(input);
				decks.add(deckInput);
				break;
			}
			else if (kind == 2) {
				deckInput = new ShamanDeck(DeckKind.Shaman);
				deckInput.getUserInput(input);
				decks.add(deckInput);
				break;
			}
			else if (kind == 3) {
				deckInput = new MageDeck(DeckKind.Mage);
				deckInput.getUserInput(input);
				decks.add(deckInput);
				break;
			}
			else {
				System.out.print("Select num for Deck Kind between 1 and 2:");
			}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}

	}
	public void deleteDeck() {
		System.out.print("deck number: ");
		int deckNumber = input.nextInt();
		int index = findIndex(deckNumber);
		removefromdecks(index, deckNumber);
	}
	
	public int findIndex(int deckNumber){
		int index = -1;
		for (int i = 0; i<decks.size(); i++) {
			if(decks.get(i).getNumber() == deckNumber) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromdecks(int index, int deckNumber) {
		if (index >=0 ) {
			decks.remove(index);
			System.out.println("the deck " + deckNumber + " is deleted");
			return 1;
			
		}
		else {
			System.out.println("the deck has not been registered");
			return -1;
		}
	}
	
	public void editDeck() {
		System.out.print("deck number: ");
		int deckNumber = input.nextInt();
		for (int i = 0; i<decks.size(); i++) {
			DeckInput deck = decks.get(i);
			if(deck.getNumber() == deckNumber) {
			int num = -1;
			while(num != 5) {
				showEditMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					deck.setDeckNumber(input);
					break;
				case 2:
					deck.setDeckName(input);
					break;
				case 3:
					deck.setDeckPrice(input);
					break;
				case 4:
					deck.setDeckType(input);
					break;
				default:
					continue;
				}
				
				} //while
			break;
		} //if

		} //for
	}
	public void viewDeck() {
		System.out.println("# of registered decks:" + decks.size());
		for (int i = 0; i<decks.size(); i++) {
			decks.get(i).printInfo();
		}
	}
	
	
	
	public void showEditMenu() {
		System.out.println("*** Deck Management System Menu ***");
		System.out.println("1. Add Decks ");
		System.out.println("2. Delete Decks ");
		System.out.println("3. Edit Decks ");
		System.out.println("4. View Decks ");
		System.out.println("5. Exit ");
		System.out.println("Select one number between 1-5: ");
		
	}

}
