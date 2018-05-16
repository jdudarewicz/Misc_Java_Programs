//Imports
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            JFrame frame = new NotepadGUI();
            frame.setDefaultCloseOperation(3);
            frame.setTitle("Notepad");
            frame.setSize(1200, 800);
            frame.setVisible(true);
        }
    }
}
