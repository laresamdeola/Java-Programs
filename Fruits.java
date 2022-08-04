class Fruits {
  public String name;
  public String season;
  public Boolean seeds;

  public Fruits(String fruitName, String fruitSeason, Boolean fruitSeeds){
    name = fruitName;
    season = fruitSeason;
    seeds = fruitSeeds;
  }

  public static void main(String[] args){
    Fruits berries = new Fruits("Berries", "Autumn", true);
    System.out.println(berries.name);
  }
}