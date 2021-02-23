package fr.mds.javaCourse.opdemo_2.launcher;

import java.util.Date;

import fr.mds.javaCourse.opdemo_2.model.Media;


public class Launcher {
	public static void main(String[] args) {		
		Media media1 = new Media("Lotr", new Date(2001,12,01));
		System.out.println(media1);
	}
}
