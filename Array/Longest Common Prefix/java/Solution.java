class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a=strs[0];
        StringBuilder sb=new StringBuilder ();
        String b=strs[strs.length-1];
        for(int i=0;i<a.length();i++){
     if(a.charAt(i)==b.charAt(i)){
        sb.append(a.charAt(i));
     }
     else{
        break;
     }
        }
        return sb.toString();
    }
}