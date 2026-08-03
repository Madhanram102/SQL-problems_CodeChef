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