public class Main {

  public static void main(String[] args) {
    Family durodola = new Family();
    durodola.motherName = "Sholape";
    durodola.fatherName = "Adeola";
    durodola.amountOfChildren = 2;
    durodola.familyStatus = "middle class";
    durodola.setStillTogether(false);

    System.out.println(durodola.children());
    System.out.println(durodola.familyDetails());
    System.out.println(durodola.getStillTogether());

  }
}