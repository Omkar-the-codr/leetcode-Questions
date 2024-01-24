class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            else
            {
                nums[count+1]=nums[i+1];
                count++;
                continue;
            }
        }
        return count+1;
    }
}
