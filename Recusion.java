class Recursion
{
public int fact(int a)
{
if (a>1)
return fact(a-1);
else
{
return 1;
}
}
public static void main (String args[])
{
Recursion recursion = new Recursion();
System.out.println(recursion.fact(5));;
}
}