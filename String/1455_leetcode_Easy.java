class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        ArrayList<String> ls = new ArrayList<>();
        StringBuilder sb= new StringBuilder("");
        int n = sentence.length();
        for(int i=0;i<n;i++){
            char curr = sentence.charAt(i);
            if(curr!=' '){
                sb.append(curr);
            }else{
                ls.add(sb.toString());
                sb= new StringBuilder(""); // initialized again empty of sb
            }
        }
        ls.add(sb.toString()); // for last word in the sentence

      // String[] words = sentence.split(" "); // above work can we do in this way also just calling split function()

        for(int i=0;i<ls.size();i++){
            String str = ls.get(i);
            if(str.length()>=searchWord.length()){
                if(str.startsWith(searchWord)){
                    return i+1;
                }
                }
        }
        return -1;
    }
}
