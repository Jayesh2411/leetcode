/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }
        int rem = 0;
        int rev = 0;
        int multiplier = 10;
        int original = x;
        while (x > 0) { //121
            rem = x % 10;
            rev = (rev*multiplier) + rem;
            x = x/10;
        }
        return rev == original;
        
    }
    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        String xStr = String.valueOf(x);
        int l = 0, r = xStr.length() - 1;
        while (l < r) {
            if (xStr.charAt(l++) != xStr.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

