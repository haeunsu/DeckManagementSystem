package deck;

import java.util.Scanner;

public class ShamanDeck extends HearthstoneDeck{
	
	public ShamanDeck(DeckKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setDeckNumber(input);
		setDeckNamewithYN(input);
		setDeckPrice(input);
		setDeckType(input);
	}
	

		
		
	
	

	

}
