public class SumDigits {
    public static int sumDigit(int number) {
        int sum=0;
        if (number>=10){
           int last_digit=number%10;
           sum+=last_digit;
            number /= 10;
           
           return sum;
        }
        return -1;
    }
}
