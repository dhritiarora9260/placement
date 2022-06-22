import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        int[]nums = {-1,0,1,2,-1,-4};
        System.out.println(solution(nums));
    }
    public static List<List<Integer>> solution(int[]nums){
        List<List<Integer>>al = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            int rtar = -nums[i];
           if(i>0&&nums[i-1]==nums[i]){
               continue;
           }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]==rtar){
                    List<Integer>li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[left]);
                    li.add(nums[right]);
                    al.add(li);
                   while(left<right&&nums[left]==nums[left+1]){
                       left++;
                   }
                    while(left<right&&nums[right]==nums[right-1]){
                       right--;
                   }
                    left++;
                    right--;
                    
                }
                else if(nums[left]+nums[right]<rtar){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return al;
    }
}
