public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println(solution(121));
    }
    public static boolean solution(int x){
        if(x<0 || x%10==0&&x!=0)return false;
        
        int rev = 0;
        
        while(x > rev){
            rev = (rev*10) + x%10;
            x=x/10;
        }
        return x==rev ||x==rev/10;
    }
}
