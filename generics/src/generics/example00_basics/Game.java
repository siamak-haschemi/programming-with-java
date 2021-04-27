package generics.example00_basics;

public class Game {
  private final Pokemon pokemon1;
  private final Pokemon pokemon2;

  public Game(Pokemon pokemon1, Pokemon pokemon2) {
    this.pokemon1 = pokemon1;
    this.pokemon2 = pokemon2;
  }

  public void play() {
    pokemon1.attackedBy(pokemon2);
    pokemon2.attackedBy(pokemon1);
  }

  public boolean runs() {
    return pokemon1.getHealthPoints() > 0 && pokemon2.getHealthPoints() > 0;
  }

  public void printStatus(Object object) {
    System.out.println(">> Object");
  }

  public void printStatus(Pokemon pokemon) {
    System.out.println(">> Pokemon");
  }

  public void printStatus(Pikachu pikachu) {
    System.out.println(">> " + pikachu.toString() + " (" + pikachu.getHealthPoints() + ")");
  }

  public void printStatus(Bulbasaur bulbasaur) {
    System.out.println(">> " + bulbasaur.toString() + " (" + bulbasaur.getHealthPoints() + ")");
  }
}
