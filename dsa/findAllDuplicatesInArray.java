import java.util.*;


public class findAllDuplicatesInArray{
    public static void main(String[] args) {
        int[]nums = {4,3,2,7,8,2,3,1};
        List<Integer>li = solution(nums);
        System.out.println(li);
    }
    public static List<Integer> solution(int[]nums){
        List<Integer> li = new ArrayList<Integer>();
        
        for(int num:nums){
            int idx = Math.abs(num)-1;
            if(nums[idx]<0){
                li.add(Math.abs(num));
            }
            nums[idx] = -nums[idx];
        }
        return li;
    }
}