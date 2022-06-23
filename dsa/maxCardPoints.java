public class maxCardPoints {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,1};
        System.out.println(solution(arr,3));
    }
    public static int solution(int[]arr,int k){
        int n = arr.length;
        int bw = n-k;
        int fw = -1;
        
        int max = 0;
        
        for(int i=bw;i<n;i++){
            max+=arr[i];
        }
        
        int count=max;
        while(fw<k&&bw<n){
            fw++;
            count = count-arr[bw];
            count = count+arr[fw];
            bw++;
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}
