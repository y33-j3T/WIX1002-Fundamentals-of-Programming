/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q6;

import java.util.Scanner;

/**
 *
 * @author Yee Jet Tan
 */
public class L5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row = s.nextInt();
        
        //initialize array with all zeros
        int[][] arr = new int[row][row];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<row ; j++){
                arr[i][j] = 0;
            }
        }
        
        System.out.println("The Pascal Triangle with " + row + " row(s)");
        
        //assign values to array
        arr[0][0] = 1;
        for(int i=1 ; i<row ; i++){
            for(int j=1 ; j<row ; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j] ; 
            }
        arr[i][0] = arr[i-1][0];
        
        }
        
        //print array
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<row ; j++){
                System.out.printf("%-4d", arr[i][j]);
            }
        System.out.println();
        
        }
    }
}
