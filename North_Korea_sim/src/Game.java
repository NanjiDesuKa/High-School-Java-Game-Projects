import java.util.*;
public class Game {
    public static Music x = new Music();
    public Game() {
    }
    public static Music f = new Music();
    public static String name;
    static int level;
    public static String getName(){
        return name;
    }
    public static void congruence(){
        System.out.println("Congruence of iteration and recrusion:\n");
        int iterate=0;
        for (int i=0; i<5; i++){
            iterate++;
        }
        int recur=0;
        recur=recursionIterate(5);
        System.out.println("x=5\nRecursion: "+ recur+" times\nIteration loop: "+iterate+" times\n");
        System.out.println("Recursion is another form of iteration.\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static int recursionIterate(int x){
        if (x==0) return 0;
        return 1+ recursionIterate(x-1);
    }
    //precondition: x<arr.length
    public static int stringArraySegmentLength(String[] arr, int x){
        if (x==0) return 0;
        else {
            arr[x]=""+x;
            return 1+stringArraySegmentLength(arr, x-1);
        }
    }
    //precondition: y<x.size()
    public static int arraylistRecursion(ArrayList x, int y){
        x.remove(y);
        x.set(0,y);
        if (y<=x.size()+1) return 0;
        return 1+arraylistRecursion(x, y+1);
    }
    //array is in order from least to greatest
    public static int recBinarySearch(int intArray[], int lowPosition, int highPosition, int target) {
        int midPosition;

        if (lowPosition > highPosition) {
            return -1;
        } else {
            midPosition = (lowPosition + highPosition)/2;
            if (intArray[midPosition] < target)
                return recBinarySearch(intArray, midPosition + 1, highPosition, target);
            if (intArray[midPosition] > target)
                return recBinarySearch(intArray, lowPosition, midPosition - 1, target);

            return midPosition;
        }
    }
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    public static void mergeArrListSort(ArrayList<Integer> arr, int low, int high)
    {
        if(low < high)
        {
            int mid = (low + high)/2;
            mergeArrListSort(arr, low, mid);
            mergeArrListSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(ArrayList<Integer> arr, int low, int mid, int high)
    {
        //copy the left "half" to a new array
        ArrayList<Integer> left = new ArrayList();

        //populate the copy
        for(int i = 0; i < mid + 1 - low; i++)
            left.add(arr.get(i + low));

        //keep track of the leftmost index
        int leftIndex = 0;

        //as long as low < middle < high
        while(low < mid + 1 && mid + 1 <= high)
        {
            //if the right index is less than the left index
            if(arr.get(mid+1) < left.get(leftIndex))
            {
                //store the right index and increment
                arr.set(low, arr.get(mid+1));
                low++;
                mid++;
            }
            else
            {
                //take the left index and increment
                arr.set(low, left.get(leftIndex));
                low++;
                leftIndex++;
            }
        }
        //there may be leftovers in the left "half"
        while(low < mid + 1)
        {
            //so take them from the left "half"  and increment
            arr.set(low, left.get(leftIndex));
            low++;
            leftIndex++;
        }
    }
        public static void initializeGame(NorthKorean object){
        System.out.println("Skip loading text?(y/n)");
        Scanner x = new Scanner(System.in);
        String g = x.nextLine();
        if (g.equals("y")){
            System.out.println("Text Skipped.");
        }
        else if (g.equals("n")) {
            System.out.println("\n\n\nGame starting....");
            slowPrint(400);
            System.out.println("Unfeeding peasants...");
            slowPrint(400);
            System.out.println("Loading DMZ Assets...");
            slowPrint(800);
            System.out.println("Adjusting wealth inequality...");
            slowPrint(200);
            System.out.println("Instilling fear in citizens...");
            slowPrint(100);
            System.out.println("Turning RTX off for PyongYang...");
            slowPrint(400);
            System.out.println("Corrupting government...");
            slowPrint(500);
            System.out.println("Bribing soldiers...");
            slowPrint(300);
            System.out.println("Great Leader dying from indulgence...");
            slowPrint(150);
            System.out.println(Game.recursionMethodRequirement(15)+" assets loaded...");
            slowPrint(700);
            System.out.println(Game.recursionWithTwoBase(102345) +"%...");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nE S C A P E   F R O M  P Y O N G Y A N G\n\n\n\n");
            System.out.println();
            slowPrint(300);
            System.out.println();
            slowPrint(300);
            System.out.println();
            slowPrint(300);
            System.out.println();
            slowPrint(300);
            System.out.println();
            slowPrint(300);
            if (object.getStatus()=="Peasant") {
                System.out.println("                                     .\n                                    .' '.\n                                  .'  |  `.\n                                .'    |    `.\n                              .`---.._|_..---'.\n                               ||    |=|    ||\n                               ||_.-'|=|`-._||\n                               ||`-._|=|_.-'||\n                          _____||    |=|    ||__\n            ____________.'     `-.   |=|  .'_.'\\/`.\n          .'       _  .' _______  `-.|_|.' .'\\.'`./`.\n        .'     _   _.'      _   _        .'\\.' `._`./`.\n      .' _       _.' __          __    .'\\.'  ___`._`./`.\n    .'        _ .'   _____           .'\\.'         `._`./`.\n  .'  _  _    .'       ______      .'\\.'  __         `._`./`.\n.'`--...__ _.'            ______ .'\\.'           __    `._`./`.\n `--...__ .'   ____            .'\\.'           _         `._`./`.\n |      .`--...__            .'\\.'     _               ____`._`./`.\n | /`-._ `--...__`--...___ .'\\.'              _______       _`._`./`.\n | | ) ( |       `--...____\\.'     _     _  .'      .`.        `._`./\n | |)   (| /`-._             |            .'      .'   `.     _ |\n | |(--| | | )( |  /`-._`--._|____       /      .'       `.     |\n | | ) `.| |(  )|  | )( |    | _      _ /      /   .---.  `\\    |\n | `--._ | |/  \\|  |(  )|`-  |         /`--.._/   /     \\  ' _  |\n | `-.   | |)-.(|  |/  \\|    |       __|      |_  |`-   |  |  _ |\n |    `-.| |) |(|  |)-.(|    |  ___  _ |  __  | __| \\`- |  |    |\n '-._    | `--._/  |) |(|    |      __ |      |   | |`- |  | _  |\n     `-._| `--.    `--._/    |  ___    | _    |   | |`- |  |   '|\n         |      `--._        |       _ |    ' |   |O|`- | _| _  |\n         '--._         `--._ |         | _    |_ \"| |`- |. |  __|\n              `--._          |       __|      |   | |`- |. | __ |\n                   `--._     |__       |   _  |\"  | |`- |  |___ |\n                        `--._|_________|_     | _ |  `- |_ |____|\n                                         '--._|___|     |__|\n");
                }
            }

        else {
            System.out.println("We didn't understand your answer so we skipped it anyway.");
        }
        System.out.println("Much like the real world, you do not have a choice of what you are born as. Tough luck.");
        System.out.println("You have been born as " + object.getStatus() + "\nWhat have you been named?");
        Scanner scanner =new Scanner(System.in);
         name = scanner.nextLine();
         if (Game.getName().equals("chris56")){
             Game.f.setFile("src/duel of fates.wav");
             Game.f.play();
             System.out.println("You have found a beta tester secret!\nYou have demolished the Geneva Conventions and have committed multiple war crimes, you monster...\nYou are to be put on trial for your sins.\nYou are to be judged by the Senate, but little do they know, you are the Senate.");
             slowPrint(250000);
             System.exit(1);
         }
         if (Game.getName().equals("orpheus")||Game.getName().equals("Orpheus")){
             System.out.println("Cool name! If you type this into any of the menus, something cool will happen!");
         }
         if (Game.getName().equals("Winni")){
             System.out.println("You found a beta tester secret!\nThe villagers were so hungry they ate the emergency food: you.");
             System.exit(1);
         }
        if (object.getStatus()=="Peasant") {
            System.out.println("You were born in a typical farming village, where the food is scarce and suffering aplenty. \nYour parents are starving as we speak and are struggling to support you. \nYour village is doomed to die a slow but painful death.");
        level=1;
        Game.slowPrint(2000);
        System.out.println("\nAs a Peasant, You will have a few options to not die.\nFarming may or may not produce any results, digging in a neighboring village bordering a military installment is dangerous, and certain actions will have unforeseen consequences. \nTry to stay alive and good luck ;)");
        Game.slowPrint(2000);
        }
        if (object.getStatus()=="Pyongyang Elite") {
            System.out.println("You were born with a silver spoon in your mouth. You'll be as rich as a North Korean citizen can be.");
        level=2;
        slowPrint(2000);
        }
        if (object.getStatus()=="Heir to the Great Leader") {
            System.out.println("You have the greatest privilege in all of North Korea.\nWill you continue your family's line of brutal leaders, or leave your country to collapse?");
        level=3;
        Game.slowPrint(3000);
        System.out.println("\n");
        }

    }
    public static void slowPrint(int millisec){
        try{
            Thread.sleep(millisec);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    public static int recursionMethodRequirement(int x){
        if (x<=0) return 0;
        return 1+recursionMethodRequirement(x-1);
    }
    public static int recursionWithTwoBase(int x){
        if (x==0) return 0;
        if (x==10) return 0;
        return 1 + recursionWithTwoBase(x/10);
    }
    public static void checkStatus(NorthKorean x){
        if (level==1){
            x=(Peasant) x;
        }
        if (level==2){
            x=(Elite) x;
        }
        if (level==3){
            x=(Heir) x;
        }
    }
    public static void secret(){
        Game.x.stop();
        System.out.println("Choose integer. You found the secret playlist of pieces the developer was listening to while raging over debugging.\n 1. Flowering Nights\n 2. UN Owen was Her\n 3. The Maid and the Pocket Watch of Blood\n 4. Crystallized\n 5. Exit the Atomosphere\n 6. Song of the DragonBorn\n 7. Spicy Calamari Inkantation\n 8. Ebb and Flow\n 9. Septette for the Dead Princess\n10. Broken Coral\n11. Snake Eater\n12. Baka Mitai\n13. Exit");
        Scanner t =new Scanner(System.in);
        String answer = t.nextLine();
        if (answer.equals("1")){
            Game.x.setFile("src/flowering nights.wav");
            Game.x.play();
            Game.slowPrint(254000);
            secret();
        }
            else if (answer.equals("2")){
                Game.x.setFile("src/flandre scarlet.wav");
                Game.x.play();
                Game.slowPrint(317000);
                secret();
        }
            else if (answer.equals("3")){
                Game.x.setFile("src/pocketwatch.wav");
                Game.x.play();
                Game.slowPrint(315000);
                secret();
        }
            else if (answer.equals("4")){
                Game.x.setFile("src/crystallized.wav");
                Game.x.play();
                Game.slowPrint(275000);
                secret();
        }
            else if (answer.equals("5")){
                Game.x.setFile("src/EtA.wav");
                Game.x.play();
                Game.slowPrint(330000);
                secret();
        }
        else if (answer.equals("6")){
            Game.x.setFile("src/Dragonborn.wav");
            Game.x.play();
            Game.slowPrint(235000);
            secret();
        }
        else if (answer.equals("13")){
            System.exit(1);
        }
        else if (answer.equals("11")){
            Game.x.setFile("src/snake eater.wav");
            Game.x.play();
            Game.slowPrint(180000);
            secret();
        }
        else if (answer.equals("7")){
            Game.x.setFile("src/spicy cala.wav");
            Game.x.play();
            Game.slowPrint(190000);
            secret();
        }
        else if (answer.equals("8")){
            Game.x.setFile("src/ebb and flow.wav");
            Game.x.play();
            Game.slowPrint(170000);
            secret();
        }
        else if (answer.equals("9")){
            Game.x.setFile("src/septette.wav");
            Game.x.play();
            Game.slowPrint(269000);
            secret();
        }
        else if (answer.equals("10")){
            Game.x.setFile("src/broken coral.wav");
            Game.x.play();
            Game.slowPrint(163000);
            secret();
        }
        else if (answer.equals("12")){
            Game.x.setFile("src/baka mitai.wav");
            Game.x.play();
            Game.slowPrint(290000);
            secret();
        }
        else{
            Game.x.play();
            secret();
        }
    }
}