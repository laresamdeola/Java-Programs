public class Main {

  public static void main(String[] args) {
    Family durodola = new Family();
    durodola.motherName = "Sholape";
    durodola.fatherName = "Adeola";
    durodola.amountOfChildren = 2;
    durodola.familyStatus = "middle class";
    durodola.setStillTogether(false);

    Nigeria naija = new Nigeria();
    naija.countryName = "Nigeria";
    naija.continent = "Africa";
    naija.amountOfStates = 36;
    naija.currency = "Naira";

    System.out.println(naija.displayName());
    System.out.println(naija.displayContinent());
    System.out.println(naija.displayCurrency());
    System.out.println(naija.displayStates());
    System.out.println(durodola.children());
    System.out.println(durodola.familyDetails());
    System.out.println(durodola.getStillTogether());

  }
}