public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution(height));
    }
    public static int solution(int[]height){
        int i=0;
        int j=height.length-1;
        int max = 0;
        
        while(i<j){
            int w = j-i;
            int h = Math.min(height[i],height[j]);
            int area = w*h;
            if(area>max){
                max=area;
            }
           
            if(height[i]>height[j]){
                j--;
            }
            else {
                i++;
            }
            
            }
        
        return max;
    }
}
