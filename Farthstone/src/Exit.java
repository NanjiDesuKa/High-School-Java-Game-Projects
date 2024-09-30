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

public class Exit implements ActionListener
{
    static JFrame exitFrame = new JFrame();
    BufferedImage img = ImageIO.read(new File("src/pics/rain.jpg"));
    JLabel bg = new JLabel(new ImageIcon(img));
    JLabel label = new JLabel("Are you sure?");
    JButton yesButton = new JButton("Yes");
    JButton noButton = new JButton("No");
    private static boolean exitClose = true;

    public Exit() throws IOException
    {
        exitFrame.setDefaultCloseOperation(exitFrame.DISPOSE_ON_CLOSE);
        exitFrame.setSize(650,425);
        exitFrame.setLayout(null);
        exitFrame.setLocationRelativeTo(null);
        exitFrame.setResizable(false);
        exitFrame.setAlwaysOnTop(true);
        exitFrame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {
                super.windowOpened(e);
                setExitClose(false);
            }
            public void windowClosed(WindowEvent e)
            {
                super.windowClosed(e);
                setExitClose(true);
                try
                {
                    if(Launch.getLaunchClose() && Arena.getArenaClose())
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

        bg.setBounds(0,0,650,425);
        exitFrame.add(bg);

        label.setBounds(175,125,400,50);
        label.setFont(new Font("Impact", Font.BOLD,50));
        label.setForeground(Color.lightGray);
        bg.add(label);

        yesButton.setBounds(75, 300, 200, 50);
        yesButton.setFocusable(false);
        yesButton.addActionListener(this);
        yesButton.setFont(new Font("Ink Free", Font.BOLD,10));
        yesButton.setForeground(Color.red);
        yesButton.setBackground(Color.lightGray);
        bg.add(yesButton);

        noButton.setBounds(375, 300, 200, 50);
        noButton.setFocusable(false);
        noButton.addActionListener(this);
        noButton.setFont(new Font("Ink Free", Font.BOLD,40));
        noButton.setForeground(Color.green);
        noButton.setBackground(Color.lightGray);
        bg.add(noButton);

        exitFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==yesButton)
        {
            System.exit(0);
        }
        if(e.getSource()==noButton)
        {
            exitFrame.dispose();
        }
    }
    public static void setExitClose(boolean boo)
    {
        exitClose = boo;
    }
    public static boolean getExitClose()
    {
        return exitClose;
    }
}
