import java.util.*;;

public class validSquare {
    public static void main(String[] args) {
        int[]p1 = {0,0};
         int[]p2 = {1,1};
         int[]p3 = {1,0};
         int[] p4 = {0,1};
        System.out.println(solution(p1,p2,p3,p4));
    }

    public static boolean solution(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> s = new HashSet<>();
        if (isSame(p1,p2) || isSame(p1,p3) || isSame(p1,p4) || isSame(p2,p3) || isSame(p3,p4) || isSame(p2,p4)) {
            return false;
        } 
        s.add(dis(p1,p2));
        s.add(dis(p1,p3));
        s.add(dis(p1,p4));
        s.add(dis(p2,p3));
        s.add(dis(p2,p4));
        s.add(dis(p3,p4));
        
        return s.size() == 2;
    }
    
    private static int dis(int[] p1, int[] p2) {
        return (p1[0]-p2[0]) * (p1[0]-p2[0]) + (p1[1]-p2[1]) * (p1[1]-p2[1]);
    }
    private static boolean isSame(int[] p1, int[] p2) {
        return p1[0] == p2[0] && p1[1] == p2[1];
    }
}
