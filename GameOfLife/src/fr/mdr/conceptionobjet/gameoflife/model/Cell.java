package fr.mdr.conceptionobjet.gameoflife.model;

public interface Cell {
	Cell newGeneration(int nbNeighbours);
	String getAString();
	boolean isAlive();
}
