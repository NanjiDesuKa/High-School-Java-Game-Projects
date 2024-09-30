import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;

public class Music
{
    static Clip clip;

    public static void setFile(String path)
    {
        try
        {
            File file = new File(path);
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audio);
            setVolume(Launch.slider.getValue());
        }
        catch (Exception e)
        {
        }
    }

    public void play()
    {
        clip.setFramePosition(0);
        clip.start();
        loop();
    }
    public void loop()
    {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public static void stop()
    {
        clip.stop();
    }
    public static void setVolume(float level)
    {
        level /= 100;
        FloatControl volume= (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue((float) (Math.log(level) / Math.log(10.0) * 20.0));
    }
}
