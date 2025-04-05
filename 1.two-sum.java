/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        Map<Integer,Integer> index = new HashMap<>();
        int res[] = new int[2];
        for(int i = 0;i<nums.length;i++) {
            if(index.containsKey(target - nums[i])) {
                res[1] = i;
                res[0] = index.get(target - nums[i]);
                return res;
            }
            if (!index.containsKey(nums[i]))
                index.put(nums[i], i);
        }
        
        return res;
    }
}
// @lc code=end

