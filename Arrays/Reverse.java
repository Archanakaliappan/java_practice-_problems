package Arrays;

public class Reverse {
    public void reverseArray(int arr[]) {
        int right=arr.length-1;
        int lft=0;
        while(lft<right){
            int temp=arr[lft];
            arr[lft]=arr[right];
            arr[right]=temp;
            lft++;
            right--;
        }
        
    }
}