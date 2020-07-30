package com.head_first.chapter2;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){

        int roundNum = 1;

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        p1.name = "Gilfoyle";
        p2.name = "Dinesh";
        p3.name = "Elrich";

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Im thinking of a number between 0 and 10");

        while (true) {

            System.out.println("ROUND " + roundNum);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            guessp2 = p2.number;
            guessp3 = p3.number;

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }

            if (guessp2 == targetNumber) {
                p2isRight = true;
            }

            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if( p1isRight || p2isRight || p3isRight )  {

                if (p1isRight) {
                    System.out.println("The winner is " + p1.name);
                }
                if (p2isRight) {
                    System.out.println("The winner is " + p2.name);
                }
                if (p3isRight) {
                    System.out.println("The winner is " + p3.name);
                }

                System.out.println("The number to guess was " + targetNumber);

                break;
            }

            System.out.println("Players will have to try again.");
            roundNum++;
        }
    }
}

class GuessGameTestDrive {

    public static void main(String[] args) {

        GuessGame newGame = new GuessGame();

        newGame.startGame();
    }
}
