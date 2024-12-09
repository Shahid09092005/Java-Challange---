import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        // Sort words by length
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        Set<String> result = new HashSet<>();
        
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Only check longer words
                if (words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // No need to check further for words[i]
                }
            }
        }

        return new ArrayList<>(result); // Convert set to list
    }
}
