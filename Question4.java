class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>(); // Create an ArrayList to store the result
        int num1 = 0, num2 = 0, count1 = 0, count2 = 0; // Initialize variables for two numbers and their counts

// Loop through the input array 'nums'
        for (int num : nums) {
            if (num1 == num) // If 'num' is equal to 'num1'
                count1++;   // Increment the count of 'num1'
            else if (num2 == num) // If 'num' is equal to 'num2'
                count2++;   // Increment the count of 'num2'
            else if (count1 == 0) {
                num1 = num;   // If 'num' is different from both 'num1' and 'num2' and count1 is 0, assign 'num' to 'num1'
                count1 = 1;   // Reset the count for 'num1' to 1
        } else if (count2 == 0) {
                num2 = num;   // If 'num' is different from both 'num1' and 'num2' and count2 is 0, assign 'num' to 'num2'
                count2 = 1;   // Reset the count for 'num2' to 1
        } else {
            count1--;   // If 'num' is different from both 'num1' and 'num2' and both counts are non-zero, decrement both counts
            count2--;
    }
}

count1 = count2 = 0; // Reset counts for 'num1' and 'num2'

// Loop through 'nums' again to count occurrences of 'num1' and 'num2'
for (int num : nums) {
    if (num == num1)
        count1++;   // Count occurrences of 'num1'
    else if (num == num2)
        count2++;   // Count occurrences of 'num2'
}

// If the count of 'num1' is greater than one-third of the array length, add 'num1' to the result list
if (count1 > nums.length / 3)
    list.add(num1);

// If the count of 'num2' is greater than one-third of the array length, add 'num2' to the result list
if (count2 > nums.length / 3)
    list.add(num2);

return list; // Return the list containing the elements that appear more than one-third of the time in the 'nums' array

        
        
    }
}