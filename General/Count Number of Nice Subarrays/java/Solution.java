1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        int res=atmost(nums,k)-atmost(nums,k-1);
4        return res;
5    }
6    int atmost(int arr[],int k){
7        int left=0;
8        int res=0;
9        int s=arr.length;
10        for(int ryt=0;ryt<s;ryt++){
11            k-=arr[ryt]%2; // decrease the count-->1
12         
13         while(k<0){
14            k+=arr[left]%2;
15            left++;
16         } //condition checking whrther the subarray contains only less than k or equal to equal k elements but not more than k elements, more odd present , the window will shrink
17
18
19            res+=ryt-left+1;// eventually count the total num of subarrays can be formed by <=k -->2
20        }
21        return res;
22
23    }
24}