public class Algorithms{
	  public static int getMin(int[] inputArray){ 
        int minValue = inputArray[0]; 
        for(int i=1;i<inputArray.length;i++){ 
          if(inputArray[i] < minValue){ 
            minValue = inputArray[i]; 
          } 
        } 
        return minValue; 
      }
	  public static double getMin(double[] inputArray){ 
        double minValue = inputArray[0]; 
        for(int i=1;i<inputArray.length;i++){ 	
          if(inputArray[i] < minValue){ 
            minValue = inputArray[i]; 
          } 
        } 
        return minValue; 
      }
	  public static int getMax(int[] inputArray){ 
        int maxValue = inputArray[0]; 
        for(int i=1;i < inputArray.length;i++){ 
          if(inputArray[i] > maxValue){ 
             maxValue = inputArray[i];
          } 
        } 
        return maxValue; 
      } 
	  public static double getMax(double[] inputArray){ 
        double maxValue = inputArray[0]; 
        for(int i=1;i < inputArray.length;i++){ 
          if(inputArray[i] > maxValue){ 
             maxValue = inputArray[i]; 
          } 
        } 
        return maxValue; 
      }
	  public static int getSum(int [] inputArray){
		  int sum =0;
		  for (int i=0; i<=inputArray.length-1;i++){
			  sum+=inputArray[i];
		  }
		  return sum;
	  } 
	  public static double getSum(double [] inputArray){
		  double sum =0;
		  for (int i=0; i<=inputArray.length-1;i++){
			  sum+=inputArray[i];
		  }
		  return sum;
	  } 
	  public static int getMean(int [] inputArray){
		  int x=getSum(inputArray);
		  return x/inputArray.length;
	  }
	  public static double getMean(double [] inputArray){
		  double x = getSum(inputArray);
		  return x/inputArray.length;
	  }
	  public static boolean anyDivisible(int x, int [] inputArray){
		  boolean divisible=false;
		  for (int i=0; i<inputArray.length; i++){
			  if (inputArray[i]%x==0){
				  divisible=true;
			  }
		  }
		  return divisible;
	  }
	  public static boolean allDivisible(int x, int []inputArray){
		  boolean divisible=true;
		  for (int i=0; i<inputArray.length;i++){
			  if (inputArray[i]%x!=0){
				  divisible=false;
			  }
		  }
		  return divisible;
	  }
	public static int modeVal(int[] nums)
    {
        int count = 0, maxC = 0, n = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i; j < nums.length; j++)
            {
                if(nums[i] == nums[j]) count++;
            }
            if(count > maxC)
            {
                maxC = count;
                n = nums[i];
            }
            count = 0;
        }
        return n;
    }
	//array is in ascending numerical order
    public static boolean ascendingOrd(int[] nums)
    {
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] > nums[i + 1]) return false;
        }
        return true;
    }
	public static boolean descendingOrd(int[] nums)
    {
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] < nums[i + 1]) return false;
        }
        return true;
    }
	 public static int[] rotateR(int[]array)
      {
         int temp = 0;
         for (int i = array.length-1; i>0;i--)
         {
            temp = array [i];
            array[i]=array[i-1];
            array[i-1]=temp;
         }
         return array;
      }
	public static String commonString(String[] nums)
    {
        int count = 0, maxC = 0;
		String s="";
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i; j < nums.length; j++)
            {
                if(nums[i].equals(nums[j])) count++;
            }
            if(count > maxC)
            {
                maxC = count;
                s = nums[i];
            }
            count = 0;
        }
        return s;
    }
	  public static String shiftR(int[] nums)
    {
        int n = nums[nums.length - 1];
        for(int i = nums.length - 1; i > 0; i--)
        {
            nums[i] = nums[i - 1];
        }
        nums[0] = n;
        return arrToStr(nums);
    }
public static String arrToStr(int[] nums)
    {
        String pri = "{";
        for(int i : nums)
        {
            pri += i + ",";
        }
        pri += "}";
        return pri;
    }
	public static String shiftL(int[] nums)
    {
        int n = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            nums[i-1] = nums[i];
        }
        nums[nums.length - 1] = n;
        return arrToStr(nums);
    }
	public static boolean containsVal (int x, int[]inputArray){
		boolean value=false;
		for (int i=0; i<inputArray.length; i++){
			if (inputArray[i]==x){
				value=true;
			}
		}
		return value;
	}
	public static boolean containsVal (String x, String[]inputArray){
		boolean value=false;
		for (int i=0; i<inputArray.length; i++){
			if (inputArray[i].equals(x)){
				value=true;
			}
		}
		return value;
	}
	 public static String maxLen(String[] str)
    {
        int len = 0;
        String s = "";
        for(String i : str)
        {
            if(i.length() > len)
            {
                len = i.length();
                s = i;
            }
        }
        return s;
    }
	 public static String reverse(int[] nums)
    {
        int n = 0;
        for(int i = 0; i < nums.length / 2; i++)
        {
            n = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = n;
        }
        return arrToStr(nums);
    }
	 public static String minLen(String[] str)
    {
        int len = str[0].length();
        String s = str[0];
        for (String i : str) {
            if (i.length() < len) {
                len = i.length();
                s = i;
            }
        }
        return s;
    }
public static String reverse(String[] str)
    {
        String s = "";
        for(int i = 0; i < str.length / 2; i++)
        {
            s = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = s;
        }
        return arrToStr(str);
    }
	public static String arrToStr(String[] str)
    {
        String pri = "{";
        for(String i : str) {
            pri += i + ",";
        }
        return pri.substring(0, pri.length()-1) + "}";
    }
	public static int frequencyArr(int x, int[]inputArray){
		int z=0;
		for (int i=0;i<inputArray.length;i++){
				if (inputArray[i]==x){
					z++;
				}
		}
		return z;
	}
	public static int frequencyArr(String x, String[]inputArray){
		int z=0;
		for (int i=0;i<inputArray.length;i++){
			if (inputArray[i].equals(x)){
				z++;
			}
		}
		return z;
	}
	public static boolean hasDuplicate (int []inputArray){
		boolean value=false;
		for (int i=0; i<inputArray.length;i++){
			for (int z=i+1;z<inputArray.length; z++){
				if (inputArray[i]==inputArray[z]){
					value=true;
				}
			}
		}
		return value;
	}
	public static int sumVersion2 (int[]inputArray){
		int total=0;
		for (int x: inputArray){ //enhanced for loop
			total+=x;
		}
		return total;
	}
}
