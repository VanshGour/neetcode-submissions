class Solution {
    public int characterReplacement(String s, int k) {
       int[] str = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            int curr = s.charAt(right) - 'A';
            str[curr]++;
            maxFreq = Math.max(maxFreq, str[curr]);

            while ((right - left) - maxFreq >= k) {
                str[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
