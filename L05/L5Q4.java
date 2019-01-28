import java.util.Scanner;

public class L5Q4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] mat = new int[3][3];
        
        System.out.println("Please input a 3 by 3 matrix");
        for(int i=0; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print("Matrix[" + i + "][" + j +"]: ");
                mat[i][j] = s.nextInt();
            }
        }
        System.out.println();
        
        System.out.println("3 by 3 Matrix");
        for(int i=0; i<3 ; i++){
            for(int j=0, k=1; j<3 ; j++, k++){
                System.out.printf("%-3d", mat[i][j]);
                if(k%3 ==0){
                    System.out.println();
                }
            }
        }
        
        //rotates 90 degrees clockwise
        int temp1 = mat[0][0];
        mat[0][0] = mat[2][0];
        mat[2][0] = mat[2][2];
        mat[2][2] = mat[0][2];
        mat[0][2] = temp1;
        
        int temp2 = mat[0][1];
        mat[0][1] = mat[1][0];
        mat[1][0] = mat[2][1];
        mat[2][1] = mat[1][2];
        mat[1][2] = temp2;
        
        System.out.println("After rotates 90 degrees clockwise");
        for(int i=0; i<3 ; i++){
            for(int j=0, k=1; j<3 ; j++, k++){
                System.out.printf("%-3d", mat[i][j]);
                if(k%3 ==0){
                    System.out.println();
                }
            }
        }
    }
}
