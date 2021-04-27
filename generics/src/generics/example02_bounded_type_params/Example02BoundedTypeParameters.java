package generics.example02_bounded_type_params;

import generics.example00_basics.Bulbasaur;
import generics.example00_basics.Pikachu;
import generics.example00_basics.Pokemon;
import generics.example00_basics.Raichu;

public class Example02BoundedTypeParameters {

  public static void main(String[] args) {
    new PokeBall<Pokemon>();
    new PokeBall<Pikachu>();
    new PokeBall<Bulbasaur>();
    new PokeBall<Raichu>();

    /* not allowed, because PokeBall's generic Type 'T' is upper-bounded
      using 'PokeBall <T extends Pokemon>'
    */
    // new PokeBall<Object>();
    // new PokeBall<String>();
    // new PokeBall<Integer>();
  }
}
