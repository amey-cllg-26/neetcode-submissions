class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];   // frequency of each character in window
        int left = 0;
        int maxFreq = 0;             // highest frequency of a single char seen so far
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add current character to window
            count[s.charAt(right) - 'A']++;

            // Update the max frequency seen so far
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            // If window is invalid (need more than k replacements), shrink from left
            if ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}