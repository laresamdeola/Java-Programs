//import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Genre fela = new Genre();
    fela.artistName = "Fela Anikulapo Kuti";
    fela.artistAlbum = "Zombie";
    fela.isAlive = true;

    System.out.println(fela.nameOfArtist());
    System.out.println(fela.nameOfAlbum());
    System.out.println(fela.deadOrAlive());
  }
}