public class maxProductSubarray {
    public static void main(String[] args) {
        int[]nums = {2,3,-2,4};
        System.out.println(solution(nums));
    }
    public static int solution(int[]nums){
        int ans = nums[0];
        int ma = nums[0];
        int mi = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = ma;
                ma = mi;
                mi = temp;
            }
            ma = Math.max(nums[i],ma*nums[i]);
            mi  = Math.min(nums[i],mi*nums[i]);
            
            ans = Math.max(ans,ma);
        }
        
        return ans;
    }
}
