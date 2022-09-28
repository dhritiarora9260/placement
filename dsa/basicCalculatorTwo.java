public class basicCalculatorTwo {
    public static void main(String[] args) {
        System.out.println(solution("3+2*2"));
    }
    public static int solution(String s){
        if(s==null||s.isEmpty())return 0;
        
        int currnum = 0;
        int lastnum = 0;
        int res = 0;
        char op = '+';
        
        for(int i=0;i<s.length();i++){
            char currchar = s.charAt(i);
            if(Character.isDigit(currchar)){
                currnum = (currnum * 10) + (currchar-'0');
            }
            if(!Character.isDigit(currchar) && !Character.isWhitespace(currchar) || i==s.length()-1){
                if(op=='+'||op=='-'){
                    res+=lastnum;
                    lastnum = op=='+'?currnum:-currnum;
                }
                else if(op=='*'){
                    lastnum = lastnum*currnum;
                }
                else if(op=='/'){
                    lastnum = lastnum/currnum;
                }
                op = currchar;
                currnum = 0;
            }
            
        }
        res+=lastnum;
        return res;
    }
}
