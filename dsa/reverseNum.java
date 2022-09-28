public class reverseNum {
    public static void main(String[] args) {
        System.out.println(solution(2147483647));
    }
    public static int solution(int x){
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 2)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -2)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
