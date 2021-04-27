package generics.example02_inheritance;

import generics.example00_basics.Bulbasaur;
import generics.example00_basics.Pikachu;
import generics.example00_basics.Pokemon;
import generics.example01_generics_basics.PokeBall;

public class Example02Inheritance {

  public static void main(String[] args) {
    {
      DoublePokeBall<Pikachu, Bulbasaur> doublePokeBall = new DoublePokeBall<>();
      doublePokeBall.setPokemon(new Pikachu());
      doublePokeBall.setSecondPokemon(new Bulbasaur());

      System.out.println(doublePokeBall.getPokemon());
      System.out.println(doublePokeBall.getSecondPokemon());
    }

    {
      // generic base types can be bound in sub-classes
      PikatchuPokeBall pikatchuPokeBall = new PikatchuPokeBall();
      pikatchuPokeBall.setPokemon(new Pikachu());
      final Pikachu pikachu = pikatchuPokeBall.getPokemon();
    }

    {
      // this is allowed, since Pikachu and Pokemon are in a inheritance hierarchy
      Pokemon pokemon = new Pikachu();

      PokeBall<Pokemon> pokemonPokeBall = new PokeBall<>();

      // Not allwed: PokeBall<Pikachu> is not a sub-type of PokeBall<Pokemon
      //      final PokeBall<Pikachu> pikachuPokeBall = pokemonPokeBall;

      // -> generics and inheritance are different concepts
    }
  }
}
