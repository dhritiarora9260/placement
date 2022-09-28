public class intToEnglish {
    private static String[] less_than_twenty = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    
    private static String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    
    private static String[] chunks = {"","Thousand","Million","Billion"};
    public static void main(String[] args) {
        System.out.println(solution(1234567));
    }

    public static String solution(int num){
        if(num==0) return "Zero";
        
        String ans = new String();
        
        int index=0;
        while(num>0){
            if(num%1000!=0){
                ans = convertThreeDigit(num%1000) + chunks[index]+" " + ans;
            }
            index++;
            num/=1000;
        }
        
        return ans.trim();
    }
    private static String convertThreeDigit(int num){
        if(num==0)return "";
        if(num<20) return less_than_twenty[num]+" ";
        
        else if(num<100) return tens[num/10] + " " + convertThreeDigit(num%10);
        
        else return less_than_twenty[num/100] + " "+"Hundred"+" "+convertThreeDigit(num%100);
    }
}
