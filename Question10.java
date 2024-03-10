// 349. Intersection of Two Arrays
// Solved
// Easy
// Topics
// Companies
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000


// import java.util.Arrays;

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int[] numsresult = new int[Math.min(nums1.length, nums2.length)]; // Result array should not exceed the smaller of the two array lengths
//         int i = 0, j = 0, k = 0; // Initialize pointers for both arrays and result array
        
//         while (i < nums1.length && j < nums2.length) {
//             if (nums1[i] == nums2[j]) {
//                 if (k==0 || numsresult[k - 1] != nums1[i]) {
//                     numsresult[k++] = nums1[i];
//                 }
//                 i++;
//                 j++;
//             }
//             else if (nums1[i] < nums2[j]) {
//                 i++;
//             } else {
//                 j++;
//             }
//         }
        
//         // Resize the numsresult array to fit only the elements actually used
//         return Arrays.copyOf(numsresult, k);
//     }
// }
