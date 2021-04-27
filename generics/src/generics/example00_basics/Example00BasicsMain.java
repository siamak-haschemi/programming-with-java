package generics.example00_basics;

public class Example00BasicsMain {
  public static void main(String[] args) {
    Bulbasaur bulbasaur = new Bulbasaur();
    Pikachu pikachu = new Pikachu();

    {
      System.out.println("\n======= polymorphic method calls");
      Pokemon p = pikachu;
      System.out.println(p.toString()); // polymorphic method call

      Pokemon p2 = bulbasaur;
      System.out.println(p2.toString()); // polymorphic method call
    }

    Game game = new Game(pikachu, bulbasaur);

    {
      System.out.println("\n======= Method overload");
      Pokemon p = pikachu;
      game.printStatus(p); // 'Pokemon' method called (overload)

      Object o = pikachu;
      game.printStatus(o); // 'Object' method called (overload)

      game.printStatus(pikachu); // 'Pikachu' method called (overload)
      game.printStatus(bulbasaur); // 'Bulbasaur' method called (overload)
    }

    System.out.println("\n======= Game");
    do {
      game.play();
      game.printStatus(pikachu);
      game.printStatus(bulbasaur);
      System.out.println();
    } while (game.runs());
  }
}
