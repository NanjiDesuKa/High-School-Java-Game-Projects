import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Bonus.tokenBonus();
  MyClass mula = new MyClass();
  mula.setMoney(Bonus.setBalance());
	System.out.println("Hello, welcome to the blackjack table, where the low lifes hang and the desperate thrive. \nLack of pride or nihilism is recommended.");
  System.out.println();
  System.out.println("The house rules for this blackjack game are:");
  slowPrint(1650);
  System.out.println("The card chances are tailored to be completely random");
  slowPrint(1650);
  System.out.println("Dealer must hit until they reach 17 or more, even if they have more than the player");
  slowPrint(1650);
  System.out.println("If both the dealer and the player have Blackjack, the dealer wins");
  slowPrint(1000);
  System.out.println();
  System.out.println("What is your name?");
	Scanner scanner =new Scanner(System.in);
    String name = scanner.nextLine();
	Main myMain = new Main();
	myMain.nonStaticMethod(name);
	Info.evilMethod();
    MyClass.blackjackRound();
	slowPrint(8000);
		System.out.println("*static*\nThis casino trip was sponsored by Holmer's AP CS course. Enjoy learning about the intricacies of Java and discover cool features such as:");
  slowPrint(7888);
  int controlTime = 800;  
	System.out.println("divisibility: " + New.divisible(2,20));
	System.out.println("position: " + New.intPosition(125161616,2));
	System.out.println("maximum: " +New.maxi(19317668));
  slowPrint(800);
	System.out.println("minimum: " + New.mini(830176));
	System.out.println("sum: " + New.sumOfAll(25036));
	System.out.println("average: " + New.average(13076));
  slowPrint(800);
	System.out.println("frequency: " + New.frequency(999329,9));
	System.out.println("mode: " + New.mode(386305));
	System.out.println(" method statementEx(6) ran "+New.statementEx(6)+" times.");
  slowPrint(800);
	int intArray[] = new int[]{12,6, 12,12, 88, 21, 1, 120,14,14};
	  int intArray5[] = new int[]{1,2,3,4,5,6,7,8};
	  double[] doubleArray = new double[] {2.2, 4.3, 6.4, 10.2, 0, -5.2, 15.5, 7.4 };
    slowPrint(800);
	  int intArray3[]=new int []{52,12,2,1};
	  int intArray2[] = new int [] {1,2,5,6,8,12,20};
	  int intArray7[]=new int [] {1,5,7,6,3};
    slowPrint(800);
	  String stringArray[]=new String [] {"Pineapple", "Gordo","Spiky","pen","pen","no","yes"};
	  System.out.println("minimum: " + Algorithms.getMin(intArray));
	  System.out.println("minimum: " + Algorithms.getMin(doubleArray));
    slowPrint(800);
	  System.out.println("maximum: " + Algorithms.getMax(intArray));
	  System.out.println("maximum: " + Algorithms.getMax(doubleArray));
	  System.out.println("sum: " + Algorithms.getSum(intArray));
    slowPrint(800);
	  System.out.println("sum: " + Algorithms.getSum(doubleArray));
	  System.out.println("mean: " + Algorithms.getMean(intArray));
	  System.out.println("mean: " + Algorithms.getMean(doubleArray));
    slowPrint(800);
	  System.out.println("anyDivisible: " + Algorithms.anyDivisible(2,intArray));
	  System.out.println("allDivisible: " + Algorithms.allDivisible(2,intArray));
	  System.out.println("mode: " + Algorithms.modeVal(intArray));
    slowPrint(800);
	  System.out.println("ascendingOrder: " + Algorithms.ascendingOrd(intArray2));
	  System.out.println("descendingOrder: " + Algorithms.descendingOrd(intArray3));
	  System.out.println("commonString: " + Algorithms.commonString(stringArray));
    slowPrint(800);
	  System.out.println("shiftR: " + Algorithms.shiftR(intArray));
	  System.out.println("shiftL: " + Algorithms.shiftL(intArray5));
	  System.out.println("containsVal: " + Algorithms.containsVal(1,intArray));
    slowPrint(800);
	  System.out.println("containsVal: " + Algorithms.containsVal("Gordo",stringArray));
	  System.out.println("maxLength: " + Algorithms.maxLen(stringArray));
	  System.out.println("reverse: " + Algorithms.reverse(intArray3));
    slowPrint(800);
	  System.out.println("minLength: " + Algorithms.minLen(stringArray));
	  System.out.println("reverse: " + Algorithms.reverse(stringArray));
	  System.out.println("frequency: " + Algorithms.frequencyArr(12,intArray));
    slowPrint(800);
	  System.out.println("frequency: " + Algorithms.frequencyArr("pen",stringArray));
	  System.out.println("hasDuplicate: " + Algorithms.hasDuplicate(intArray7));
	  System.out.println("SumVersion2: "+ Algorithms.sumVersion2(intArray));
    slowPrint(800);
	  System.out.println("Disclaimer: attending this course does not guarantee that you will learn anything without putting in some effort.");
    slowPrint(800);
    System.out.println("Failed attempts to acquire knowledge without effort will not be reimbursed.");
    slowPrint(800);
    System.out.println("By applying to the class, you agree to the terms and service.");
    slowPrint(800);
    System.out.println("Entering this course does not exempt you from being recruited into the Mafia.");
}
  private void nonStaticMethod(String s){
	  System.out.println(s+"?\nWhat an odd name. Are you sure you're from around here?");
    slowPrint(1000);
    System.out.println("I don't recommend staying around here.");
    slowPrint(1000);
    System.out.println("There's this group of strange men that stand around...menacingly.");
    slowPrint(1000);
    System.out.println("Honestly, it's quite bizarre.");
    slowPrint(1000);
  }
  public static void slowPrint(int millisec){
    try{
       Thread.sleep(millisec);
       } 
    catch(InterruptedException ex){
       Thread.currentThread().interrupt();
       }
  }
}