package ui;

import javax.swing.*;

public class MainForm extends JFrame {
    private JPanel panel;
    private JPanel rootPanel;
    private JButton buttonnewContact;
    private JButton buttonRemove;
    private JTable tableContacts;

    public MainForm() {

        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

    }
}
