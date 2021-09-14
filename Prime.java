import java.util.Scanner;
public class Prime
{
 public static void main(String args[])
 {
  System.out.println("enter the limit:");
  Scanner reader=new Scanner(System.in);
  int n=reader.nextInt();
  int i,j,k;
  System.out.println("Prime numbers are:");
  for(i=2;i<=n;i++)
  {
   k=0;
   for(j=1;j<=i;j++)
   {
    if(i%j==0)
    {
     k++;
    }
   }
   if(k==2)
   {
    System.out.println(i+"");
   }
  }
 }
}

  