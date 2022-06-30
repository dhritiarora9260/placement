import java.util.*;
public class duplicatesInString {
    public static void main(String[] args) {
        HashMap<Character,Integer>hm = solution("geeksforgeeks");
        for(char key:hm.keySet()){
            if(hm.get(key)>1)
            System.out.print(key+" "+hm.get(key)+" ");
        }
    }
    public static HashMap<Character,Integer>solution(String str){
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char ch:str.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        return hm;
    }
}
