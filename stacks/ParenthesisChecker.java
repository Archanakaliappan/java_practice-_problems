/*Input: s = "[{()}]"
Output: true
Explanation: All the brackets are well-formed.
Input: s = "[()()]{}"
Output: true
Explanation: All the brackets are well-formed.
Input: s = "([]"
Output: false
Explanation: The expression is not balanced as there is a missing ')' at the end.
Input: s = "([{]})"
Output: false
Explanation: The expression is not balanced as there is a closing ']' before the closing '}'.
 */


class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st= new Stack<>();
        for(char a: s.toCharArray()){
            if(a=='(' || a=='{' || a=='['){
                st.push(a);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                
                if(a==')' && top != '('||
                   a=='}' && top!= '{' ||
                   a== ']' && top != '[') return false;
            }
        }
        return st.isEmpty();
    }
}
