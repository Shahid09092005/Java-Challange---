class Solution {
    public boolean rotateString(String s, String goal) {
        int sizeOfs = s.length();
        int sizeOfgoal = goal.length();
        if(sizeOfs!=sizeOfgoal) return false ;
        // for(int k=1;k<=sizeOfs;k++){
        //     StringBuilder str = new StringBuilder("");
        //     str.append(s.substring(k,sizeOfs));
        //     str.append(s.substring(0,k));
        //     if(str.toString().equals(goal)) return true;
        // }
        // return false;
        // or
        String twice=s+s;
        if (twice.contains(goal)){ 
            return true;
        }
        return false;

    }
}
