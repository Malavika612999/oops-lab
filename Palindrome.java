import java.util.Scanner;
public class Palindrome
{
 public static void main(String args[])
 {
  System.out.println("enter a number:");
  Scanner reader=new Scanner(System.in);
  int n=reader.nextInt();
  int i,rev=0,temp;
  temp=n;
  while(n>0)
  {
  i=n%10;
  rev=rev*10 + i;
  n=n/10;
  }
  if(temp==rev)
  {
  System.out.println(+temp+ " is a palindrome");
  }
  else
  {
  System.out.println(+temp+ " is not a palindrome");
  }
 }
}
