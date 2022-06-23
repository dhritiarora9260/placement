public class wordSearch {
    public static void main(String[] args) {
        char[][]board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(solution(board,"SEE"));
    }
    public static boolean solution(char[][]board,String word){
        boolean flag=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    flag = solve(board,i,j,0,word,new boolean[board.length][board[0].length]);
                    if(flag) return flag;
                }
            }
        }
         return flag;
    }
    public static boolean solve(char[][]board,int i,int j,int k,String word,boolean[][]visited){
        if(k==word.length()){
            return true;
        }
        if(i<0||i==board.length||j<0||j==board[0].length||k>word.length()||board[i][j]!=word.charAt(k)||visited[i][j]==true){
            return false;
        }
        
        visited[i][j]=true;
        
       if(solve(board,i-1,j,k+1,word,visited)){
           return true;
       }
        else if(solve(board,i+1,j,k+1,word,visited)){
            return true;
        }
        else if(solve(board,i,j-1,k+1,word,visited)){
            return true;
        }
        else if(solve(board,i,j+1,k+1,word,visited)){
            return true;
        }
        visited[i][j]=false;
        return false;
        
    }
}

// Space Complexity: O(L)
// Time Complexity: O(M * N * 3^L)

// Space Complexity is because of recursion - to store function stack context.
// Time Complexity - from every block we go in three adjacent blocks (avoiding the direction we came from). 
// This walk can go for max of L times. So each thred at most goes L length long. -> O(3^L).
//  Now this is applied at each node from main calling function -> O(M * N). Therefore, O(M * N * 3^L).
