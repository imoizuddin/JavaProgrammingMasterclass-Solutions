import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    public static void reverse(int[] array) {
        int[] temp = new int[array.length];
        int j=array.length;
        for (int i=0;i<array.length;i++){
            temp[j-1]=array[i];
            j=j-1;
        }
        System.out.println(Arrays.toString(temp));
        }



    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array");
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));

        reverse(arr);

    }

}
