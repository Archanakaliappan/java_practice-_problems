class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res=atmost(nums,k)-atmost(nums,k-1);
        return res;
    }
    int atmost(int arr[],int k){
        int left=0;
        int res=0;
        int s=arr.length;
        for(int ryt=0;ryt<s;ryt++){
            k-=arr[ryt]%2; // decrease the count-->1
         
         while(k<0){
            k+=arr[left]%2;
            left++;
         } //condition checking whrther the subarray contains only less than k or equal to equal k elements but not more than k elements, more odd present , the window will shrink


            res+=ryt-left+1;// eventually count the total num of subarrays can be formed by <=k -->2
        }
        return res;

    }
}