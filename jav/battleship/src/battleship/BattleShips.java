package battleship;


import java.util.*;

public class BattleShips {
	//TORPEDOES
	public static int numOfTorpedoes = 15;
	//BOUNDARIES
    public static int numRows = 8;
    public static int numCols = 8;
    // ARRAYS
    public static String [][] grid = new String [numRows][numCols];
    public static String [][] systemShip = new String [numRows][numCols];
    public static String [][] prevHit =  new String[numRows][numCols];
    public static String [][] prevMiss =  new String[numRows][numCols];
    public static void main(String[] args){
        playGame(systemShip,grid,prevHit,prevMiss);
    }
    public static void printASCII() {
    	System.out.println(" _           _   _   _           _     _       \n"
    			+ "| |         | | | | | |         | |   (_)      \n"
    			+ "| |__   __ _| |_| |_| | ___  ___| |__  _ _ __  \n"
    			+ "| '_ \\ / _` | __| __| |/ _ \\/ __| '_ \\| | '_ \\ \n"
    			+ "| |_) | (_| | |_| |_| |  __/\\__ \\ | | | | |_) |\n"
    			+ "|_.__/ \\__,_|\\__|\\__|_|\\___||___/_| |_|_| .__/ \n"
    			+ "                                        | |    \n"
    			+ "                                        |_|    ");
    }
    public static void fillGrid(String[][] array) {
    	for (int i = 0; i < grid.length; i++) {
    	    for (int j = 0; j < grid[i].length; j++) {
    	        grid[i][j] = " . ";
    	    }
    	}
    	printGrid(grid);
    }

    public static void playGame(String[][] systemShip,String[][] grid,String [][] prevHit,String [][] prevMiss) {
    	printASCII();
    	fillGrid(grid);
    	placeShip(systemShip);
    	@SuppressWarnings("resource")
		Scanner fire = new Scanner(System.in);
    	for(int i = 0; i < numOfTorpedoes; i++ ) {
    	System.out.println(numOfTorpedoes - i + " torpedoes remaining.");
    	System.out.println("Enter row number: ");
    	int rowe  = fire.nextInt();
    	int row = rowe- 1;
    	if(row > 8 || row < 0 ) {
    		System.out.println("Invalid row. The are only 8");
    	}
    	System.out.println("Enter column number: ");
    	int cole  = fire.nextInt();
    	int col = cole - 1;
    	String shipval  = systemShip[row][col];
    	if(shipval == prevHit[row][col]) {
    		System.out.println("You have already hit the ship at that location, try again!");
    		numOfTorpedoes++;
    		printGrid(grid);
    		continue;
    	} else if (shipval == prevMiss[row][col]) {
    		System.out.println("You have already missed the ship at that location, try again!");
    		numOfTorpedoes++;
    		printGrid(grid);
    		continue;
    	} else if(shipval == " O ") {
    		System.out.println("HIT");
    		grid[row][col] = " X "; 
    		prevHit[row][col] = " X ";
    		printGrid(grid);
    	} else {
    		System.out.println("MISS");
    		prevMiss[row][col] = " . ";
    		printGrid(grid);
    	} 
      }
    	System.out.println("All of you torpedoes have been used. Game has ended. The ship was here...");
		printGrid(systemShip);

    }
    public static void placeShip(String[][] systemShip) {  
        for (int row = 0; row < systemShip.length; row++) {
            for (int col = 0; col < systemShip[0].length; col++) {
            	systemShip[row][col] = " . ";
            }
        }
        Random rand = new Random();
        int shipRowLocation = rand.nextInt(8);
        int shipColumnLocation = rand.nextInt(8);
        int shipDirection = rand.nextInt(2) + 1; 
        if (shipDirection == 1) {
            for (int i = 0; i < 4; i++) {
                if (shipRowLocation >= 4) {
                	systemShip[shipRowLocation - i][shipColumnLocation] = " O ";
                } else {
                	systemShip[shipRowLocation + i][shipColumnLocation] = " O ";
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                if (shipColumnLocation >= 4) {
                	systemShip[shipRowLocation][shipColumnLocation - i] =" O ";
                } else {
                	systemShip[shipRowLocation][shipColumnLocation + i] = " O ";
                }
            }
        }
       // printGrid(systemShip);
    }
    
    public static void printGrid(String[][] array) {
    	for(int i = 0; i<numRows; i++)
    	{
    	    for(int j = 0; j<numCols; j++)
    	    {
    	        System.out.print(array[i][j]);
    	    }
    	    System.out.println();
    	}
    }
}