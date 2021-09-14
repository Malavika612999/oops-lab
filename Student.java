import java.util.Scanner;
public class Student
{
 public static void main(String args[])
 {
  String name;
  int rollno;
  char branch;
  float mark;
  char grade;
  Scanner console=new Scanner(System.in);
  System.out.print("Enter the name: ");
  name=console.nextLine();
  System.out.print("Enter rollno: ");
  rollno=console.nextInt();
  System.out.print("Enter branch: ");
  branch=console.next().charAt(0);
  System.out.print("Enter mark: ");
  mark=console.nextFloat();
  System.out.print("Enter grade: ");
  grade=console.next().charAt(0);
  System.out.println(" Name "+name+ "\n rollno "+rollno+"\n branch "+branch+"\n mark "+mark+" \n grade "+grade);
 }
}