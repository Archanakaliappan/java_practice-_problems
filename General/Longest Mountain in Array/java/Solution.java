1class Solution {
2    public int longestMountain(int[] arr) {
3        int up=0;
4        int down=0;
5        int res=0;
6        for(int i=1;i<arr.length;i++){
7            //new mountain forming
8            if(down>0 && arr[i]>arr[i-1] || arr[i]==arr[i-1]){
9                up=0;
10                down=0;
11            }
12            if(arr[i]>arr[i-1]){
13                up++;
14            }
15            if(arr[i]<arr[i-1]){
16                down++;
17            }
18            if(up>0 && down>0){
19                res=Math.max(res,up+down+1);
20            }
21            
22        }
23        return res;
24    }
25}