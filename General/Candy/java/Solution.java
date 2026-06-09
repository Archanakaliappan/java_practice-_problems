1class Solution {
2    public int candy(int[] ratings) {
3        int n=ratings.length;
4        int arr1[]=new int[n];
5        int arr2[]= new int[n];
6        arr1[0]=1;
7        arr2[n-1]=1;
8        for(int i=1;i<n;i++){
9            if(ratings[i]>ratings[i-1]){
10              arr1[i]=arr1[i-1]+1;
11            }
12            else{
13                arr1[i]=1;
14            }
15        }
16       for(int i=n-2;i>=0;i--){
17            if(ratings[i]>ratings[i+1]){
18              arr2[i]=arr2[i+1]+1;
19            }
20            else{
21                arr2[i]=1;
22            }
23        }
24        int sum=0;
25        for(int j=0;j<n;j++){
26            int max=Math.max(arr1[j],arr2[j]);
27            sum+=max;
28        }
29        return sum;
30    }
31}