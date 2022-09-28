public class minMovesToEqualArray {
    public static void main(String[] args) {
        int[]nums = {1,2,3};
        System.out.println(solution(nums));
    }
    public static int solution(int[]nums){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        
        for(int num:nums){
            if(num<min)min = num;
            sum+=num;
        }
        int m = sum-(min*n);
        return m;
    }
}
