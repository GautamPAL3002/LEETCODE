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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        int components = 0, connected = 0;
        ListNode temp = head;
        
        while(temp != null){
            if(set.contains(temp.val))
               connected++; 
            else if(connected > 0){
                components++;
                connected = 0;
            }
            temp = temp.next;
        }
        if(connected == 0) return components;
        return components+1;
    }
}
