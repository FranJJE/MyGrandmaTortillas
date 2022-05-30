package main.view.components;

import main.models.interfaces.Elegible;
import main.view.fonts.CustomFont;

import javax.swing.*;
import java.awt.*;

public class CreditCardPanel extends JPanelBackground implements Elegible {
    private String pin;

    public JPanel dataPanel;
        public JLabel cardnumLabel;
        public JLabel expiryLabel;
        public JLabel cvvLabel;
    public JButton newBtn;
    public JButton deleteBtn;
    public JButton selectCardBtn;

    public CreditCardPanel()
    {
        super("src\\main\\view\\images\\emptyCard.png");
        initComponents();

        setLayout( new BorderLayout());
        setOpaque(false);
        add(newBtn, BorderLayout.CENTER);
    }

    public void initComponents()
    {
        cardnumLabel = new JLabel();
        cvvLabel = new JLabel();
        expiryLabel = new JLabel();

        dataPanel = new JPanel( new FlowLayout(FlowLayout.LEFT,13,15));
        dataPanel.setBackground(null);
        dataPanel.setOpaque(false);
        dataPanel.add(expiryLabel);
        dataPanel.add(cardnumLabel);
        dataPanel.add(cvvLabel);
        for(Component c : dataPanel.getComponents())
        {
            c.setFont( CustomFont.coolvetica(14) );
        }

        ImageIcon newBtnIcon = new ImageIcon("src\\main\\view\\images\\newCardIcon.png");
        newBtnIcon = scaleImage(newBtnIcon,this.getWidth()/8,this.getHeight()/8);
        newBtn = new JButton(newBtnIcon);
        newBtn.setFocusPainted(false);
        newBtn.setBorder(null);
        newBtn.setContentAreaFilled(false);

        selectCardBtn = new JButton();
        selectCardBtn.setBorder(null);
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
        add(dataPanel, BorderLayout.SOUTH);
        revalidate();
        repaint();
    }

    public void deleteCard()
    {
        setBackground("src\\main\\view\\images\\emptyCard.png");
        add(newBtn);
        remove(selectCardBtn);
        remove(dataPanel);
        revalidate();
        repaint();
    }
}
