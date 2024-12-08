class Solution {
    public static int[] computeLPS(String needle , int m){
        int[] arr = new int[m];
        arr[0] = 0;
        int i=1;
        int length=0;
        while(i<m){
            if(needle.charAt(i)==needle.charAt(length)){
                length++;
                arr[i]=length;
                i++;
            }else{
                if(length>0){
                length=arr[length-1];
                }else{ // if length==0
                    arr[i]=0;
                    i++;
                }

            }
        }
        return arr;
    }
    public int strStr(String haystack, String needle) {
        int m = needle.length(); // for pattern
        int n= haystack.length(); // for text
        int[] LPS = computeLPS(needle ,m);
        int i=0; // for text
        int j=0;  // for pattern
        while(i<n){
            // if match found
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==m){ // string found 
                // j=LPS[j-1]; bcz we need to only fist mathcing and no check for futher.
                return i-j;
            }else if(i<n && haystack.charAt(i)!=needle.charAt(j)){
                    if(j>0){
                        j=LPS[j-1];
                    }else{
                        i++;
                    }

            }
        
        }
        return -1;
    }
}
