class Main {

  public String name;
  public int age;
  public String nationality;

  public Main(String fullName, int fullAge, String fullNationality) {
    name = fullName;
    age = fullAge;
    nationality = fullNationality;
  }

  public static void main(String[] args) {
    Main damilare = new Main("Damilare Adeola", 30, "Nigeria");
    System.out.println(damilare.name + " " + damilare.nationality);
  }
}