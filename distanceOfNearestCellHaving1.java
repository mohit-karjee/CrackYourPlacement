package CrackYourPlacement;

public class distanceOfNearestCellHaving1 {




    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n=grid.length, m=grid[0].length, cons=(int)1e5;
        int[][] ret=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j]!=1) ret[i][j]=cons;//make the return array as some large constant where 1 does not come
            }
        }
        for(int i=0;i<n;i++) {//straight traversal
            for(int j=0;j<m;j++) {
                for(int x=-1;x<=1;x++) {
                    for(int y=-1;y<=1;y++) {
                        if(x==y || x+y==0) continue;//traversal not allowed in these direction
                        int xx=x+i, yy=y+j;
                        if(xx<n && xx>=0 && yy<m && yy>=0) {
                            ret[i][j]=Math.min(ret[i][j], 1+ret[xx][yy]);
                        }
                    }
                }
            }
        }
        for(int i=n-1;i>=0;i--) {//reverse traversal to fill out spaces left
            for(int j=m-1;j>=0;j--) {
                for(int x=-1;x<=1;x++) {
                    for(int y=-1;y<=1;y++) {
                        if(x==y || x+y==0) continue;
                        int xx=x+i, yy=y+j;
                        if(xx<n && xx>=0 && yy<m && yy>=0) {
                            ret[i][j]=Math.min(ret[i][j], 1+ret[xx][yy]);
                        }
                    }
                }
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,0},{1,1,0,0},{0,0,1,1}};
        distanceOfNearestCellHaving1 obj = new distanceOfNearestCellHaving1();

        int[][] distance = obj.nearest(matrix);
        System.out.println("Distance to nearest cell containing 1: " + distance);
    }
}
