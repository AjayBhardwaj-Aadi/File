class Methodoverloading
{
public void area (int a , int b)
{
System.out.println("Area of Rectangle" + (a*b));
}
public void area (int b)
{
System.out.println("Area of Square" +(b*b)); 
}
public void area(float q ,float p)
{
System.out.println("Area of Rhombus"+ (p*q)/2);
}
public static void main (String args []) 
{
Methodoverloading obj= new Methodoverloading ();
obj.area(1);
obj.area(1,2);
obj.area(23.0f,3.0f);
}
}