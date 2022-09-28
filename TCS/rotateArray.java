public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        solution(arr,2,5);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void solution(int[]arr,int d,int n){
        d = d%n;
        if(d<0)d = d+n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int[]arr,int li,int ri){
        while(li<ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            
            li++;
            ri--;
        }
    }
}
