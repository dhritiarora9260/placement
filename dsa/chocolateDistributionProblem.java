import java.util.*;

public class chocolateDistributionProblem {
   public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(7);
    a.add(3);
    a.add(2);
    a.add(4);
    a.add(9);
    a.add(12);
    a.add(56);
    System.out.println(solution(a,3));
   } 
   public static long solution(ArrayList<Integer>a,int m){
    Collections.sort(a);
    int min = a.get(0);
    int max = a.get(m-1);
    long mdiff = max-min;
    
    for(int i=1;i<=a.size()-m;i++){
        min = a.get(i);
        max = a.get(i+m-1);
        long diff = max-min;
        if(diff<mdiff){
            mdiff = diff;
        }
    }
    return mdiff;
   }
}
