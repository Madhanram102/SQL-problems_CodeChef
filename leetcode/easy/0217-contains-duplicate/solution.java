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