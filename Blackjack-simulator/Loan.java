import java.util.Scanner;
public class Loan{
	private int loanAmount=0;
	static String fallingObject="brick";
	/**constructor method Loan 
	@param amount creates a loan with the int value. 
	The int value should be positive.
	Precondition: amount>=0
	However, if amount<0, the method will work anyway, with loanAmount=0
	post condition: the local variable amount value is stored in the instance variable loanAmount.
		If the amount value is 200 or more, fallingObeject is set to the "baseball bat" string
		If the amount value is less than or equal to 0, the loanAmount variable will be set to 0 and a String message will print out.
	*/
	public Loan(int amount){
		/*
		if the loan amount is 200 or more, 
		the String instance variable fallingObject is set to "brick"
		*/
		if (amount>=200){
			fallingObject="baseball bat";
		}
		/*if the loan amount is less than or equal to 0, the amount is set to 0, which then becomes the value of loanAmount. A string message is then printed out in response.
		*/
		if (amount<=0){
			System.out.println("Uhhh, sure I guess? I guess we can loan you nothing. You still owe us though.");
			amount=0;
		}
		loanAmount=amount;
	}
	/**This is the toString method
	*/
	public String toString(){
		return "You owed the mafia " + loanAmount + " coins ";
	}
	public int getLoanAmount(){
		return loanAmount;
	}
	public void changeLoanAmount(int amount){
		loanAmount=amount;
		if (amount>199){
			fallingObject="baseball bat";
		}
	}
	public static void callMafia(){
    Main.slowPrint(2000);
   System.out.println();
   System.out.println("Loading...");
   System.out.print("     ♠");
   Main.slowPrint(820);
   System.out.print("                ♣");
   Main.slowPrint(820);
   System.out.print("                ♦");
   Main.slowPrint(820);
   System.out.println("                ♥");
   Main.slowPrint(820);
   System.out.println();
		System.out.println("You're all out of money, lacking even one cent to your name. If you go now, you will most likely not survive the night. The Streets are cold, and the world colder. Your last resort is the local mafia. Attempt to contact them for a loan?");
		Scanner desperado = new Scanner(System.in);
	String poor = desperado.next();
    if (poor.equalsIgnoreCase("yes")) {
	   yesMafia();
    }
    else if (poor.equalsIgnoreCase("no")){
	    System.out.println("You are kicked out of the casino, left to fend for yourself on the cold cobblestone streets. The night seems to grow colder than before, and the world around you fades away. The Streets have claimed another soul.");
    }
	  else {
		  System.out.println("You didn't answer correctly so you got kicked out of the casino and fell asleep on the ground in the middle of the freezing night, your eyes slowly closing. Many hours pass.\nYou wake up on a cart chained. There are other prisoners.\nOne of them say,\n \"You're finally awake.\"");
		  Main.slowPrint(2000);
	  }
	}
	public static void yesMafia(){
		System.out.println("Big Bill: How much ya wanna \"borrow\", kid?");
		Scanner green = new Scanner(System.in);
		try {
	int answer = green.nextInt();
	Loan lastResort= new Loan(answer);
	System.out.println("You are being loaned " +lastResort.getLoanAmount()+".");
  Main.slowPrint(1800);
	System.out.println("You take your loaned money and walk out of the mafia den. You feel uneasy. Do you feel safe?");
	Scanner t = new Scanner(System.in);
	String r = t.next();
    if (r.equalsIgnoreCase("yes")) {
     Main.slowPrint(1800);
	   System.out.println("Are you sure about that?");
    }
    else if (r.equalsIgnoreCase("no")){
      Main.slowPrint(1700);
	    System.out.println("Too bad.");
    }
	  else {
      Main.slowPrint(1800);
		  System.out.println("Your response was not very verbose nor understandable.");
	  }
    Main.slowPrint(1800);
	  System.out.println("You walk down the block heading back towards the Casino, when suddenly a "+fallingObject+" falls from the sky and knocks your loan into a nearby sewer grate.");
    Main.slowPrint(1200);
    System.out.println("You've been hit by. You've been struck by. A " + fallingObject+".");
    Main.slowPrint(1200);
    System.out.println("The Mafia become enraged with your inability to pay them back.");
    Main.slowPrint(1200);
    System.out.println("You are forced to work for the Mafia for 20 years as a grunt.");
    Main.slowPrint(1200);
	   System.out.println(lastResort);
	}
catch (Exception f){
  Main.slowPrint(1800);
	System.out.println("Big Bill: If you're not going to take this seriously, you'll get nothing. Now scram.");
}
	}
}