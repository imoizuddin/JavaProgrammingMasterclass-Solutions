import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
//        for (int i=0;i<myIntegers.length;i++){
//
//        }
        System.out.println("Sorted Numbers" + Arrays.toString(sortNumbers(myIntegers)));
    }

    private static int[] getIntegers(int numbers) {
        System.out.println("Enter " + numbers + "integer values.\r");
        int[] values = new int[numbers];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static int[] sortNumbers(int[] values) {
        int temp = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] < values[j]) {
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
//        Arrays.sort(values); //For Ascending Order
        return values;
    }
}
