package main.view;

import main.view.components.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class GUI {
    //*********************************************** VARIABLES ******************************************************/
    public final int WIDTH = 1280;
    public final int HEIGHT = 820;
    public static JPanelBackground selectedPanel = null;
    Border raisedBevel = BorderFactory.createRaisedBevelBorder();
    Border loweredBevel = BorderFactory.createLoweredBevelBorder();
    Border compound = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);

    //*********************************************** GUI STRUCTURE **************************************************/
    public final JFrame frame = new JFrame();
        public final JPanel mainPanel = new JPanel();
            public final JPanel menuPanel = new JPanel();
            public final JPanel titlePanel = new JPanel();
                public final JLabel logoLabel = new JLabel();
            public final JPanel contentPanel = new JPanel();
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
        contentPanel.setLayout(null);
        contentPanel.setBounds(150,50,WIDTH-150,HEIGHT-50);
        contentPanel.setBackground(Color.lightGray);
        contentPanel.add(actionsPanel);
        contentPanel.add(accountsPanel);
        contentPanel.add(cardsPanel);
        contentPanel.add(cashFlowPanel);
        contentPanel.add(transactionsPanel);

        titlePanel.setBounds(0,0,WIDTH,50);
        titlePanel.setLayout( new FlowLayout(FlowLayout.LEFT,35,5));
        titlePanel.setBackground(Color.decode("#0026ca"));
        titlePanel.setBorder(compound);
        titlePanel.add(logoLabel);

        menuPanel.setLayout( new FlowLayout(FlowLayout.CENTER,50,20));
        menuPanel.setBounds(0,50,150,HEIGHT);
        menuPanel.setBackground(Color.darkGray);
        menuPanel.setBorder(compound);
        menuPanel.add( new JLabel("HOME"));
        menuPanel.add( new JLabel("STATISTICS"));
        menuPanel.add( new JLabel("ABOUT"));
        menuPanel.add( new JLabel("EXIT"));
        for(Component c : menuPanel.getComponents())
        {
            c.setForeground(Color.white);
        }

        mainPanel.setBounds(0,0,WIDTH,HEIGHT);
        mainPanel.setLayout( null);
        mainPanel.add(titlePanel);
        mainPanel.add(menuPanel);
        mainPanel.add(contentPanel);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setPreferredSize( new Dimension(WIDTH,HEIGHT));
        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //****** TOP LEFT POSITION ******/
        actionsPanel.setLayout( new FlowLayout( FlowLayout.LEFT,0,0));
        actionsPanel.setBounds(40,20,400,200);
        actionsPanel.add(actions);

        //****** TOP RIGHT POSITION ******/
        accountsPanel.setLayout(null);
        accountsPanel.setBounds(460,20,610,200);
        accountsPanel.setOpaque(false);
        accountsPanel.add(account);

        //****** MIDDLE POSITION ******/
        cardsPanel.setLayout( new GridLayout(1,4,20,0));
        cardsPanel.setBounds(40,240,1030,150);
        cardsPanel.setOpaque(false);
        cardsPanel.add(cc1);
        cardsPanel.add(cc2);
        cardsPanel.add(cc3);
        cardsPanel.add(cc4);

        //****** BOTTOM LEFT POSITION ******/
        cashFlowPanel.setLayout( new FlowLayout( FlowLayout.LEFT,0,0));
        cashFlowPanel.setBounds(40,410,400,300);
        cashFlowPanel.add(cashFlow);

        //****** BOTTOM RIGHT POSITION ******/
        transactionsPanel.setLayout( new FlowLayout( FlowLayout.LEFT,0,0));
        transactionsPanel.setBounds(460,410,610,300);
        transactionsPanel.add(latestTransactions);
    }

    public void logoImage()
    {
        ImageIcon logo = new ImageIcon("src\\main\\view\\images\\logo2.png");
        logo = new ImageProcessing().scaleImage(logo,300, (int)(HEIGHT*0.08));
        logoLabel.setIcon(logo);
    }


}
