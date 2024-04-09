package com.telran.prof.homework_5_Feb;

import java.util.Scanner;
import java.util.Arrays;

public class SeaBattleShip {
    //Массив кораблей для инициализации, элементы по такому типу {количество_палуб,количество_кораблей}
    private static final int[][] SHIP_DECK_AMOUNT = {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
    //Переменная отвечающая за размер поля
    private static final int FIELD_LENGTH = 10;
    //Сканнер для ввода
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);// initializing two players by 'name' or 'nickname'
        System.out.println("First player, please input your name");
        String playerOne = scanner.nextLine();
        System.out.println("Hi, " + playerOne + "!");
        System.out.println("Second player, please input your name");
        String playerTwo = scanner.nextLine();
        System.out.println("Hi, " + playerTwo + "!");

        //Объявляем поле для первого и второго игрока
        char[][] playerOneField = new char[FIELD_LENGTH][FIELD_LENGTH];// x=10 y=10
        char[][] playerTwoField = new char[FIELD_LENGTH][FIELD_LENGTH];// x=10 y=10

        fieldByDefault(playerOneField);// filling each field with dots
        fieldByDefault(playerTwoField);// filling each field with dots

        //В данном методе, нужно расставить корабли для первого и второго участника
        System.out.println(playerOne + ", enter your ships"); // calling player one to fill his field with ships
        fillFiled(playerOneField); // ships' decks are marked with '=' and prints each ship after each [x][y]+arrow
        System.out.println(playerTwo + ", enter your ships"); // calling player two to fill his field with ships '='
        fillFiled(playerTwoField); // ships' decks are marked with '=' and prints each ship after each [x][y]+arrow

