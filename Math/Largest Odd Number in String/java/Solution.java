class Solution {
    public String largestOddNumber(String num) {
      
      long n=Long.parseLong(num);
      if(n%2!=0)return num;
      long max=0;

while(n!=0){
    if(n%2!=0){
  max=Math.max(max,n);
  
    }
    n=n/10;
}
String s=Long.toString(max);

      //System.out.println(max);
     return s.equals("0")?"":s;
    }
}