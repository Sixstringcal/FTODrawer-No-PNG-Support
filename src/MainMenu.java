

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.nio.file.Paths;


public class MainMenu extends JFrame {
    private JRadioButton l3tViewerButton;
    private JRadioButton drawScrambleButton;
    private JPanel panel;
    private JLabel scrambleLabel;
    private JTextArea scrambleTextBox;
    private JLabel saveLabel;
    private JTextField fileNameTextBox;
    private JButton saveButton;
    private JLabel svgEndingLabel;
    private JLabel scrambleImageLabel;
    private FTO fto;


    public MainMenu() {
        super();
        setContentPane(panel);
        drawScrambleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liveUpdate();
            }
        });
        l3tViewerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liveUpdate();
            }
        });
        liveUpdate();
        scrambleTextBox.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                liveUpdate();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                liveUpdate();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                liveUpdate();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeFile("" + fileNameTextBox.getText());
            }
        });
        pack();
        setSize(400, 700);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void makeFile(String path) {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileFilter filter = new FileNameExtensionFilter("Images ", "svg");
        jFileChooser.setFileFilter(filter);
        int result = jFileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {


            try {
                FileWriter myWriter = new FileWriter(jFileChooser.getSelectedFile().toString() + ".svg");
                System.out.print(jFileChooser.getSelectedFile().toString() + ".svg");
                if (drawScrambleButton.isSelected()) {
                    String a = scrambleTextBox.getText();
                    fto = new FTO();
                    if (!a.equals("")) {
                        fto.doMoves(a);
                    }
                    myWriter.write(Main.drawScramble(fto.getState()));
                } else {
                    String a = scrambleTextBox.getText();
                    fto = new FTO();
                    fto.doMoves(a);
                    myWriter.write(Main.getSVG(fto.getState()));
                }
                myWriter.flush();
                myWriter.close();
            } catch (IOException ex) {
                System.out.println("oof");
                ex.printStackTrace();
            }
        }
    }

    public void liveUpdate() {

    }
}
