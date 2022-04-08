/*
WAP in java t create a class Bank having ROI data member and find_ROI() member function. Derive three classes HDFC, ICICI, BOI with find_ROI() function and find the rate of interest of different Banks using dynamic method dispatch concept
*/

class Bank {
  double ROI;
  void find_ROI() {
    ROI = 5;
    System.out.println("\nROI (Bank): " + ROI + "%");
  }
}

class HDFC extends Bank {
  void find_ROI() {
    ROI = 5.8;
    System.out.println("\nROI (HDFC): " + ROI + "%");
  }
}

class ICICI extends Bank {
  void find_ROI() {
    ROI = 5.9;
    System.out.println("\nROI (ICICI): " + ROI + "%");
  }
}

class BOI extends Bank {
  void find_ROI() {
    ROI = 5.7;
    System.out.println("\nROI (BOI): " + ROI + "%");
  }
}

class ques1 {
  public static void main(String[] args) {
    Bank bank = new Bank();
    ICICI icici = new ICICI();
    HDFC hdfc = new HDFC();
    BOI boi = new BOI();

    Bank ref;

    ref = bank;
    ref.find_ROI();

    ref = icici;
    ref.find_ROI();

    ref = hdfc;
    ref.find_ROI();

    ref = boi;
    ref.find_ROI();
    
  }
}