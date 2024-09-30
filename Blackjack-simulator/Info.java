import java.util.Scanner;
public class Info {
  public static void evilMethod(){
    Scanner fetch = new Scanner(System.in);
  System.out.println();
	System.out.println("Anyway, do you like Blackjack? If yes, type yes. If no, type no.");
	String input = fetch.next();
    if (input.equalsIgnoreCase("yes")) {
	    System.out.println("Great!");
      Main.slowPrint(1888);
    }
    else if (input.equalsIgnoreCase("no")){
	    System.out.println("Well, what the heck are you doing here?\nWell might as well play since you're here.");
      Main.slowPrint(1888);
    }
	  else {
		  System.out.println("eh, doesn't matter. Moving on.");
      Main.slowPrint(1888);
	  }
  }
}