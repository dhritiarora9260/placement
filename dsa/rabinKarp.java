public class rabinKarp {
    public static void main(String[] args) {
        System.out.println(solution("hello","ll"));
    }
    public static int solution(String s1,String s2){
        long pr = 31;
        long mod = 1000000007;
        long pow = pr;
        
        long dhv = s2.charAt(0)-'a'+1;
        
        for(int i=1;i<s2.length();i++){
            dhv = (dhv+(s2.charAt(i)-'a'+1)*pow)%mod;
            pow = (pow*pr)%mod;
        }
        
        long[]arr = new long[s1.length()];
        long[]pa = new long[s1.length()];
        arr[0] = s1.charAt(0)-'a'+1;
        pa[0] = 1;
        pow = pr;
        
        for(int i=1;i<s1.length();i++){
          arr[i] = (arr[i-1]+(s1.charAt(i)-'a'+1)*pow)%mod;
            pa[i] = pow;
            pow=(pow*pr)%mod;
        }
        int i=0;
        int j=s2.length()-1;
        while(j<s1.length()){
            long right = arr[j];
            long left = (i==0)?0:arr[i-1];
            long hv = (right-left+mod)%mod;
            long ch = (dhv*pa[i])%mod;
            if(hv==ch){
                return i;
            }
          i++;
          j++;
        }
        return -1;
    }
}
