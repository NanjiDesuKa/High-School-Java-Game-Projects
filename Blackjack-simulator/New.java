public class New{
	public static boolean divisible(int a, int b){
	  if (a%b==0){
		  return true;
	  }
	  if (b%a==0){
		  return true;
	  }
	  else{
		  return false;
	  }
  }
  public static String intPosition(int a, int b){
	  String firstString = "" + a;
	  
	  return firstString.substring(b,b+1); 
  }
  public static int maxi(int a) {
    if (a>0) {
        int x=a%10;
        int max=maxi(a/10);
        return Math.max(x, max);
    } else {
        return 0;
    } 
}
public static int mini(int a){
    int tempMin = 0;
    String ranStr = String.valueOf(a);
    int first = Integer.parseInt(String.valueOf(ranStr.charAt(0)));
    for (int i = 0; i < ranStr.length() - 1; i++) {
      tempMin = Math.min(first, Integer.parseInt(String.valueOf(ranStr.charAt(i + 1))));
      first = tempMin;
    }
    return tempMin;
}
static int sumOfAll(int x)
	{
	int sum=0;
	    while(x!=0)
	    {
		sum+=x%10;
		x/=10;
	    }
	return sum;
	}
	static double average(int a){
	double x=sumOfAll(a);
	String z = ""+a;
	return x/(z.length());
}
public static int frequency(int a, int b) {
  String c = "" + a;
  String d = "" + b;
  int counter = 0;
  for (int i = 0; i < c.length(); i++) {
    if ( c.substring(i, i+1).equals(d))
      counter++;
  }
  return counter;
}
 static int mode(int a){
    String mode = "";
    int modeVal = 0;
    int mode1=frequency(a,1);
    int mode2=frequency(a,2);
    int mode3=frequency(a,3);
    int mode4=frequency(a,4);
    int mode5=frequency(a,5);
    int mode6=frequency(a,6);
    int mode7=frequency(a,7);
    int mode8=frequency(a,8);
    int mode9=frequency(a,9);
    int mode0=frequency(a,0);
    String po = "" +mode1+mode2+mode3+mode4+mode5;
    String op = "" +mode6+mode7+mode8+mode9+mode0;
    int poo = maxi(Integer.valueOf(po));
    int oop = maxi(Integer.valueOf(op));
    if (poo > oop || poo == oop){
      modeVal = poo;
    } else {
      modeVal = oop;
    }
    if (modeVal == mode1){
      mode = mode + 1;
    }
    if (modeVal == mode2){
      mode = mode + 2;
    }
    if (modeVal == mode3){
      mode = mode + 3;
    }
    if (modeVal == mode4){
      mode = mode + 4;
    }
    if (modeVal == mode5){
      mode = mode + 5;
    }
    if (modeVal == mode6){
      mode = mode + 6;
    }
    if (modeVal == mode7){
      mode = mode + 7;
    }
    if (modeVal == mode8){
      mode = mode + 8;
    }
    if (modeVal == mode9){
      mode = mode + 9;
    }
    if (modeVal == mode0){
      mode = mode + 0;
    }
    int hahahahaha = Integer.valueOf(mode);
    return hahahahaha;
  }
  static int mode2(int b) {
    String input = "";
    input += b;
    int newMode = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < input.length(); j++) {
        if (frequency(b, j) > newMode) {
          newMode = j;
        }
      }
    }
    return newMode; //no idea if this works
  }
  public static int statementEx(int r){//statement execution
	  int x=0;
	  int c=0;
	  while (x<r){
		  int y=0;
		  while (y<5){
			  c++;
			  y++;
		  }
		  x++;
	  }
 return c;
  }
}