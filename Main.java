import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    NetIncome sample = new NetIncome();
    Scanner scanner = new Scanner(System.in);

    System.out.println("How much is your annual gross income?e.g 10000 ");
    sample.grossIncome = scanner.nextInt();

  }
}