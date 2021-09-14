import java.util.Scanner;
public class Largest
{
 public static void main(String args[])
 {
  Scanner reader=new Scanner(System.in);
  System.out.println("Enter first number:");
  int a=reader.nextInt();
  System.out.println("Enter second number:");
  int b=reader.nextInt();
  System.out.println("Enter third number:");
  int c=reader.nextInt();
  if(a>b && a>c)
  {
  System.out.println(+a+ " is larger");
  }
  else if(b>c)
  {
  System.out.println(+b+ " is larger");
  }
  else
  {
  System.out.println(+c+ " is larger");
  }
 }
}

  