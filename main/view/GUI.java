package main.view;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public final int WIDTH;
    public final int HEIGHT;


    public JFrame frame;
        public JPanel mainPanel;
            public JPanel accountsPanel;
            public JPanel cardsPanel;
            public JPanel othersPanel;

    public GUI()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        WIDTH = screenSize.width;
        HEIGHT = screenSize.height;

        initComponents();
    }

    public void initComponents()
    {
        mainPanel = new JPanel();
        mainPanel.setPreferredSize( new Dimension(WIDTH,HEIGHT));
        mainPanel.setBackground(Color.lightGray);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(mainPanel);
        frame.pack();
        //frame.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
