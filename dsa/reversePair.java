import java.util.*;

public class reversePair {
    public static void main(String[] args) {
        int[]nums = {1,3,2,3,1};
        System.out.println(solution(nums));
    }
    public static int solution(int[]nums){
        return mergeSort(nums,0,nums.length-1);
    }
    public static int mergeSort(int[]nums,int lo,int hi){
        if(lo>=hi){
            return 0;
        }
        int mid = lo+(hi-lo)/2;
        int cnt = mergeSort(nums,lo,mid)+mergeSort(nums,mid+1,hi);
        
        for(int i=lo,j=mid+1;i<=mid;i++){
            while(j<=hi&&nums[i]/2.0>nums[j])j++;
            cnt+=j-(mid+1);
        }
        Arrays.sort(nums,lo,hi+1);
        return cnt;
    }
}
