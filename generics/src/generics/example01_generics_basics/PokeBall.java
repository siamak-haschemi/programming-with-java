package generics.example01_generics_basics;


public class PokeBall<T> { // Type-variable 'T' is a formal type parameter
  private T pokemon;

  public void setPokemon(T pokemon) {
    this.pokemon = pokemon;
  }

  public T getPokemon() {
    return pokemon;
  }
}
