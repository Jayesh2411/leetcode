/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    /*
    Sorted--> Two Pointers
    Take last indexes of both nums1, nums2
    Take last index of nums1 for insertion
    Replace the val in place depending on which is greater 
    */
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1; // Pointer for last element in nums1
            int j = n - 1; // Pointer for last element in nums2
            int k = m + n - 1; // Pointer for last position in nums1
    
            while (j >= 0) {
                if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
        }
    }
}
// @lc code=end

