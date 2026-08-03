# Merge Two Sorted Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one  **sorted**  list. The list should be made by splicing together the nodes of the first two lists.

Return  *the head of the merged linked list*.

 

 **Example 1:** 

```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

```

 **Example 2:** 

```
Input: list1 = [], list2 = []
Output: []

```

 **Example 3:** 

```
Input: list1 = [], list2 = [0]
Output: [0]

```

 

 **Constraints:** 

- The number of nodes in both lists is in the range [0, 50].
- -100 <= Node.val <= 100
- Both list1 and list2 are sorted in non-decreasing order.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.4 MB (beats 39.57%)  
**Submitted:** 2026-08-02T13:06:13.148Z  

```java
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyList = new ListNode(0);
        ListNode headNode = dummyList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                dummyList.next = list1;
                list1 = list1.next;
            } else {
                dummyList.next = list2;
                list2 = list2.next;
            }

            dummyList = dummyList.next;
        }

        // adding last element //
        if (list1 == null) {
            dummyList.next = list2;
        } else {
            dummyList.next = list1;
        }

        return headNode.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)