import java.util.HashMap;

public class minimumWindowString {
    public static void main(String[] args) {
        System.out.println(solution("ADOBECODEBANC","ABC"));
    }
    public static String solution(String s1,String s2){
        String ans = "";
        HashMap<Character,Integer>map2 = new HashMap<>();
         for(int i=0;i<s2.length();i++){
             map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
         }
        int left = -1;
        int right=-1;
         int mct=0;
         int desired_mct = s2.length();
         
         HashMap<Character,Integer>map1 = new HashMap<>();
         
         while(true){
             boolean f1 = false;
             boolean f2 = false;
             //acquire
             while(right<s1.length()-1 && mct<desired_mct){
                 right++;
                 char ch = s1.charAt(right);
                 map1.put(ch,map1.getOrDefault(ch,0)+1);
                 if(map1.getOrDefault(ch,0)<=map2.getOrDefault(ch,0)){
                     mct++;
                 }
                 f1 = true;
             }
             //collect answers and release
             while(left<right && mct==desired_mct){
                 String pans = s1.substring(left+1,right+1);//potential answer
                 if(ans.length()==0||pans.length()<ans.length()){
                     ans = pans;
                 }
                 left++;
                 char ch = s1.charAt(left);
                 if(map1.get(ch)==1){
                     map1.remove(ch);
                 }
                 else{
                     map1.put(ch,map1.get(ch)-1); 
                 } 
                 
                 if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0)){
                     mct--;
                 }
                 f2 = true;
             }
             if(f1==false && f2 ==false)break;
         }
             
         
     return ans;
    }
}
