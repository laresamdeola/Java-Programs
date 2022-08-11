public class Main {

  public static void main(String[] args) {
    Profit yearOne = new Profit();
    System.out.println(yearOne.calculateProfit(10000, 2500));
    yearOne.setLimitedLiability("Sholape");
    System.out.println(yearOne.getLimitedLiability());
  }

}