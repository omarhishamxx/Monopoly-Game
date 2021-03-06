import java.util.ArrayList;

public class Monopoly {
    public static void main(String[] args){
        // objects from classes
        Dice dice = new Dice();
        Jail jail = new Jail();
        
        ArrayList<Player> players = createPlayers(2);
        
        Board board = new Board(jail, dice, players);   
        
        Game game = new Game(jail, dice, board, players);
        
        //start the game
        jail.setGame(game);

        game.turn(players.get(0));
    }

    //arraylist to store the players name
    static ArrayList<Player> createPlayers(int numPlayers){
        ArrayList<Player> players = new ArrayList<>();

        for(int i = 1; i <= numPlayers; i++){
            System.out.print("Player " + i + " name: ");
            players.add(new Player(Input.read()));
        }

        return players;
    }
}

