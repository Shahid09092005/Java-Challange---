class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i=len/2;i>0;i--){
            if(len%i==0){  // taking len of substring is must be perfectly div. of s
                int times = len/i;
                String substr =s.substring(0,i);
                StringBuilder sb = new StringBuilder("");
                while(times>0){
                    sb.append(substr);
                    times--;
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
