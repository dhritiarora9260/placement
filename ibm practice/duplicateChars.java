import java.util.HashSet;

class duplicateChars{
    public static void main(String[] args) {
        System.out.println(solution("Good Life"));
    }
    public static char solution(String s){
        HashSet<Character>set = new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch))return ch;
            set.add(ch);
        }
        return 'a';
    }
}