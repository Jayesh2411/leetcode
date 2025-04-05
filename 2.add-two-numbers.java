/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
       
        int carry = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while(l1!= null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while(l2!= null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        Collections.reverse(list1);
        Collections.reverse(list2);
        List <Integer> res = new ArrayList<>();
        int min = Math.min(list1.size(), list2.size());
        int i = 0;
        for( i = 0;i<min; i++) {
            int val = list1.get(i) + list2.get(i);
            res.add((val+carry) % 10);
            carry = (val+carry)/10;
            
        }
        for(int j = i; j<list1.size();j++ ) {
            int val = list1.get(j);
            res.add((val+carry) % 10);
            carry = (val+carry)/10;
        }
        
        for(int j = i; j<list2.size();j++ ) {
            int val = list2.get(j);
            res.add((val+carry) % 10);
            carry = (val+carry)/10;
        }
        ListNode resList = null;
        ListNode head = null;
        for(Integer v: res) {
            if(resList == null ) {
                resList = new ListNode(v);
                head = resList;
            } else {
                resList.next =  new ListNode(v);
                resList = resList.next;
            }
        }
        if(carry == 1) {
            resList.next = new ListNode(1);
        }
        return head;
    }
}
// @lc code=end

