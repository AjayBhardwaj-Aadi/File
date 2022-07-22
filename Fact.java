class Fact
{
public static void main (String args[])
{
int fact=1, i;
int number = 9;
for (i=1;i<=number;i++)
{
fact=fact*i;
}
System.out.println("Factorial of" +number+ "is" +fact);
}
}
