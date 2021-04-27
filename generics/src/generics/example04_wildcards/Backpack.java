package generics.example04_wildcards;

import generics.example00_basics.Pokemon;
import generics.example01_generics_basics.PokeBall;
import java.util.ArrayList;
import java.util.List;

public class Backpack {
  private final List<PokeBall<? extends Pokemon>> pokeBalls = new ArrayList<>();

  public void addPokeBall(PokeBall<? extends Pokemon> pokeBall) {
    pokeBalls.add(pokeBall);
  }

  public PokeBall<? extends Pokemon> getPokeBall(int index) {
    return pokeBalls.get(index);
  }
}
