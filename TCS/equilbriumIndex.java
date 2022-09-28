public class equilbriumIndex {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0} ;
        System.out.println(solution(arr));
    }
    public static int solution(int []arr){
        int leftsum = 0;
        int sum = 0;
        for(int num:arr){
            sum+=num;
        }
        for(int i=0;i<arr.length;i++){
            sum = sum-arr[i];
            if(leftsum==sum)return i;
            leftsum+=arr[i];
        }
        return -1;
    }
}
