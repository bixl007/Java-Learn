import java.util.*;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] r = new int[26];
        for (char i : s.toCharArray()) {
            r[i - 'a']++;
        }
        int[] L = new int[26];
        HashSet<Integer> S = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - 'a';
            r[t]--;
            for (int j = 0; j < 26; j++) {
                if (L[j] > 0 && r[j] > 0) {
                    S.add(26 * t + j);
                }
            }
            L[t]++;
        }

        return S.size();
    }
}