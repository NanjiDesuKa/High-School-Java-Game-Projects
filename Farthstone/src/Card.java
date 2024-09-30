public class Card
{
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int ability; //make abilities from 0-10. Make each type of  ability unique.
    private boolean canAttack;
    private static Card[] drawPile= new Card[28];
    private static Card[][] field = new Card[2][3];

    public Card() {
        name="Mindless Thrall";
        health=1;
        attack=1;
        defense=0;
        ability=0;
        canAttack=false;
    }
    public Card(Card c)
    {
        name=c.name;
        health=c.health;
        attack=c.attack;
        defense=c.defense;
        ability=c.ability;
        canAttack=false;
    }
    public Card(String n, int h, int a, int d, int ab)
    {
        name=n;
        health=h;
        attack=a;
        defense=d;
        ability=ab;
        canAttack=false;
    }

    public static Card getCard(int i)
    {
        return drawPile[i];
    }
    public String getName()
    {
        return name;
    }
    public int getAttack()
    {
        return attack;
    }
    public int getHealth()
    {
        return health;
    }
    public int getDefense()
    {
        return defense;
    }
    public int getAbility()
    {
        return ability;
    }
    public boolean getCanAttack()
    {
        return canAttack;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setHealth(int a)
    {
        health=a;
    }
    public void setAttack(int a)
    {
        attack=a;
    }
    public void setDefense(int a)
    {
        defense=a;
    }
    public void setAbility(int a)
    {
        ability=a;
    }
    public void setCanAttack(boolean boo)
    {
        canAttack = boo;
    }

    public static Card[] getPartField(int i)
    {
        return field[i];
    }
    public static void clearField()
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                field[i][j] = null;
            }
        }
    }

    public String toString()
    {
        String abi = "<br>";
        if(ability == 0)
        {
            abi += "None";
        }
        else if(ability == 1)
        {
            abi += "+1 defense";
        }
        else if(ability == 2)
        {
            abi += "+2 attack";
        }
        else if(ability == 3)
        {
            abi += "Randomize health";
        }
        else if(ability == 4)
        {
            abi += "+2 defense";
        }
        else if(ability == 5)
        {
            abi += "+6 attack";
        }
        else if(ability == 6)
        {
            abi += "Clears board";
        }
        else if(ability == 7)
        {
            abi += "Chance to deal 7 dmg to random enemy card";
        }
        else if(ability == 8)
        {
            abi += "Passive: trades hp for att";
        }
        else if(ability == 9)
        {
            abi += "Chance to summon Jarlgonir";
        }
        else if(ability == 10)
        {
            abi += "Randomize defense";
        }
        return name +"<br>Health: "+health+"<br>Attack: "+attack+"<br>Defense: "+defense+"<br>Ability: " + abi;
    }

    public static void initializeCard()
    {
        drawPile[0] = new Card();
        drawPile[1] = new Card("Novice Mage", 4, 2, 1, 3);
        drawPile[2] = new Card("Kamikaze Tank",1,0,0,6);
        drawPile[3] = new Card("Lord", 5,2,2,2);
        drawPile[4] = new Card ("Gondolf", 7, 4,2,5);
        drawPile[5] = new Card("Lonk", 5, 5, 5, 7);
        drawPile[6] = new Card("Shield Enthusiast", 1,1,15,1);
        drawPile[7] = new Card("World Destroyer Priest", 1, 0, 0, 9);
        drawPile[8] = new Card("Jarlgonir, the World Wyrm", 25, 10, 5, 8);
        drawPile[9] = new Card("PotionMaster", 5, 1, 1, 4);
        drawPile[10] = new Card ("Enemy Stand User", 3,3,0,3);
        drawPile[11] = new Card("Cocogoat",4,20,0,0);
        drawPile[12] = new Card("Broken Vessel",2,7,1,3);
        drawPile[13] = new Card("Elevator boy",1,1,1,0);
        drawPile[14] = new Card("Water taxi",15,0,3,10);
        drawPile[15] = new Card("Tone Deaf Bard",2,2,1,5);
        drawPile[16] = new Card("Inkling",3,2,3,1);
        drawPile[17] = new Card("WoomyTale",2,3,1,3);
        drawPile[18] = new Card("VeemoStory",4,1,0,3);
        drawPile[19] = new Card("Small Fry",1,1,0,0);
        drawPile[20] = new Card("Bourgeoisie",1,20,0,3);
        drawPile[21] = new Card("Proletariat",4,15,10,10);
        drawPile[22] = new Card("BarBar Jinks",4,1,3,0);
        drawPile[23] = new Card("Emergency Food",15,7,0,3);
        drawPile[24] = new Card("Charizard is a dragon!",15,15,0,2);
        drawPile[25] = new Card("Green Blob Boi", 10, 10, 2,2);
        drawPile[26] = new Card("Dadza", 15, 3, 3,4);
        drawPile[27] = new Card("Arson boy", 3, 12,0,7);
    }
}