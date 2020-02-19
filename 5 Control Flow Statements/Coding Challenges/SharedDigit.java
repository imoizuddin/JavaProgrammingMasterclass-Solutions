public class SharedDigit {
           public static boolean hasSharedDigit(int First, int Second) {
            while ((First >= 10 && First <= 99) && (Second >= 10 && Second <= 99)) {
                return ((First % 10 == Second % 10) ||
                        (First % 10 == Second / 10) ||
                        (First / 10 == Second / 10) ||
                        (First / 10 == Second % 10));
            }
            return false;
        }
}
