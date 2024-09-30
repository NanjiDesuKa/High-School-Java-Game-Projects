import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Card.initializeCard();
        Launch launch = new Launch();
        Requirements.verySad();
        Requirements.verySad2();
        Requirements.evenSadder();
        Requirements.insertionSort(Requirements.sortingTime);
        Requirements.selectionSort(Requirements.sortingTime);
        ArrayList<Integer> joe = new ArrayList<Integer>(6);
        System.out.println(joe.add(1));
        System.out.println(joe.size());
        System.out.println(joe.set(0,69));
        System.out.println(joe.remove(0));
        joe.add(0,1);
        joe.add(0,2);
        joe.add(1,1);
        System.out.println(joe.get(1));
        System.out.println(joe);
        System.out.println(Arrays.toString(joe.toArray()));
        Requirements.arrayListTraverse();
        Requirements.deleteEverything();
        System.out.println(Requirements.linearSearchInArrayTroy(45));
    }
}

