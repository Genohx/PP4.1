public class Die
{
    //instance variables
    private int sides;
    //constructors
    public Die()
    {
        sides = 0;
    }

    public Die(int newSides)
    {
        sides = newSides;
    }
    //getters
    public int getSides()
    {
        return sides;
    }
    //setters
    public void setSides(int newSides)
    {
        sides = newSides;
    }
    //brain methods
    public int roll()
    {
        int x = sides + 1;
        double random = Math.random();
        int rolled = (int)((x*random)-1)+1;
        return rolled;
    }
    //toString
    public String toString()
    {
        String output=sides+"";
        return output;
    }
}
