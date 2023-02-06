/**
 * @author N'ZO LAGOU
 * 
 * Exercice 1 : Imprimer Des Étoiles
Instructions
Écrivez un programme en Java pour imprimer le modèle suivant


 */

package ExerciceXP;

public class PrintStars {

	public static void execute() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
