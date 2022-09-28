public class kthFactor {
    public static void main(String[] args) {
        System.out.println(solution(12,3));
    }
    public static int solution(int n,int k){
        for(int i=1;i<=n && k>0;i++){
            if(n%i==0){
                if(k==1)return i;
                k--;
            }
        }
     return -1;
    }
}
