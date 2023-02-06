package ExerciceXP;

import java.util.Scanner;

public class ChiffreInverse {
	
	public static void executer() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Entrez un nombre entier svp");
			String input = sc.nextLine();

			StringBuilder reverse = new StringBuilder();
			for (int i = input.length() - 1; i >= 0; i--) {
			    reverse.append(input.charAt(i));
			}

			System.out.println("The reverse is " + reverse);
		}
    }

}
