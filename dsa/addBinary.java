public class addBinary {
    public static void main(String[] args) {
        System.out.println(solution("11","1"));
    }
    public static String solution(String a,String b){
        int sum=0,carry=0,j=b.length()-1,i=a.length()-1;
        
        StringBuilder sb = new StringBuilder();
        
        while(i>=0||j>=0){
            sum = carry;
            if(j>=0)sum+=b.charAt(j--)-'0';
            if(i>=0)sum+=a.charAt(i--)-'0';
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry==1)sb.append(carry);
        return sb.reverse().toString();
    }
}


