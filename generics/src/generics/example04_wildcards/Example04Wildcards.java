package generics.example04_wildcards;

import generics.example00_basics.Bulbasaur;
import generics.example00_basics.Pikachu;
import generics.example00_basics.Pokemon;
import generics.example01_generics_basics.PokeBall;

public class Example04Wildcards {

  public static void main(String[] args) {
    final PokeBall<Pikachu> pikachuPokeBall = new PokeBall<>();
    pikachuPokeBall.setPokemon(new Pikachu());

    // Compatible with PokeBall<Pokemon>, PokeBall<Pikatchu>, and PokeBall<Bulbasaur>
    PokeBall<? extends Pokemon> somePokeBall = pikachuPokeBall;

    // not allowed, since somePokeBall could be of type Bulbasaur
    //    somePokeBall.setPokemon(new Pikachu());

    // not allowed, since somePokeBall could be of type Pikachu
    //    somePokeBall.setPokemon(new Bulbasaur());

    final Pokemon pokemon = somePokeBall.getPokemon();

    Backpack backpack = new Backpack();
    backpack.addPokeBall(new PokeBall<Pikachu>());
    backpack.addPokeBall(new PokeBall<Pokemon>());
    backpack.addPokeBall(new PokeBall<Bulbasaur>());

    final PokeBall<? extends Pokemon> pokeBall = backpack.getPokeBall(0);
    final Pokemon pokemon1 = pokeBall.getPokemon();
    //    pokeBall.setPokemon(new Pikachu());
  }
}
