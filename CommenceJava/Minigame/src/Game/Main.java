package Game;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPlayer = 0;  // number of human player in game

        System.out.print("Input number of player (>=0 and <=4): ");
        numPlayer = input.nextInt();

        // Condition to input number of human player >=0 and <=4
        while (true)
        {
            if (numPlayer < 0)
            {
                System.out.println("Number of player is not less than 0");
            }
            else if (numPlayer > 4)
            {
                System.out.println("Number of player is not more than 4");
            } else break;
            System.out.print("Input again: ");
            numPlayer = input.nextInt();
        }

        // initialize the player in the game
        Player player1 = null, player2 = null , player3 = null, player4 = null;

        switch (numPlayer) {
            case 0 -> {
                player1 = new Bot();
                player2 = new Bot();
                player3 = new Bot();
                player4 = new Bot();
            }
            case 1 -> {
                player1 = new Human();
                player2 = new Bot();
                player3 = new Bot();
                player4 = new Bot();
            }
            case 2 -> {
                player1 = new Human();
                player2 = new Human();
                player3 = new Bot();
                player4 = new Bot();
            }
            case 3 -> {
                player1 = new Human();
                player2 = new Human();
                player3 = new Human();
                player4 = new Bot();
            }
            case 4 -> {
                player1 = new Human();
                player2 = new Human();
                player3 = new Human();
                player4 = new Human();
            }
            default -> System.out.println("Something's wrong");
        }

        // input name of player
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        // input name of players
        for (Player player: players)
        {
            player.inputName();
        }

        // referee start the game
        Referee referee = new Referee(players);
        referee.displayRule();
        referee.controlGame();
        input.close();
    }
}

