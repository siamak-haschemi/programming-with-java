package generics.example01_generics_basics;

import generics.example00_basics.Pokemon;

public class UnsafePokeBall {
  private Pokemon pokemon;

  public void setPokemon(Pokemon pokemon) {
    this.pokemon = pokemon;
  }

  public Pokemon getPokemon() {
    return pokemon;
  }
}
