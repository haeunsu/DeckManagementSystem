import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Deckmanager deckmanager = getObject("deckmanager.ser");
		if (deckmanager == null) {
			deckmanager = new Deckmanager(input);
		}
		
		selectMenu(input, deckmanager);
		putObject(deckmanager, "deckmanager.ser");

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
	
	public static Deckmanager getObject(String filename) {
		Deckmanager deckmanager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			deckmanager = (Deckmanager)in.readObject();
			
			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return deckmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deckmanager;
	}
	
	public static void putObject(Deckmanager deckmanager ,String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(deckmanager);
			
			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

