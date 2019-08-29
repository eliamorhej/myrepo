/*purpose: first algortihm that we are going to make in part 3 of lab 02
of course intro to computer science 1.
programmer: elia morhej
*/
import java.util.Scanner;
public class Algorithm1
{
 public static double CtoFFormula(double value)
	{
		/*this method takes the inputted C value and
		converts it to F using the conventional forumla*/
		return( value * 9/5 ) + 32;
	}


	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double value;
		System.out.print("Enter a value in Celsius: \n");
		value = keyboard.nextDouble(); //user's input put into var value

		System.out.println( value + " is " + (CtoFFormula(value)) + " in Fahrenheit. \n");

    }

}
