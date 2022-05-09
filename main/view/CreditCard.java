package main.view;

import javax.swing.*;
import java.awt.*;

public class CreditCard extends JPanelBackground {
    private String cardNumber = "3456 0824 7462 1234";
    private String expirationDate = "12/22";
    private int cvv = 123;
    private String pin;

    private JLabel numLabel;
    private JLabel expLabel;
    private JLabel cvvLabel;
    private JButton newBtn;
    private JButton deleteBtn;

    public CreditCard()
    {
        super("src\\main\\view\\images\\emptyCard.png");
        initComponents();

        setLayout( new BorderLayout());
        setOpaque(false);
        add(newBtn, BorderLayout.CENTER);
    }

    public void initComponents()
    {
        ImageIcon newBtnIcon = new ImageIcon("src\\main\\view\\images\\newCardIcon.png");
        newBtnIcon = scaleImage(newBtnIcon,100,100);
        newBtn = new JButton(newBtnIcon);
        newBtn.setBackground(Color.white);
        newBtn.setFocusPainted(false);
        newBtn.setOpaque(false);
        newBtn.setBorder(null);

        /*JLabel label = new JLabel();
        label.setText(cardNumber);
        label.setBounds((int)(width*0.2), (int)(height*0.1),width,50);*/
    }

    public void activateCard(String pin)
    {
        this.pin = pin;
    }

}
