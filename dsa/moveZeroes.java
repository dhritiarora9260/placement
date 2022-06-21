public class moveZeroes {
    public static void main(String[] args) {
        int[]nums = {0,1,0,3,12};
        solution(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void solution(int[]nums){
            int lastnz = 0;
             for(int i=0;i<nums.length;i++){
                 if(nums[i]!=0){
                     nums[lastnz++]=nums[i];
                 }
             }
             for(int i=lastnz;i<nums.length;i++){
                 nums[i]=0;
             }
         }
    }

