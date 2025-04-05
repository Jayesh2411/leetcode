/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int curr = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[curr]) {
                nums[curr+1] = nums[j];
                curr++;
            }
        }

        return curr+1;        
    }
}
// @lc code=end

//1 1 2 3