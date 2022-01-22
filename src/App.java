
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player player1 = new Player();
		player1.setName("Player 1");
		Player player2 = new Player();
		player2.setName("Player 2");
		deck.shuffle();
		
		
		for (int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
		player1.describe();
		System.out.println();
		player2.describe();
		
		
		for (int i = 0; i < 26; i++) {
			System.out.println("\nRound " + (i+1));
			Card player1Card = player1.flip();
			System.out.print(player1.getName() + ": ");
			player1Card.describe();
			Card player2Card = player2.flip();
			System.out.print(player2.getName() + ": ");
			player2Card.describe();
			
			
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " has won the round. Current score: " + player1.getScore());
			}else if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " has won the round. Current score: " + player2.getScore());
			}else {
				System.out.println("Round ends in a draw. No points awarded");
			}
			
			
			}
		
		System.out.println("\n##### Final results #####");
		System.out.println(player1.getName() + " has a score of " + player1.getScore());
		System.out.println(player2.getName() + " has a score of " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 has won the game!");
		}else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 has won the game!");
		}else {
			System.out.println("Game ends in a draw. Play Again.");
		}

	}

}
