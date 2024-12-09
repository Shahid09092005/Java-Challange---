class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> ls = new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n-1;i++){
            String i_str=words[i];
            for(int j=i+1;j<n;j++){
                String j_str=words[j];
                // && condition is used to not add duplicated string 
                // Note: we can also use HashSet so duplicated will not added it and conv into List returning time.
                if(i_str.contains(j_str)&& (!ls.contains(j_str))){
                    ls.add(j_str);
                }
                if(j_str.contains(i_str) &&  (!ls.contains(i_str))){
                    ls.add(i_str);
                }
            }
        }
        return ls;
        
    }
}
