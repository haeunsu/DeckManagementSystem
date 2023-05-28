import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Deckmanager deckmanager = new Deckmanager(input);
		
		selectMenu(input, deckmanager);

	}

	public static void selectMenu(Scanner input, Deckmanager deckmanager) {
		int num = -1;
		while (num != 5) {
			try {
			showMenu();
			num = input.nextInt();
			switch (num) {
			case 1:
				deckmanager.addDeck();
				logger.log("add a deck");
				break;
			case 2:
				deckmanager.deleteDeck();
				logger.log("dlete a deck");
				break;
			case 3:
				deckmanager.editDeck();
				logger.log("edit a deck");
				break;
			case 4:
				deckmanager.viewDeck();
				logger.log("view a deck");
				break;
			default:
				continue;
			}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Deck Management System Menu ***");
		System.out.println("1. Add Decks");
		System.out.println("2. Delete Decks");
		System.out.println("3. Edit Decks");
		System.out.println("4. View Decks");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5: ");
	}

}
