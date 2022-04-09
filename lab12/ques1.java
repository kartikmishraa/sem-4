/*
WAP in java which will accept will two numbers from the keyboard, divide the first by second and check if the denominator is 0 than handle the necessary exception ArithmeticException.
*/

import java.util.*;

class ques1 {
  double Test(int x, int y) {
    try {
      int result = x / y;
      return result;
    } catch (ArithmeticException err) {
      System.out.println(err);
      return Double.POSITIVE_INFINITY;
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num1, num2;
    
    System.out.println("Enter num1: ");
    num1 = Integer.parseInt(sc.nextLine());

    System.out.println("Enter num2: ");
    num2 = Integer.parseInt(sc.nextLine());
    
    ques1 obj = new ques1();
    double quo = obj.Test(num1, num2);

    System.out.println("result: " + quo);

    sc.close();
  }
}