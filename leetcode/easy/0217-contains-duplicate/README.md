# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return `true` if any value appears  **at least twice**  in the array, and return `false` if every element is distinct.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,1]

 **Output:**  true

 **Explanation:** 

The element 1 occurs at the indices 0 and 3.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  false

 **Explanation:** 

All elements are distinct.

 **Example 3:** 

 **Input:**  nums = [1,1,1,3,3,4,3,2,4,2]

 **Output:**  true

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 39 ms (beats 5.24%)  
**Memory:** 110.6 MB (beats 6.13%)  
**Submitted:** 2026-08-02T16:51:16.640Z  

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
     //   int n = nums.length;
    /*  ArrayList<Integer> list1=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
         if(list1.contains(nums[i])){
            return true;
         }
         else{
            list1.add(nums[i]);
         }
       }
       return false;
    }*/
    Map<Integer,Integer> m1=new HashMap<>();
    for(int x:nums){
        m1.put(x, m1.getOrDefault(x,0)+1);
    }
    for(int x:m1.values()){
        if(x>=2){
            return true;
        }
    }
    return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate/)