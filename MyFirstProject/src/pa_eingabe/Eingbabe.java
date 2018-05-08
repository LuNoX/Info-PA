package pa_eingabe;

import java.util.Scanner;

public class Eingbabe
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Geben sie einen Namen ein.");
		String x = input.nextLine();
		System.out.println("Ihr eingegebener Name ist: " + x);
		input.close();
	}

}
