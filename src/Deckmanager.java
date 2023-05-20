import java.util.ArrayList;
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
					setDeckNumber(deck, input);
					break;
				case 2:
					setDeckName(deck, input);
					break;
				case 3:
					setDeckPrice(deck, input);
					break;
				case 4:
					setDeckType(deck, input);
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
	
	public void setDeckNumber(DeckInput deck, Scanner input) {
		System.out.print(" Deck Number: ");
		int Number = input.nextInt();
		deck.setNumber(Number);
	}
	
	public void setDeckName(DeckInput deck, Scanner input) {
		System.out.print(" Deck Name: ");
		String name = input.next();
		deck.setName(name);
	}
	
	public void setDeckPrice(DeckInput deck, Scanner input) {
		System.out.print(" Deck Price: ");
		int price = input.nextInt();
		deck.setPrice(price);
	}
	
	public void setDeckType(DeckInput deck, Scanner input) {
		System.out.print(" Deck Type: ");
		String type = input.next();
		deck.setType(type);
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
