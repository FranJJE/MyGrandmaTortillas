package main.view;

import javax.swing.*;
import java.awt.*;


public class GUI {
    public final int WIDTH;
    public final int HEIGHT;

    public JFrame frame = new JFrame();
        public JPanel menuPanel = new JPanel();
            public JLabel logoLabel = new JLabel();
        public JPanel mainPanel = new JPanel();
            public JPanelBackground newsPanel = new JPanelBackground("src\\main\\view\\images\\newsBG.png");
            public JPanelBackground accountsPanel = new JPanelBackground("src\\main\\view\\images\\accountsBG.png");
            public JPanel cardsPanel = new JPanel();
                public CreditCard cc1 = new CreditCard();
                public CreditCard cc2 = new CreditCard();
                public CreditCard cc3 = new CreditCard();
                public CreditCard cc4 = new CreditCard();
            public JPanelBackground othersPanel = new JPanelBackground("src\\main\\view\\images\\othersBG.png");
            public JPanelBackground transactionsPanel = new JPanelBackground("src\\main\\view\\images\\transactionsBG.png");

    public static JPanelBackground selectedPanel = null;

    public GUI()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        WIDTH = screenSize.width;
        HEIGHT = screenSize.height;

        initComponents();
        logoImage();
    }

    public void initComponents()
    {
        //********************** FRAME, MENU AND MAIN PANEL **********************/
        mainPanel.setLayout( new FlowLayout( FlowLayout.CENTER,20,20));
        mainPanel.setPreferredSize( new Dimension( WIDTH,(int)(HEIGHT*0.92)));
        mainPanel.setBackground(Color.lightGray);
        mainPanel.add(newsPanel);
        mainPanel.add(accountsPanel);
        mainPanel.add(cardsPanel);
        mainPanel.add(othersPanel);
        mainPanel.add(transactionsPanel);

        menuPanel.setPreferredSize( new Dimension( WIDTH,(int)(HEIGHT*0.08)));
        menuPanel.setLayout(null);
        menuPanel.setBackground(Color.decode("#0026ca"));
        menuPanel.add(logoLabel);

        frame.setLayout( new FlowLayout(FlowLayout.CENTER,0,0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.setPreferredSize( new Dimension(WIDTH,HEIGHT));
        frame.pack();
        frame.add(menuPanel);
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //********************** TOP LEFT POSITION **********************/
        newsPanel.setPreferredSize( new Dimension( (int)(mainPanel.getWidth()*0.35-10),(int)(mainPanel.getHeight()*0.25)));

        //********************** TOP RIGHT POSITION **********************/
        accountsPanel.setPreferredSize( new Dimension( (int)(mainPanel.getWidth()*0.55-10),(int)(mainPanel.getHeight()*0.25)));

        //********************** MIDDLE POSITION **********************/
        cardsPanel.setLayout( new GridLayout(1,4,20,0));
        cardsPanel.setPreferredSize( new Dimension( (int)(mainPanel.getWidth()*0.9),(int)(mainPanel.getHeight()*0.20)));
        cardsPanel.setOpaque(false);
        cardsPanel.add( cc1);
        cardsPanel.add( cc2);
        cardsPanel.add( cc3);
        cardsPanel.add( cc4);

        //********************** BOTTOM LEFT POSITION **********************/
        othersPanel.setLayout(null);
        othersPanel.setPreferredSize( new Dimension((int) (mainPanel.getWidth()*0.35), (int) (mainPanel.getHeight()*0.40)));

        //********************** BOTTOM RIGHT POSITION **********************/
        transactionsPanel.setLayout(null);
        transactionsPanel.setPreferredSize( new Dimension((int) (mainPanel.getWidth()*0.55), (int) (mainPanel.getHeight()*0.40)));
    }

    public void logoImage()
    {
        ImageIcon logo = new ImageIcon("src\\main\\view\\images\\logo2.png");
        logo = scaleImage(logo,300, (int)(HEIGHT*0.08));
        logoLabel.setIcon(logo);
        logoLabel.setBounds(90,0,300, (int)(HEIGHT*0.08));
    }

    public ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if(icon.getIconWidth() > w)
        {
            nw = w;
            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if(nh > h)
        {
            nh = h;
            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
}
