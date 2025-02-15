// Create an array and shuffle it.


import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        s=sc.nextInt();
        int[] array= new int[s];
        System.out.println("Enter the array values");
        for(int i = 0; i<s ;i++){
            array[i] = sc.nextInt();
        }
        shuffleArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
