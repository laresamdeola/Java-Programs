class Genre {
  String artistName, artistAlbum, message;
  boolean isAlive;

  public String nameOfArtist() {
    return artistName;
  }

  public String nameOfAlbum() {
    return artistAlbum;
  }

  public String deadOrAlive() {
    if (isAlive == false) {
      message = artistName + "" + " has passed away";
    } else {
      message = artistName + "" + " is alive";
    }
    return message;
  }
}