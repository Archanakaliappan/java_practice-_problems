import java.util.*;
public class 3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        Stack<Character> st= new Stack<>();

        for(char c: s.toCharArray()){
            if(c==')'){
              char top= st.peek();
              st.pop();
              boolean valid=true;

            while(top!=')'){
                if(top=='+'|| top == '*' || top=='/' || top =='-'){
                    valid=true;
                }
                top=st.peek();
                st.pop();
            }
            if(valid){
                System.out.println(true);            }


            }
            else{
           st.push(c);
            }
        }
       
        
            System.out.println(false);
        
    }
    
}
