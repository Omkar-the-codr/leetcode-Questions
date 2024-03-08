// # **[1781. Sum of Beauty of All Substrings](https://leetcode.com/problems/sum-of-beauty-of-all-substrings/)**
// public class Solution {
//     public int beautySum(String s) {
//         int result = 0;
//         for (int i = 0; i < s.length(); i++) {
//             int[] freq = new int[26];
//             for (int j = i; j < s.length(); j++) {
//                 freq[s.charAt(j) - 'a']++;
//                 int maxFreq = Integer.MIN_VALUE;
//                 int minFreq = Integer.MAX_VALUE;
//                 for (int f : freq) {
//                     if (f > 0) {
//                         maxFreq = Math.max(maxFreq, f);
//                         minFreq = Math.min(minFreq, f);
//                     }
//                 }
//                 result += maxFreq - minFreq;
//             }
//         }
//         return result;
//     }
// } Question9 {
    
// }
