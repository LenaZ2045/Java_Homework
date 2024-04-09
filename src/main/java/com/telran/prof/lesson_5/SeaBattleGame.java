package com.telran.prof.lesson_5;

import java.util.Scanner;

public class SeaBattleGame {

    private static final int FIELD_LENGTH = 10;
    private static final int[][] SHIP_DECK_AMOUNT = {{4,1}, {3,2}, {2,3}, {1,4}};

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String playerOne;
        String playerTwo;
//        Scanner - name of players

        // String playerOne, playerTwo
        char[][] playerFiledOne = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerFiledTwo = new char[FIELD_LENGTH][FIELD_LENGTH];

        // create class
        SeaBattleGame seaBattleGame = new SeaBattleGame();
        seaBattleGame.fillPlayer(playerFiledOne);
        seaBattleGame.fillPlayer(playerFiledTwo);
    }

    private void fillPlayer(char[][] playerField) {
        // write logic to set the battles
        // create cycle
        printField(playerField);
    }

    private void printField(char[][] playerField) {
        // print 2D array
    }

    private void startGame(String playerOne, String playerTwo, char[][] playerFieldOne, char[][] playerFieldTwo) {

        char[][] playerBattleFiledOne = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerBattleFiledTwo = new char[FIELD_LENGTH][FIELD_LENGTH];

        char[][] currentPlayerField;
        char[][] currentPlayerBattleField;
        //
        while(isPlayerAlive(playerFieldOne) && isPlayerAlive(playerFieldTwo)) {
            // input shots x, y
            // verificationShot (currentPlayerBattleField, currentPlayerField, x, y)
        }
        System.out.println("Winner is ");
    }

    private boolean verificationShot(char[][] battleField, char[][] enemyField, int x, int y) {
        // shot in or missed
        return false;
    }

    private boolean isPlayerAlive(char[][] field) {
        // if exists one deck
        return false;
    }
}