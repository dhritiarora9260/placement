public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(solution(16));
    }
    public static boolean solution(int n){
        return n>0 && (n&n-1)==0;
    }
}
