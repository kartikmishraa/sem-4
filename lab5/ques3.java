/*
  Definition class: MyNumber, Application class:  MyNumberDem
  Value
  Void setValue(int);
  Boolean isEven();
  int FindFactorial();
  Boolean isPrime();
  int findSumofDigits()
*/

class Value {
  int num;

  void setValue(int num) {
    this.num = num;
  }

  Boolean isEven() {
    if (num % 2 == 0)
      return true;
    else
      return false;
  }

  int FindFactorial() {
    int arr[] = new int[100000];
    arr[0] = 1;
    arr[1] = 1;
    
    for (int i = 2; i <= num; i++) {
      arr[i] = i;
    }

    int fact = 1;
    for (int i = 0; i <= num; i++) 
      fact *= arr[i];

    return fact;
  }

  boolean isPrime() {
    if (num <= 1) 
      return false;

    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) 
          return false;
    }
    
    return true;
  }

  int findSumOfDigits() {
    int sum = 0;
    int n = num;
    
    while(n > 0) {
      int rem = n % 10;
      sum += rem;
      n /= 10;
    }

    return sum;
  }
}

class ques3 {
  public static void main(String args[]) {
    Value v1 = new Value();
    v1.setValue(11);
    if (v1.isEven())
      System.out.println("is even");
    else
      System.out.println("is odd");

    if (v1.isPrime())
      System.out.println("is prime");
    else 
      System.out.println("is not prime");
    
    System.out.println(v1.FindFactorial());
    System.out.println(v1.findSumOfDigits());
  }
}