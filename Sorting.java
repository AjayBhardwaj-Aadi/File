class Sorting 
{
public static void main (String a [])
{
int[] array = {1,9,7,2,5};
int temp = 0;
for (int i = 0; i< array.length; i++)
{
for (int j=0;j<array.length;j++)
{
if (array[i]<array[j])
{
	temp = array[i];
a[j]=a[i];
a[i]=temp;

}
}
}
for(int i = 0; i<array.length; i++){
	System.out.println(""+array[i]);
}
}
}
