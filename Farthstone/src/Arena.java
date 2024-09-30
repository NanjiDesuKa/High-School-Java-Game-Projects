import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Arena implements ActionListener
{
    static JFrame arenaFrame = new JFrame();
    JButton setting = new JButton("Setting");
    private static JLabel name1 = new JLabel("(ONE): " + Launch.one.getName());
    private static JLabel name2 = new JLabel("(TWO): " + Launch.two.getName());
    private static JLabel turn = new JLabel("Player one");
    private JList<String> deck = new JList<>();
    private DefaultListModel deckModel = new DefaultListModel();
    JScrollPane scrollPane = new JScrollPane(deck);
    private JLabel cardStat = new JLabel();
    JButton summon = new JButton("Summon");
    JButton end = new JButton("End turn");
    JButton attack = new JButton("Attack");
    JButton restart = new JButton("Restart");
    JButton exit = new JButton("Exit");
    private JLabel gameStat = new JLabel("<html><center>Welcome to Farthstone.<br>This game is a literal mix of random things if you haven't already noticed.<br>It is player one's turn now.</html>");
    private JButton[][] field = new JButton[2][3];
    private static Music music = new Music();//gui//gui things
    private int round = 1;
    private static boolean arenaClose = true;
    private static boolean gameOver = false;
    private int oneCard = -1;
    private int twoCard = -1;
    private String s1 = "";
    private String s2 = "";
    private int cardSelected = -1;
    private int dragHealth = 28;
    private int dragAttack = 10;//basic java

    Arena() throws IOException
    {
        arenaFrame.setDefaultCloseOperation(arenaFrame.DISPOSE_ON_CLOSE);
        arenaFrame.setSize(1200,700);
        arenaFrame.setLayout(null);
        arenaFrame.setLocationRelativeTo(null);
        arenaFrame.setResizable(false);
        arenaFrame.getContentPane().setBackground(Color.black);
        Card.clearField();
        arenaFrame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {
                super.windowOpened(e);
                music.setFile("src/musics/Always with me - OST.wav");
                music.play();
                gameOver = false;
                setArenaClose(false);
            }
            public void windowClosed(WindowEvent e)
            {
                music.stop();
                super.windowClosed(e);
                setArenaClose(true);
                try
                {
                    if(GetName.getNameClose())
                    {
                        if(Launch.getLaunchClose())
                        {
                            Launch launch = new Launch();
                        }
                        else
                        {
                            Music launchMusic = new Music();
                            launchMusic.setFile("src/musics/Coffin Dance.wav");
                            launchMusic.play();
                            Launch.startButton.setText("Start");
                        }
                    }
                    else
                    {
                        Music waitMusic = new Music();
                        waitMusic.setFile("src/musics/Baby Shark (Trap Remix).wav");
                        waitMusic.setVolume(5);
                        waitMusic.play();
                    }
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }
        });//arena frame and music thing

        name1.setBounds(235,-25,750,100);
        name1.setFont(new Font("Segoe Print", Font.BOLD,25));
        name1.setHorizontalAlignment(JLabel.CENTER);
        name1.setForeground(Color.cyan);
        arenaFrame.add(name1);
        name2.setBounds(235,585,750,100);
        name2.setFont(new Font("Segoe Print", Font.BOLD,25));
        name2.setForeground(Color.cyan);
        name2.setHorizontalAlignment(JLabel.CENTER);
        arenaFrame.add(name2);//p1, p2 name

        turn.setBounds(20,-10,200,100);
        turn.setFont(new Font("Ink Free", Font.BOLD,25));
        turn.setForeground(Color.cyan);
        turn.setHorizontalAlignment(JLabel.CENTER);
        arenaFrame.add(turn);//shows whose deck/turn

        refreshP1();
        scrollPane.setBounds(20,75,200,200);
        scrollPane.getVerticalScrollBar().setBackground(Color.darkGray);
        scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI()
        {
            @Override
            protected void configureScrollBarColors() { this.thumbColor = Color.lightGray; }
        });
        deck.setBackground(Color.BLACK);
        deck.setForeground(Color.white);
        deck.setFont(new Font("Gabriola",Font.PLAIN,18));
        arenaFrame.add(scrollPane);
        deck.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                if(deck.getSelectedIndex() != -1) cardSelected = deck.getSelectedIndex();;
                if (round%2==1)
                {
                    if(cardSelected > -1&& cardSelected < Launch.one.getDeck().size()) cardStat.setText("<html><center>"+Launch.one.getDeck().get(cardSelected)+"</html>");
                }
                else
                {
                    if(cardSelected> -1 && cardSelected < Launch.two.getDeck().size()) cardStat.setText("<html><center>"+Launch.two.getDeck().get(cardSelected)+"</html>");
                }
                deck.clearSelection();
            }
        });//shows deck

        cardStat.setBounds(20,425, 200, 200);
        cardStat.setBorder(BorderFactory.createLineBorder(Color.white));
        cardStat.setForeground(Color.white);
        cardStat.setFont(new Font("Comic Sans MS", Font.PLAIN,15));
        cardStat.setHorizontalAlignment(JLabel.CENTER);
        arenaFrame.add(cardStat);//shows card stats

        gameStat.setBounds(260,250, 700, 175);
        gameStat.setForeground(Color.white);
        gameStat.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        gameStat.setHorizontalAlignment(JLabel.CENTER);
        arenaFrame.add(gameStat);//game instructions? duno smth like that

        setting.setBounds(1050, 10, 125, 50);
        setting.setFocusable(false);
        setting.addActionListener(this);
        setting.setFont(new Font("MV Boli", Font.BOLD,20));
        setting.setForeground(Color.cyan);
        setting.setBackground(Color.BLACK);
        setting.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        arenaFrame.add(setting);//setting button

        attack.setBounds(1000, 285, 125, 50);
        attack.setFocusable(false);
        attack.addActionListener(this);
        attack.setFont(new Font("Segoe Script", Font.BOLD,17));
        attack.setForeground(Color.cyan);
        attack.setBackground(Color.BLACK);
        attack.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        arenaFrame.add(attack);//attack button

        end.setBounds(1000, 355, 125, 50);
        end.setFocusable(false);
        end.addActionListener(this);
        end.setFont(new Font("Segoe Script", Font.BOLD,17));
        end.setForeground(Color.cyan);
        end.setBackground(Color.BLACK);
        end.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        arenaFrame.add(end);//end button

        summon.setBounds(50,325, 125, 50);
        summon.setFocusable(false);
        summon.addActionListener(this);
        summon.setFont(new Font("Segoe Script", Font.BOLD,17));
        summon.setForeground(Color.cyan);
        summon.setBackground(Color.BLACK);
        summon.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        arenaFrame.add(summon);//summon button

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                field[i][j] = new JButton();
                field[i][j].setFocusable(false);
                field[i][j].addActionListener(this);
                field[i][j].setIcon(new ImageIcon("src/pics/card.jpg"));
                field[i][j].setVerticalTextPosition(JButton.CENTER);
                field[i][j].setHorizontalTextPosition(JButton.CENTER);
                field[i][j].setForeground(Color.white);
                field[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN,15));
                field[i][j].setVisible(false);
                field[i][j].setBounds(310 + j * 200, 75 + i * 325,175,200);
                arenaFrame.add(field[i][j]);
            }
        }//play field cards

        exit.setBounds(1000, 355, 125, 50);
        exit.setVisible(false);
        exit.setFocusable(false);
        exit.addActionListener(this);
        exit.setFont(new Font("Segoe Script", Font.BOLD,20));
        exit.setForeground(Color.cyan);
        exit.setBackground(Color.BLACK);
        exit.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        arenaFrame.add(exit);//exit button

        restart.setBounds(1000, 285, 125, 50);
        restart.setVisible(false);
        restart.setFocusable(false);
        restart.addActionListener(this);
        restart.setFont(new Font("Segoe Script", Font.BOLD,20));
        restart.setForeground(Color.cyan);
        restart.setBackground(Color.BLACK);
        restart.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        arenaFrame.add(restart);//restart button

        arenaFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== setting && Launch.getLaunchClose())
        {
            try
            {
                Launch launch = new Launch();
                Launch.setLaunchClose(false);
                Launch.startButton.setText("Change Name");
            }
            catch (IOException ioException)
            {
                ioException.printStackTrace();
            }
        }
        if(e.getSource() == end)
        {
            cardStat.setText("");
            cardSelected = -1;
            s1 = "";
            s2 = "";
            round++;
            if(round % 2 == 1)
            {
                refreshP1();
                gameStat.setText("Player one's turn");
                for(int i = 0; i < 3; i++)
                {
                    if(Card.getPartField(1)[i] != null)
                    {
                        Card.getPartField(1)[i].setCanAttack(true);
                        field[1][i].setText("<html><center>" + Card.getPartField(1)[i] + "<br>Can attack </html>");
                    }
                }
            }
            else
            {
                refreshP2();
                gameStat.setText("Player two's turn");
                for(int i = 0; i < 3; i++)
                {
                    if(Card.getPartField(0)[i] != null)
                    {
                        Card.getPartField(0)[i].setCanAttack(true);
                        field[0][i].setText("<html><center>" + Card.getPartField(0)[i] + "<br>Can attack </html>");
                    }
                }
            }
            if(Card.getPartField(0)[0]==null && Card.getPartField(0)[1]==null && Card.getPartField(0)[2]==null&&Launch.one.getDeck().size()==0 && Card.getPartField(1)[0]==null && Card.getPartField(1)[1]==null && Card.getPartField(1)[2]==null&&Launch.two.getDeck().size()==0)
            {
                gameOver = true;
                gameStat.setText("<html><center>Aiya, its a tie, no one wins or loses</html>");
            } //tie
            else if(Card.getPartField(0)[0]==null && Card.getPartField(0)[1]==null && Card.getPartField(0)[2]==null&&Launch.one.getDeck().size()==0)
            {
                gameOver=true;
                gameStat.setText("<html><center>Player two (" + Launch.two.getName() + ") is da winner</html>");
            } //p2 win
            else if(Card.getPartField(1)[0]==null && Card.getPartField(1)[1]==null && Card.getPartField(1)[2]==null&&Launch.two.getDeck().size()==0)
            {
                gameOver=true;
                gameStat.setText("<html><center>Player one (" + Launch.one.getName() + ") is da winner</html>");
            } //p1 win
            if(gameOver)
            {
                summon.setVisible(false);
                attack.setVisible(false);
                scrollPane.setVisible(false);
                turn.setVisible(false);
                cardStat.setVisible(false);
                end.setVisible(false);
                exit.setVisible(true);
                restart.setVisible(true);
            }
        }
        if(e.getSource() == summon)
        {
            if(cardSelected != -1)
            {
                Card card;
                String s = "<html><center>";
                if(round % 2 == 1)
                {
                    card = Launch.one.getDeck().get(cardSelected);
                    for(int i = 0; i < 3; i++)
                    {
                        if(Card.getPartField(0)[i] == null)
                        {
                            s += card.getName() + " has been summoned!<br>";
                            Card.getPartField(0)[i] = card;
                            Launch.one.getDeck().remove(cardSelected);
                            refreshP1();
                            if (card.getAbility()==1)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(0)[x] != null)Card.getPartField(0)[x].setDefense(Card.getPartField(0)[x].getDefense() + 1);
                                }
                                s += "All ally cards have been given 1 extra defense.";
                            }
                            else if (card.getAbility()==2)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(0)[x] != null) Card.getPartField(0)[x].setAttack(Card.getPartField(0)[x].getAttack() + 2);
                                }
                                s += "All ally cards have been given 2 extra attack.";
                            }
                            else if (card.getAbility()==3)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(0)[x]!=null) Card.getPartField(0)[x].setHealth((int)(Math.random()*12+1));
                                }
                                s += "Ally health has been randomized!";
                            }
                            else if (card.getAbility()==4)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(0)[x] != null) Card.getPartField(0)[x].setDefense(Card.getPartField(0)[x].getDefense() + 2);
                                }
                                s += "All ally cards have been given 2 extra defense.";
                            }
                            else if (card.getAbility()==5)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(0)[x] != null) Card.getPartField(0)[x].setAttack(Card.getPartField(0)[x].getAttack() + 6);
                                }
                                s += "All ally cards have been given 6 extra attack.";
                            }
                            else if (card.getAbility()==6)
                            {
                                for(int j = 0; j < 3; j++)
                                {
                                    field[0][j].setVisible(false);
                                    field[1][j].setVisible(false);
                                    Card.getPartField(0)[j] = null;
                                    Card.getPartField(1)[j] = null;
                                }
                                s += "The board has been cleared by Kamikaze";
                            }
                            else if (card.getAbility()==7)
                            {
                                int z = (int)(Math.random()*3);
                                if (Card.getPartField(1)[z]!=null)
                                {
                                    s+= "A random enemy card slot has been dealt 7 damage!";
                                    Card.getPartField(1)[z].setHealth(Card.getPartField(1)[z].getHealth() -7);
                                    if (Card.getPartField(1)[z].getHealth()<=0)
                                    {
                                        Card.getPartField(1)[z]=null;
                                        s += "<br>It died! :D";
                                    }
                                    refreshPartField(1);
                                }
                                else s += "Shot has been missed, awww :(";
                            }
                            else if (card.getAbility()==9)
                            {
                                for (int f=0; f<4; f++)
                                {
                                    if(f == 3)
                                    {
                                        s += "The board is full :( You failed to get the free Jarlgonir";
                                        break;
                                    }
                                    if (Card.getPartField(0)[f]==null)
                                    {
                                        Card.getPartField(0)[f]=new Card(Card.getCard(8));
                                        s += "It came with a Jarlgonir! Buy one get one free!";
                                        break;
                                    }
                                }
                            }
                            else if (card.getAbility() == 10)
                            {
                                for (int x = 0; x < 3; x++)
                                {
                                    if (Card.getPartField(0)[x] != null) Card.getPartField(0)[x].setDefense((int) (Math.random() * 25));
                                }
                                s += "All ally cards have had their defense randomized.";
                            }
                            gameStat.setText(s + "</html>");
                            refreshPartField(0);
                            break;
                        }
                        else gameStat.setText("<html><center>You failed to summon " + card.getName() + "<br>Can't you see your playing field is full ? - ?</html>");
                    }
                }
                else
                {
                    card = Launch.two.getDeck().get(cardSelected);
                    for(int i = 0; i < 3; i++)
                    {
                        if(Card.getPartField(1)[i] == null)
                        {
                            s += card.getName() + " has been summoned<br>";
                            Card.getPartField(1)[i] = card;
                            Launch.two.getDeck().remove(cardSelected);
                            refreshP2();
                            if (card.getAbility()==1)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(1)[x] != null)Card.getPartField(1)[x].setDefense(Card.getPartField(1)[x].getDefense() + 1);
                                }
                                s += "All ally cards have been given 1 extra defense.";
                            }
                            else if (card.getAbility()==2)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(1)[x] != null) Card.getPartField(1)[x].setAttack(Card.getPartField(1)[x].getAttack() + 2);
                                }
                                s += "All ally cards have been given 2 extra attack.";
                            }
                            else if (card.getAbility()==3)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(1)[x]!=null) Card.getPartField(1)[x].setHealth((int)(Math.random()*12+1));
                                }
                                s += "Ally health has been randomized!";
                            }
                            else if (card.getAbility()==4)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(1)[x] != null) Card.getPartField(1)[x].setDefense(Card.getPartField(1)[x].getDefense() + 2);
                                }
                                s += "All ally cards have been given 2 extra defense.";
                            }
                            else if (card.getAbility()==5)
                            {
                                for (int x=0; x<3; x++)
                                {
                                    if (Card.getPartField(1)[x] != null) Card.getPartField(1)[x].setAttack(Card.getPartField(1)[x].getAttack() + 6);
                                }
                                s += "All ally cards have been given 6 extra attack.";
                            }
                            else if (card.getAbility()==6)
                            {
                                for(int j = 0; j < 3; j++)
                                {
                                    field[0][j].setVisible(false);
                                    field[1][j].setVisible(false);
                                    Card.getPartField(0)[j] = null;
                                    Card.getPartField(1)[j] = null;
                                }
                                s += "The board has been cleared by Kamikaze";
                            }
                            else if (card.getAbility()==7)
                            {
                                int z = (int)(Math.random()*3);
                                if (Card.getPartField(0)[z]!=null)
                                {
                                    Card.getPartField(0)[z].setHealth(Card.getPartField(0)[z].getHealth() -7);
                                    if (Card.getPartField(0)[z].getHealth()<=0)
                                    {
                                        s+= "A random enemy card slot has been dealt 7 damage!";
                                        Card.getPartField(0)[z]=null;
                                        s+= "<br>It died! :D";
                                    }
                                    refreshPartField(0);
                                }
                                else s += "Shot has been missed, awww :(";
                            }
                            else if (card.getAbility()==9)
                            {
                                for (int f=0; f<4; f++)
                                {
                                    if(f == 3)
                                    {
                                        s += "The board is full :( You failed to get the free Jarlgonir";
                                        break;
                                    }
                                    if (Card.getPartField(1)[f]==null)
                                    {
                                        Card.getPartField(1)[f]=new Card(Card.getCard(8));
                                        s += "It came with a Jarlgonir! Buy one get one free!";
                                        break;
                                    }
                                }
                            }
                            else if (card.getAbility() == 10)
                            {
                                for (int x = 0; x < 3; x++) {
                                    if (Card.getPartField(1)[x] != null) Card.getPartField(1)[x].setDefense((int) (Math.random() * 25));
                                }
                                s += "All ally cards have had their defense randomized.";
                            }
                            gameStat.setText(s + "</html>");
                            refreshPartField(1);
                            break;
                        }
                        else gameStat.setText("<html><center>You failed to summon " + card.getName() + "<br>Can't you see your playing field is full ? - ?</html>");
                    }
                }
                cardSelected = -1;
            }
            else gameStat.setText("<html><center>You cannot summon if you did not select a card<br>That is an illegal action<br>:(((</html>");
        }
        if(e.getSource() == field[0][0])
        {
            oneCard = 0;
            s1 = Card.getPartField(0)[0].getName() + " is selected";
            gameStat.setText("<html><center>" + s1 + "<br>" + s2 + "</html>");
        }
        if(e.getSource() == field[0][1])
        {
            oneCard = 1;
            s1 = Card.getPartField(0)[1].getName() + " is selected";
            gameStat.setText("<html><center>" + s1 + "<br>" + s2 + "</html>");
        }
        if(e.getSource() == field[0][2])
        {
            oneCard = 2;
            s1 = Card.getPartField(0)[2].getName() + " is selected";
            gameStat.setText("<html><center>" + s1 + "<br>" + s2 + "</html>");
        }
        if(e.getSource() == field[1][0])
        {
            twoCard = 0;
            s2 = Card.getPartField(1)[0].getName() + " is selected";
            gameStat.setText("<html><center>" + s1 + "<br>" + s2 + "</html>");
        }
        if(e.getSource() == field[1][1])
        {
            twoCard = 1;
            s2 = Card.getPartField(1)[1].getName() + " is selected";
            gameStat.setText("<html><center>" + s1 + "<br>" + s2 + "</html>");
        }
        if(e.getSource() == field[1][2])
        {
            twoCard = 2;
            s2 = Card.getPartField(1)[2].getName() + " is selected";
            gameStat.setText("<html><center>" + s1 + "<br>" + s2 + "</html>");
        }//Select cards for attack
        if(e.getSource() == attack)
        {
            if (oneCard==-1||twoCard==-1) gameStat.setText("Bruh. You haven't selected two cards to interact with.");
            else
            {
                Card c1 = Card.getPartField(0)[oneCard];
                Card c2 = Card.getPartField(1)[twoCard];
                String s = "<html><center>";
                if (round%2==1)
                {
                    if (Card.getPartField(0)[oneCard].getCanAttack())
                    {
                        int temp = c1.getAttack() - c2.getDefense();
                        if (temp >= 0)
                        {
                            Card.getPartField(1)[twoCard].setHealth(c2.getHealth() - temp);
                            s += c1.getName() + " attacked " + c2.getName() + "<br>Now " + c2.getName() + " has " + Card.getPartField(1)[twoCard].getHealth() + " health left";
                            if(Card.getPartField(1)[twoCard].getAbility()==8)
                            {
                                int tem=dragHealth-Card.getPartField(1)[twoCard].getHealth();
                                int temp2=tem*4;
                                Card.getPartField(1)[twoCard].setAttack(dragAttack+temp2);
                                s += "<br>Aw, you didn't managed to knock it off, now it is enraged and has " + Card.getPartField(1)[twoCard].getAttack() + " attack";
                            }
                            if(Card.getPartField(1)[twoCard].getHealth() <= 0)
                            {
                                s = "<html><center>" + c2.getName() + " was knocked off the field by " + c1.getName();
                                field[1][twoCard].setVisible(false);
                                Card.getPartField(1)[twoCard]=null;
                            }
                        }
                        else s+= c1.getName() + " tried to attack " + c2.getName() + "<br> It didn't even cause a scratch lul";
                        Card.getPartField(0)[oneCard].setCanAttack(false);
                        field[0][oneCard].setText("<html><center>" + Card.getPartField(0)[oneCard] + "<br>Cannot attack</html>");
                        field[1][twoCard].setText("<html><center>" + Card.getPartField(1)[twoCard] + "<br>Can attack</html>");
                    }
                    else
                    {
                        s += "You were not able to attack " + c2.getName() + " with " + c1.getName();
                    }
                }
                else
                {
                    if (Card.getPartField(1)[twoCard].getCanAttack())
                    {
                        int temp =  c2.getAttack() - c1.getDefense();
                        if (temp >= 0)
                        {
                            Card.getPartField(0)[oneCard].setHealth(c1.getHealth() - temp);
                            s += c2.getName() + " attacked " + c1.getName() + "<br>Now " + c1.getName() + " has " + Card.getPartField(0)[oneCard].getHealth() + " health left";
                            if(Card.getPartField(0)[oneCard].getAbility()==8)
                            {
                                int tem=dragHealth-Card.getPartField(0)[oneCard].getHealth();
                                int temp2=tem*4;
                                Card.getPartField(0)[oneCard].setAttack(dragAttack+temp2);
                                s += "<br>Aw, you didn't managed to knock it off, now it is enraged and has " + Card.getPartField(0)[oneCard].getAttack() + " attack";
                            }
                            if(Card.getPartField(0)[oneCard].getHealth()<=0)
                            {
                                s = "<html><center>" + c1.getName() + " was knocked off the field by " + c2.getName();
                                field[0][oneCard].setVisible(false);
                                Card.getPartField(0)[oneCard]=null;
                            }
                        }
                        else s+= c2.getName() + " tried to attack " + c1.getName() + "<br> It didn't even cause a scratch lul";
                        Card.getPartField(1)[twoCard].setCanAttack(false);
                        field[0][oneCard].setText("<html><center>" + Card.getPartField(0)[oneCard] + "<br>Can attack</html>");
                        field[1][twoCard].setText("<html><center>" + Card.getPartField(1)[twoCard] + "<br>Cannot attack</html>");
                    }
                    else
                    {
                        s += "You were not able to attack " + c1.getName() + " with " + c2.getName();
                    }
                }
                gameStat.setText(s + "</html>");
                s1 = "";
                s2 = "";
                oneCard = -1;
                twoCard = -1;
            }
        }
        if(e.getSource() == exit)
        {
            try
            {
                Exit exit = new Exit();
            }
            catch (IOException ioException)
            {
                ioException.printStackTrace();
            }
        }
        if(e.getSource() == restart)
        {
            arenaFrame.dispose();
        }
    }

    public void refreshP1()
    {
        turn.setText("Player one");
        deckModel.removeAllElements();
        for(Card c : Launch.one.getDeck())
        {
            deckModel.addElement(c.getName());
        }
        deck.setModel(deckModel);
        deck.ensureIndexIsVisible(deckModel.getSize());
    }
    public void refreshP2()
    {
        turn.setText("Player two");
        deckModel.removeAllElements();
        for(Card c : Launch.two.getDeck())
        {
            deckModel.addElement(c.getName());
        }
        deck.setModel(deckModel);
        deck.ensureIndexIsVisible(deckModel.getSize());
    }
    public void refreshPartField(int i)
    {
        for(int j = 0; j < 3; j++)
        {
            String att = "<br>Cannot attack</html>";
            if(Card.getPartField(i)[j] != null)
            {
                if(Card.getPartField(i)[j].getCanAttack()) att = "<br>Can attack</html>";
                field[i][j].setText("<html><center>" + Card.getPartField(i)[j] + att);
                field[i][j].setVisible(true);
            }
            else field[i][j].setVisible(false);
        }
    }

    public static void setArenaClose(boolean boo)
    {
        arenaClose = boo;
    }
    public static boolean getArenaClose()
    {
        return arenaClose;
    }
    public static void setName1(String str)
    {
        name1.setText(str);
    }
    public static void setName2(String str)
    {
        name2.setText(str);
    }
}
