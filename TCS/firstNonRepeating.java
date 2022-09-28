import java.util.HashMap;
public class firstNonRepeating{
    public static void main(String[] args) {
        int[]arr = {1,2,1,3,2};
        System.out.println(solution(arr));
    }
    public static int solution(int[]arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(hm.get(num)==1)return num;
        }
        return 0;
    }
}