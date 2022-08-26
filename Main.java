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