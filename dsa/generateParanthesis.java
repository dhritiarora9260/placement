import java.util.ArrayList;
import java.util.List;

public class generateParanthesis {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
    public static List<String> solution(int n){
        List<String> list = new ArrayList<String>();
         backtrack(list, "", 0, 0, n);
        return list;
    }
    public static void backtrack(List<String> list, String str, int open, int close, int max){
        
        if(str.length() == max*2){
            list.add(str);
            return;
        }
        
        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }
}

// Time Complexity : O(2^{2n}n)O(2 
// 2n
// n). For each of 2^{2n}2 
// 2n
//  sequences, we need to create and validate the sequence, which takes O(n)O(n) work.

// Space Complexity : O(2^{2n}n)O(2 
// 2n
// n). Naively, every sequence could be valid. 
