/* Exercice 2
Écrivez un programme Java qui utilise les boucles pour produire la sortie suivante :

1
22
333
4444
55555
666666
7777777

*/



package ExerciceXP;

public class NumberTriangle {
	public static void exe() {
		for (int triangle1 = 1; triangle1 <= 7; triangle1++) {

			for (int triangle2 = 1; triangle2 <= triangle1; triangle2++) {

				System.out.print(triangle1);
			}

			// pour revenir a la ligne
			System.out.println();
		}
	}
}
