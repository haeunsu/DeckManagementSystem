package deck;

import java.util.Scanner;

public interface DeckInput {
	
	public int getNumber();
	
	public void getUserInput(Scanner input);

	public void setNumber(int number);

	public void setName(String name);

	public void setPrice(int price);

	public void setType(String type);

	public void printInfo();


}
