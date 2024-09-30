import java.util.Scanner;
public class Bonus{
  private static int token;
  private static int[]tokens = {20,200,400,0};
  public static void tokenBonus(){
  System.out.println("Hi there, our Casino is giving out free token today.");
  Main.slowPrint(1000);
  System.out.println("Pick one of the three token as your bonus entrance coin balance! Each coin has a different value. The values are 400, 200, or 20.");
  Main.slowPrint(2000);
  System.out.print("   ?");
  Main.slowPrint(820);
  System.out.print("         ?");
  Main.slowPrint(820);
  System.out.println("         ?");
  Main.slowPrint(820);
  System.out.println("Do you want the first, second, or third token?");
  Scanner scammer = new Scanner(System.in);
  String decision= scammer.next();
  if(decision.equalsIgnoreCase("first")||decision.equalsIgnoreCase("second")|| decision.equalsIgnoreCase("third")){
    setToken();
    System.out.println("You have chosen the "+decision+" token, it's worth "+token+" coins.");
   }else{
     System.out.println("Well I guess you don't want that bonus.");
     setToken(3);
   }
   System.out.println("You claimed "+token+" coins in addition to your 500 coins that you were supposed to use to: \n Pay your rent \n Feed yourself \n Feed your family \n Buy some Hollow Knight merch \n Buy Splatfest merch and some Inkling Amiibos \n Buy insurance for your car and yourself \n Invest in stocks \n Buy your parents a nice gift \n Invest in your start up business \n Invest for your retirement \n And pay your taxes\n Yes, 500 coins can get you all of that. Imagine what you're gambling here.");
   Main.slowPrint(13000);
   System.out.println();
   System.out.println("Loading...");
   System.out.print("     A");
   Main.slowPrint(820);
   System.out.print("                C");
   Main.slowPrint(820);
   System.out.print("                E");
   Main.slowPrint(820);
   System.out.println("                S");
   Main.slowPrint(820);
   System.out.println();
 }
  public static int setBalance(){
    return getToken()+ 500;
  }
  public static void setToken(){
    token = tokens[(int)(Math.random()*3)];
  }
  public static void setToken(int a){
    token = tokens[3];
  }
  public static int getToken(){
    return token;
  }
}