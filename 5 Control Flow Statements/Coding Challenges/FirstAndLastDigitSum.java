public class FirstAndLastDigitSum {
          public static int sumFirstAndLastDigit(int number) {

            if (number < 0) {
                return -1;
            }

            int lastDigit = number % 10;
            int firstDigit = 0;

            while (true) {

                if (number / 10 != 0) {
                    number /= 10;
                    continue;
                }

                firstDigit = number;

                return firstDigit + lastDigit;
            }
        }
    }

