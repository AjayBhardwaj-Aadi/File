class Pattern
{
public static void main(String args[])
{
int i,j,row=5;
for(i=0;i<=5;i++)
{
for (j=0;j<=i;j++)
{
System.out.print("x" + " ");
}
System.out.print("\n");
}
for(i=5;i>=0;i--)
{
for(j=0;j<=i-1;j++)
{
System.out.print("x" + " ");
}
System.out.print("\n");
}
}
}