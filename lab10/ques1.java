/*
Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class ‘Manager’ which uses this interface without implementing bonus() method. Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements bonus() method.  Write the complete program to find out earnings, deduction and bonus of a substaff with basic salary amount entered by the user as per the following guidelines –
earnings  =    basic + DA (80% of basic) + HRA (15% of basic)
deduction PF  =  12% of basic
bonus   =   50% of basic
*/

import java.util.Scanner;

interface Account {
  void earnings();
  void deductions();
  void bonus();
}

abstract class Manager implements Account {
  double basic, DA, HRA;
  double _earnings, _pf, _bonus;

  Scanner sc = new Scanner(System.in);
  
  public void earnings() {
    DA = 0.8 * basic;
    HRA = 0.15 * basic;

    _earnings = basic + HRA + DA;

    System.out.println("\nEarnings: " + _earnings);
  }

  public void deductions() {
    _pf = 0.12 * basic;

    System.out.println("\nPF: " + _pf);
  }

  void getDetails() {
    System.out.println("\nEnter base pay: ");
    basic = Double.parseDouble(sc.nextLine());
  }
}

class Substaff extends Manager {
  public void bonus() {
    _bonus = 0.5 * basic;
    System.out.println("\nBonus: " + _bonus);
  }
}

class ques1 {
  public static void main(String[] args) {
    Substaff kartik = new Substaff();
    kartik.getDetails();
    kartik.earnings();
    kartik.deductions();
    kartik.bonus();
  }
}