	  package packageTp10;
	  import java.util.Random;
	
	  public class ClassTp10 {
	  /*
	   * Représente les informations des bateaux. identifiant | taille | nombre
	   * par joueur.
	   */
	  private final static int[][] NAVIRES = new int[][] {
		    { 1, 1, 1 },
		    { 2, 3, 2 },
		    { 3, 4, 2 },
		    { 4, 6, 1 }
	  };
	  private final static int IDENTIFIANT = 0;
	  private final static int TAILLE = 1;
	  private final static int NOMBRE = 2;
	  private final static int MAP_X = 15;
	  private final static int MAP_Y = 15;
	  private final static int JOUEURS = 10;
	  
//	  Couleurs et Backgrounds
	  public static final String ANSI_RESET = "\u001B[0m";
	  public static final String ANSI_BLACK = "\u001B[30m";
	  public static final String ANSI_RED = "\u001B[31m";
	  public static final String ANSI_GREEN = "\u001B[32m";
	  public static final String ANSI_YELLOW = "\u001B[33m";
	  public static final String ANSI_BLUE = "\u001B[34m";
	  public static final String ANSI_PURPLE = "\u001B[35m";
	  public static final String ANSI_CYAN = "\u001B[36m";
	  public static final String ANSI_WHITE = "\u001B[37m";
	  
	  public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	  public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	  public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	  public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	  public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	  public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	  public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	  public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	  
	  public static int Party[][][] = new int[JOUEURS][MAP_X][MAP_Y];
	  
	  public static void main(String[] args) {
		//Démmarrage du programme
		placeToutBateau();
		//Affiche Les Maps
		for (int k = 0; k < JOUEURS; k++) {
			for(int i=0; i< MAP_X; i++) {
				for (int j = 0; j < MAP_Y; j++) {
					System.out.print(ANSI_BLUE_BACKGROUND +" "+ ANSI_WHITE + " " + 0 + " " +  ANSI_RESET);
				}
				System.out.println();
				
			}
			System.out.println();
			System.out.println();
			
		}
		
		boolean notOver = true;
		int gamersLeft = JOUEURS;
		while(notOver == true) {
			//La partie se termine quand il ne reste qu'un joueur
			for(int i = 0; i < JOUEURS;i++) {
				if(estVivant(i) == false) {
					gamersLeft--;
				}
				if(gamersLeft==1) {
					for(int l = 0; l < JOUEURS;l++) {
						if(estVivant(l)) {
							System.out.println("Le joueur " + l + " l'emporte félicitation");
							afficheCartePlacement(l);
						}
					}
					notOver = false;
				}
				
				int prochaineCible = trouveCible(i);
				System.out.println("cible trouvée" + prochaineCible);
				tire(prochaineCible);
				afficheCartePlacement(prochaineCible);
			}
			
			
		}
		

		
	  }
	  
	  
	  
	  
	  
	  /*
	   * Indique si le joueur à l'indice joueur est encore considéré comme vivant.
	   * @param joueur indice du joueur dans le tableau de jeu.
	   * @return
	   */
	   public static boolean estVivant(int joueur) {
	   		boolean estVivant = false;
			for(int i=0; i< MAP_X; i++) {
				for (int j = 0; j < MAP_Y; j++) {
					if(Party[joueur][i][j] == 5) {
						estVivant = true;
					}
				}
			}
			return estVivant;
	   }
	   
	  /**
	   * Place tous les bateaux pour tous les joueurs.
	   */
	  public static void placeToutBateau() {
		   for(int i = 0; i< JOUEURS;i++) {
			   for(int j = 0; j < (NAVIRES.length);j++) {
				   placeBateau(i,NAVIRES[j]);
			   }
		   }
	   }
	  
	  /**
	   * Place un bateau pour un joueur.
	   * @param joueur l'indice du joueur dans le tableau.
	   * @param navire le tableau représentant le type de bateau à placer.
	   */
	  public static void placeBateau(int joueur, int[] navire) {
		  	int nbrNavires = navire[NOMBRE];
		   System.out.println("joueur: " + joueur);
		   System.out.println("id navire: " + navire[IDENTIFIANT]);
		   System.out.println("Longueure navire: " + navire[TAILLE]);
		   System.out.println("nombre navire: " + navire[NOMBRE]);
   		   
   		   System.out.println();
   		   
   		   for (int i = 0; i < navire[NOMBRE]; i++) {
   			   while(nbrNavires > 0) {
	   				Random randomno = new Random();
	   				boolean isVerticale = randomno.nextBoolean();
	   				int PositionX = (int) (Math.random()*MAP_X);
	   				int PositionY = (int) (Math.random()*MAP_Y);
	   				System.out.println(estPlacable(joueur, navire, PositionX, PositionY, isVerticale));
    			   if(estPlacable(joueur, navire, PositionX, PositionY, isVerticale)) {
    				   placeBateauDansCarte(joueur, navire, PositionX, PositionY, isVerticale);
    				   nbrNavires--;
    			   }
    		   }
   		   }
	   }
	  
	  /**
	   * Indique si un bateau peut être placé aux coordonnées x, y dans une direction donnée, pour un joueur donné
	   * @param joueur l'indice du joueur dans le tableau
	   * @param navire le tableau représentant le type de navire
	   * @param x coordonnée X
	   * @param y coordonnée Y
	   * @param direction verticale ou horizontale
	   * @return
	   */
	  public static boolean estPlacable(int joueur, int[] navire, int PositionX, int PositionY, boolean isVerticale) {
		  	boolean estPlacable = true;
			for (int i = 0; i < navire[TAILLE]; i++) {
				if(isVerticale) {
					if(navire[TAILLE] > (MAP_X - PositionX) || Party[joueur][PositionX+i][PositionY ] != 0) {
						estPlacable = false;
					}
				}
				else {
					if(navire[TAILLE] > (MAP_Y - PositionY) || Party[joueur][PositionX][PositionY +i] != 0) {
						estPlacable = false;
					}
				}
			}
			return estPlacable;
	   }
	  
	  /**
	   * Place réellement le bateau sur la carte du joueur.
	   * @param joueur l'indice du joueur dans le tableau
	   * @param navire le tableau représentant le type de navire
	   * @param x coordonnée X
	   * @param y coordonnée Y
	   * @param direction verticale ou horizontale
	   */
	  public static void placeBateauDansCarte(int joueur, int[] navire, int PositionX, int PositionY, boolean isVerticale) {
		   for (int i = 0; i < navire[TAILLE]; i++) {
			   if (isVerticale) {
				   Party[joueur][PositionX+i][PositionY] = 5;
			   }
			   else {
				   Party[joueur][PositionX][PositionY+i] = 5;
			   }
		   }
	   }
	  
	  /**
	   * Affiche la carte d'un joueur.
	   * @param joueur l'indice du joueur dans le tableau.
	   */
	  public static void afficheCartePlacement(int joueur) {
				for(int i=0; i< MAP_X; i++) {
					for (int j = 0; j < MAP_Y; j++) {
						if(Party[joueur][i][j] == 0) {
							System.out.print(ANSI_BLUE_BACKGROUND + ANSI_WHITE +  0 +   ANSI_RESET);
						}
						if(Party[joueur][i][j] == 7) {
							System.out.print(ANSI_BLACK_BACKGROUND + ANSI_RED +  7 +  ANSI_RESET);
						}
						if(Party[joueur][i][j] == 5) {
							System.out.print(ANSI_BLACK_BACKGROUND + ANSI_YELLOW + 5 + ANSI_RESET);
						}
						if(Party[joueur][i][j] == 9) {
							System.out.print(ANSI_BLUE_BACKGROUND +ANSI_RED +  9 +  ANSI_RESET);
						}
						
						
					}
					System.out.println();
				}
				System.out.println();
				System.out.println();
	   }
	  
	  /**
	   * Trouve la prochaine cible en vie.
	   * @param attaquant l'indice de l'attaquant.
	   * @return l'adversaire suivant.
	   */
	  private static int trouveCible(int attaquant) {
		  boolean trouve = false;
		  int Cible = 0;
		  while(trouve == false) {
			  Cible = (int)((Math.random()* (JOUEURS-0))+ 0);
			  
			  if(estVivant(Cible)&& Cible!=attaquant) {
				  System.out.println("Cible: " + Cible);
				  trouve = true;
			  }
		  }
		   return Cible;
	   }
	  
	  /**
	   * Tire sur le joueur ciblé
	   * @param joueurCible indice du joueur ciblé
	   */
	  public static void tire(int joueurCible) {
		  boolean tireValide = false;
		  while(tireValide != true) {
			  int TireX = (int) (Math.random()*MAP_X);
			  int TireY = (int) (Math.random()*MAP_Y);
			  if(Party[joueurCible][TireX][TireY] == 0 ) {
				  Party[joueurCible][TireX][TireY] = 9;
				  tireValide = true;
			  }
			  else if(Party[joueurCible][TireX][TireY] == 5 ) {
				  Party[joueurCible][TireX][TireY] = 7;
				  tireValide = true;
			  }
		  }
	   }
}		


