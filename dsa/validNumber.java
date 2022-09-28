public class validNumber {
    public static void main(String[] args) {
        System.out.println(solution("005047e+6"));
    }
    public static boolean solution(String s){
        boolean numseen = false,eSeen = false,decSeen = false,signSeen = false;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch=='.'){
                System.out.println(decSeen);
                System.out.println(eSeen);
                if(decSeen||eSeen)return false;
                decSeen=true;
            }
            else if(ch=='+'||ch=='-'){
                if(i!=0 && (s.charAt(i-1)!='e'&&s.charAt(i-1)!='E'))return false;
                numseen = false;
            }
            else if(ch=='e'||ch=='E'){
                if(eSeen || !numseen)return false;
                numseen=false;
                eSeen = true;
            }
            else{
                if(!Character.isDigit(ch))return false;
                numseen = true;
            }
        }
        return numseen;
    }
}
