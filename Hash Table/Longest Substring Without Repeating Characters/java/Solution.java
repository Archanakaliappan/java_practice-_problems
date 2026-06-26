class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[256];
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            //expand
            char ch=s.charAt(r);
            freq[ch]++;
            //shrink
            while(freq[ch]>1 && l<=r){
                freq[s.charAt(l)]--;
                l++;
            }
         max=Integer.max(max,r-l+1);
        }
        return max;
    }
}