class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int max=0;
        StringBuilder sb=new StringBuilder();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            while(sb.indexOf(String.valueOf(ch))!=-1){
                
                sb.deleteCharAt(0);
            }
            
            sb.append(ch);
            max=Integer.max(max,sb.length());
            
        }
        return max;
    }
}