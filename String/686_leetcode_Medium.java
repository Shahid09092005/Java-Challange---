class Solution {
    // computing LPS
     public int[] ComputeLPS(String pat , int m){
        // m is length of pat
        int[] LPSArray=new int[m];
        int length = 0;
        LPSArray[0] = 0; // first char has no prefix and suff so 0
        int i=1; // start with i=1
        while(i<m){
            // if currChar euqal to chat at leng.
            if(pat.charAt(i) == pat.charAt(length)){
                length++;
                LPSArray[i]=length;
                i++;
            }else{   //If the current character does not match
                if(length==0){ // length==0; then 
                    LPSArray[i]=0;
                    i++;
                }else{  // if length !=0
                    length = LPSArray[length-1];
                }
            }
        }
        return LPSArray;
        
    }
// KMP check
    public Boolean kmp(String pat, String txt) {
        int n = txt.length(); // length of text
        int m = pat.length(); // length of pat
        int[] LPS = ComputeLPS( pat , m);
        ArrayList<Integer> ls = new ArrayList<>();
        int i=0; // for txt
        int j=0;  // for pat
       while(i<n){
           if(txt.charAt(i)==pat.charAt(j)){ 
               i++;
               j++;
           }
           
           if(j==m){
               return true;
            //    j=LPS[j-1];
           }else if (i < n && txt.charAt(i) != pat.charAt(j)){
               if(j>0){ // // Use the LPS array to move the pattern pointer
                   j=LPS[j-1];
               }else{ //// Only increment the text pointer if no prefix matches
                   i++;
               }
           }
       }
       return false;
    }

// main function
    public int repeatedStringMatch(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        StringBuilder sb = new StringBuilder("");
        int count=0;
        // minimum no. of times
        while(sb.length()<b_len){
            sb.append(a);
            count++;
        }
        // Check if `b` is a substring of the current repeated string by using KMP
        if(kmp(b,sb.toString())){
            return count++;
        }

        // Add one more repetition to handle edge cases
        sb.append(a);
        count++;
        if(kmp(b,sb.toString())){
            return count++;
        }
        return -1;
        
    }
}
