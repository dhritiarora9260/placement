public class validPalindromeTwo {
    public static void main(String[] args) {
        System.out.println(solution("abca"));
    }
    public static boolean solution(String s){
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            // Found a mismatched pair - try both deletions
            if (s.charAt(i) != s.charAt(j)) {
                return (checkPalindrome(i, j - 1,s) || checkPalindrome( i + 1, j,s));
            }
            
            i++;
            j--;
        }
        
        return true;
    }
    public static boolean checkPalindrome(int i,int j,String s){
        while (i < j) {
             if (s.charAt(i) != s.charAt(j)) {
                 return false;
             }
             
             i++;
             j--;
         }
         
         return true;
     }
}
