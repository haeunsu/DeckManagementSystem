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
		switch(num) {
		case 1:
			input.nextLine();//여기서 버퍼를 비워준다는게 뭔뜻이지
			System.out.print("Deck Name: ");
			String deckname1 = input.nextLine();
			System.out.print("Deck Price: ");
			int deckprice = input.nextInt();
			System.out.print("Deck Type: ");
			String decktype = input.next();
			System.out.print("Avarage Mana Cost: ");
			double manacost = input.nextDouble();
			break;
		case 2:
		case 3:
		case 4:
			input.nextLine();
			System.out.print("Deck Name: ");
			String deckname2 = input.nextLine();
		}
		}
	}

}
