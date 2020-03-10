public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount<0 || smallCount<0 ||goal<0) {
            return false;
        }
        bigCount*=5;  //5kg bag(size)
        while (bigCount>goal){
            bigCount-=5; //reduce 5kg bags if goal is greater than sum
        }
        return bigCount+smallCount>=goal // at least equal to goal
                ||smallCount>=goal; // method should return true if it is possible to make a package with goal kilos of flour.

    }
}
