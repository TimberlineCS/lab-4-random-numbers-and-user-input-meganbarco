/*
Megan Barco
P.2
9/15/2020
*/
import java.io.*;
import java.util.*;

public class RandomAndUserInput{
  public static void main(String args[]){
    //code challenge 1 (random numbers)
    Scanner rand = new Scanner(System.in);
    System.out.println("Type a negative number: ");
    int negNum = rand.nextInt();
    System.out.println("Type a postive number that is greater than the absolute value of your negative number: ");
    int posNum = rand.nextInt();

    double randNumRange1 = (Math.floor(Math.random() * posNum + negNum)); 
    double randNumRange2 = (Math.floor(Math.random() * posNum + negNum));

    System.out.println("Your numbers are :" + randNumRange1 + " and " + randNumRange2);
    //code challenge 2 (madlibs)
    Scanner madlib = new Scanner(System.in);
    System.out.println("Type a princess' name: ");
    String noun1 = madlib.next();
    System.out.println("Type an adverb: ");
    String noun2 = madlib.next();
    System.out.println("Type a name: ");
    String noun3 = madlib.next();
    System.out.println("Type a number: ");
    int number1 = madlib.nextInt();
    System.out.println("Type a number with a decimal: ");
    double number2 = madlib.nextDouble();
    System.out.println("Type a number: ");
    int number3 = madlib.nextInt();
    System.out.println("Type a number: ");
    int number4 = madlib.nextInt();

    System.out.println("Once upon a time there was a princess named " +  noun1 + " who lived with her " + number1 + " siblings. She taught her little siblings in their house, at their " + noun2 + " house. Her little sibling, " + noun3 + ", said that the value of pi was " + number2 + ". Then " + noun1 + " went through addition with them, she said " + number3 + " + " + number4 + " = " + (number3 + number4) + ".");
  }
}