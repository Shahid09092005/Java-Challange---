                                                // Time limit exceed for larget size of the array
                                                // See dp solution
class Solution {
    static Boolean check(int[] arr ,int t,int idx,int sos){
        if(sos==t) return true;
        if(idx>=arr.length) return false;
        if(check(arr,t,idx+1,sos+arr[idx])) return true ; //include
        if(check(arr,t,idx+1,sos)) return true; // not incluse
        return false;
    }

    static Boolean isSubsetSum(int arr[], int target) {
        return check(arr,target,0,0);
        
    }
}
