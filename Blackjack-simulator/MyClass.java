import java.util.Scanner;
public class MyClass {
	private static int money=0;
	private static int outcome=0;
	private static boolean win;
  private static int finalScore;
  public static int aceCounter;
  private static int dealerFinalScore; 
  private static  int dealerStartingPoints = (int) (CardMechanic.dealerCards());
  private static int newCard;
  public static int getMoney(){
	  return money;
  }
  public void setMoney(int money){
	  this.money=money;
  }
public static void blackjackRound() {
  int zz = getMoney();
	System.out.println("You have "+zz+ " coins!");
	  int z=money;
	  int y;
	  while (z>0 && z<1999) {
		  dealerStartingPoints=(int) (CardMechanic.dealerCards());
	Scanner bet = new Scanner(System.in);
System.out.println("How much do you want to bet?\nPlease input an integer amount.");
int number=0;
int result=0;
try {
	number=bet.nextInt();
	}
catch (Exception e){
	System.out.println("Did you even pay attention to the last line of text? I said int!");
  Main.slowPrint(800);
  System.out.println("Your bet is now 0.");
	outcome=0;
  Main.slowPrint(800);
}
outcome=number;
if (outcome<0){
	System.out.println("Are you daft? Why are you betting negative numbers? Your bet is now set to 0 as a punishment.");
	outcome=0;
  Main.slowPrint(800);
}
if (outcome>z){
	System.out.println("You don't have enough to bet that amount. As a result, your bet is now 0.");
  Main.slowPrint(800);
  System.out.println("Moving on.");
	outcome=0;
  Main.slowPrint(800);
}
if(outcome==z){
  Main.slowPrint(800);
  System.out.println("You went all in, it's either go big or go homeless.");
  Main.slowPrint(1200);
}
    int startingCards;
    startingCards = CardMechanic.playerCards();
    System.out.println("You start with " + startingCards);
    String playerStatus;
    for (int i = startingCards; i < 100;) {
      System.out.println("The amount of ace you have:" + aceCounter);
      Scanner hOrs = new Scanner(System.in);
      if (i > Math.abs(21) && aceCounter > 0) {
        i -= 10;
        aceCounter --;
        Main.slowPrint(1000);
        System.out.println("Your total point exceeded 21, but luckily your ace canceled out 10 points. \nAnd now your total point is " + i);
        Main.slowPrint(777);
      }
      if (i > 21 && aceCounter == 0) {
        finalScore = i;
        i = 100;
        System.out.println("Your total point is " + finalScore + " , you busted!");
		win=false;
      }
      if (i == 21) {
        finalScore = i;
        i = 100;
        System.out.println("Your total point is 21, you have blackjack!"); 
      } 
      else if (i < 21) {
        System.out.println("<------------------------------> \nHit or Stay?");
        String hitOrstay = hOrs.nextLine();
        if (hitOrstay.equalsIgnoreCase("Hit")) {
          newCard = (int) (Math.random() * 13) + 1;
          if (newCard > 9) {
            newCard = 10;
          }
          if (newCard == 1) {
            newCard = 11;
            aceCounter++;
          }
          i += newCard;
          System.out.println("You drew " + newCard + " and now your total point is " + i);
        }
        if (hitOrstay.equalsIgnoreCase("Stay")) {
          finalScore = i;
          i = 100;
          System.out.println("You stay and your total point is " + finalScore);
        }
      }
    }
    //dealer time -----------------------------------------------


    if (finalScore >= 22) {
      Main.slowPrint(2000);
      System.out.println("The dealer wins, better luck next time.");
	  win=false;
    }
    else {
      Main.slowPrint(2000);
      System.out.println("The dealer has " + dealerStartingPoints);
      aceCounter = 0;
      for (int j = dealerStartingPoints; j < 100;) {
        System.out.println("The amount of ace the dealer has:" + aceCounter);
        if (j > Math.abs(21) && aceCounter > 0) {
          j -= 10;
          aceCounter --;
          Main.slowPrint(900);
          System.out.println("The dealer has exceeded 21, but their ace saved them, so the dealer has " + j);
          Main.slowPrint(900);
        }
        if (j > 21 && aceCounter == 0) {
          finalScore = j;
          j = 100;
          Main.slowPrint(2000);
          System.out.println("The dealer has busted with " + finalScore + "!");
		      win=true;
        }
        else {
          if (j == 21) {
            if (finalScore == 21) {
              j = 100;
              Main.slowPrint(2000);
              System.out.println("The dealer has blackjack. Despite the fact that you also have blackjack, the dealer wins. \nDon't tell me the rules are unfair, the house has to make money somehow.");
			        win=false;
            }
            else {
              j = 100;
              Main.slowPrint(2000);
              System.out.println("The dealer has blackjack, you lose. \nBetter luck next time.");
			        win=false;
            } 
          }
          else {
            if (j < 21) {
              if (j < 17) {
                newCard = (int) (Math.random() * 13) + 1;
                if (newCard > 9) {
                  newCard = 10;
                }
                if (newCard == 1) {
                  newCard = 11;
                  aceCounter++;
                }
				        if (newCard==11 && j>10){
				        	newCard=1;
				        }
                j += newCard;
                Main.slowPrint(2000);
                System.out.println("The dealer drew " + newCard + " and now his point total is " + j + ".");
              }
              else {
                if (j > 16) {
                  dealerFinalScore = j;
                  j = 100;
                  Main.slowPrint(2000);
                  if (dealerFinalScore > finalScore) {
                    System.out.println("The dealer wins with " +dealerFinalScore + " points to your " + finalScore  + ". \nBetter luck next time.");
					win=false;
                  }
                  else { 
                    if (dealerFinalScore == finalScore) {
                      System.out.println("The dealer ties you with " + dealerFinalScore + ". You push.");
					  outcome=0;
                      }
                    else {  
                      if (dealerFinalScore < finalScore) {
                        System.out.println("The dealer stays with " + dealerFinalScore + ". However, you have " + finalScore + ". \nYou win.");
						win=true;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      aceCounter = 0;
    }
	if (win==true){
	result=outcome;
	}
	if (win==false){
	result=outcome * -1;
	}
	z+=result;
	System.out.println("You have "+ z + " coins!");
  }
  if (win) {
    Main.slowPrint(2800);
	  System.out.println("You won! You beat your gambling addiction by gambling even more!\nHowever, you are now a rich man. \nWhether you stay a rich man is completely up to you.\nEveryone around you will start acting differently, gazing upon you for the wealth rather than the individual.\nYou might even experience betrayals and despair.\nPerhaps losing all your money would have been a less tragic outcome.");
	  Main.slowPrint(8000);
  }
  if (win==false){
    Main.slowPrint(3800);
	  System.out.println("You thought you could win, but you left the casino with an empty wallet and no cure to your gambling addiction.\nThere goes your entire life savings.");
	  Loan.callMafia();
  }
}
}