package main.view;

import main.models.Elegible;

import javax.swing.*;
import java.awt.*;

public class CreditCard extends JPanelBackground implements Elegible {
    private String cardNumber = "3456 0824 7462 1234";
    private String expirationDate = "12/22";
    private int cvv = 123;
    private String pin;

    public JLabel numLabel;
    public JLabel expLabel;
    public JLabel cvvLabel;
    public JButton newBtn;
    public JButton deleteBtn;

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

    @Override
    public void select()
    {
        setBackground("src\\main\\view\\images\\selectedCard.png");
        newBtn.setVisible(false);
        newBtn.setEnabled(false);  // Puede ser que se pueda quitar
    }

    @Override
    public void unselect()
    {
        setBackground("src\\main\\view\\images\\emptyCard.png");
        newBtn.setVisible(true);
        newBtn.setEnabled(true);  // Puede ser que se pueda quitar
    }
}
