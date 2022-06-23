import java.util.*;
public class spiralMatrix {
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(solution(matrix));
    }
    public static List<Integer> solution(int[][]matrix){
        List<Integer>li = new ArrayList<>();
        int minr=0;
        int maxr = matrix.length-1;
        int minc=0;
        int maxc=matrix[0].length-1;
        int count=0;
        int tn = matrix.length*matrix[0].length;
        
        while(count<tn){
            if(count<tn){
               for(int j=minc;j<=maxc;j++){
                li.add(matrix[minr][j]);
                count++;
                } 
            }
            
            minr++;
            if(count<tn){
                 for(int i=minr;i<=maxr;i++){
                li.add(matrix[i][maxc]);
                count++;
                }
            }
           
            maxc--;
            if(count<tn){
              for(int j=maxc;j>=minc;j--){
                li.add(matrix[maxr][j]);
                count++;
                }  
            }
            
            maxr--;
            if(count<tn){
               for(int i=maxr;i>=minr;i--){
                li.add(matrix[i][minc]);
                count++;
                }  
            }
           
            minc++;
        }
        return li;
    }
}
