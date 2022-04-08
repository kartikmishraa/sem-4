/*
WAP in java which will depict the use of Multiple Inheritance – use both extends and   implements keyword. The class will extends from shape class as well as implements the Interface INTER – 1.
*/

interface FootballGoal {
  void goal();
}

interface FootballSave {
  void save();
}

class Football implements FootballGoal, FootballSave {
  public void goal() {
    System.out.println("Its a GOALLLLL!!");
  }

  public void save() {
    System.out.println("Its a SAVEEEE!!");
  }
}