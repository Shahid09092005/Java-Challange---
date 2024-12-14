                                                // Time limit exceed for larget size of the array
                                                // See dp solution
public class Solution {
    //If there exist a subset then return 1 else return 0.
    public int check(int[] arr  , int t ,int idx , int sos){
        if(sos==t) return 1;
        if(idx>=arr.length) return 0;
        check(arr,t,idx+1,sos+arr[idx]);
        check(arr,t,idx+1,sos);
        return 0;
    }
    public int solve(int[] A, int B) {
        // A is Array and B is target
        return check( A , B ,0,0);
    }
}
