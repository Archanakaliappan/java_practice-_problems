public class 2 {
    public String  main (String s){
        Strng a="";
        Stach<Character> st = new Stack<>();
        for(char c :s.toharArray()){
            st.push(c);
        }
        while(!st.isEmpty()){
         a+=st,pop();
        }
        return a;

    }    
}
