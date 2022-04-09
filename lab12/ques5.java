/*
Write a Java class which has a method called ProcessInput(). This method checks the number entered by the user. If the entered number is negative then throw an user defined exception called NegativeNumberException, otherwise it displays the double value of the entered number.
*/

import java.util.*;

class NegativeNumberException extends Exception {
  NegativeNumberException() {
    super("A negative number was found");
  }
}

class Test {
  Scanner sc = new Scanner(System.in);
  int num;
  
  void ProcessInput() {
    try {
      System.out.println("Enter num: ");    
      num = Integer.parseInt(sc.nextLine());

      if (num < 0) throw new NegativeNumberException();
      else System.out.println("2 * Num: " + num*2);
      
    } catch (NegativeNumberException err) {
      System.out.println(err);
    }
  }
}

class ques5 {
  public static void main(String[] args) {
    Test obj = new Test();
    obj.ProcessInput();
  }
}