/* this program will decide if an inputted number is even or odd
programmer: Elia Morhej */

import java.util.Scanner;
public class Algorithm2
{
	public static int getint() //gets value from user
	{
		Scanner keyboard = new Scanner(System.in);

		int value;
		System.out.println("Enter a integer: ");
		value = keyboard.nextInt();

		return value;

	}

	public static String evenorodd(int value) 
	{
		/*decides if it is even or odd then returns the result as a string
		there is just minimal safeproofing with an error code if the user inputs 0,
		as / by 0 is impossible.
		*/
		if ( value%2 == 0 && value != 0 )
			return "The number you entered is even. \n";
		else if (value != 0)
			return "The number you entered is odd \n";
		else
			return "error. 0 is not an acceptable input \n";

	}

	public static void main(String[] args)
	{
		int value;
		value = getint();

		System.out.println( evenorodd(value) ); //prints the result from the evenorodd method.


	}

}
