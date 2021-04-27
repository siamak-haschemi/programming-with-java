package generics.example02_bounded_type_params;

import generics.example00_basics.Pokemon;

/*
 * Type 'T' can only be 'Pokemon' or a inheritor (Pikatchu, Bulbasaur)
 */
public class PokeBall<T extends Pokemon> {
  private T pokemon;

  public void setPokemon(T pokemon) {
    this.pokemon = pokemon;
  }

  public T getPokemon() {
    return pokemon;
  }
}
