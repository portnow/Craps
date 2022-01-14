/**
 * Game of Craps
 *
 * @author Dhalia Portnow
 * @version 2022-01-11
 */
import java.util.Scanner;
public class Craps
{
    public static void instructions()
    {

        System.out.println("1. Roll two six-sided dice.");
        System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
        System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
        System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
        System.out.println("3. Keep rolling the dice again until:");
        System.out.println("4. a. You roll the point again and win!");
        System.out.println("4. b. or you roll a 7 and lose.");

    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        boolean playing = true;
        System.out.println("LET'S PLAY CRAPS!");
        System.out.println("Do you need instructions (Y/n)?");
        String response = in.nextLine();
        if(response.equals("") || response.substring(0,1).equalsIgnoreCase("y"))
        {
            instructions();
        }
        System.out.println();
        System.out.println("Good luck!");
        System.out.println();
        while(playing)
        {
            System.out.println("Press <Enter> to roll the dice...");
            String roll = in.nextLine();
            Die d1 = new Die();
            Die d2 = new Die();
            d1.rollDie();
            d2.rollDie();
            int point = d1.getRoll() + d2.getRoll();
            System.out.println("Your first roll is: " + (point));
            if (point == 7 || point == 11)
            {
                System.out.println("You WIN! You are glorious!");
                System.out.println("Would you like to play again(Y/n)?");
                response = in.nextLine();
                if(response.equals("") || response.substring(0,1).equalsIgnoreCase("y"))
                {
                    playing = true;
                }
                else 
                {
                    playing = false; 
                }
            }
            else if (point == 2 || point == 3 || point == 12)
            {
                System.out.println("You LOSE! Haha sucker.");
                System.out.println("Would you like to play again(Y/n)?");
                response = in.nextLine();
                if(response.equals("") || response.substring(0,1).equalsIgnoreCase("y"))
                {
                    playing = true;
                }
                else 
                {
                    playing = false; 
                }  
            }
        }
    }
}
