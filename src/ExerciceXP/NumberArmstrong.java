/**
 * @author N'ZO LAGOU
 * 
 * Exercice 4 : Les Nombres D'Armstrong
Instructions
Écrivez un programme pour imprimer tous les nombres d'Armstrong entre 1 et 500. Si la somme des cubes de chaque chiffre du nombre est égale au nombre lui-même, alors le nombre est appelé un nombre d'Armstrong.

Par exemple,153 = ( 1 _ 1 _ 1 ) + ( 5 _ 5 _ 5 ) + ( 3 _ 3 _ 3 )


 */

package ExerciceXP;

public class NumberArmstrong {
	 public static void affiche() {
	        for (int i = 1; i <= 500; i++) {
	            //Conversion en chaine pour pouvoir parcourir
	            String valleurDuString = String.valueOf(i);
	            //On parcours chaque caractère et on converti en entier
	            //pour ensuite l'élever au cube, puis on fait la somme des cubes.
	            int total = 0;
	            for (int j = 0; j < valleurDuString.length(); j++) {
	                total += Math.pow(Integer.parseInt(valleurDuString.charAt(j) + ""), 3);
	            }

	            //Si le total est égal au nombe initia alors on affiche le nombre
	            if (total == i) System.out.println(i);
	        }
	    }

}

