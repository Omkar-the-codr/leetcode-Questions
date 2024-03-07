// # **[13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)**

// Solved

// Easy

// Topics

// Companies

// Hint

// Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

// ```
// SymbolValue
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// ```

// For example, `2` is written as `II` in Roman numeral, just two ones added together. `12` is written as `XII`, which is simply `X + II`. The number `27` is written as `XXVII`, which is `XX + V + II`.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`. There are six instances where subtraction is used:

// - `I` can be placed before `V` (5) and `X` (10) to make 4 and 9.
// - `X` can be placed before `L` (50) and `C` (100) to make 40 and 90.
// - `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.

// Given a roman numeral, convert it to an integer.

// **Example 1:**

// ```
// Input: s = "III"
// Output: 3
// Explanation: III = 3.

// ```

// **Example 2:**

// ```
// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.

// ```

// **Example 3:**

// ```
// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

// ```

// **Constraints:**

// - `1 <= s.length <= 15`
// - `s` contains only the characters `('I', 'V', 'X', 'L', 'C', 'D', 'M')`.
// - It is **guaranteed** that `s` is a valid roman numeral in the range `[1, 3999]`.

// Solution:

// # **Intuition**

// The basic intuition is to define the values of all roman sumbols before the use and then we can directly use them without defining their value each time we perform some calculation.

// # **Approach**

// The apporach consists of the following steps:

// 1. First of all we will iterate through a for loop and just like the string is stored into the array we will store the values in the same format in an array.
// 2. Now using another for loop we will start our calculations.
// 3. Basically there will be two conditions, if the present index value is greater than the next index value then we will directly add it to the sum,else if the present index value is lesser than the next index value then we will will first of all subtract two times the current index value from the sum because we are adding it additionally in the above condition and then add to the sum the value of the next index.
// 4. After the loop is finished we will return the value of sum.

// # **Complexity**

// - Time complexity:

// O(n)

// - Space complexity:

// O(n)

// # **Code**

// ```jsx
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=1;
            }
            if(s.charAt(i)=='V'){
                arr[i]=5;
            }
            if(s.charAt(i)=='X'){
                arr[i]=10;
            }
            if(s.charAt(i)=='C'){
                arr[i]=100;
            }
            if(s.charAt(i)=='D'){
                arr[i]=500;
            }
            if(s.charAt(i)=='M'){
                arr[i]=1000;
            }
            if(s.charAt(i)=='L'){
                arr[i]=50;
            }
        }
        sum=sum+arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                sum=sum+arr[i+1];
            }
            else{
                sum=sum+arr[i+1]-(2*arr[i]);
            }
        }
        return sum;
    }
}
```