//F3 F7 A1 D1 J10 J8 B9 D9 I2 J2
//A1 A5 A10 D10 G3 G5 C3 C5 D7 E7
package battleship;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        SeaField myField = new SeaField();
        SeaField enemyField = new SeaField();

        //Beginning the placing ships of player 1
        System.out.println("Player 1, place your ships on the game field\n");

        myField.showField();

        boolean isShipOk = false;
        System.out.println("\nEnter the coordinates of the Aircraft Carrier (5 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = myField.aircraftCarrier.getCrd(curCorFirst, curCorLast) == true) {
                if (!myField.PlaceAircraftCarrier()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        myField.showField();
        //myField.showImplicitField();

        isShipOk = false;
        System.out.println("\nEnter the coordinates of the Battleship (4 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = myField.battleship.getCrd(curCorFirst, curCorLast) == true) {
                if (!myField.PlaceBattleship()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        myField.showField();
        //myField.showImplicitField();

        isShipOk = false;
        System.out.println("\nEnter the coordinates of the Submarine (3 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = myField.submarine.getCrd(curCorFirst, curCorLast) == true) {
                if (!myField.PlaceSubmarine()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        myField.showField();
        //myField.showImplicitField();

        isShipOk = false;
        System.out.println("\nEnter the coordinates of the Cruiser (3 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = myField.cruiser.getCrd(curCorFirst, curCorLast) == true) {
                if (!myField.PlaceCruiser()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        myField.showField();
        //myField.showImplicitField();

        isShipOk = false;
        System.out.println("\nEnter the coordinates of the Destroyer (2 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = myField.destroyer.getCrd(curCorFirst, curCorLast) == true) {
                if (!myField.PlaceDestroyer()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        myField.showField();
        //myField.showImplicitField();
        //Ending the placing ships of player 1

        showPromptToAnotherPlayer();

        //Beginning the placing ships of player 2
        System.out.println("Player 2, place your ships on the game field\n");

        enemyField.showField();

        isShipOk = false;
        System.out.println("\nEnter the coordinates of the Aircraft Carrier (5 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = enemyField.aircraftCarrier.getCrd(curCorFirst, curCorLast) == true) {
                if (!enemyField.PlaceAircraftCarrier()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        enemyField.showField();
        //myField.showImplicitField();

        isShipOk = false;
        System.out.println("\nEnter the coordinates of the Battleship (4 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = enemyField.battleship.getCrd(curCorFirst, curCorLast) == true) {
                if (!enemyField.PlaceBattleship()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        enemyField.showField();
        //myField.showImplicitField();

        isShipOk = false;
        System.out.println("\nEnter the coordinates of the Submarine (3 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = enemyField.submarine.getCrd(curCorFirst, curCorLast) == true) {
                if (!enemyField.PlaceSubmarine()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        enemyField.showField();
        //myField.showImplicitField();

        isShipOk = false;
        System.out.println("\nEnter the coordinates of the Cruiser (3 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = enemyField.cruiser.getCrd(curCorFirst, curCorLast) == true) {
                if (!enemyField.PlaceCruiser()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        enemyField.showField();
        //myField.showImplicitField();

        isShipOk = false;
        System.out.println("\nEnter the coordinates of the Destroyer (2 cells):");
        while(!isShipOk) {
            System.out.println();
            String curCorFirst = scanner.next();
            String curCorLast = scanner.next();
            if (isShipOk = enemyField.destroyer.getCrd(curCorFirst, curCorLast) == true) {
                if (!enemyField.PlaceDestroyer()) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    isShipOk = false;
                }
            }
        }
        //System.out.println();
        enemyField.showField();
        //myField.showImplicitField();
        //Ending the placing ships of player 2

        //System.out.println("\nThe game starts!\n");
        //myField.showFieldWithFogOfWar();
        //System.out.println("\nTake a shot!\n");
        while (myField.getCountSunkShips() != 5 || enemyField.getCountSunkShips() != 5) {
            showPromptToAnotherPlayer();
            showFieldsForPlayer1(myField, enemyField);
            while (!enemyField.makeShot(scanner.next())) continue;
            showPromptToAnotherPlayer();
            showFieldsForPlayer2(enemyField, myField);
            while (!myField.makeShot(scanner.next())) continue;
        }
    }

    static boolean showPromptToAnotherPlayer() {
        System.out.println("\nPress Enter and pass the move to another player");
        try {
            while ((char)System.in.read()!= '\n') {
                continue;
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    static void showFieldsForPlayer1(SeaField player1, SeaField player2) {
        player2.showFieldWithFogOfWar();
        System.out.println("---------------------");
        player1.showField();
        System.out.println("Player 1, it's your turn:\n");
    }

    static void showFieldsForPlayer2(SeaField player2, SeaField player1) {
        player1.showFieldWithFogOfWar();
        System.out.println("---------------------");
        player2.showField();
        System.out.println("Player 2, it's your turn:\n");
    }
}

class SeaField {
    static final int TOTAL_SHIPS = 5;

    private char[][] currentField;
    private char[][] implicitField;
    private final int COL = 10;
    private final int ROW = 10;

    private int countSunkShips = 0;

    Ship aircraftCarrier = new Ship(5, "Aircraft Carrier");
    Ship battleship = new Ship(4, "Battleship");
    Ship submarine = new Ship(3, "Submarine");
    Ship cruiser = new Ship(3, "Cruiser");
    Ship destroyer = new Ship(2, "Destroyer");

    public SeaField() {
        this.currentField = new char[ROW][COL];
        for (int i = 0; i < ROW; ++i) {
            for (int j = 0; j < COL; ++j) {
                currentField[i][j] = '~';
            }
        }
        this.implicitField = new char[ROW][COL];
        for (int i = 0; i < ROW; ++i) {
            for (int j = 0; j < COL; ++j) {
                implicitField[i][j] = '~';
            }
        }
    }
    public boolean PlaceAircraftCarrier() {
        return fillShipSpace(this.aircraftCarrier);
    }

    public boolean PlaceBattleship () {
        return fillShipSpace(this.battleship);
    }

    public boolean PlaceSubmarine() {
        return fillShipSpace(this.submarine);
    }

    public boolean PlaceCruiser() {
        return fillShipSpace(this.cruiser);
    }

    public boolean PlaceDestroyer() {
        return fillShipSpace(this.destroyer);
    }



    public void showFieldWithFogOfWar() {
        System.out.print(" ");
        for (int i = 1; i <= COL; ++i) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < ROW; ++i) {
            System.out.print((char)(65 + i) + " ");
            for (int j = 0; j < COL; ++j) {
                if (currentField[i][j] == 'O') {
                    System.out.print('~' + " ");
                } else {
                    System.out.print(currentField[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //Making a shot.
    public boolean makeShot(String crdnt) {
        int tmpRow = "ABCDEFGHIJ".indexOf(crdnt.charAt(0));
        int tmpCol;
        String tmpStrCol = crdnt.substring(1);
        try {
            if (tmpRow != -1) {
                tmpCol = Integer.parseInt(tmpStrCol) - 1;
                if (tmpCol >= 0 && tmpCol < COL) {
                    int tempCountOfSinkShips = getCountSunkShips();
                    switch (currentField[tmpRow][tmpCol]) {
                        case 'O' :
                            currentField[tmpRow][tmpCol] = 'X';
                            //this.showFieldWithFogOfWar();
                            if (tempCountOfSinkShips == getCountSunkShips()) {
                                System.out.println("\nYou hit a ship!\n");
                                //this.showField();
                            } else {
                                if (tempCountOfSinkShips < TOTAL_SHIPS - 1) {
                                    System.out.println("\nYou sank a ship! Specify a new target:\n");
                                } else {
                                    System.out.println("\nYou sank the last ship. You won. Congratulations!\n");
                                }
                            }
                            break;
                        case '~' :
                            currentField[tmpRow][tmpCol] = 'M';
                            //this.showFieldWithFogOfWar();
                            System.out.println("\nYou missed!\n");
                            //this.showField();
                            break;
                        default:
                            //this.showFieldWithFogOfWar();
                            System.out.println("\nAlready shorted!\n");
                            //this.showField();
                            break;
                    }
                    return true;
                } else {
                    System.out.println("\nError! You entered the wrong coordinates! Try again:\n");
                    return false;
                }
            } else {
                System.out.println("\nError! You entered the wrong coordinates! Try again:\n");
                return false;
            }
        }
        catch (NumberFormatException e) {
            System.out.println("\nError! You entered the wrong coordinates! Try again:\n");
            return false;
        }
    }

    private boolean fillShipSpace(Ship ship) {
        int[][] tempOneDim = ship.getShipArea();
        //First it is needed to check if it is possible to place the ship at this location
        if (isPlaceShip(ship)) {
            for (int i = 0; i < tempOneDim.length; ++i) {
                markO(tempOneDim[i][0], tempOneDim[i][1]);
            }
            int[][][] tempThreeDim = ship.getProhibitedArea();
            for (int i = 0; i < tempThreeDim.length; ++i) {
                for (int j = 0; j < tempThreeDim[i].length; ++j) {
                    markS(tempThreeDim[i][j][0], tempThreeDim[i][j][1]);
                }
            }
            return true;
        } else {
            return false;
        }
    }
    private boolean isNotS(int crdnt1, int crdnt2) {
        return implicitField[crdnt1][crdnt2] != 'S';
    }

    private boolean isX(int crdnt1, int crdnt2) {
        return  currentField[crdnt1][crdnt2] == 'X';
    }

    private boolean isPlaceShip(Ship ship) {
        boolean answer = false;
        int[][] temp = ship.getShipArea();
        for (int i = 0; i < temp.length; ++i) {
            if (answer = isNotS(temp[i][0], temp[i][1])) {
                continue;
            } else {
                break;
            }
        }
        return answer;
    }

    private void markO( int crdnt1, int crdnt2) {
        try {
            currentField[crdnt1][crdnt2] = 'O';
        } catch (Exception e) {
            System.out.println("Function \"markO:\" Out of range of sea field");
        }
    }

    private void markS( int crdnt1, int crdnt2) {
        try {
            implicitField[crdnt1][crdnt2] = 'S';
        } catch (Exception e) {
            System.out.println("Function \"markS:\" Out of range of sea field");
        }
    }

    private boolean isShipSunk(Ship ship) {
        boolean answer = true;
        int[][] temp = ship.getShipArea();
        for (int i = 0; i < temp.length; ++i) {
            if (answer = isX(temp[i][0], temp[i][1])) {
                continue;
            } else {
                break;
            }
        }
        return answer;
    }

    private int countOfSunkShip() {
        int count = 0;
        if (isShipSunk(aircraftCarrier)) {
            ++count;
        }
        if (isShipSunk(battleship)) {
            ++count;
        }
        if (isShipSunk(submarine)) {
            ++count;
        }
        if (isShipSunk(cruiser)) {
            ++count;
        }
        if (isShipSunk(destroyer)) {
            ++count;
        }
        return count;
    }

    public int getCountSunkShips() {
        return this.countSunkShips = countOfSunkShip();
    }

    public void showField() {
        System.out.print(" ");
        for (int i = 1; i <= COL; ++i) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < ROW; ++i) {
            System.out.print((char)(65 + i) + " ");
            for (int j = 0; j < COL; ++j) {
                System.out.print(currentField[i][j] + " ");
            }
            System.out.println();
        }
    }

    // This method is to help for debug
    public void showImplicitField() {
        System.out.print(" ");
        for (int i = 1; i <= COL; ++i) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < ROW; ++i) {
            System.out.print((char)(65 + i) + " ");
            for (int j = 0; j < COL; ++j) {
                System.out.print(implicitField[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Ship {
    private final int LENGTH_AREA = 10;
    private int CrdRow1;
    private int CrdRow2;
    private int CrdCol1;
    private int CrdCol2;
    private int cells = 0;
    private int[][] shipArea;
    private int[][][] prohibitedArea;
    private String typeShip;

    private void setProhibitedArea() {
        if (CrdRow1 == CrdRow2) {
            for (int i = 0; i < cells + 2; ++i) {
                prohibitedArea[0][i][0] = CrdRow1 - 1;
                prohibitedArea[1][i][0] = CrdRow1;
                prohibitedArea[2][i][0] = CrdRow1 + 1;
            }
            for (int i = 0; i < cells + 2; ++i) {
                prohibitedArea[0][i][1] = CrdCol1 - 1 + i;
                prohibitedArea[1][i][1] = CrdCol1 - 1 + i;
                prohibitedArea[2][i][1] = CrdCol1 - 1 + i;
            }
        }
        if (CrdCol1 == CrdCol2) {
            for (int i = 0; i < cells + 2; ++i) {
                prohibitedArea[0][i][0] = CrdRow1 - 1 + i;
                prohibitedArea[1][i][0] = CrdRow1 - 1 + i;
                prohibitedArea[2][i][0] = CrdRow1 - 1 + i;
            }
            for (int i = 0; i < cells + 2; ++i) {
                prohibitedArea[0][i][1] = CrdCol1 - 1;
                prohibitedArea[1][i][1] = CrdCol1;
                prohibitedArea[2][i][1] = CrdCol1 + 1;
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < cells + 2; ++j) {
                for (int k = 0; k < 2; ++k) {
                    if (prohibitedArea[i][j][k] < 0) {
                        prohibitedArea[i][j][k] = 0;
                    }
                    if (prohibitedArea[i][j][k] >= LENGTH_AREA) {
                        prohibitedArea[i][j][k] = 9;
                    }
                }
            }
        }
    }

    private void setShipArea() {
        if (CrdRow1 == CrdRow2) {
            for (int i = 0; i < shipArea.length; ++i) {
                shipArea[i][0] = CrdRow1;
                shipArea[i][1] = CrdCol1 + i;
            }
        } else {    //so CrdCol1 == CrdCol2
            for (int i = 0; i < shipArea.length; ++i) {
                shipArea[i][0] = CrdRow1 + i;
                shipArea[i][1] = CrdCol1;
            }
        }
    }

    public Ship(int cells, String typeShip) {
        this.cells = cells;
        shipArea = new int[this.cells][2];
        prohibitedArea = new int[3][(this.cells + 2)][2];
        this.reset();
        this.typeShip = new String(typeShip);
    }

    // This method is to help for debug
    public void showCrd() {
        System.out.println("CrdRow1: " + CrdRow1);
        System.out.println("CrdRow2: "  + CrdRow2);
        System.out.println("CrdCol1: " + CrdCol1);
        System.out.println("CrdCol2: " + CrdCol2);
    }

    private void reset() {
        CrdRow1 = -1;
        CrdRow2 = -1;
        CrdCol1 = -1;
        CrdCol2 = -1;
        for (int i = 0; i < shipArea.length; ++i) {
            for (int j = 0; j < shipArea[i].length; ++j) {
                shipArea[i][j] = -1;
            }
        }
    }

    //Purpose of this method is to swap coordinates
    private void swapCrds() {
        int tmp;
        if (this.CrdRow1 > this.CrdRow2) {
            tmp = this.CrdRow1;
            this.CrdRow1 = this.CrdRow2;
            this.CrdRow2 = tmp;
        }
        if (this.CrdCol1 > this.CrdCol2) {
            tmp = this.CrdCol1;
            this.CrdCol1 = this.CrdCol2;
            this.CrdCol2 = tmp;
        }
    }

    public int[][] getShipArea() {
        int[][] temp = new int[cells][2];
        for (int i = 0; i < cells; ++i) {
            temp[i] = Arrays.copyOf(shipArea[i],shipArea[i].length);
        }
        return temp;
    }

    public int[][][] getProhibitedArea() {
        int[][][] temp = new int[3][(cells + 2)][2];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < cells + 2; ++j) {
                temp[i][j] = Arrays.copyOf(prohibitedArea[i][j], prohibitedArea[i][j].length);
            }
        }
        return temp;
    }

    public boolean getCrd(String first, String last) {
        int tmpRow1 = "ABCDEFGHIJ".indexOf(first.charAt(0));
        int tmpRow2 = "ABCDEFGHIJ".indexOf(last.charAt(0));
        String tmpFirst = first.substring(1);
        String tmpLast = last.substring(1);
        if (tmpRow1 != -1 || tmpRow2 != -1) {
            CrdRow1 = tmpRow1;
            CrdRow2 = tmpRow2;
            try {
                CrdCol1 = Integer.parseInt(tmpFirst) - 1;
                CrdCol2 = Integer.parseInt(tmpLast) - 1;
                if (CrdCol1 < 0 || CrdCol1 >= LENGTH_AREA || CrdCol2 < 0 || CrdCol2 >= LENGTH_AREA ) {
                    System.out.println("Error! Wrong ship location! Try again:");
                    this.reset();
                    return false;
                } else {
                    if (CrdRow1 == CrdRow2) {
                        if (Math.abs(CrdCol1 - CrdCol2) != cells - 1) {
                            System.out.println("\nError! Wrong length of the " + this.typeShip + "! Try again:");
                            this.reset();
                            return false;
                        } else {
                            swapCrds();
                            setShipArea();
                            setProhibitedArea();
                            return true;
                        }
                    } else if (CrdCol1 == CrdCol2) {
                        if (Math.abs(CrdRow1 - CrdRow2) != cells - 1) {
                            System.out.println("\nError! Wrong length of the " + this.typeShip + "! Try again:");
                            this.reset();
                            return false;
                        } else {
                            swapCrds();
                            setShipArea();
                            setProhibitedArea();
                            return true;
                        }
                    } else {
                        System.out.println("\nError! Wrong ship location! Try again:");
                        this.reset();
                        return false;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\nError! Wrong ship location! Try again:");
                this.reset();
                return false;
            }
        } else {
            System.out.println("\nError! Wrong ship location! Try again:");
            this.reset();
            return false;
        }
    }
}