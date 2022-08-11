class Calculator {
  public String operator;
  public int firstNumber, secondNumber, answer;

  public int addition(int firstNumber, int secondNumber) {
    answer = firstNumber + secondNumber;
    return answer;
  }

  public int substraction(int firstNumber, int secondNumber) {
    answer = firstNumber - secondNumber;
    if (answer < 0) {
      answer = 0;
    }
    ;
    return answer;
  }

  public int division(int firstNumber, int secondNumber) {
    answer = firstNumber / secondNumber;
    return answer;
  }

  public int multiply(int firstNumber, int secondNumber) {
    answer = firstNumber * secondNumber;
    return answer;
  }

}