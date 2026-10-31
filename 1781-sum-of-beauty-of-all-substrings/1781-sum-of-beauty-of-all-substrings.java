class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < n; j++) {

                int index = s.charAt(j) - 'a';

                freq[index]++;

                // Maximum frequency never decreases
                maxFreq = Math.max(maxFreq, freq[index]);

                int minFreq = Integer.MAX_VALUE;

                // Find minimum frequency
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0 && freq[k] < minFreq) {
                        minFreq = freq[k];
                    }
                }

                totalBeauty += maxFreq - minFreq;
            }
        }

        return totalBeauty;
    }
} 