public class sortColors {
    public static void main(String[] args) {
        int[]arr = {2,0,2,1,1,0};
        solution(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void solution(int[]nums){
        int count[] = new int[3];
        
        for(int num:nums){
            count[num]++;
        }
        for(int i=0;i<nums.length;i++){
            if(count[0]>0){
                nums[i]=0;
                count[0]--;
            }
            else if(count[1]>0){
                nums[i]=1;
                count[1]--;
            }
            else if(count[2]>0){
                nums[i]=2;
                count[2]--;
            }
            
        }
    }
}
