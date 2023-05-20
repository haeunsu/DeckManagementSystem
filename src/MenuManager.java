import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Deckmanager deckmanager = new Deckmanager(input);

		int num = -1;
		while (num != 5) {
			showMenu();
			num = input.nextInt();
			switch (num) {
			case 1:
				deckmanager.addDeck();
				break;
			case 2:
				deckmanager.deleteDeck();
				break;
			case 3:
				deckmanager.editDeck();
				break;
			case 4:
				deckmanager.viewDeck();
				break;
			default:
				continue;
			}

		}
	}
//	public static void addDeck() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("deck number ");
//		int deckNumber = input.nextInt();
//		System.out.print("deck name ");
//		String deckName = input.next();
//		System.out.print("deck price ");
//		int deckPrice = input.nextInt();
//		System.out.print("deck type ");
//		String decktype = input.next();
//	}
//	public static void deleteDeck() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("deck number ");
//		int deckNumber = input.nextInt();
//	}
//	public static void editDeck() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("deck number ");
//		int deckNumber = input.nextInt();
//	}
//	public static void viewDeck() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("deck number ");
//		int deckNumber = input.nextInt();
//	}

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
