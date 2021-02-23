package fr.mdr.conceptionobjet.gameoflife.model;

import java.util.Random;


public class World {

	private Cell[][] cells;

	public World(int nbColumns, int nbRows) {
		cells = new Cell[nbColumns][nbRows];

		Random random = new Random();

//		String pattern = "bob$2bo$3o!";

//		String pattern = "bob$bbo$ooo"; 

		String pattern = "bbbbbbbbbbbbbbbbbbbbbbbbobbbbbbbbbbb$bbbbbbbbbbbbbbbbbbbbbbobobbbbbbbbbbb$bbbbbbbbbbbboobbbbbboobbbbbbbbbbbboo$bbbbbbbbbbbobbbobbbboobbbbbbbbbbbboo$oobbbbbbbbobbbbbobbboobbbbbbbbbbbbbb$oobbbbbbbbobbboboobbbbobobbbbbbbbbbb$bbbbbbbbbbobbbbbobbbbbbbobbbbbbbbbbb$bbbbbbbbbbbobbbobbbbbbbbbbbbbbbbbbbb$bbbbbbbbbbbboobbbbbbbbbbbbbbbbbbbbbb";

		String[] linesPattern = pattern.split("\\$");
		String[][] readPattern = new String[9][36];

		int line = 0;
		int column = 0;
		for (String item : linesPattern) {
			System.out.println("line"+line+ ": " + item);
			for (String string : item.split("")) {
				readPattern[line][column] = string;
				column++;
				if (column == 36) {
					column = 0;
				}
			}
			line++;
		}

		for (String[] item : readPattern) {
			for (String string : item) {
				System.out.println("read:" + string);
			}
		}

		int x = 9;
		int y = 36;

		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				if (i < x && j < y) {
					if (readPattern[i][j].equals("o")) {
						System.out.println("o: " + readPattern[i][j]);
						cells[i][j] = new AliveCell();
					} else {
						System.out.println("b: " + readPattern[i][j]);
						cells[i][j] = new DeadCell();
					}
				} else {
					if (random.nextBoolean()) {
						cells[i][j] = new DeadCell();
					} else {
						cells[i][j] = new DeadCell();
					}
				}
			}
		}
	}

	public void newGeneration() {

		Cell[][] tempCells = new Cell[cells.length][cells[0].length];

		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				int nbNeighbourg = countNeighbourgs(i, j);
				Cell nextGenCell = cells[i][j].newGeneration(nbNeighbourg);
				tempCells[i][j] = nextGenCell;
			}
		}

		cells = tempCells;
	}

	public int countNeighbourgs(int x, int y) {

		int nbNeighbourg = 0;

		for (int u = -1; u <= 1; u++) {
			for (int v = -1; v <= 1; v++) {

				if (u == 0 && v == 0) {
					continue;// skip current iteration
				}

				int xNeighbourg = x + u;
				int yNeighbourg = y + v;

				if (xNeighbourg < 0 || yNeighbourg < 0) {
					continue;
				}

				if (xNeighbourg >= cells.length || yNeighbourg >= cells[0].length) {
					continue;
				}
//				System.out.println("[" + xNeighbourg + "," + yNeighbourg + "]");

				if (cells[xNeighbourg][yNeighbourg].isAlive()) {
					nbNeighbourg++;
				}
			}
		}
		return nbNeighbourg;
	}

	@Override
	public String toString() {
		String worldStr = "";

		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				worldStr += cells[i][j].getAString();
			}
			worldStr += "\n";
		}

		return worldStr;
	}

}
