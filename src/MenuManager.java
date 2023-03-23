import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
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
		}
	}

}
