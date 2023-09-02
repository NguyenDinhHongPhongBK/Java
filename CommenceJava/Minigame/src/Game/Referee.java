package Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Referee {

    private final int CONDITION_WIN = 21;
    private ArrayList<Player> players;

    Referee (ArrayList<Player> players)
    {
        this.players = players;
    }

    // the referee control the game
    public void controlGame() {
        int faceRolled = 0;
        Scanner input = new Scanner(System.in);
        boolean state = true;
        while (state) {
            for (int i = 0; i < players.size(); i++) {
                System.out.println("Player: " + players.get(i).getName());

                // roll the dice
                if (players.get(i) instanceof Human) {
                    System.out.print("Enter any key for rolling dice: ");
                    input.nextLine();
                    faceRolled = players.get(i).rollingDice();
                } else {
                    faceRolled = players.get(i).rollingDice();
                }

                // count player's score
                countPlayerScore(players.get(i), faceRolled);
                // if the player's total score > CONDITION_WIN, so it is 0
                if (players.get(i).getScore() > CONDITION_WIN) {
                    System.out.println("Player's score > " + CONDITION_WIN + " so it is 0");
                    players.get(i).setScore(0);
                }
                // display all player's score
                displayPlayerScore(players);

                if (players.get(i).getScore() == CONDITION_WIN) {
                    // if a player's score == CONDITION_WIN, it will win, the game end
                    System.out.println("FINAL RESULT: " + players.get(i).getName() + " wins\n");
                    if (players.get(i) instanceof Bot) {
                        ((Bot) players.get(i)).emotionWin();
                        System.out.println();
                    }
                    players.remove(i);

                    // bot player express emotion
                    for (Player failPlayer : players) {
                        if (failPlayer instanceof Bot) {
                            ((Bot) failPlayer).emotionLose();
                        }
                    }

                    state = false;
                    break;
                }
            }
        }
    }


    // count all player's score
    public void countPlayerScore(Player player, int faceRolled){
        int score = player.getScore();
        score += faceRolled;
        player.setScore(score);
    }

    // print the rule out
    public void displayRule()
    {
        System.out.println("\n======================================================================================");
        System.out.printf("%25s\n", "RULES");
        System.out.println("The referee in turn appoints the next player, calculating the score for the player.\n" +
                "If the sum of the player's old and newly rolled points is " + CONDITION_WIN +", " +
                "that player wins, the game ends.\n" +
                "If the sum of the old and newly rolled points is greater than " + CONDITION_WIN +"," +
                " the player's score is 0.\n" +
                "The rest of the cases are normal.\n" +
                "Each player on their turn will randomly receive a dice and roll.");
        System.out.println("======================================================================================\n");
    }

    // print the table of result
    public void displayPlayerScore(ArrayList<Player> players)
    {
        System.out.println("\n======================================================================================");
        System.out.printf("%25s\n", "RESULT");
        System.out.printf("%15s %17s\n", "User's Name", "Score");
        for (Player player: players)
        {
            System.out.printf("%10s %20d\n", player.getName(), player.getScore());
        }
        System.out.println("======================================================================================\n");
    }
}
