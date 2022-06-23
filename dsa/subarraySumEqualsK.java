import java.util.HashMap;

public class subarraySumEqualsK {
    public static void main(String[] args) {
        int[]nums = {1,2,3};
        System.out.println(solution(nums,3));
    }
    public static int solution(int[]nums,int k){
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
