/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        int l = 0, r = 0;
        Arrays.sort(nums);
        for (int i =0;i<nums.length;i++) {
            l = i + 1;
            r = nums.length-1;
            while(l < r) {

                if((nums[i] + nums[l] +nums[r]) == 0) {
                    List<Integer> list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    set.add(list);
                    l++; r--;
                } else if(nums[i] + nums[l] +nums[r] < 0 ) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}
// @lc code=end

