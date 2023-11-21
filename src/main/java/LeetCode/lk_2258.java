package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/9 10:19
 */
public class lk_2258 {

    class Solution {
        int[][] dxy = {{0,1},{1,0},{-1,0},{0,-1}};
        int[][] grid;
        int[][] fire;
        int m , n;
        public int maximumMinutes(int[][] grid) {
            this.grid = grid;
            m = grid.length;
            n = grid[0].length;
            //定义火的数组
            fire = new int[m][n];
            //开烧
            goFire();
            int l = -1, r = m*n;
            while(l<r){
                int mid = r + l +1 >> 1;
                if(!check(grid, mid)){
                    r = mid -1;
                }else{
                    l = mid;
                }
            }
            return l == m*n ? (int)1e9 : l;
        }

        private boolean check(int[][] grid, int times){
            //表示起点有火，且火在times之前已经烧到起点
            if(fire[0][0] > 0 && fire[0][0] <= times + 1) return false;
            boolean[][] vs = new boolean[m][n];
            vs[0][0] = true;
            //定义当前人到达的位置信息
            Queue<int[]> move = new LinkedList<>();
            move.add(new int[]{0,0});
            int k = move.size();
            while(!move.isEmpty()){
                times++;
                while(k-->0){
                    int[] point = move.poll();
                    int x= point[0], y = point[1];
                    for(int i =0;i<dxy.length;i++){
                        int nx = x+dxy[i][0], ny = y+dxy[i][1];
                        if(nx>=0&&nx<m&&ny>=0&&ny<n&&grid[nx][ny]==0&&!vs[nx][ny]){
                            //因为人和火可以同时到达安全屋，这里做一个特殊的判断 times没有+1
                            if(nx == m-1 && ny == n-1 && (fire[nx][ny] > times || fire[nx][ny] == 0))
                                return true;
                            //表示当前时间段没有火能烧到当前位置
                            //times+1主要是因为定义fire数组 为了方便 火的时间从1开始计算，此处times+1
                            if ((fire[nx][ny] > times +1 || fire[nx][ny] == 0)){
                                vs[nx][ny] = true;
                                move.add(new int[]{nx, ny});
                            }
                        }
                    }
                }
                k = move.size();
            }
            return false;
        }

        private void goFire(){
            Queue<int[]> onFire = new LinkedList<>();
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j] == 1){
                        //下标为1代表火
                        fire[i][j]=1;
                        onFire.add(new int[]{i,j});
                    }
                }
            }
            int k = onFire.size();
            //下一时间段从2开始，fire[x][y]代表火烧到此处需要的时间
            int times = 2;
            while (!onFire.isEmpty()){
                while(k-->0){
                    int[] point = onFire.poll();
                    int x= point[0], y = point[1];
                    for(int i =0;i<dxy.length;i++){
                        int nx = x+dxy[i][0], ny = y+dxy[i][1];
                        if(nx>=0&&nx<m&&ny>=0&&ny<n&&grid[nx][ny]==0&&fire[nx][ny]==0){
                            fire[nx][ny] = times;
                            onFire.add(new int[]{nx, ny});
                        }
                    }
                }
                k = onFire.size();
                times++;
            }
        }
    }
}
