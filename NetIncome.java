// A program to calculate one's net income - UK

class NetIncome {
  public int grossIncome, taxableIncome;
  public int personalAllowance = 12500;
  public double basic = 0.20;
  public double higher = 0.40;
  public double additional = 0.45;

  public int getAllowance(int grossIncome) {
    return grossIncome - personalAllowance;
  }

  public int getBasic() {
    taxableIncome = getAllowance(grossIncome);
    return (int) (taxableIncome * basic);
  }

  public int getHigher() {
    taxableIncome = getAllowance(grossIncome);
    return (int) (taxableIncome * higher);
  }

  public int getAdditional() {
    taxableIncome = getAllowance(grossIncome);
    return (int) (taxableIncome * additional);
  }

}