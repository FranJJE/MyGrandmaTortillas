package main.view;

import main.view.components.*;

import javax.swing.*;
import java.awt.*;


public class GUI {
    //*********************************************** VARIABLES ******************************************************/
    public final int WIDTH = 1280;
    public final int HEIGHT = 720;
    public static JPanelBackground selectedPanel = null;

    //*********************************************** GUI STRUCTURE **************************************************/
    public final JFrame frame = new JFrame();
        public final JPanel mainPanel = new JPanel();
            public final JPanel titlePanel = new JPanel();
                public final JLabel logoLabel = new JLabel();
            public final JPanel contentPanel = new JPanel();
            public final JPanel menuPanel = new JPanel();
                public final JPanelBackground actionsPanel = new JPanelBackground("src\\main\\view\\images\\newsBG.png");
                    public final Actions actions = new Actions();
                public final JPanelBackground accountsPanel = new JPanelBackground("src\\main\\view\\images\\accountsBG.png");
                    public final Account account = new Account();
                public final JPanel cardsPanel = new JPanel();
                    public final CreditCard cc1 = new CreditCard();
                    public final CreditCard cc2 = new CreditCard();
                    public final CreditCard cc3 = new CreditCard();
                    public final CreditCard cc4 = new CreditCard();
                public final JPanelBackground cashFlowPanel = new JPanelBackground("src\\main\\view\\images\\othersBG.png");
                    public final CashFlow cashFlow = new CashFlow();
                public final JPanelBackground transactionsPanel = new JPanelBackground("src\\main\\view\\images\\transactionsBG.png");
                    public final Transaction latestTransactions = new Transaction("Latest transactions");


    //************************************************ CONSTRUCTORS **************************************************/
    public GUI()
    {
        initComponents();
        logoImage();
    }

    //*************************************************** METHODS ****************************************************/
    public void initComponents()
    {
        //****** FRAME, MENU AND MAIN PANEL ******/
        contentPanel.setLayout( new FlowLayout( FlowLayout.CENTER,20,20));
        contentPanel.setPreferredSize( new Dimension((int) (WIDTH*0.9),(int)(HEIGHT*0.92)));
        contentPanel.setBackground(Color.lightGray);
        contentPanel.add(actionsPanel);
        contentPanel.add(accountsPanel);
        contentPanel.add(cardsPanel);
        contentPanel.add(cashFlowPanel);
        contentPanel.add(transactionsPanel);

        titlePanel.setPreferredSize( new Dimension( WIDTH,(int)(HEIGHT*0.08)));
        titlePanel.setLayout( new FlowLayout(FlowLayout.CENTER,0,10));
        titlePanel.setBackground(Color.decode("#0026ca"));
        titlePanel.add(logoLabel);

        menuPanel.setLayout( new FlowLayout(FlowLayout.CENTER,20,20));
        menuPanel.setPreferredSize( new Dimension((int) (WIDTH*0.1),(int)(HEIGHT*0.92)));
        menuPanel.setBackground(Color.darkGray);
        menuPanel.add( new JLabel("HOME"));
        menuPanel.add( new JLabel("STATISTICS"));
        for(Component c : menuPanel.getComponents())
        {
            c.setForeground(Color.white);
        }

        mainPanel.setPreferredSize( new Dimension(WIDTH,HEIGHT));
        mainPanel.setLayout( new FlowLayout( FlowLayout.CENTER,0,0));
        mainPanel.add(titlePanel);
        mainPanel.add(menuPanel);
        mainPanel.add(contentPanel);

        frame.setLayout( new FlowLayout(FlowLayout.LEFT,0,0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setPreferredSize( new Dimension(WIDTH,HEIGHT));
        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //****** TOP LEFT POSITION ******/
        actionsPanel.setLayout( new FlowLayout( FlowLayout.LEFT,20,10));
        actionsPanel.setPreferredSize( new Dimension( (int)(contentPanel.getWidth()*0.35-10),(int)(contentPanel.getHeight()*0.25)));
        actionsPanel.add(actions);

        //****** TOP RIGHT POSITION ******/
        accountsPanel.setLayout( new FlowLayout(FlowLayout.LEFT,20,10));
        accountsPanel.setPreferredSize( new Dimension( (int)(contentPanel.getWidth()*0.55-10),(int)(contentPanel.getHeight()*0.25)));
        accountsPanel.setOpaque(false);
        accountsPanel.add( account);

        //****** MIDDLE POSITION ******/
        cardsPanel.setLayout( new GridLayout(1,4,20,0));
        cardsPanel.setPreferredSize( new Dimension( (int)(contentPanel.getWidth()*0.9),(int)(contentPanel.getHeight()*0.20)));
        cardsPanel.setOpaque(false);
        cardsPanel.add( cc1);
        cardsPanel.add( cc2);
        cardsPanel.add( cc3);
        cardsPanel.add( cc4);

        //****** BOTTOM LEFT POSITION ******/
        cashFlowPanel.setLayout( new FlowLayout( FlowLayout.LEFT,20,10));
        cashFlowPanel.setPreferredSize( new Dimension((int) (contentPanel.getWidth()*0.35), (int) (contentPanel.getHeight()*0.35)));
        cashFlowPanel.add(cashFlow);

        //****** BOTTOM RIGHT POSITION ******/
        transactionsPanel.setLayout( new FlowLayout( FlowLayout.LEFT,20,10));
        transactionsPanel.setPreferredSize( new Dimension((int) (contentPanel.getWidth()*0.55), (int) (contentPanel.getHeight()*0.35)));
        transactionsPanel.add(latestTransactions);
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
