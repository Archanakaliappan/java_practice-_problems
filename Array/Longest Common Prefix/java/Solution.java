class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
     Arrays.sort(strs);
    String fst=strs[0];
     String last  = strs[strs.length-1];
     for(int i=0;i<fst.length();i++){
        if(fst.charAt(i)==last.charAt(i)){
           ans+=fst.charAt(i);
        }
        else{
            break;
        }
     } 
     return ans;
    }
}