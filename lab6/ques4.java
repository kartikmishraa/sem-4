/*
WAP in java that will ask the user – How many toy details you want to accept, then the program will accept the Toy Id, Toy name, Toy Qty and Toy price from the user and finally, the program will display the individual details of all the toys and Grand total of the billing amount.
*/

import java.util.*;

class toy {
  Scanner sc = new Scanner(System.in);
  int toyID, toyQTY=1;
  String toyName;
  double toyPrice;

  static double sum = 0;

  void getData() {
    
    System.out.println("Enter id: ");
    toyID = Integer.parseInt(sc.nextLine());
    
    System.out.println("Enter qty: ");
    toyQTY = Integer.parseInt(sc.nextLine());
    
    System.out.println("Enter name: ");
    toyName = sc.nextLine();
    
    System.out.println("Enter price: ");
    toyPrice = Double.parseDouble(sc.nextLine());

    toyPrice *= toyQTY;
    sum += toyPrice;
    
    sc.close();
  }
  
  void showData() {
    System.out.println("Toy Name: " + toyName);
    System.out.println("Toy ID: " + toyID);
    System.out.println("Toy Price: " + toyPrice);
    System.out.println("QTY: " + toyQTY);
  }

  void showBill() {
    System.out.println("Total: " + sum);
  }
}

class ques4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter num: ");
    int num = Integer.parseInt(sc.nextLine());
    int count = 0;

    toy[] arr = new toy[num];
    
    while(count < num) {
      arr[count] = new toy();
      arr[count].getData();
      count++;
    }
    
    while(count >= 0) {
      arr[count].showData();
    }

    arr[0].showBill();
    
    sc.close();
  }
}