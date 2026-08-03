class Solution {
    public int climbStairs(int n) {
         int dp[]=new int[n+1];
        
       if(n<=1) return 1;
      int pre2=1;
      int pre1=1;
      int current =0;
       for(int i=2;i<=n;i++){
       current=pre1+pre2;
       pre2=pre1;
       pre1=current;
       }
    
       return current;
    }
}