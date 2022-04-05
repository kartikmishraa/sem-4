/*
WAP in java which will display the working of static variable with example. 

*/

import java.util.*;

class student {
  Scanner sc = new Scanner(System.in);
  
  String s_name;
  static String clg_name = "KIIT";

  void getDetails() {
    System.out.println("\nEnter name: ");
    s_name = sc.nextLine();
  }

  void showDetails() {
    System.out.println("\nName: " + s_name);
    System.out.println("College: " + clg_name);
  }
}

class ques1 {
  public static void main(String[] args) {
    student one = new student();
    student two = new student();

    one.getDetails();
    two.getDetails();

    one.showDetails();
    two.showDetails();
  }
}