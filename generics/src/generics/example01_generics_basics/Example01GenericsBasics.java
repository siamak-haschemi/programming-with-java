package generics.example01_generics_basics;

import generics.example00_basics.Bulbasaur;
import generics.example00_basics.Pikachu;
import generics.example00_basics.Pokemon;
import generics.example00_basics.Raichu;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnnecessaryLocalVariable")
public class Example01GenericsBasics {

  public static void main(String[] args) {
    // Let's use our UnsafePokeBall:
    try {
      UnsafePokeBall pokeBall = new UnsafePokeBall();
      pokeBall.setPokemon(new Pikachu());
      Pokemon pokemon = pokeBall.getPokemon(); // type is lost
      Pikachu pikachu = (Pikachu) pokemon; // we have to cast to get the type back

      // somewhere later in our program, another developer does
      pokeBall.setPokemon(new Bulbasaur());
      //
      // and we do ...
      //
      pikachu = (Pikachu) pokeBall.getPokemon(); // java.lang.ClassCastException
    } catch (Exception e) {
      System.err.println(e);
    }

    // Using our typesafe PikeBall implementation:
    {
      PokeBall<Pikachu> pikatchuPokeBall = new PokeBall<Pikachu>();
      pikatchuPokeBall.setPokemon(new Pikachu());
      final Pikachu pikachu = pikatchuPokeBall.getPokemon(); // no casting needed
      // somewhere later in our program, another developer CANNOT do:
      //      pikatchuPokeBall.setPokemon(new Bulbasaur());
    }

    {
      // Type parameter 'T' can hold all reference types, but not primitive types:
      new PokeBall<Object>();
      new PokeBall<Pokemon>();
      new PokeBall<Pikachu>();
      new PokeBall<Raichu>();
      new PokeBall<Bulbasaur>();
      new PokeBall<String>(); // ups ... not what we wanted
      new PokeBall<Integer>(); // ups ... not what we wanted
      //       new PokeBall<int>(); // primitive types not allowed
    }

    // Using the diamond operator '<>', the compiler may be able to determine/infer the type
    // parameter automatically
    {
      final PokeBall<Pikachu> pikatchuPokeBall = new PokeBall<>();
      final PokeBall<Object> objectPokeBall = new PokeBall<>();
      final PokeBall<Raichu> raichuPokeBall = new PokeBall<>();
    }

    // You can also substitute a type parameter 'T' with a parameterized type (List<Pikachu>)
    {
      final PokeBall<List<Pikachu>> pikatchuListPokeBall = new PokeBall<>();
      final List<Pikachu> pikachuList = new ArrayList<>();
      pikachuList.add(new Pikachu());
      pikatchuListPokeBall.setPokemon(pikachuList);
    }

    // A raw type is the name of a generic class or interface without any type arguments.
    try {
      final PokeBall<Pikachu> pikachuPokeBall = new PokeBall<>();

      final PokeBall pokeBall = pikachuPokeBall; // OK, but raw use
      pokeBall.setPokemon(new Bulbasaur()); // unchecked call

      final PokeBall<Pikachu> pikachuPokeBall2 = pokeBall;

      final Pikachu pokemon = pikachuPokeBall2.getPokemon(); // ClassCastException
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
