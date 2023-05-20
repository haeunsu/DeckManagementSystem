package deck;

import java.util.Scanner;

public class MageDeck extends HearthstoneDeck {
	
	protected String renathalname;
	protected String renathaltype;
	
	public MageDeck(DeckKind kind) {
		super(kind);
	}
	
	
	
	public void getUserInput(Scanner input) {
		setDeckNumber(input);
		setDeckName(input);
		setDeckNamewithYN(input);
		setDeckPrice(input);
		setDeckType(input);
	}
	
	public void setRenathalNamewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Do you know a 40XL deck name? (y/n): ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setDeckName(input);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setName("");
				break;
			} else {

			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " number:" + number + " name:" +name + " price:"+ price +" type:" + type +" 40XL name:" + renathalname+ " 40XL type: " +renathaltype);
	}

}
