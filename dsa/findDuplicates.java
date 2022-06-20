public class findDuplicates{
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
       System.out.println(solution(arr)) ;
    }
    public static int solution(int[]nums){
        int len = nums.length;
        for (int num : nums) {
            int idx = Math.abs(num);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }

        return len;
    }
    
}