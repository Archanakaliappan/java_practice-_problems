class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int arr1[]=new int[n];
        int arr2[]= new int[n];
        arr1[0]=1;
        arr2[n-1]=1;
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
              arr1[i]=arr1[i-1]+1;
            }
            else{
                arr1[i]=1;
            }
        }
       for(int i=n-2;i<=0;i--){
            if(ratings[i]<ratings[i+1]){
              arr2[i]=arr1[i-1]+1;
            }
            else{
                arr2[i]=1;
            }
        }
        int sum=0;
        for(int j=0;j<n;j++){
            int max=Math.max(arr1[j],arr2[j]);
            sum+=max;
        }
        return sum;
    }
}