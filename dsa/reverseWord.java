public class reverseWord {
    public static void main(String[] args) {
        System.out.println(solution("The sky is Pink"));
    }
    public static String solution(String s){
        String curr = "";
        String rev = "";  
          for(char ch:s.toCharArray()){
              if(ch==' '){
                  System.out.println(curr);
                  if(curr!=""){
                      // System.out.println(curr);
                      rev = " "+curr+rev;
                      curr="";
                  }
              }
              else{
                  curr+=ch;
              }
          }
         if(curr=="")return rev.substring(1);
          else return curr+rev;
    }
}
