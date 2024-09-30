	public class CardMechanic {
public static int dealerCards() {
	int dealerValue1;
	dealerValue1 = (int) (Math.random()*9)+2;
	int dealerTotal = dealerValue1;
	return dealerTotal;
	}
public static int playerCards() {
	int playerValue1;
	int playerValue2;
	playerValue1 = (int) (Math.random()*10)+2;
	playerValue2 = (int) (Math.random()*10)+2;
	int playerTotal = playerValue1 + playerValue2;
	if (playerValue1+playerValue2==22){
		playerTotal=12;
    MyClass.aceCounter = 1;
	}
	return playerTotal;
	}
}