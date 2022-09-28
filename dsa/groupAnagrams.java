import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        String[]strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution(strs));
    }
    public static List<List<String>>solution(String[]strs){
        HashMap<HashMap<Character,Integer>,ArrayList<String>>bmap = new HashMap<>();
        
        for(String str:strs){
            HashMap<Character,Integer>fmap = new HashMap<>();
            for(char ch:str.toCharArray()){
                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
            }
            if(!bmap.containsKey(fmap)){
               bmap.put(fmap,new ArrayList<>());
            }
                
                bmap.get(fmap).add(str);
        }
        List<List<String>>li = new ArrayList<>();
        for(ArrayList<String>val:bmap.values()){
            li.add(val);
        }
        return li;
    }
}
