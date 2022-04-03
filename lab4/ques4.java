import java.util.Arrays;
import java.util.Scanner;

public class ques4 {

  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter size of the array: ");
    int n = scan.nextInt();
   
    int numbers[] = new int[n];

    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; ++i) {
      numbers[i] = scan.nextInt();
    }

 
    oddEvenSum(args);

    
    scan.close();

  }

  public static void oddEvenSum(String args) {
  
    int oddSum = 0;
    int evenSum = 0;
  
    for (int num : numbers) {
      if (num % 2 == 0) { 
        evenSum += num;
      } else {            
        oddSum += num;
      }
    }

    System.out.println("Odd numbers sum = " + oddSum);
    System.out.println("Even numbers sum = " + evenSum);
    int t= oddSum+evenSum;
    System.out.println("Grand Total = " + t);
  }
}