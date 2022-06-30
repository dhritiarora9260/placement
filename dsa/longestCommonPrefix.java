import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[]strs = {"flight","flower","flow"};
        System.out.println(solution(strs));
    }
    public static String solution(String[]strs){
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length-1];
        
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }
}
