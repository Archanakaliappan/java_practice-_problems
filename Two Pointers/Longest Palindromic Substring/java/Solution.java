class Solution {
    public String longestPalindrome(String s) {
    int maxlen=0;
    String maxstr=s.substring(0,1);
    
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
               
            if(j-i>maxlen && isPalindrome(s.substring(i,j+1)) ){
                maxlen=j-i;
                maxstr=s.substring(i,j+1);
            }
            }

        }
        return maxstr;
    }
    boolean isPalindrome(String m){
        int l=0;
        int r=m.length()-1;
        while(l<r){
            if(m.charAt(l)!=m.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
    }
    
