class Fibonacci
{
public void fact(int a, int b,int c)
{
for (int i=0;i<10;i++)
{
c=a+b;
b=a;
a=c;
System.out.println("value of c" +c);
}}
public static void main(String args[])
{
Fibonacci fibonacci = new Fibonacci();
fibonacci.fact(1,1,1);

}
}