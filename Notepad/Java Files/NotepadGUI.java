import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class NotepadGUI extends JFrame{
    //GUI elements
    private JPanel mainPanel;
    private JToolBar toolBar;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JButton openButton ;
    private JButton saveButton;

    //File
    private File current;
    private String filePath;
    private String editing;

    public NotepadGUI() {
        mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());

        createToolBar();
        createTextArea();

        mainPanel.add(toolBar, BorderLayout.NORTH);
        mainPanel.add(scrollPane);

        add(mainPanel);
    }

    private void createToolBar(){
        toolBar = new JToolBar();
        toolBar.setFloatable(false);

        createOpenButton();
        createSaveButton();

        toolBar.add(openButton);
        toolBar.add(saveButton);
    }

    private void createTextArea() {
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }

    private void createOpenButton() {
        openButton = new JButton("Open");

        class OpenButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                chooseFile();

                if(current != null) {
                    try {
                        readIn();
                    }
                    catch (IOException exception){
                        System.out.println(exception);
                        System.exit(3);
                    }
                }
            }
        }

        openButton.addActionListener(new OpenButton());
    }

    private void createSaveButton() {
        saveButton = new JButton("Save");

        class saveButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                chooseFile();

                if(current != null) {
                    try {
                        readOut();
                    }
                    catch (IOException exception) {
                        System.out.println(exception);
                        System.exit(3);
                    }
                }
            }
        }

        saveButton.addActionListener(new saveButton());
    }

    private void chooseFile() {
        final JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
        fc.setFileFilter(filter);
        int returned = fc.showOpenDialog(null);

        if(returned == fc.APPROVE_OPTION) {
            current = new File(fc.getSelectedFile().getName());
            filePath = fc.getSelectedFile().getParent();
        }
    }

    private void readIn() throws IOException {
        FileInputStream fis = new FileInputStream(filePath + "\\" + current.getName());

        editing = "";
        int next = fis.read();
        while(next != -1){
            editing = editing + (char)next;
            next = fis.read();
        }

        textArea.setText(editing);
        fis.close();
    }

    private void readOut() throws IOException {
        BufferedReader reader = new BufferedReader(new StringReader(textArea.getText()));
        PrintWriter writer = new PrintWriter(new FileWriter(filePath + "\\" + current.getName()));

        String line = reader.readLine();
        while(line != null) {
            writer.println(line);
            line = reader.readLine();
        }

        writer.close();
        reader.close();
    }
}
