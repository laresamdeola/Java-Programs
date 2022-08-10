class Main {
  public static int totalRevenue;
  public static int totalCost;
  public static double currentProfit;
  public static double previousProfit;
  public static String sharePriceIncrease;
  public static Boolean profitable;
  public static Double percent;

  public static double calculateProfit(int totalRevenue, int totalCost) {
    currentProfit = totalRevenue - totalCost;
    return currentProfit;
  }

  public static Boolean madeProfit(double calculateProfit) {
    if (calculateProfit > 0) {
      profitable = true;
    } else {
      profitable = false;
    }
    return profitable;
  }

  public static String percentageIncrease(double currentProfit, double previousProfit) {
    percent = ((currentProfit - previousProfit) / previousProfit) * 100;
    return String.format("%.2f", percent) + "%";
  }

  public static void main(String[] args) {
    previousProfit = 90.0;
    final double year2020 = calculateProfit(2600, 2500);
    System.out.println(year2020);
    System.out.println(madeProfit(year2020));
    System.out.println(percentageIncrease(currentProfit, previousProfit));
  }
}
