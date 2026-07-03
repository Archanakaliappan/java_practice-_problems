class Solution {
    public String largestOddNumber(String num) {
      
      int n=Integer.parseInt(num);
      if(n%2!=0)return num;
      int max=0;

while(n!=0){
    if(n%2!=0){
  max=Math.max(max,n);
  
    }
    n=n/10;
}
String s=Integer.toString(max);

      //System.out.println(max);
     return s.equals("0")?"":s;
    }
}