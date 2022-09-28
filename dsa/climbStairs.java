package dp;

public class climbStairs {
   public static void main(String[] args) {
    System.out.println(solution(3));
   }
   public static int solution(int n){
    if(n==1)return 1;
    if(n==0)return 0;
    int prev1=1;
    int prev2=1;
    int newVal = 0;
    for(int i=n-2;i>=0;i--){
        newVal = prev1+prev2;
        prev1=prev2;
        prev2 = newVal;
    }
    return newVal;
   } 
}
