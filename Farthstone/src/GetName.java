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

public class GetName implements ActionListener
{
    static JFrame frame = new JFrame();
    BufferedImage img = ImageIO.read(new File("src/pics/name.jpg"));
    JLabel bg = new JLabel(new ImageIcon(img));
    JLabel txt1 = new JLabel("Player One");
    private JTextField name1 = new JTextField(Launch.one.getName());
    JLabel txt2 = new JLabel("Player Two");
    private JTextField name2 = new JTextField(Launch.two.getName());
    JButton button = new JButton("Confirm");
    private static boolean nameClose = true;
    static Music waitMusic = new Music();

    public GetName() throws IOException
    {
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(425,600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        if(Arena.getArenaClose())
        {
            waitMusic.setFile("src/musics/Baby Shark (Trap Remix).wav");
            waitMusic.setVolume(5);
            waitMusic.play();
        }
        frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {
                super.windowOpened(e);
                setNameClose(false);
            }
            public void windowClosed(WindowEvent e)
            {
                super.windowClosed(e);
                waitMusic.stop();
                setNameClose(true);
                try
                {
                    if(Arena.getArenaClose())
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

        bg.setBounds(0,0,425,600);
        frame.add(bg);

        txt1.setBounds(150,150,200,50);
        txt1.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        txt1.setForeground(Color.white);
        bg.add(txt1);

        name1.setBounds(70,200,275,50);
        name1.setFont(new Font("Segoe Print", Font.PLAIN,20));
        name1.setHorizontalAlignment(JTextField.CENTER);
        bg.add(name1);

        txt2.setBounds(150,250,200,50);
        txt2.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        txt2.setForeground(Color.white);
        bg.add(txt2);

        name2.setBounds(70,300,275,50);
        name2.setFont(new Font("Segoe Print", Font.PLAIN,20));
        name2.setHorizontalAlignment(JTextField.CENTER);
        bg.add(name2);

        button.setBounds(100, 500, 200, 50);
        button.setFocusable(false);
        button.addActionListener((ActionListener) this);
        button.setFont(new Font("Segoe Script", Font.BOLD,25));
        button.setForeground(Color.white);
        button.setBackground(Color.BLACK);
        bg.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            frame.dispose();
            String n1 = name1.getText().trim();
            if(!n1.isEmpty())
            {
                Launch.one.setName(n1);
                Arena.setName1("(ONE): " + n1);
            }
            String n2 = name2.getText().trim();
            if(!n2.isEmpty())
            {
                Launch.two.setName(n2);
                Arena.setName2("(TWO): " + n2);
            }
            if(Arena.getArenaClose())
            {
                waitMusic.stop();
                try
                {
                    Arena arena = new Arena();
                }
                catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
                Arena.setArenaClose(false);
            }
        }
    }

    public static void setNameClose(boolean boo)
    {
        nameClose = boo;
    }
    public static boolean getNameClose()
    {
        return nameClose;
    }
}
