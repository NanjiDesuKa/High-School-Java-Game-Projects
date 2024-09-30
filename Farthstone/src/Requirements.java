import java.util.*;
public class Requirements {
    //requirements for 2d arrays. Has row major and column major. Also nested iteration.
    static int[][] sad = new int[5][5];
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
    public static int[] sortingTime = {7, 3, 4, 7, 8, 12, 21, 12, 14, 54, 23, 52, 25, 12, 78, 342};
    static String[][] grid = {{"A", "B", "C", "D", "E"}, {"F", "G", "H", "I", "J"}, {"K", "L", "M", "N", "O"}, {"P", "Q", "R", "S", "T"}};
    public static ArrayList<Integer> george = new ArrayList<Integer>();
    public static ArrayList<Integer> troy = new ArrayList<Integer>(Arrays.asList(2, 5, 7, 8, 24, 57, 100, 55, 54, 78, 65, 23, 45, 2));


    public static void verySad() {
        for (int row = 0; row < sad.length; row++) {
            for (int column = 0; column < sad[row].length; column++) {
                sad[row][column] = 42;
            }
        }
        System.out.println(Arrays.deepToString(sad));
    }

    public static void verySad2() {
        for (int column = 0; column < sad[0].length; column++) {
            for (int row = 0; row < sad.length; row++) {
                sad[row][column] = 69;
            }
        }
        System.out.println(Arrays.deepToString(sad));
    }

    //enhanced for loop with 2d array
    public static void evenSadder() {
        for (String[] row : grid) {
            for (String column : row)
                System.out.print(column + " ");
            System.out.println();
        }
    }

    public static void selectionSort(int arr[]) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
                count++;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection Sort Count: " + count);
    }

    public static void insertionSort(int arr[]) {
        int count = 0;
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sort Count: " + count);
    }
    //statement execution for both sorting methods ^

    //iteration with arraylist
    public static void arrayListTraverse() {
        ArrayList<Integer> mama = new ArrayList<Integer>();
        mama.add(0);
        mama.add(1);
        mama.add(226);
        mama.add(2501);
        for (int i = 0; i < mama.size(); i++) {
            mama.set(i, 25);
        }
        System.out.println(mama);
    }

    public static void deleteEverything() {
        george.add(1);
        george.add(2);
        george.add(3);
        george.add(4);
        george.add(5);
        george.add(6);
        george.add(7);
        for (int x = george.size() - 1; x >= 0; x--) {
            george.remove(x);
        }
        System.out.println(george);
    }

    public static boolean linearSearchInArrayTroy(int x) {
        for (int z : troy) {
            if (z == x) {
                return true;
            }
        }
        return false;
    }
}