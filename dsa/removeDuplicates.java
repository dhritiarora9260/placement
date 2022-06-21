public class removeDuplicates {
    public static void main(String[] args) {
        int[]arr = {0,0,1,1,1,2,2,3,3,4};
        int k = solution(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int solution(int[]nums){
        int cursor=0;
        int min=-101;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min){
                min=nums[i];
                nums[cursor++]=nums[i];
            }
        }
        return cursor;
    }
}
