import java.util.*;

class ques5{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);

    System.out.println("Enter roll: ");
    int roll = Integer.parseInt(s.nextLine());

    System.out.println("Enter name: ");
    String name = s.nextLine();
    
    float marks[] = new float[5];

    for(int i = 0; i < 5; i++){
      System.out.println("enter marks: ");
      marks[i] = s.nextFloat();

      if(marks[i] < 0 || marks[i] > 100) {
        System.out.println("invalid entry!");
        System.exit(0);
      }
    }

    System.out.println("\n");

    float avg = 0;

    for(int i = 0; i < 5; i++){
      avg += marks[i];
    }

    avg /= 50;
    char grade = 'F';

    if(avg >= 9 && avg <= 10) {
      grade = 'O';
    } else if (avg >= 8) {
        grade = 'E';
    } else if (avg >= 7) {
        grade = 'A';
    } else if (avg >= 6) {
        grade = 'B';
    } else if (avg >= 5) {
        grade = 'C';
    } else if (avg >= 4) {
        grade = 'D';
    } 


    System.out.println("Roll: " + roll);
    System.out.println("Name: " + name);
    System.out.println("CGPA: " + avg);
    System.out.println("Grade: " + grade);

  }
}