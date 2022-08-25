class HeadsOrTail {
  boolean randomChoice;
  int randomNumber;
  String toss;

  public int aRandomNumber(){
    randomNumber = (int) (Math.random() * 2);
    return randomNumber;
  }

  public boolean headsOrTails(){
    if(randomNumber == 1){
      randomChoice = true;
    } else {
      randomChoice = false;
    }
    return randomChoice;
  }

  public String fate(){
    if(randomChoice == true){
      toss = "You won";
    } else {
      toss = "You lost";
    }
    return toss;
  }

}