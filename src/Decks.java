
public class Decks {
	
	int number;
	int price;
	String name;
	String type;
	
	public Decks() {
	}
	
	public Decks(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Decks(int number, String name, int price, String type) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public void printInfo() {
		System.out.println("number:" + number + "name:" +name + "price:"+ price +"type:" + type);
	}
}
