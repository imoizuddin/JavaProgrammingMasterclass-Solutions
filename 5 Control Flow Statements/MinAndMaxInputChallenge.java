import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int max=0, min=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter Number");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
                int number=sc.nextInt();

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
            else break;
            sc.nextLine();
        }
        System.out.println("Max = "+max+" Min = "+min);
    sc.close();
    }

}
