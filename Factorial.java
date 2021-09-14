import java.util.Scanner;
public class Factorial
{
 public static void main(String args[])
 {
  System.out.println("enter a number:");
  Scanner reader=new Scanner(System.in);
  int n=reader.nextInt();
  int i,fact=1;
  for(i=1;i<=n;i++)
  {
  fact=fact*i;
  }
  System.out.println("factorial of " +n+ " is "+fact);
 }
}

  