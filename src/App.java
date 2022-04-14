import Player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Howdy Coder!");
        /**
         * Model A Player Class with A Name(string), and Level(int)
         */
        /**
         * Create 2-5 Objects with the Player Class, and initialize
         * the values via the constructor.
         */
        Player one = new Player("Floren",45);
        Player two = new Player("Shelzy",67);
        Player three = new Player("Nicole",80);
        Player four = new Player("Sophia",99);
        Player five = new Player("Mae", 101);

        /**
         * Display total Players
         * Display Max Level Among the Player Objects Created
         */
        System.out.println("Total Player/s: "+ Player.getPlayer_count());
        System.out.println("Highest Level: "+ Player.getMax_level());
    }
}
