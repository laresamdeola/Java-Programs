class Family {
  String motherName, fatherName, familyStatus;
  byte motherAge, fatherAge, amountOfChildren;
  private boolean stillTogether;

  public String familyDetails() {
    return (motherName + " " + fatherName + " " + familyStatus);
  }

  public int children() {
    return amountOfChildren;
  }

  public boolean getStillTogether(){
    return stillTogether;
  }

  public void setStillTogether(boolean updateStillTogether) {
    this.stillTogether = updateStillTogether;
  }

}