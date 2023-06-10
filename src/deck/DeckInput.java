package deck;

import java.util.Scanner;

import exception.DeckTypeFormatException;

public interface DeckInput {
	
	public int getNumber();
	
	public void getUserInput(Scanner input);

	public void setNumber(int number);
	
	public String getName();

	public void setName(String name);
	
	public int getPrice();

	public void setPrice(int price);
	
	public String getType();

	public void setType(String type) throws DeckTypeFormatException;

	public void printInfo();
	
	public void setDeckNumber(Scanner input);
	
	public void setDeckName(Scanner input);
	
	public void setDeckPrice(Scanner input);
	
	public void setDeckType(Scanner input);


}
