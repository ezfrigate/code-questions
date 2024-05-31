package questions.oneDP;

public class ClimbStairs {
    public int climbStairs(int n) {
        int prev=2;
        int prevprev=1;
        for(int i=2; i<n; i++){
            int temp = prev + prevprev;
            prevprev = prev;
            prev = temp;
        }
        return n==1 ? 1 : prev;
    }
}
