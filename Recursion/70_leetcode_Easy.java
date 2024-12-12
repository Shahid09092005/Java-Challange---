                              //Note: by using recursion -->Time limit exceed;
                              // Dp solution also available in DP-1
class Solution {
    public int climb(int n){
        if(n==0 ||n==1||n==2){
            return n;
        }
        int one_step=climb(n-1);
        int two_step = climb(n-2);
        return one_step+two_step;
    }
    public int climbStairs(int n) {
        return climb(n);
    }
}
