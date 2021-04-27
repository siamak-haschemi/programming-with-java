package generics.example00_basics;

/* https://www.pokemon.com/us/pokedex/bulbasaur */
public class Bulbasaur extends AbstractPokemon {
  public Bulbasaur() {
    super(4.0d, 3);
  }

  @Override
  public String toString() {
    return "Bulbasaur";
  }
}
