/*
WAP in java to create a 2-D array, accept the size of row and column from the
keyboard, and also accept the value of each element from the keyboard and display
in matrix form.
*/

import java.util.*;

class ques3 {
  static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter row: ");
    int row = Integer.parseInt(sc.nextLine());

    System.out.println("enter column: ");
    int column = Integer.parseInt(sc.nextLine());

    int[][] matrix = new int[row][column];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.println("enter element: ");
        matrix[i][j] = Integer.parseInt(sc.nextLine());
      }
    } 

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(matrix[i][j] + " "); 
      }
      System.out.println("");
    }

    sc.close();
  }
}