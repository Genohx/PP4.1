import java.util.Scanner;

public class DieDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of sides on the die you would like to roll: ");
        int sides = keyboard.nextInt();
        Die die1 = new Die(sides);
        System.out.println("You rolled a: "+die1.roll());
    }
}
