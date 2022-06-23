public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,0,0,0};
        int[]nums2 = {2,5,6};
        solution(nums1,nums2,3,3);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
    public static void solution(int[]nums1,int[]nums2,int m,int n){
        int t1=m-1;
      int t2=n-1;
        int end = n+m-1;
        
        while(t1>=0&&t2>=0){
            if(nums1[t1]>nums2[t2]){
                nums1[end]=nums1[t1];
                end--;
                t1--;
            }
            else{
                nums1[end]=nums2[t2];
                end--;
                t2--;
            }
        }
        while(t2>=0){
            nums1[end]=nums2[t2];
            t2--;
            end--;
        }
        
    }
}
