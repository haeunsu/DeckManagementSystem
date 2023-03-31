import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num != 6) {
		System.out.println("*** Deck Management System Menu ***");
		System.out.println("1. Add Decks");
		System.out.println("2. Delete Decks");
		System.out.println("3. Edit Decks");
		System.out.println("4. View Decks");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6: ");
		num = input.nextInt();
		if (num==1) {
			addDeck();
		}
		else if (num==2) {
			deleteDeck();
		}
		else if (num==3){
			editDeck();
		}
		else if (num==4){
			viewDeck();
		}
		else {
			continue;
			}
		}
	}
	public static void addDeck() {
		Scanner input = new Scanner(System.in);
		System.out.print("deck price");
		int deckPrice = input.nextInt();
		System.out.print("deck name");
		String deckName = input.next();
		System.out.print("deck type");
		String decktype = input.next();
	}
	public static void deleteDeck() {
		Scanner input = new Scanner(System.in);
		System.out.print("deck name");
		String deckName = input.next();
	}
	public static void editDeck() {
		Scanner input = new Scanner(System.in);
		System.out.print("deck name");
		String deckName = input.next();
	}
	public static void viewDeck() {
		Scanner input = new Scanner(System.in);
		System.out.print("deck name");
		String deckName = input.next();
	}
}
