class Liverpool {
  String playerName;
  int playerNumber;
  String playerCountry;

  public Liverpool(String lfcPlayerName, int lfcPlayerNumber, String lfcPlayerCountry){
    playerName = lfcPlayerName;
    playerNumber = lfcPlayerNumber;
    playerCountry = lfcPlayerCountry;
  }

  public static void liverpool(String[] args){
    Liverpool nunez = new Liverpool("Darwin Nunez", 27, "Uruguay");
    System.out.println(nunez.playerName + " " + nunez.playerNumber + " " + nunez.playerCountry);
  }
  
}