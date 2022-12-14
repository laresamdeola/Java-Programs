class Bmi {

  /*
   * Body Mass Index is a simple calculation using a person’s height and weight.
   * The formula is BMI = kg/m2 where kg is a person’s weight in kilograms and m2
   * is their height in metres squared.
   * 
   * A BMI of 25.0 or more is overweight, while the healthy range is 18.5 to 24.9.
   * BMI applies to most adults 18-65 years.
   */

  /*

  import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Bmi lare = new Bmi();
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your weight? ");
    lare.weight = scanner.nextByte();
    System.out.println("What is your height? ");
    lare.height = scanner.nextByte();

    System.out.println(lare.calcBmi());

  }
}
  
  */

  public byte height, weight, bmi;
  public String message;

  public String calcBmi() {
    bmi = (byte) (weight / ((height / 100) ^ 2));
    if (bmi > 25) {
      message = "overweight";
    }
    if (bmi > 18 && bmi < 25) {
      message = "healthy";
    }
    if (bmi < 18) {
      message = "underweight";
    }

    return ("Your BMI is " + String.valueOf(bmi) + " and you are " + message);
  }

}
