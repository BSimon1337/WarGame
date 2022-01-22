
public class Card {
	
	
	private String name;
	private int value;
	
	public Card (int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() {
		if (value == 2) {
			System.out.println("Two of " + name);
		}else if (value == 3) {
			System.out.println("Three of " + name);
		}else if (value == 4) {
			System.out.println("Four of " + name);
		}else if (value == 5) {
			System.out.println("Five of " + name);
		}else if (value == 6) {
			System.out.println("Six of " + name);
		}else if (value == 7) {
			System.out.println("Seven of " + name);
		}else if (value == 8) {
			System.out.println("Eight of " + name);
		}else if (value == 9) {
			System.out.println("Nine of " + name);
		}else if (value == 10) {
			System.out.println("Ten of " + name);
		}else if (value == 11) {
			System.out.println("Jack of " + name);
		}else if (value == 12) {
			System.out.println("Queen of " + name);
		}else if (value == 13) {
			System.out.println("King of " + name);
		}else if (value == 14) {
			System.out.println("Ace of " + name);
		}
	}
	
	
	

}
