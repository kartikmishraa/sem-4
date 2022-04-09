/*
WAP to create user defined exceptions called HrsException,
MinException and SecException. Create a class Time which contains data members hours, minutes, seconds and throw the user defined exceptions if hours (>24 & <0),minutes(>60 & <0),seconds(>60 & <0)
*/

class HrsException extends Exception {
  HrsException() {
    super("Hours out of range");
  }
}

class MinException extends Exception {
  MinException() {
    super("Minutes out of range");
  }
}

class SecException extends Exception {
  SecException() {
    super("Seconds out of range");
  }
}

class Time {
  private int hours, minutes, seconds;

  Time() {
    hours=25; minutes=170; seconds=66;
  }

  private int getHours() {
    try {
      if (hours > 24 || hours < 0)
        throw new HrsException();
      else return hours;
      
    } catch (HrsException err) {
      System.out.println(err);
      return -1;
    }
  }
  
  private int getMins() {
    try {
      if (minutes > 60 || minutes < 0) 
        throw new MinException();
      else return minutes;
      
    } catch (MinException err) {
      System.out.println(err);
      return -1;
    }
  } 
  
  private int getSec() {
    try {
      if (seconds > 60 || seconds < 0) 
        throw new SecException();
      else return minutes;
      
    } catch (SecException err) {
      System.out.println(err);
      return -1;
    }
  }
  
  void displayTime() {
    System.out.println("Hours: " + getHours());
    System.out.println("Minutes: " + getMins());
    System.out.println("Seconds: " + getSec());
  }
}

class ques6 {
  public static void main(String[] args) {
    Time ghadi = new Time();
    ghadi.displayTime();
  }
}