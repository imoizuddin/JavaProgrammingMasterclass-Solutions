public class NumberToWords {
    public static void numberToWords(int number) {
        if (number<0){
            System.out.println("Invalid Value");
        }
        else if (number==0){
            System.out.println("Zero");
        }
        else {
            int reversedNumber = reverse(number);
            int leadingZeroes = getDigitCount(number) - getDigitCount(reversedNumber);
            while (reversedNumber>0){
                int last_digit = reversedNumber % 10;
                reversedNumber/=10;

                switch (last_digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
            }
            if (leadingZeroes > 0) {
                for (int i=0;i<leadingZeroes;i++){
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int num) {
        if (num==0){
            return 0;
        }
        int reversed=0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;

    }

    public static int getDigitCount(int numb) {
        if(numb<0){
        return -1;
        }
        if(numb==0){
            return 1;
        }
        int count=0;

        while (numb>0){
            numb/=10;
            count++;
        }
        return count;
    }
}
