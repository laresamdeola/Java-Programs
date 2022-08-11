class Profit {
  int totalRevenue;
  int totalCost;
  int currentProfit;
  int previousProfit;
  String sharePriceIncrease;
  Boolean profitable;
  int percent;
  private String limitedLiability = "yes";

  public String getLimitedLiability() {
    return limitedLiability;
  }

  public void setLimitedLiability(String newLimitedLiability) {
    this.limitedLiability = newLimitedLiability;
  }

  public int calculateProfit(int totalRevenue, int totalCost) {
    currentProfit = totalRevenue - totalCost;
    return currentProfit;
  }

  public Boolean madeProfit(int calculateProfit) {
    if (calculateProfit > 0) {
      profitable = true;
    } else {
      profitable = false;
    }
    return profitable;
  }

  public String percentageIncrease(int currentProfit, int previousProfit) {
    percent = (int) ((previousProfit / currentProfit) * 100);
    String percentString = Integer.toString(percent);
    return (percentString + "%");
  }

}
