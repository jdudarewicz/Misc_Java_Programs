import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DataSetViewer
{
    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 500;
        final int FRAME_HEIGHT = 100;

        JFrame frame = new DataSetFrame();
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Statistical Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class DataSetFrame extends JFrame
{
    private ArrayList<Double> dataSet = new ArrayList<Double>();
    private double minVal = -1.0;
    private double maxVal =  -1.0;
    private double average;

    private JLabel textFieldLabel;
    private JLabel result = new JLabel("No Data Yet");
    private JButton button;
    private JTextField textField;

    public DataSetFrame()
    {
        createButton();
        createTextField();
        createPanel();
    }

    private void createTextField()
    {
        textFieldLabel = new JLabel("Enter new data: ");

        textField = new JTextField(10);
        textField.setText("" + 0);
    }

    private void createButton()
    {
        button = new JButton("Add to data-set");

        ActionListener listener = new AddButtonListener();
        button.addActionListener(listener);
    }

    class AddButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            double newData = Double.parseDouble(textField.getText());

            dataSet.add(newData);
            
            if(newData > maxVal || maxVal == -1.0){
                maxVal = newData;
            }
            if(newData < minVal || minVal == -1.0){
                minVal = newData;
            }

            Double total = 0.0;

            for(Double data: dataSet){
                total = total + data;
            }

            average = total/dataSet.size();
            result.setText("minVal: " + minVal + ", maxVal: " + maxVal + ", average: " + average);
        }
    }

    private void createPanel()
    {
        JPanel panel = new JPanel();

        panel.add(textFieldLabel);
        panel.add(textField);
        panel.add(button);
        panel.add(result);

        add(panel);
    }
}