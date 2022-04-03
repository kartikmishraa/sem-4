/*
Write a menu-driven program in java that will do the following operations
using scanner
a. Addition of two numbers
b. Multiplication of two numbers
c. Division of two numbers
d. Subtractions of two numbers
The program will ask at the end – DO YOU WANT TO CONTINUE ?.
*/

import java.util.*;

class numbers {
  int x, y;
  boolean numSet = false;
  Scanner sc = new Scanner(System.in);
  
  void setNum() {
    System.out.println("enter num1: ");
    x = Integer.parseInt(sc.nextLine());

    System.out.println("enter num2: ");
    y = Integer.parseInt(sc.nextLine());

    numSet = true;
  }
  
  void error(){
    System.out.println("Numbers not set!");
  }
  
  int add() {
    if (numSet)
      return x + y;
    else
      error();

    return -1;
  }

  int sub() {
    if (numSet)
      return x - y;
    else 
      error();

    return -1;
  }

  int prod() {
    if (numSet)
      return x * y;
    else 
      error();

    return -1;
  }

  int quo() {
    if (numSet)
      return x / y;
    else
      error();

    return -1;
  }
}

class ques4 {
  static void menu() {
    System.out.println("1. Set numbers");
    System.out.println("2. Add numbers");
    System.out.println("3. Subtract numbers");
    System.out.println("4. Multiply numbers");
    System.out.println("5. Divide numbers");
    System.out.println("0. Exit");
  }
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    numbers obj1 = new numbers();

    int choice = 100;
    
    while(choice != 0) {
      menu();
      System.out.println("enter choice..");
      choice = Integer.parseInt(sc.nextLine());

      switch(choice) {
        case 1:
          obj1.setNum();
          break;

        case 2:
          System.out.println("Sum: " + obj1.add());
          break;

        case 3:
          System.out.println("Diff: " + obj1.sub());
          break;

        case 4: 
          System.out.println("Product: " + obj1.prod());
          break;

        case 5:
          System.out.println("Quotient: " + obj1.quo());
          break;

        case 0:
          System.out.println("Okay, exiting...");
          break;
          
        default:
          System.out.println("invalid option!");
      }
    }
  }
}