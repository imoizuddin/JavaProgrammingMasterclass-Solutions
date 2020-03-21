import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
  final static Scanner scanner= new Scanner(System.in);
    public static int[] readIntegers(int count) {
        int[] array= new int[count];
//        Scanner scanner= new Scanner(System.in);
        for (int i=0;i<count;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static int findmin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args) {
        System.out.println("Enter Count");
        int count = scanner.nextInt();
        int[] arr =readIntegers(count);
        int min = findmin(arr);
        System.out.println(min);
    }
}
