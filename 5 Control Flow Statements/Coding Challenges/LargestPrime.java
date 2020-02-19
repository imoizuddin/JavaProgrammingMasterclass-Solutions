public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number<=1){
            return -1;
        }
        int i;
        for ( i = 2; i <= number; i++) { //i=2 coz "1" doesn't have prime number
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        return i;
    }
}
