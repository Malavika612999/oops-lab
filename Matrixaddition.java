import java.util.Scanner;
public class Matrixaddition
{
 public static void main(String args[])
 {
 int col,row,i,j;
 Scanner reader=new Scanner(System.in);
 System.out.print("Enter the rows and columns of 2D array");
 row=reader.nextInt();
 col=reader.nextInt();
 int n[][]=new int[row][col];
 int n2[][]=new int[row][col];
 int matrix[][]=new int[row][col];
 System.out.print("Enter first array elements");
 for(i=0;i < row;i++)
 {
  for(j=0;j < col;j++)
  {
   n[i][j]=reader.nextInt();
  }
 }
 System.out.print("Enter second array elements");
 for(i=0;i < row;i++)
 {
  for(j=0;j < col;j++)
  {
   n2[i][j]=reader.nextInt();
  }
 }
 
 for(i=0;i < row;i++)
 {
  for(j=0;j < col;j++)
  {
   matrix[i][j]=n[i][j]+n2[i][j];  
  }
 }
 System.out.println("Sum of matrix is:");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
   System.out.print("     ");
   System.out.print(matrix[i][j]+" ");
					
  }
 System.out.println(" ");
 }
 }
}


  