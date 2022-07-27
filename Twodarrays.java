class Twodarrays
{
public static void main (String args[])
{
int twoD [][] = new int [2][2];
for (int i=0 ; i<twoD.length;i++)
{
for(int j=0;j<twoD.length;j++)
{
twoD [i][j]=i+j;
}
}
for(int i=0;i<twoD.length;i++)
{
for(int j=0;j<twoD.length;j++)
{
System.out.print(twoD [i][j] + " ");
}
System.out.println(" ");
}
}
}