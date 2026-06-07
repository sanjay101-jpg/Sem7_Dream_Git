import java.util.Scanner;

public class matrix_multiplcation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20},{21,22,23,24,25}};
        int[][] b = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] c = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                c[i][j]=0;
                for(int k=0;k<5;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
