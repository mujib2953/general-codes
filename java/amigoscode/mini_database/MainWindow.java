package mini_database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MainWindow extends JFrame {
    public static final String filePath = "D:\\work\\personal\\clone\\general-codes\\java\\amigoscode\\mini_database\\database.txt";
    JTextArea ta;
    JButton b1, b2;

    JPanel mainPanel, p1, p2;

    Time time = new Time();
    SaveToFile save = new SaveToFile();

    public MainWindow() {
        super("Mini App");

        this.setSize(500, 270);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        mainPanel = new JPanel(new BorderLayout());
        p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        ta = new JTextArea(10, 40);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        JScrollPane pane = new JScrollPane(ta);

        b1 = new JButton("Save");
        b2 = new JButton("Open file with notepad");

        DealWithButtons db = new DealWithButtons();
        b1.addActionListener(db);
        b2.addActionListener(db);

        p1.add(pane);

        p2.add(b1);
        p2.add(b2);

        mainPanel.add(p1, BorderLayout.CENTER);
        mainPanel.add(p2, BorderLayout.SOUTH);

        this.add(mainPanel);

        this.setVisible(true);

        ta.requestFocus();
    }

    private class DealWithButtons implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                PrintWriter pr = save.createFile(filePath);

                int option = JOptionPane.showConfirmDialog(null, "Do  you want to save?");

                if (option == 0) {
                    save.printToFile(ta.getText().trim(), pr);
                    save.printToFile(time.getDate() + " | " + time.getTime(), pr);
                    save.addSpace();

                    ta.setText("");

                    pr.close();
                }
            } else if (e.getSource() == b2) {
                File file = new File(filePath);
                Desktop desktop = Desktop.getDesktop();

                if (file.exists() && file.length() > 0) {
                    try {
                        desktop.edit(file);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
}
