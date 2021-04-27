package generics.example00_basics;

public abstract class AbstractPokemon implements Pokemon {
  private Double healthPoints;
  private final Integer attackPoints;

  public AbstractPokemon(final Double healthPoints, final Integer attackPoints) {
    this.healthPoints = healthPoints;
    this.attackPoints = attackPoints;
  }

  @Override
  public Integer getAttackPoints() {
    return attackPoints;
  }

  @Override
  public Double getHealthPoints() {
    return healthPoints;
  }

  @Override
  public final void attackedBy(final Pokemon pokemonWhichAttacks) {
    if (getHealthPoints() == 0) {
      System.out.println(this + " is powerless. No need to be attacked by " + pokemonWhichAttacks);
      return;
    }

    if (pokemonWhichAttacks.getHealthPoints() == 0) {
      System.out.println(pokemonWhichAttacks + " cannot attack " + this);
      return;
    }

    final double randomAttackPoints = Math.random() * pokemonWhichAttacks.getAttackPoints();
    final double newHalthPoints = this.healthPoints - randomAttackPoints;
    this.healthPoints = Math.max(0, newHalthPoints);

    System.out.println(
        pokemonWhichAttacks
            + " attacks "
            + this
            + " with "
            + randomAttackPoints
            + " attack points.");
  }
}
