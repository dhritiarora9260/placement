public class gameOfLife {
    public static void main(String[] args) {
        int[][]board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        solution(board);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void solution(int[][]board){
        solve(board,0,0);
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==-1)board[i][j]=0;
                if(board[i][j]==-2)board[i][j]=1;
            }
        }
    }
    public static void solve(int[][]board,int i,int j){
        if(i<0||j<0||i==board.length||j==board[0].length){
            return;
        }
        
       int count = getCount(board,i,j);
        
        System.out.println(count);
        
        
        
        if(board[i][j]==0){
            if(count==3){
                board[i][j]=-2;
            }
        }
        else{
            if(!(count==2||count==3)){
                board[i][j] = -1;
            }
        }
        int r=i;
        int c=j+1;
        if(j==board[0].length-1&&i<board.length-1){
            r=i+1;
            c=0;
        }
        solve(board,r,c);     
    }
    
    private static int getCount(int[][]board,int i,int j){
        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1},{-1,1},{-1,-1},{1,1},{1,-1}};
        int count=0;
        for(int[]dir:dirs){
            int x = i+dir[0];
            int y = j+dir[1];
            
            
            
            if(x>=0 && y>=0 && x<board.length && y<board[0].length){
                if(board[x][y]==1||board[x][y]==-1){
                    count++;
                }
            }
        }
        return count;
    }
    
}
