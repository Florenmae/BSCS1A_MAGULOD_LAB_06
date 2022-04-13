package Player;

public class Player {
    /**
     * Instance Variable Requirements
     * Name
     * Level
     */

    private String name;
    private int level;

    /**
     * Static Variable Requirement
     * Static Variable called max_level(int)(private)
     * Holds the value of the Max Level of the players created.
     */
    private static int max_level=0;
    private static int player_count=0;

    /**
     * Static variable called player_count(int)(private)
     * This hold the value of the total players created
     */

    public Player(String playerName, int playerLevel){
        name = playerName;
        level = playerLevel;

        //Display the player name and level
        System.out.println( playerName + " level: " + playerLevel);

        //Method to count the player registered
        player_count++;

        //Method to find the highest level among the objects
        if(player_count == 1){
            max_level = playerLevel;
        }
        else if ( playerLevel > max_level){
            max_level = playerLevel;
        }
    }

    //Static methods - getters for max_level, and counter
    // return max_level
    public static int getMax_level(){
        return max_level;
    }
    public static int getPlayer_count(){
        return player_count;
    }
}
