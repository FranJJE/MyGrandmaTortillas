package main.view;

import main.models.Elegible;

import javax.swing.*;
import java.awt.*;

public class CreditCard extends JPanelBackground implements Elegible {
    private String cardNumber = "3456 0824 7462 1234";
    private String expDate = "12/22";
    private int cvv = 123;
    private String pin;

    public JPanel dataPanel;
        public JLabel numLabel;
        public JLabel expDateLabel;
        public JLabel cvvLabel;
    public JButton newBtn;
    public JButton deleteBtn;
    public JButton selectCardBtn;

    public CreditCard()
    {
        super("src\\main\\view\\images\\emptyCard.png");
        initComponents();

        setLayout( new BorderLayout());
        setOpaque(false);
        add(dataPanel, BorderLayout.SOUTH);
        add(newBtn, BorderLayout.CENTER);
    }

    public void initComponents()
    {
        numLabel = new JLabel(cardNumber);
        cvvLabel = new JLabel(String.valueOf(cvv));
        expDateLabel = new JLabel(expDate);

        dataPanel = new JPanel( new FlowLayout(FlowLayout.LEFT,15,20));
        dataPanel.setBackground(null);
        dataPanel.setOpaque(false);

        ImageIcon newBtnIcon = new ImageIcon("src\\main\\view\\images\\newCardIcon.png");
        newBtnIcon = scaleImage(newBtnIcon,100,100);
        newBtn = new JButton(newBtnIcon);
        newBtn.setBackground(Color.white);
        newBtn.setFocusPainted(false);
        newBtn.setOpaque(false);
        newBtn.setBorder(null);
        newBtn.setContentAreaFilled(false);

        selectCardBtn = new JButton();
        selectCardBtn.setBackground(Color.white);
        selectCardBtn.setFocusPainted(false);
        selectCardBtn.setOpaque(false);
        selectCardBtn.setBorder(null);
        selectCardBtn.setEnabled(true);
        selectCardBtn.setVisible(true);
        selectCardBtn.setContentAreaFilled(false);
    }

    public void activateCard(String pin)
    {
        this.pin = pin;
    }

    @Override
    public void select()
    {
        setBackground("src\\main\\view\\images\\selectedCard.png");
        for(Component data : dataPanel.getComponents())
        {
            data.setForeground(Color.white);
        }
        revalidate();
        repaint();
    }

    @Override
    public void unselect()
    {
        setBackground("src\\main\\view\\images\\debitCard.png");
        for(Component data : dataPanel.getComponents())
        {
            data.setForeground(Color.black);
        }
        revalidate();
        repaint();
    }

    public void deleteNewCardBtn()
    {
        remove(newBtn);
        add(selectCardBtn, BorderLayout.CENTER);
        dataPanel.add(expDateLabel);
        dataPanel.add(numLabel);
        dataPanel.add(cvvLabel);
        revalidate();
        repaint();
    }
}
