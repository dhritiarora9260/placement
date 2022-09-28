public class missingNumber {
    public static void main(String[] args) {
        int[]nums = {3,0,1};
        System.out.println(solution(nums));
    }
    public static int solution(int[]nums){
        int lim = nums.length;
              int sumt=0;
                for(int i=0;i<=lim;i++){
                    sumt+=i;
                }
                
                int sumo=0;
                for(int i=0;i<lim;i++){
                    sumo+=nums[i];
                }
                return sumt-sumo;
    }
}
