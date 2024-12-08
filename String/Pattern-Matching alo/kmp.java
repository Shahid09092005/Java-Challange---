class Solution {
    
    public static int[] ComputeLPS(String pat , int m){
        // m is length of pat
        int[] LPSArray=new int[m];
        int length = 0;
        LPSArray[0] = 0; // first char has no prefix and suff so 0
        int i=1; // start with i=1
        while(i<m){
            // if currChar euqal to chat at leng.
            if(pat.charAt(i) ==pat.charAt(length)){
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

    ArrayList<Integer> search(String pat, String txt) {
        int n = txt.length(); // length of text
        int m = pat.length(); // length of pat
        int[] LPS = ComputeLPS(String pat , m);
        ArrayList<Integer> ls = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n){
            if(pat.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                ls.add(i-j);
                j = lps[j - 1];
            }else if (pat.charAt(j) != txt.charAt(i)) {
                // Mismatch after j matches
                if (j != 0) {
                    j = LPS[j - 1];
                } else {
                    i++;
                }
            }
        }
        
         
    }
}
