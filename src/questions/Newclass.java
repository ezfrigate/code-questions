package questions;

public class Newclass {

    public static int getBestIndex(int[] a){
        int elementsHaveToBeTaken = 1;
        int currentSum = 0;
        int indexTracker = a.length-1;
        int bestSum = Integer.MIN_VALUE;
        for(int i=1; elementsHaveToBeTaken<=a.length; i++){
            for(int j=0; j<i; j++){
                currentSum = currentSum+a[indexTracker];
                indexTracker--;
            }
            if(currentSum > bestSum){
                bestSum = currentSum;
            }
            elementsHaveToBeTaken = elementsHaveToBeTaken+(i+1);
        }
        if(indexTracker != -1){
            for(int i=0; indexTracker>=0; i++){
                currentSum = currentSum - a[a.length-1-i] + a[indexTracker];
                if(currentSum > bestSum){
                    bestSum = currentSum;
                }
                indexTracker--;
            }
        }
        return bestSum;
    }
}
