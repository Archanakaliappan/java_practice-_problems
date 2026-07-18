class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
              slow=sumpro(slow);
              fast=sumpro(sumpro(fast));
        }
        while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;
    }
    int sumpro(int n){
        int ans=0;
        while(n!=0){
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
}