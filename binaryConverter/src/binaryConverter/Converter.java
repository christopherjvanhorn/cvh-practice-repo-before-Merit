package binaryConverter;
/*
You need to make a program to convert integer numbers to their binary representation.
Create a Converter class with a static toBinary() method, 
which returns the binary version of its argument.
The code in main takes a number as input and calls the corresponding static method. 
Make sure the code works as expected. 
 */
import java.util.Scanner;

//your code goes here
public class Converter {
  public static String toBinary(int num) {
      String binary="";
      while(num > 0) {
          binary = (num%2)+binary;
          num /= 2;
      }
      return binary;
  }

}

public class Program {
  public static void main(String[ ] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      System.out.print(Converter.toBinary(x));
  }
}

//This worked in the online IDE I used and is giving an error. Just copying precourse work projects over at the moment