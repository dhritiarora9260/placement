import java.util.HashMap;

public class SymmetricPairs {
    public static void main(String[] args) {
        int arr[][] = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
        solution(arr);
    }
    public static void solution(int[][]arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i][1]) && hm.get(arr[i][1])==arr[i][0]){
                System.out.println("("+arr[i][1]+" "+arr[i][0]+")");
            }
            hm.put(arr[i][0],arr[i][1]);
        }
    }
}
