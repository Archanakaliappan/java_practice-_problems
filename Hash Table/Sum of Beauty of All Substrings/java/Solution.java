class Solution {
    public int beautySum(String s) {
       
        int ans=0;
        for(int i=0;i<s.length();i++){
          
            for(int j=i;j<s.length();j++){
                 int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
                String m=s.substring(i,j+1);
                    int freq[]=new int[26];
                for(int l=0;l<m.length();l++){
                freq[m.charAt(l)-'a']++;
               
                }
               //  System.out.println(m);
                
               for(int k:freq){
                if(k>0){
                 max=Math.max(k,max);
                 min=Math.min(k,min);
               // System.out.println(max);
               // System.out.println(min);
                }
            }
            ans+=max-min;
           
            }
              
        }
        return ans;
    }
}