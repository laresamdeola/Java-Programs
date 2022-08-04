class Main {
  public String name;
  public String season;
  public Boolean seeds;

  public Main(String fruitName, String fruitSeason, Boolean fruitSeeds){
    name = fruitName;
    season = fruitSeason;
    seeds = fruitSeeds;
  }

  public static void main(String[] args){
    Main berries = new Main("Berries", "Autumn", true);
    System.out.println(berries.name + " " + berries.season + " " + berries.seeds);
  }
}