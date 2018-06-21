import java.awt.*;
import javax.swing.*;

public class BullseyeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(350,350);
        frame.setTitle("A bullseye");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new BullseyeComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}

class BullseyeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        int x = 100;
        int y = 100;

        for(int i = 100; i > 0; i = i - 20)
        {
            if(i % 40 == 0)
            {
                g.setColor(Color.WHITE);
                g.fillOval(x,y,i,i);
                x = x + 10;
                y = y + 10;
            }
            else
            {
                g.setColor(Color.BLACK);
                g.fillOval(x,y, i, i);
                x = x + 10;
                y = y + 10;
            }
        }   
    }   
}