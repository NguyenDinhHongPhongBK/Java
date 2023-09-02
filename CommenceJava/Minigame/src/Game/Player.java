package Game;

import java.util.Random;
import java.util.Scanner;

public class Player {

    private String name;
    private int score = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // input player's name
    public void inputName()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input name of ");
        if (this instanceof Human)
        {
            System.out.print("human player: ");
        }
        else  {
            System.out.print("bot player: ");
        }
        this.setName(input.nextLine());
    }

    // take randomly a die and return rolled face
    public int rollingDice()
    {
        Random random = new Random();
        int faceRolled = 0; // the face of dice player rolled
        int randomFace = random.nextInt(23) + 1;
        int typeOfDice = random.nextInt(3) + 1;

        // 4 types of dice with different probability
        int[] facelist1 = {1,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int[] facelist2 = {1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int[] facelist3 = {1,1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int[] facelist4 = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,6,6,6,6};

        // choose a random dice (1->4)
        System.out.println("Choosing randomly a dice (1->4): dice #" + typeOfDice);
        System.out.println("Rolling...........");

        // depend on type of dice to roll
        switch (typeOfDice) {
            case 1 -> faceRolled = facelist1[randomFace];
            case 2 -> faceRolled = facelist2[randomFace];
            case 3 -> faceRolled = facelist3[randomFace];
            case 4 -> faceRolled = facelist4[randomFace];
            default -> System.out.println("Not exist dice");
        }

        // result of rolled face
        System.out.println("Face is rolled: " + faceRolled);
        return faceRolled;
    }

}
