/*
WAP in java to create a class 'Stack' having data members an array of 10 integers, top which is initialized to - 1. It contains member function PUSH()-to insert elements into array, POP()-to retrieve elements from array, TOP() - to retrieve array top element, EMPTY() - to check your array contains elements or not. Display() to display all elements in the array. Make sure your stack class works on the LIFO principle.
*/

class Stack {
  int arr[] = new int[10];
  int top;

  Stack() {top=-1;}

  void PUSH(int num) {
    if (top >= 10)
      System.out.println("Stack overflow!");
    
    else
      arr[++top] = num;
  }

  void POP() {
    if (top != -1)
      top--;
    else 
      System.out.println("Stack underflow!");
  }

  void TOP() {
    if (top == -1)
      System.out.println("Stack empty!");
    
    else
      System.out.println("Top Element: " + arr[top]);
  }

  void EMPTY() {
    if (top == -1)
      System.out.println("Stack empty!");

    else
      System.out.println("Stack not empty!");
  }
}

class ques3 {
  public static void main(String[] args) {
    Stack obj = new Stack();

    obj.PUSH(1);
    obj.PUSH(2);
    obj.PUSH(3);
    obj.PUSH(4);
    obj.TOP();
    
    obj.POP();
  }
}