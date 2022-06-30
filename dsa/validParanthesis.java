public class validParanthesis {
    public static void main(String[] args) {
        System.out.println(solution("()"));
    }
    public static boolean solution(String s){
        Stack<Character>st  = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            if(ch==')'){
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
             if(ch==']'){
                if(st.size()>0 && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
             if(ch=='}'){
                if(st.size()>0 && st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}