        startGame(playerOneField, playerTwoField, playerOne, playerTwo); // game is started it invites first player to go
        if (isPlayerAlive(playerOneField)) { // check if one field is alive after other dead
            System.out.println("The winner is " + playerOne); // and presents winner if first player is alive
        } else {
            System.out.println("The winner is " + playerTwo);// or presents winner if second player is alive
        }
    }

    private static void startGame(char[][] playerFieldOne, char[][] playerFieldTwo, String playerOne, String playerTwo) {
        //Игра будет идти, пока один из игроков не потеряет все корабли
        while (isPlayerAlive(playerFieldOne) && isPlayerAlive(playerFieldTwo)) {
            // Добавим еще два поля, на которых будем отмечать выстрелы
            char[][] playerBattleFieldOne = new char[FIELD_LENGTH][FIELD_LENGTH]; // initialized battlefield x=10 y=10
            char[][] playerBattleFieldTwo = new char[FIELD_LENGTH][FIELD_LENGTH]; // initialized battlefield x=10 y=10
            //Определяем текущего игрока, они будут ходить по очереди
            String currentPlayer; // creating variable to change between players if anyone misses
            currentPlayer = playerOne; // invites first player to go as a currentPlayer
            char[][] currentPlayerField = playerFieldTwo; // player's hits apply to the enemy field marking as 'x'
            char[][] currentPlayerEnemyField = playerBattleFieldOne; // should show and apply hits for player's view for next hit
            // Запрашиваем координаты нового выстрела
            System.out.println(currentPlayer + ", please, input Y coordinate of shot"); // actual hits by numbers y=0-to-9
            int xShot = scanner.nextInt();// prints somehow in reverse for 'x' and 'y' why? this is why I changed order for Y & X
            System.out.println(currentPlayer + ", please, input X coordinate of shot"); // actual hits by numbers x=0-to-9
            int yShot = scanner.nextInt();// prints somehow in reverse for 'x' and 'y' why? this is why I changed order for Y & X
            // Обрабатываем выстрел
            int shotResult = verificationShot(currentPlayerEnemyField, currentPlayerField, xShot, yShot);// verifies hit? miss?
            // Печатает поле текущего игрока , куда он уже стрелял
            printField(currentPlayerEnemyField); // should show and apply hits for player's view for next hit

            if (shotResult == 0) { // Если выстрел был не удачный
                if (currentPlayer.equals(playerOne)) {
                    currentPlayer = playerTwo; //то присваиваем в переменные текущего игрока, другого игрока
                    //и его поле выстрелов присваиваем в поле противника
                    currentPlayerField = playerFieldOne;
                    currentPlayerEnemyField = playerBattleFieldTwo; // marks ships decks hits & misses
                    System.out.println(currentPlayer + ", please, input Y coordinate of shot");// actual hits by numbers y=0-to-9
                    int xShot2 = scanner.nextInt(); // prints somehow in reverse for 'x' and 'y' why?
                    System.out.println(currentPlayer + ", please, input X coordinate of shot");// actual hits by numbers x=0-to-9
                    int yShot2 = scanner.nextInt();// prints somehow in reverse for 'x' and 'y' why?
                    int shotResult2 = verificationShot(currentPlayerEnemyField, currentPlayerField, xShot2, yShot2);// hit? miss?
                    printField(currentPlayerEnemyField);// should show and apply hits for player's view for next hit
                    while (shotResult2 != 0 && isPlayerAlive(currentPlayerField)) {// logic checks if no miss & if player is alive
                        currentPlayer = playerTwo; // lets player play if no miss
                        currentPlayerField = playerFieldOne; // same field after currency change first time
                        currentPlayerEnemyField = playerBattleFieldTwo; // marks ships decks hits & misses
                        System.out.println(currentPlayer + ", please, input Y coordinate of shot");// actual hits by numbers y=0-to-9
                        int xShot3 = scanner.nextInt(); // prints somehow in reverse for 'x' and 'y' why?
                        System.out.println(currentPlayer + ", please, input X coordinate of shot");// actual hits by numbers x=0-to-9
                        int yShot3 = scanner.nextInt();// prints somehow in reverse for 'x' and 'y' why?
                        int showResult3 = verificationShot(currentPlayerEnemyField, currentPlayerField, xShot3, yShot3);// hit? miss?
                        printField(currentPlayerEnemyField);// should show and apply hits for player's view for next hit
                        if (showResult3 == 0) { // redirects last current player to the start of the game when MISS
                            startGame(playerFieldOne, playerFieldTwo, playerOne, playerTwo); //recursively game runs until one is dead
                        }
                    }
                }
            }
        }
    }
    /**
     * Метод проверяющий, что по переданным координатам есть корабль и выстрел успешный
     * возвращает 1, если успешный, 0 если промах
     * отмечает выстрелы на поле противника field и на своем поле выстрелов battleField
     */
    private static int verificationShot(char[][] battleField, char[][] field, int x, int y) { //verifies if hit or miss
        printField(battleField); // prints in console shots and disappears why? or empty?
        printField(field); // prints in console enemy field
        // Check if the coordinates are within bounds
        if (x < 0 || x >= field.length || y < 0 || y >= field[0].length) {
            System.out.println("Invalid coordinates. Keep playing.");
            return 0; // Out of bounds, treated as a miss
        }
        // Check if there's an intact deck on the opponent's field
        if (!(field[x][y] == '.' || field[x][y] == '0')) { //проверить, что на данном поле есть целая палуба корабля
            // Mark the hit deck on the opponent's field
            //если успех, то отметить подбитую палубу на поле противника field
            field[x][y] = 'X';
            // Mark the shot on the player's battleField
            battleField[x][y] = 'X'; //и отметить выстрел на своем поле выстрелов battleField
            System.out.println("Hit! Keep playing.");
            return 1; // Successful hit и вернуть 1
        } else {
            field[x][y] = '0'; //отметить промах палубу на поле противника field
            // Mark the miss on the player's battleField
            battleField[x][y] = 'O'; //иначе отметить на своем поле выстрелов battleField промах
            System.out.println("Miss! Play goes to another player!");
            return 0; // Miss и вернуть 0
        }
    }
    /**
     * Метод проверяющий, что у игрока есть хоть одна целая палуба на поле
     */
    private static boolean isPlayerAlive(char[][] field) { // verifies if any ship is alive BOOLEAN
        //пробежаться по всему полю и вернуть true
        //если есть хотя бы одна палуба на поле целая
        //иначе вернуть false
        for (int i = 0; i < field.length; i++) { // runs over 100 marks
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == '=') { // searches for any '='char then it is alive
                    return true; // true
                }
            }
        }
        // if no more ships player is not alive
        System.out.println("There is no whole deck!"); // otherwise no alive ships
        return false; // false
    }
    /**
     * Заполняет поле символом '.'
     */
    private static void fieldByDefault(char[][] field) { // both fields will be marked with dots
        for (char[] chars : field) { // runs for each field separately
            Arrays.fill(chars, '.'); // marks with '.' char
        }
    }
    /**
     * Рисует поле в консоли в виде матрицы
     */
    private static void printField(char[][] field) { // prints field
        for (char[] ints : field) {// runs field as is
            for (char anInt : ints) {// takes each char in field
                System.out.print(anInt + " ");// divides each char with space ' '
            }
            System.out.println(); // empty line as a space
        }
    }
    /**
     * Метод запрашивает и расставляет корабли на поле
     */
    private static void fillFiled(char[][] field) {
        //Идем по массиву кораблей
        for (int i = 0; i < SHIP_DECK_AMOUNT.length; i++) {
            //Определяем количество кораблей с определенной палубой
            int shipCount = SHIP_DECK_AMOUNT[i][1];
            //Начинаем расставлять корабли с определенной палубой
            for (int j = 0; j < shipCount; j++) {
                System.out.println("Put " + SHIP_DECK_AMOUNT[i][0] + " deck ship. Left: " + (shipCount - j));

                int result = 1;
                int x = 0;
                int y = 0;
                int direction = 0;
                //Запрашиваем x,y координату на поле с которой будет начинаться наш
                //корабль и направление, куда он будет продолжен по горизонтали или вертикали
                //после этого в этом цикле будет проверено, что расставленный корабль не пересекся
                //с другими и не коснулся никого соседними клетками и если все ок,
                //то можно заполнить поле игрока этим кораблем и вывести в консоль то,
                //как выглядит поле после расстановки корабля. Так будет повторяться для всех кораблей.
                while (result != 0) {
                    System.out.println("Input start x coordinate: ");
                    x = scanner.nextInt();
                    if (x > 10 || x < 0) {
                        System.out.println("Number Out of Bounds = start game over");
                    }
                    System.out.println("Input start y coordinate: ");
                    y = scanner.nextInt();
                    if (y > 10 || y < 0) {
                        System.out.println("Number Out of Bounds = start game over");
                    }
                    System.out.println("Input direction of ship: ");
                    System.out.println("1 - horizontal; 2 - vertical;");
                    direction = scanner.nextInt();
                    //Проверяет что корабль распологается корректно и если это так
                    //то возвращает 0 и выходим из этого цикла, что бы отрисовать корабль на поле
                    result = validateCoordinateForShip(field, x, y, direction, i);
                }
                int shipDeck = SHIP_DECK_AMOUNT[i][0];
                //Рисуем корабль по горизонтали
                if (direction == 1) {
                    for (int k = 0; k < shipDeck; k++) {
                        field[y][x + k] = '=';
                    }
                }
                //Рисуем корабль по вертикали
                if (direction == 2) {
                    for (int k = 0; k < shipDeck; k++) {
                        field[y + k][x] = '=';
                    }
                }
                //выводит поле после размещения корабля
                printField(field);
            }
        }
    }
    /**
     * Метод проверяет, что корабль корректно поместится по указанным координатам и не будет
     * соседствовать, в нарушении правил, с другими кораблями
     * если корректно - вернет 0, иначе -1
     */
    private static int validateCoordinateForShip(char[][] field, int x, int y, int direction, int shipDeck) {
        // horizontally
        if (direction == 1) {
            for (int i = 0; i < shipDeck - 1; i++) {
                if (x > 0) {
                    if ('=' == field[y][x + i - 1]) {
                        return -1;
                    }
                }
                if (y > 0) {
                    if ('=' == field[y - 1][x + i]) {
                        return -1;
                    }
                }
                if ('=' == field[y][x + i] || '=' == field[y][x + i + 1] || '=' == field[y + 1][x + i] || (x + i) > 9) {
                    return -1;
                }
            }
        } else if (direction == 2) { // vertically
            for (int i = 0; i < shipDeck - 1; i++) {
                if (y > 0) {
                    if ('=' == field[y + i - 1][x]) {
                        return -1;
                    }
                }
                if (x > 0) {
                    if ('=' == field[y + i][x - 1]) {
                        return -1;
                    }
                }
                if ('=' == field[y + i][x] || '=' == field[y + i + 1][x] || '=' == field[y + i][x + 1] || (y + i) > 9) {
                    return -1;
                }
            }
        }
        return 0;
    }
}