import java.util.Scanner;
class Areashape
{
void area(float x) 
{
System.out.println("Area of square is "+Math.pow(x,2)+" sq units");
}
void area(float x,float y)
{
System.out.println("Area of rectangle is "+x*y+" sq units");
}
void area(double x)
{
double z=3.14*x*x;
System.out.println("Area of circle is "+z+" sq units");
}
}
class Overload
{
public static void main(String[] args)
{
float s,l,b;
double r;
Scanner reader=new Scanner(System.in);
Areashape obj=new Areashape();
System.out.print("Enter side of the square ");
s=reader.nextFloat();
System.out.print("Enter length of rectangle ");
l=reader.nextFloat();
System.out.print("Enter breadth of rectangle ");
b=reader.nextFloat();
System.out.print("Enter radius of circle ");
r=reader.nextDouble();
obj.area(s);
obj.area(l,b);
obj.area(r);
}
}
