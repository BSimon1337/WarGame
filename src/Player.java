import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	public Player() {}
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	
	public void describe(Card card) {
		System.out.println(this.name " plays: " + card.describe());
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw (Deck deck) {
		hand.add(deck.draw());
	}
	
	public int incrementScore() {
		return this.score +=1;
	}
	
	public List<Card> getHand(){
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;//ask how this. works in the method
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
