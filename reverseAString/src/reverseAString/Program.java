package reverseAString;
/*
 Write a program to take a string as input and output its reverse.
The given code takes a string as input and converts it into a char array, 
which contains letters of the string as its elements. 
 */
import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		String rev = "";
          for (char i: arr)
           rev = i + rev;  
       System.out.println(rev);

	}
}