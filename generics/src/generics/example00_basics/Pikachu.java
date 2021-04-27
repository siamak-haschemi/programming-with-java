package generics.example00_basics;

/* https://www.pokemon.com/us/pokedex/pikachu */
public class Pikachu extends AbstractPokemon {
  public Pikachu() {
    super(3.0d, 4);
  }

  Pikachu(final Double healthPoints, final Integer attackPoints) {
    super(healthPoints, attackPoints);
  }

  @Override
  public String toString() {
    return "Pikachu";
  }
}
