import java.util.*;
public class combinationSum {
    public static List<List<Integer>> al = new ArrayList<>();
    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        System.out.println(solve(candidates,8));
    }

    public static List<List<Integer>> solve(int[]candidates,int target){
                
        List<Integer> res = new ArrayList<>();
        
        Arrays.sort(candidates);
        fun(candidates,target,0,0,res);
        
        return al;
    }
    public static void fun(int[]candidates, int target, int i,int sum,List<Integer> res){
        
        if(sum>target){
            return;
        }
         if(sum==target){
             List<Integer> temp = new ArrayList<>(res);
             al.add(temp);
             return;
         }
        if(i==candidates.length){
            return;
        } 
         
              res.add(candidates[i]);
         
             fun(candidates,target,i,sum+candidates[i],res);
         
             res.remove(res.size()-1);
         
             if(i+1!=candidates.length && sum+candidates[i+1]<=target)
             fun(candidates,target,i+1,sum,res);
           
         
     }
}
