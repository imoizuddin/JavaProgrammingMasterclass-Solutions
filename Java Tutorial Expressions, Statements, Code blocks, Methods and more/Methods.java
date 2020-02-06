package com.company;

public class Methods {
    public static void displayHighScorePosition(String playerName, int playerPosition){
            System.out.println(playerName+ " managed to get into position "+playerPosition+" on the high score table ");
        }

        public static int calculateHighScorePosition(int score){

            if (score>=1000) {
                return 1;
            }
            else if (score>=500){
                return 2;
            }
            else if (score>=100){
                return 3;
            }
            else
                return 4;
        }
    public static void main(String[] args) {

        int highScorePosition=calculateHighScorePosition(1500);
        displayHighScorePosition("Amit",30);
        System.out.println("Amit scored  "+highScorePosition);

        int highScorePosition2=calculateHighScorePosition(900);
        displayHighScorePosition("Ajay",30);
        System.out.println("Ajay scored  "+highScorePosition2);

        int highScorePosition3=calculateHighScorePosition(400);
        displayHighScorePosition("Ashok",30);
        System.out.println("Ashok scored  "+highScorePosition3);

        int highScorePosition4=calculateHighScorePosition(40);
        displayHighScorePosition("Ashwin",30);
        System.out.println("Ashwin scored  "+highScorePosition4);

    }

}


