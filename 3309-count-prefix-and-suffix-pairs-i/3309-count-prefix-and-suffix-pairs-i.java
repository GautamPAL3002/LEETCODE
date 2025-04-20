public class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String wordI = words[i];
             for (int j = i + 1; j < words.length; j++) {
                String wordJ = words[j];
              if (wordJ.length() >= wordI.length()) {
                    String prefix = wordJ.substring(0, wordI.length());
                    String suffix = wordJ.substring(wordJ.length() - wordI.length());

                    if (prefix.equals(wordI) && suffix.equals(wordI)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
