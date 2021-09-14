import java.util.Scanner;
public class Transpose
{
 public static void main(String args[])
 {
 int col,row,i;
 int j;
 Scanner reader=new Scanner(System.in);
 System.out.print("Enter the rows and columns of matrix ");
 row=reader.nextInt();
 col=reader.nextInt();
 int n[][]=new int[row][col];
 int trans[][]=new int[row][col];
 System.out.print("Enter the elements");
 for(i=0;i < row;i++)
 {
  for(j=0;j < col;j++)
  {
   n[i][j]=reader.nextInt();
  }
 }
 if(row==col)
 {
 for(i=0;i < row;i++)
 {
  for(j=0;j < col;j++)
  {
   trans[i][j]=n[j][i];
  }
 }
 }
 else
 {
 System.out.print("Transpose does not exist");
 }
 System.out.print("Transpose of matrix is");
 for(i=0;i < row;i++)
 {
  for(j=0;j < col;j++)
  { 
   System.out.print("  ");
   System.out.print(trans[i][j] + "\t");
  }
  System.out.println(" ");
 }
 if(trans[i][j]==n[i][j])
 {
 System.out.print("matrix is symmetric"); 
 }
 else
 {
 System.out.print("matrix is not symmetric"); 
 }
 }
}