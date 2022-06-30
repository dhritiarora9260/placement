import java.util.*;
public class RandomizedCollection {
    ArrayList<Integer>li;
    HashMap<Integer,HashSet<Integer>>idx;
    java.util.Random rand = new java.util.Random();
    public RandomizedCollection() {
        li = new ArrayList<>();
        idx = new HashMap<>();
        
        
    }
    
    public boolean insert(int val) {
        if(!idx.containsKey(val)) idx.put(val,new HashSet<>());
        idx.get(val).add(li.size());
        li.add(val);
        
        return idx.get(val).size()==1;
        
    }
    
    public boolean remove(int val) {
        if(!idx.containsKey(val) || idx.get(val).size()==0)return false;
        
        int remove_idx = idx.get(val).iterator().next();
        idx.get(val).remove(remove_idx);
        int last = li.get(li.size()-1);
        idx.get(last).add(remove_idx);
        li.set(remove_idx,last);
        idx.get(last).remove(li.size()-1);
        li.remove(li.size()-1);
        return true;
    }
    
    public int getRandom() {
       return li.get(rand.nextInt(li.size())); 
    }
}
