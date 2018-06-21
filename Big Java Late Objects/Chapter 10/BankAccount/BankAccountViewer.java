import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankAccountViewer
{
    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 500;
        final int FRAME_HEIGHT = 100;

        JFrame frame = new BankAccountFrame();

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Bank Account Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}