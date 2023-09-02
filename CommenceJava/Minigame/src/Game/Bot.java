package Game;

import java.util.Random;

public class Bot extends Player{

    // bot's emotion when win
    public void emotionWin()
    {
        String[] emotionWin = {":]]]", "haha", "Yeah i'm win", "=)))", "hehe", "idiot human", "LOL"};
        Random random = new Random();
        int emotionBot = random.nextInt(emotionWin.length);
        System.out.println(this.getName() + ": " + emotionWin[emotionBot]);
    }

    // bot's emtion when lose
    public void emotionLose()
    {
        String[] emotionFail = {":[[[", "huhu", "Oh no i'm loser", "+(((", "=(((", "so sad", "T-T"};
        Random random = new Random();
        int emotionBot = random.nextInt(emotionFail.length);
        System.out.println(this.getName() + ": " + emotionFail[emotionBot]);
    }
}
