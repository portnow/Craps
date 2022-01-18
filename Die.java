
/**
 * A dice for the game.
 *
 * @author Dhalia Portnow
 * @version 2021-01-11
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        roll = rollDie();
    }

    /**
     * The rollDie method rolls a die.
     * @return    the value of the roll
     */
    public int rollDie()
    {
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
    
    /**
     * The getRoll() method views the die value.
     * @return    the value of the roll
     */
    public int getRoll()
    {
        return roll;
    }
}
