import java.util.Scanner;
public class Positive
{
 public static void main(String args[])
 {
  System.out.println("enter a number:");
  Scanner reader=new Scanner(System.in);
  int n=reader.nextInt();
  String a=(n>0)?"POSITIVE":"NEGATIVE";
  System.out.println("number  " +n+ " is a "+a+" number");
 }
}

  