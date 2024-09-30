import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Instruction implements ActionListener
{
    static JFrame instructionFrame = new JFrame();
    BufferedImage img = ImageIO.read(new File("src/pics/paper.jpg"));
    JLabel bg = new JLabel(new ImageIcon(img));
    JLabel label = new JLabel();
    private JButton okButton = new JButton("Ok");
    private static boolean instructionClose = true;

    public Instruction() throws IOException
    {
        instructionFrame.setDefaultCloseOperation(instructionFrame.DISPOSE_ON_CLOSE);
        instructionFrame.setSize(650,525);
        instructionFrame.setLayout(null);
        instructionFrame.setLocationRelativeTo(null);
        instructionFrame.setResizable(false);
        instructionFrame.setAlwaysOnTop(true);
        instructionFrame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {
                super.windowOpened(e);
                setInstructionClose(false);
            }
            public void windowClosed(WindowEvent e)
            {
                super.windowClosed(e);
                setInstructionClose(true);
                try
                {
                    if(Launch.getLaunchClose())
                    {
                        Launch launch = new Launch();
                    }
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
            }
        });
        bg.setBounds(0,-15,650,525);
        instructionFrame.add(bg);


        label.setBounds(25,50,575,400);
        label.setFont(new Font("Ink Free", Font.BOLD,15));
        label.setText("<html><center>Each player automatically draws 12 random cards from a predetermined card pool." +
                "Place cards and attack the enemy player. If any player does not have a card on the " +
                "board or is unable to place a card, they lose. <br>" + "Here are a list of abilities:<br>" +
                "1 = +1 defense to all ally cards<br>" +
                "2 = +2 attack to ally cards<br>" +
                "3 = change all ally cards health to random number between 1 and 12<br>" +
                "4 = +2 defense to all ally cards<br>" +
                "5 = +6 attack to all ally cards<br>" +
                "6 = clear entire board, all cards are gone<br>" +
                "7 = deal 7 damage to random enemy card slot. If there is no card, no damage is dealt.<br>" +
                "8 = for each damage your card takes, increase damage by 4<br>" +
                "9 = summons Jarlgonir, the world wyrm (separate card) if there is space<br>" +
                "10 = change all ally cards defense to random number between 0 to 25<br>" +
                "Good luck, and have fun.</html>");
        bg.add(label);

        okButton.setBounds(250, 390, 150, 45);
        okButton.setFocusable(false);
        okButton.addActionListener(this);
        okButton.setFont(new Font("Ink Free", Font.BOLD,35));
        okButton.setForeground(Color.white);
        okButton.setBackground(Color.white);
        okButton.setBorderPainted(false);
        okButton.setOpaque(false);
        bg.add(okButton);

        instructionFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==okButton)
        {
            instructionFrame.dispose();
        }
    }
    public static void setInstructionClose(boolean boo)
    {
        instructionClose = boo;
    }
    public static boolean getInstructionClose()
    {
        return instructionClose;
    }
}