# Add Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two  **non-empty**  linked lists representing two non-negative integers. The digits are stored in  **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

 **Example 1:** 

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

```

 **Example 2:** 

```
Input: l1 = [0], l2 = [0]
Output: [0]

```

 **Example 3:** 

```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

```

 

 **Constraints:** 

- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 46.3 MB (beats 90.87%)  
**Submitted:** 2026-08-02T13:03:41.979Z  

```java
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public static ListNode deserialize(String data) {
        if (data == null || data.isEmpty() || data.equals("[]")) {
            return null;
        }
        data = data.replace("[", "").replace("]", ""); 
        String[] parts = data.split(","); 
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String part : parts) {
            current.next = new ListNode(Integer.parseInt(part.trim()));
            current = current.next;
        }
        return dummy.next; 
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode current = this;
        result.append("[");
        while (current != null) {
            result.append(current.val);
            if (current.next != null) {
                result.append(",");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10; 
            current.next = new ListNode(sum % 10); 
            current = current.next;
        }
        return dummy.next; 
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = ListNode.deserialize("[2,4,3]");
        ListNode l2 = ListNode.deserialize("[5,6,4]");
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println(result); 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-two-numbers/)