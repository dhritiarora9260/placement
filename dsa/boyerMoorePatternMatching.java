import java.util.HashMap;

public class boyerMoorePatternMatching {
    public static void main(String[] args) {
        System.out.println(solution("hello","ll"));
    }
    public static int solution(String t,String p){
        if (t == null || p == null || t.length() < p.length()) {
			return -1;
		} else if (p.isEmpty()) {
			return 0;
		}
        HashMap<Character,Integer>badMatch = new HashMap<>();
        
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            int val  = p.length()-i-1;
            if(i==p.length()-1)val = p.length();
            
            badMatch.put(ch,val);
        }
        badMatch.put('*',p.length());
        
       
        int idx = 0;
        while(idx<t.length()){
            int m=p.length()-1;
            if(idx+m>=t.length())return -1;
            while(m>=0 && p.charAt(m)==t.charAt(idx+m)){
                m--;
            }
            if(m==-1)return idx;
            char miss = t.charAt(idx+p.length()-1);
            int shift = p.length();
            if(badMatch.containsKey(miss)){
                shift = badMatch.get(miss);
            }
            idx = idx+shift;
        }
        return -1;
    }
}
