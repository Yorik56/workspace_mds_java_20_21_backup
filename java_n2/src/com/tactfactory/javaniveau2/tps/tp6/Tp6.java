package com.tactfactory.javaniveau2.tps.tp6;


import com.tactfactory.javaniveau2.tps.tp6.entities.User;
import com.tactfactory.javaniveau2.tps.tp6.views.Tp6View;

/**
*
* @author tactfactory
*
*  - Créer un programme qui permet d'ajouter et de supprimer des utilisateurs dans une liste d'utilisateur avec Swing.
*    - 1 : Ajouter l'utilisateur représenté par les JTextField nom et prénom en cliquant sur le bouton Ajouter
*    - 2 : Sur la sélection d'un élément dans la liste d'utilisateur remplir les JTextField nom et prénom avec les
*       informations de l'utilisateur
*    - 3 : Sur le clique du bouton Supprimer supprimer de la liste d'utilisateur l'utilisateur représenté par les
*       JTextField nom et prénom
*/
public class Tp6 {

  public static void main(String[] args) {
	  Tp6View view = new Tp6View();
	  view.show();
  }

}
