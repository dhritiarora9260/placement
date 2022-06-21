import java.util.HashMap;

public class twoSum {
   public static void main(String[] args) {
    int[]nums = {2,7,11,15};
    int[]arr = solution(nums,9);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
   }
   public static int[] solution(int[]nums,int target){
    int[] arr = new int[2];
        
    HashMap<Integer,Integer> hm = new HashMap<>();
    
    for(int i=0;i<nums.length;i++){
        if(hm.containsKey(target-nums[i])){
            arr[0]=hm.get(target-nums[i]);
            arr[1]=i;
            return arr;
        }
        else{
            hm.put(nums[i],i);
        }
    }
    return arr;
   } 
}
