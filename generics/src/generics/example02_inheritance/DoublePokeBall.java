package generics.example02_inheritance;

import generics.example01_generics_basics.PokeBall;

public class DoublePokeBall<T, U> extends PokeBall<T> {
  private U secondPokemon;

  public void setSecondPokemon(U secondPokemon) {
    this.secondPokemon = secondPokemon;
  }

  public U getSecondPokemon() {
    return secondPokemon;
  }
}
