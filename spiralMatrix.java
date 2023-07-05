package CrackYourPlacement;
import java.util.*;

public class spiralMatrix {
    public int[][] generateMatrix(int n) {
        int[][] order = new int[n][n];
        if(n==0) return order;
        int left =0;
        int right=n-1;
        int top=0;
        int bottom= n-1;
        int v=1;

        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                order[top][j]=v++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                order[i][right]=v++;
            }
            right--;


            if(left<=right && top<=bottom){
                for(int j=right;j>=left;j--){
                    order[bottom][j]=v++;
                }
                bottom--;

                for(int i=bottom;i>=top;i--){
                    order[i][left]=v++;
                }
                left++;

            }

        }

        return order;
    }

}

