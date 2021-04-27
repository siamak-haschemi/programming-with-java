package generics.example03_collections;

import generics.example00_basics.Bulbasaur;
import generics.example00_basics.Pikachu;
import generics.example00_basics.Pokemon;
import generics.example00_basics.Raichu;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example03Collections {

  public static void main(String[] args) {

    // first let's see what the problem of untyped usage is:
    try {
      List list = new ArrayList();
      list.add(14);
      list.add("cycle");
      list.add(12);

      Integer sum = 0;
      for (Object o : list) {
        // programmer's mistake above (adding 'cycle') will cause ClassCastException
        sum += (Integer) o;
      }
    } catch (Exception e) {
      System.err.println(e);
    }

    final List<Pokemon> pokemons = new ArrayList<>();
    pokemons.add(new Pikachu());
    pokemons.add(new Raichu());
    pokemons.add(new Bulbasaur());

    for (Pokemon pokemon : pokemons) {
      System.out.println(pokemon);
    }

    // group Pokemons by healthPoints
    Map<Double, List<Pokemon>> healthPointMap =
        pokemons.stream().collect(Collectors.groupingBy(Pokemon::getHealthPoints));
    System.out.println(healthPointMap);
  }
}
