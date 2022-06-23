public class jumpGame {
    public static void main(String[] args) {
        int[]A = {2,3,1,1,4};
        System.out.println(solution(A));
    }
    public static boolean solution(int[]A){
        int last=A.length-1,i,j;
        for(i=A.length-2;i>=0;i--){
            if(i+A[i]>=last)last=i;
        }
        return last<=0;
            
    }
}
