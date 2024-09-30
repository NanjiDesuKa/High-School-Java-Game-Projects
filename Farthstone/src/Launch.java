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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Launch implements ActionListener
{
    static Player one = new Player("Player one");;
    static Player two = new Player("Player two");;
    JFrame launchFrame = new JFrame("FARTHSTONE");
    BufferedImage img = ImageIO.read(new File("src/pics/space.jpg"));
    JLabel bg = new JLabel(new ImageIcon(img));
    JLabel title = new JLabel("FARTHSTONE");
    static JButton startButton = new JButton("Start");
    JButton instructionsButton = new JButton("Instructions");
    JButton exitButton = new JButton("Exit");
    static JSlider slider = new JSlider(0, 100, 15);
    private static boolean launchClose = true;
    static Music launchMusic = new Music();

    public Launch() throws IOException
    {
        launchFrame.setDefaultCloseOperation(launchFrame.DISPOSE_ON_CLOSE);
        launchFrame.setSize(800,500);
        launchFrame.setLayout(null);
        launchFrame.setLocationRelativeTo(null);
        launchFrame.setResizable(false);
        launchFrame.setAlwaysOnTop(true);
        if(Arena.getArenaClose())
        {
            launchMusic.setFile("src/musics/Coffin Dance.wav");
            launchMusic.play();
            one.resetDeck();
            two.resetDeck();
            launchFrame.setAlwaysOnTop(false);
        }
        launchFrame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {
                super.windowOpened(e);
                setLaunchClose(false);
                if(Arena.getArenaClose())
                {
                    startButton.setText("Start");
                }
            }
            public void windowClosed(WindowEvent e)
            {
                super.windowClosed(e);
                setLaunchClose(true);
                if(Arena.getArenaClose() && (!Exit.getExitClose() || !Instruction.getInstructionClose()))
                {
                    launchMusic.stop();
                }
            }
        });
        bg.setBounds(0,0,800,500);
        launchFrame.add(bg);

        title.setBounds(140,0,600,200);
        title.setFont(new Font("Segoe Print", Font.BOLD,75));
        title.setForeground(Color.white);
        bg.add(title);//title

        startButton.setBounds(200, 200, 400, 50);
        startButton.setFocusable(false);
        startButton.addActionListener(this);
        startButton.setFont(new Font("Segoe Script", Font.BOLD,25));
        startButton.setForeground(Color.white);
        startButton.setBackground(Color.BLACK);
        bg.add(startButton);//start button

        instructionsButton.setBounds(200, 275, 400, 50);
        instructionsButton.setFocusable(false);
        instructionsButton.addActionListener(this);
        instructionsButton.setFont(new Font("Segoe Script", Font.BOLD,25));
        instructionsButton.setForeground(Color.white);
        instructionsButton.setBackground(Color.BLACK);
        bg.add(instructionsButton);//instruction button

        exitButton.setBounds(200, 350, 400, 50);
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);
        exitButton.setFont(new Font("Segoe Script", Font.BOLD,25));
        exitButton.setForeground(Color.white);
        exitButton.setBackground(Color.BLACK);
        bg.add(exitButton);//exit button

        slider.setBounds(200, 425, 400, 25);
        slider.setBackground(Color.BLACK);
        launchFrame.add(slider);
        slider.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                Music.setVolume(slider.getValue());
            }
        });//volume slider

        launchFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==startButton && GetName.getNameClose())
        {
            launchFrame.dispose();
            if(Arena.getArenaClose()) launchMusic.stop();
            try
            {
                if(GetName.getNameClose())
                {
                    GetName.setNameClose(false);
                    GetName getName = new GetName();
                }
            }
            catch (IOException ioException)
            {
                ioException.printStackTrace();
            }
        }
        if(e.getSource()==instructionsButton && Instruction.getInstructionClose())
        {
            try
            {
                if(Instruction.getInstructionClose())
                {
                    Instruction instruction = new Instruction();
                }
            }
            catch (IOException ioException)
            {
                ioException.printStackTrace();
            }
        }
        if(e.getSource()==exitButton && Exit.getExitClose())
        {
            try
            {
                if(Exit.getExitClose())
                {
                    Exit exit = new Exit();
                }
            }
            catch (IOException ioException)
            {
                ioException.printStackTrace();
            }
        }
    }

    public static boolean getLaunchClose()
    {
        return launchClose;
    }
    public static void setLaunchClose(boolean boo)
    {
        launchClose = boo;
    }
}
