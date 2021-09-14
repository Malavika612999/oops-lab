import java.util.Scanner;
public class Numbername
{
 public static void main(String args[])
 {
  System.out.println("enter a number:");
  Scanner reader=new Scanner(System.in);
  int n=reader.nextInt();
  switch(n)
  {
  case 1:
  System.out.println("number name of " +n+ " is one");
  break;
  case 2:
  System.out.println("number name of " +n+ " is two");
  break;
  case 3:
  System.out.println("number name of " +n+ " is three");
  break;
  case 4:
  System.out.println("number name of " +n+ " is four");
  break;
  case 5:
  System.out.println("number name of " +n+ " is five");
  break;
  case 6:
  System.out.println("number name of " +n+ " is six");
  break;
  case 7:
  System.out.println("number name of " +n+ " is seven");
  break;
  case 8:
  System.out.println("number name of " +n+ " is eight");
  break;
  case 9:
  System.out.println("number name of " +n+ " is nine");
  break; 
  }
 }
}
