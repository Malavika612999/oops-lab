import java.util.Scanner;
public class Oddeven
{
 public static void main(String args[])
 {
  System.out.println("enter a number:");
  Scanner reader=new Scanner(System.in);
  int n=reader.nextInt();
  if(n%2==0)
  {
  System.out.println("number" +n+ "is even");
  }
  else
  {
  System.out.println("number" +n+ "is odd");
  }
 }
}

  