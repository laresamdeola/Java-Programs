import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    NetIncome sample = new NetIncome();
    Scanner scanner = new Scanner(System.in);

    System.out.println("How much is your annual gross income?e.g 10000 ");
    sample.grossIncome = scanner.nextInt();
    if (sample.grossIncome <= sample.personalAllowance) {
      System.out.println(sample.minimumWage());
    }
    if(sample.grossIncome > sample.personalAllowance && sample.grossIncome <= 50270){
      sample.getAllowance(sample.grossIncome);
      System.out.println(sample.getBasic());
    }
    if(sample.grossIncome > 50270 && sample.grossIncome <= 150000 ){
      sample.getAllowance(sample.grossIncome);
      System.out.println(sample.getHigher());
    }
    if(sample.grossIncome > 150000){
      sample.getAllowance(sample.grossIncome);
      System.out.println(sample.getAdditional());
    }
  }
}