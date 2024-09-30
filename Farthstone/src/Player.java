import java.util.ArrayList;

public class Player
{
    private ArrayList<Card> deck = new ArrayList<Card>();
    private String name;

    public Player(String n)
    {
        name = n;
        resetDeck();
    }

    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public ArrayList<Card> getDeck()
    {
        return deck;
    }
    public void resetDeck()
    {
        deck.clear();
        for (int i = 0; i < 12; i++)
        {
            deck.add(new Card(Card.getCard((int)(Math.random()* 28))));
        }
    }
}
