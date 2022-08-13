class Trivia {
  String question;
  String answer;
  String[] questionsList = { "What is your name?", "How old are you?" };

  public String[] questions() {
    return questionsList;
  }

  public String triviaQuestion() {
    return question;
  }
}