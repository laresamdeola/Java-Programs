// A program to calculate one's net income - UK

class NetIncome {
  public int grossIncome, taxableIncome, basicIncome, higherIncome, additionalIncome;
  public int personalAllowance = 12500;
  public double basic = 0.20;
  public double higher = 0.40;
  public double additional = 0.45;

  public int getAllowance(int grossIncome) {
    return grossIncome - personalAllowance;
  }

  public String minimumWage() {
    return String.format("Your net income is %d", grossIncome);
  }

  public String getBasic() {
    taxableIncome = getAllowance(grossIncome);
    basicIncome = grossIncome - ((int) (taxableIncome * basic));
    return String.format("Your net income is %d", basicIncome);
  }

  public String getHigher() {
    taxableIncome = getAllowance(grossIncome);
    higherIncome = grossIncome - ((int) (taxableIncome * higher));
    return String.format("Your net income is %d", higherIncome);
  }

  public String getAdditional() {
    taxableIncome = getAllowance(grossIncome);
    additionalIncome = grossIncome - ((int) (taxableIncome * additional));
    return String.format("Your net income is %d", additionalIncome);
  }
}