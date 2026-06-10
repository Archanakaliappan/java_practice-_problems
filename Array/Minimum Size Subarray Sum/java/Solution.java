class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int left=0;
        int min=Integer.MAX_VALUE;
       int sum=0;
       for(int r=0;r<nums.length;r++){
         sum+=nums[r];
         while(sum>=t){
             min=Math.min(min,(r-left+1));
            sum=sum-nums[left];//shrink
            left++;
           
         }
         
       }
       return min==Integer.MAX_VALUE?0:min;
    }
}