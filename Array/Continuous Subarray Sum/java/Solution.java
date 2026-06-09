class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        for(int l=0;l<nums.length-1;l++ ){
            int sum=nums[l];
            
            for(int r=l+1;r<nums.length;r++){
                sum+=nums[r];
                if(sum%k==0){
                    return true;
                }
            }
            
        }
        return false;
    }
}