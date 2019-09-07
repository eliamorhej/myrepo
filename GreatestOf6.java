
import java.util.Scanner;

public class GreatestOf6
{

    public static void main(String[] args)
    {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter 6 different integers: \n");
		int a, b, c, d, e, f;
		a = kb.nextInt();
		b = kb.nextInt();
		c = kb.nextInt();
		d = kb.nextInt();
		e = kb.nextInt();
		f = kb.nextInt();

       if((a > b) && (a > c) && (a > d) && (a > e) && (a > f))
       System.out.println(a + " Is the greatest of the 6 inputted values");
       else if(b > a && b > c && b > d && b > e && b > f)
       System.out.println(b + " Is the greatest of the 6 inputted values");
       else if(c > a && c > b && c > d && c > e && c > f)
       System.out.println(c + " Is the greatest of the 6 inputted values");
       else if(d > a && d > b && d > c && d > e && b > f)
       System.out.println(d + " Is the greatest of the 6 inputted values");
       else if(e > a && e > b && e > c && e > d && e > f)
       System.out.println(e + " Is the greatest of the 6 inputted values");
       else if(f > a && f > b && f > c && f > d && f > e)
       System.out.println(f + " Is the greatest of the 6 inputted values");



	}

}