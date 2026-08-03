class Solution {
    public boolean isPalindrome(int x) {
            int n1=x;
            int st=0;
            while( x>0){
               int  r=x%10;
                 st=(st*10)+r;
                x/=10;
            }
            if(st==n1){
                return true;
            }
            return false;
        }
    }
