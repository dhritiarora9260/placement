import java.util.ArrayList;
import java.util.List;

public class textJustification {
    public static void main(String[] args) {
        String[] words = {"What","must","be","acknowledgment","shall","be"};
        System.out.println(solution(words,16));
    }
    public static List<String> solution(String[]words,int maxWidth){
        int i=0;
        List<String>li = new ArrayList<>();
        while(i<words.length){ //n
            int cc = words[i].length();
            int j = i+1;
            
            int can = 0;
            while(j<words.length && cc+can+words[j].length()+1<=maxWidth){ //n
                can++;
                cc+=words[j].length();
                j++;
            }
            
            int vac = maxWidth-cc;
            
            int atleast = can==0?0:vac/can;
            int extra = can==0?0:vac%can;
            
            if(j==words.length){
                atleast=1;
                extra=0;
            }
            
            StringBuilder sb = new StringBuilder();
            
            
            for(int k=i;k<j;k++){
               sb.append(words[k]);
                int t=0;
                if(k==j-1)break;
                if(extra>0){
                    sb.append(" ");
                    extra--;
                }
                while(t<atleast){
                    sb.append(" ");
                    t++;
                }
                
            }
            
            while(sb.length()<maxWidth){
                sb.append(" ");
            }
            li.add(sb.toString());
            
            i=j;
        }
        return li;
    }
}
