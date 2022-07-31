class Main {

  public String carModel;
  public String carBrand;
  public int carYear;
  public int carSitters;
  public boolean isLuxury;

  public Main(String model, String brand, int year, int sitters, boolean luxury) {
    carModel = model;
    carBrand = brand;
    carYear = year;
    carSitters = sitters;
    isLuxury = luxury;
  }

  public static void main(String[] args) {
    Main camry = new Main("Camry", "Toyota", 2022, 6, true);
    System.out.println(camry.carBrand + " " + camry.carModel);
  }
}