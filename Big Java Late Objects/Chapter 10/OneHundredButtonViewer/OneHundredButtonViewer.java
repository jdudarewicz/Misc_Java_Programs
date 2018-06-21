import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class OneHundredButtonViewer
{
    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 500;
        final int FRAME_HEIGHT = 500;

        JFrame frame = new ButtonFrame();
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("100 button program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ButtonFrame extends JFrame
{
    private ArrayList<JButton> buttons = new ArrayList<JButton>();

    public ButtonFrame()
    {
        for(int i = 1; i <= 100; i++)
        {
            createButton(i);
        }
        createPanel();
    }

    private void createButton(int n)
    {
        JButton button = new JButton("" + n);
        buttons.add(button);
    }

    private void createPanel()
    {
        JPanel panel = new JPanel();
        
        for(JButton button : buttons)
        {
            panel.add(button);
        }

        add(panel);
    }
}