package generics.example00_basics;

/* https://www.pokemon.com/us/pokedex/raichu */
public class Raichu extends Pikachu {
  public Raichu() {
    super(4.0d, 6);
  }

  @Override
  public String toString() {
    return "Raichu";
  }
}
