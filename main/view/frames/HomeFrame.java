package main.view.frames;

import main.view.components.*;
import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JFrame
{
    //*********************************************** VARIABLES ******************************************************/
    public final int WIDTH = 1280;
    public final int HEIGHT = 820;
    public static String userLogged = "";
    public static JPanelBackground selectedPanel = null;

    //*********************************************** GUI STRUCTURE **************************************************/
        public final JPanel mainPanel = new JPanel();
            public final MenuPanel menuPanel = new MenuPanel();
            public final TitlePanel titlePanel = new TitlePanel();
            public final JPanel contentPanel = new JPanel();
                public final ActionsPanel actionsPanel = new ActionsPanel();
                public final AccountPanel accountsPanel = new AccountPanel();
                public final JPanel cardsPanel = new JPanel();
                    public final CreditCardPanel[] creditCardArr = new CreditCardPanel[]{
                            new CreditCardPanel(),
                            new CreditCardPanel(),
                            new CreditCardPanel(),
                            new CreditCardPanel(),
                    };
                public final CashFlowPanel cashFlowPanel = new CashFlowPanel();
                public final TransactionPanel transactionsPanel = new TransactionPanel("Latest transactions");


    //************************************************ CONSTRUCTORS **************************************************/
    public HomeFrame()
    {
        initComponents();
    }

    //*************************************************** METHODS ****************************************************/
    public void initComponents()
    {
        //****** FRAME AND CONTAINERS ******/
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setPreferredSize( new Dimension(WIDTH,HEIGHT) );
        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(false);

        mainPanel.setBounds(0,0,WIDTH,HEIGHT);
        mainPanel.setLayout( null);
        mainPanel.add(titlePanel);
        mainPanel.add(menuPanel);
        mainPanel.add(contentPanel);

        contentPanel.setLayout(null);
        contentPanel.setBounds(150,50,WIDTH-150,HEIGHT-50);
        contentPanel.setBackground(Color.lightGray);
        contentPanel.add(actionsPanel);
        contentPanel.add(accountsPanel);
        contentPanel.add(cardsPanel);
        contentPanel.add(cashFlowPanel);
        contentPanel.add(transactionsPanel);

        //****** TOP AND SIDE PANELS ******/
        titlePanel.setLayout(null);
        titlePanel.setBounds(0,0,WIDTH,50);

        menuPanel.setLayout( new GridLayout(18,1));
        menuPanel.setBounds(0,50,150,HEIGHT);

        //****** TOP LEFT POSITION ******/
        actionsPanel.setLayout( null);
        actionsPanel.setBounds(40,20,400,200);

        //****** TOP RIGHT POSITION ******/
        accountsPanel.setLayout(null);
        accountsPanel.setBounds(460,20,610,200);

        //****** MIDDLE POSITION ******/
        cardsPanel.setLayout( new GridLayout(1,4,20,0));
        cardsPanel.setBounds(40,240,1030,150);
        cardsPanel.setOpaque(false);
        cardsPanel.add(creditCardArr[0]);
        cardsPanel.add(creditCardArr[1]);
        cardsPanel.add(creditCardArr[2]);
        cardsPanel.add(creditCardArr[3]);

        //****** BOTTOM LEFT POSITION ******/
        cashFlowPanel.setLayout( new FlowLayout( FlowLayout.LEFT,0,0));
        cashFlowPanel.setBounds(40,410,400,300);

        //****** BOTTOM RIGHT POSITION ******/
        transactionsPanel.setLayout( new FlowLayout( FlowLayout.LEFT,0,0));
        transactionsPanel.setBounds(460,410,610,300);
    }
}
