package fr.mds.conceptionobjet.gameoflife.launcher;

import fr.mdr.conceptionobjet.gameoflife.model.World;

public class Launcher {
	public static void main(String[] args) {

		World world = new World(25, 40);

		while (true) {
			System.out.println(world);
			world.newGeneration();

			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
