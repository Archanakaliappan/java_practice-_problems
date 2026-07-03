class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        int o=0;
        char cc=')';
        char oo='(';
         StringBuilder sb=new StringBuilder();
        String temp="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           
            if(ch==cc){
                c++;
                
            }
            if(ch==oo){
                o++;
            }
             temp+=ch;
            if(o > 0 && o==c){
                if(temp.length()>2){

                   
                    temp=temp.substring(1,temp.length()-1);
                    sb.append(temp);
                    temp="";
                    c=0;
                    o=0;
                }
                else
                {
                    temp = "";
                    o = 0;
                    c = 0;
                }
            }
        }
        return sb.toString();
    }
}