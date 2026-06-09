class Solution {
    public int longestMountain(int[] arr) {
        int up=0;
        int down=0;
        int res=0;
        for(int i=1;i<arr.length;i++){
            //new mountain forming
            if(down>0 && arr[i]>arr[i-1] || arr[i]==arr[i-1]){
                up=0;
                down=0;
            }
            if(arr[i]>arr[i-1]){
                up++;
            }
            if(arr[i]<arr[i-1]){
                down++;
            }
            if(up>0 && down>0){
                res=Math.max(res,up+down+1);
            }
            
        }
        return res;
    }
}