//Imports
import javax.swing.filechooser.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
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

    /*
    * Creates main Notepad GUI, adding all the main elements
    */
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
        openButton.setIcon(UIManager.getIcon("FileView.directoryIcon"));

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
        saveButton.setIcon(UIManager.getIcon("FileView.fileIcon"));

        class saveButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                saveFile();

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
        fc.setCurrentDirectory(new File (System.getProperty("user.home") + System.getProperty("file.separator") + "Desktop"));
        int returned = fc.showOpenDialog(mainPanel);

        if(returned == fc.APPROVE_OPTION) {
            current = new File(fc.getSelectedFile().getName());
            filePath = fc.getSelectedFile().getParent();
        }
    }

    private void saveFile() {
        final JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
        fc.setFileFilter(filter);
        fc.setCurrentDirectory(new File (System.getProperty("user.home") + System.getProperty("file.separator") + "Desktop"));
        int returned = fc.showSaveDialog(mainPanel);

        if(returned == fc.APPROVE_OPTION) {
            current = new File(fc.getSelectedFile().getName());
            filePath = fc.getSelectedFile().getParent();
        }
    }

    private void readIn() throws IOException {
        FileInputStream fis = new FileInputStream(filePath + System.getProperty("file.separator") + current.getName());
        editing = "";
        boolean done = false;

        while(!done){
            int next = fis.read();
            if(next == -1) done = true;
            else editing = editing + (char)next;
        }

        textArea.setText(editing);
        fis.close();
    }

    private void readOut() throws IOException {
        FileWriter out = new FileWriter(filePath + System.getProperty("file.separator") + current.getName());
        out.write(textArea.getText());
        out.close();
    }
}
