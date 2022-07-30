import java.util.Scanner;
class HelloWorld 
{
    public static void main(String args[])
 {         
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int enterNumber = 1;
        while(enterNumber >=1 && enterNumber<10)
  {
            System.out.println("USER PLEASE INPUT  YOUR NUMBER :-) ");
            enterNumber = scanner.nextInt();
            for(int j =0;j<i;j++)
       {
            System.out.println("HI :-D Bruhh!!");
            }
            i++;
        }
        System.out.println(" Loop end :-[ ");
    }
}