class Main {
  public static String operator;
  public static int firstNumber;
  public static int secondNumber;
  public static int answer;

  public static int addition(int firstNumber, int secondNumber){
    answer = firstNumber + secondNumber;
    return answer;
  }

  public static int substraction(int firstNumber, int secondNumber){
    answer = firstNumber - secondNumber;
    if(answer < 0){
      answer = 0;
    };
    return answer;
  }

  public static int division(int firstNumber, int secondNumber){
    answer = firstNumber / secondNumber;
    return answer;
  }

  public static int multiply(int firstNumber, int secondNumber){
    answer = firstNumber * secondNumber;
    return answer;
  }

  public static void main(String[] args){
    System.out.println(addition(2, 3) + "," + multiply(10, 50));
  }
}