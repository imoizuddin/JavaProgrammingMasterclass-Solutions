import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter Number " + count);
            boolean hasNext = sc.hasNextInt();
            if (hasNext) {
                int input = sc.nextInt();
                sum += input;
                count++;
            }else {
                System.out.println("Invalid Value");
            }
            System.out.println(sum);
        }

    }
}
