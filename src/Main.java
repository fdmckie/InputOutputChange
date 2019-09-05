import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2;

        System.out.print( "First number? " );
        num1 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print( "Second number? " );
        num2 = keyboard.nextDouble();
        keyboard.nextLine();


//        num3 = (num1 + num)

        System.out.println("The average value is : " + ( num1 + num2 )/2);
    }
}
