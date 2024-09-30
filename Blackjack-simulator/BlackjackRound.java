import java.util.Arrays;
public class BlackjackRound {
  static String[] arrayCards = {"ca", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "cj", "cq", "ck", "sa", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "sj", "sq", "sk", "da", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "dj", "dq", "dk", "ha", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "hj", "hq", "hk"};

  static int index=0;
  static String card = "";
  static String[] copyArrayCards = arrayCards;
  static int cardNumber;
  static String glub = "";
  static String cardName = "";
  static String cardSuit = "";

  public static void drawCard() {
    //if (arrayCards.length % 2 == 0) {
      index = (int)(Math.random()*(arrayCards.length-1)+1);
      card = arrayCards[index];
      copyArrayCards = new String[arrayCards.length-1];
      for (int i = 0, j = 0; i < arrayCards.length;i++) {
        if (i != index) {
          copyArrayCards[j++] = arrayCards[i];
        }
      }
      arrayCards = copyArrayCards;
    /*}
    else {
      index = (int)(Math.random()*(arrayCards.length-1)+1);
      card = copyArrayCards[index];
      arrayCards = new String[copyArrayCards.length-1];
      for (int i = 0, j = 0; i < copyArrayCards.length;i++) {
        if (i != index) {
          arrayCards[j++] = copyArrayCards[i];
        }
      }
      copyArrayCards = arrayCards;
    }*/
    //System.out.println(card);
    //return card;
  }
  //public static void shuffleDeck() {
    //arrayCards = {"ca", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "cj", "cq", "ck", "sa", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "sj", "sq", "sk", "da", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "dj", "dq", "dk", "ha", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "hj", "hq", "hk"};
  //}
  public static int getCard() {
    if (card.substring(1,card.length()).equals("a")) {
      return 1;
    }
    if (card.substring(1,card.length()).equals("2")) {
      return 2;
    }
    if (card.substring(1,card.length()).equals("3")) {
      return 3;
    }
    if (card.substring(1,card.length()).equals("4")) {
      return 4;
    }
    if (card.substring(1,card.length()).equals("5")) {
      return 5;
    }
    if (card.substring(1,card.length()).equals("6")) {
      return 6;
    }
    if (card.substring(1,card.length()).equals("7")) {
      return 7;
    }
    if (card.substring(1,card.length()).equals("8")) {
      return 8;
    }
    if (card.substring(1,card.length()).equals("9")) {
      return 9;
    }
    if (card.substring(1,card.length()).equals("10")) {
      return 10;
    }
    if (card.substring(1,card.length()).equals("j")) {
      return 10;
    }
    if (card.substring(1,card.length()).equals("q")) {
      return 10;
    }
    if (card.substring(1,card.length()).equals("k")) {
      return 10;
    }
    return 0;
  }
  public static void decipherCard(String card) {
    glub = card.substring(1,card.length());
    if (glub.equals("a")) {
      cardNumber = 1;
      cardName = "ace";
    }
    if (glub.equals("2")) {
      cardNumber = 2;
      cardName = "two";
    }
    if (glub.equals("3")) {
      cardNumber = 3;
      cardName = "three";
    }
    if (glub.equals("4")) {
      cardNumber = 4;
      cardName = "four";
    }
    if (glub.equals("5")) {
      cardNumber = 5;
      cardName = "five";
    }
    if (glub.equals("6")) {
      cardNumber = 6;
      cardName = "six";
    }
    if (glub.equals("7")) {
      cardNumber = 7;
      cardName = "seven";
    }
    if (glub.equals("8")) {
      cardNumber = 8;
      cardName = "eight";
    }
    if (glub.equals("9")) {
      cardNumber = 9;
      cardName = "nine";
    }
    if (glub.equals("10")) {
      cardNumber = 10;
      cardName = "ten";
    }
    if (glub.equals("j")) {
      cardNumber = 11;
      cardName = "jack";
    }
    if (glub.equals("q")) {
      cardNumber = 12;
      cardName = "queen";
    }
    if (glub.equals("k")) {
      cardNumber = 13;
      cardName = "king";
    }
    if (card.substring(0,1).equals("c")) {
      cardSuit = "clubs";
    }
    if (card.substring(0,1).equals("s")) {
      cardSuit = "spades";
    }
    if (card.substring(0,1).equals("d")) {
      cardSuit = "diamonds";
    }
    if (card.substring(0,1).equals("h")) {
      cardSuit = "hearts";
    }
    System.out.println(cardName + " of " + cardSuit + ".");
  }
}