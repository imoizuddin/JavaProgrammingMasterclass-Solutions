public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)){
            int lastDigit_num1= num1%10;
            int lastDigit_num2= num2%10;
            int lastDigit_num3= num3%10;

            if (lastDigit_num1 == lastDigit_num2) return true;
            if (lastDigit_num2 == lastDigit_num3) return true;
            if (lastDigit_num1 == lastDigit_num3) return true;
            return false;
        }
        return false;
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}
