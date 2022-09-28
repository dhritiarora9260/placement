import java.util.HashSet;

public class subsetOfArray {
    public static void main(String[] args) {
    int[]arr1 = {11, 1, 13, 21, 3, 7};
    int[]arr2 = {11, 3, 7, 1};
    System.out.println(solution(arr1,arr2));
    }
    public static boolean solution(int[]arr1,int []arr2){
        HashSet<Integer>set = new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            if(!set.contains(num))return false; 
        }
        return true;
    }
}
