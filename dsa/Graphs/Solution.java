package dsa.Graphs;
import java.util.*;
class Pair{
    int x;
    int y;
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class Solution {
    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            Arrays.fill(ans[i],-1);

            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    q.add(new Pair(i,j));
                    ans[i][j] = 0;
                }
            }
            //System.out.print(Arrays.toString(ans[i]));
        }

        int dist = 0;
        while(!q.isEmpty()){
            ++ dist;

            for(int i=0;i<q.size();i++){
                int row = q.peek().x;
                int col = q.peek().y;
                q.remove();
                int[][] trav = {{0,-1},{0,1},{-1,0},{1,0}};
                for(int[] cur:trav){
                    int r = row + cur[0];
                    int c = col + cur[1];
                    if(r >= 0 && r < m && c >= 0 && c < n && ans[r][c] == -1) {
                        System.out.println(r+" "+c+" "+dist);
                        ans[r][c] = dist;
                        q.add(new Pair(r,c));
                    }

                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] mati = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] sol = updateMatrix(mati);
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(sol[i]));
        }
    }
}
