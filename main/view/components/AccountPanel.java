package main.view.components;

import main.models.interfaces.Elegible;
import main.view.fonts.CustomFont;

import javax.swing.*;
import java.awt.*;

public class AccountPanel extends JPanelBackground implements Elegible
{
    public JButton selectBtn = new JButton();
    public JLabel holderLabel = new JLabel();
    public JLabel ibanLabel = new JLabel();
    public JLabel euroLabel = new JLabel();
    public JLabel balanceLabel = new JLabel();

    public AccountPanel()
    {
        super("src\\main\\view\\images\\accountsBG.png");
        initComponents();
    }

    public void initComponents()
    {
        setLayout(null);
        setBounds(0,50,610,200);
        setOpaque(false);
        add(holderLabel);
        add(ibanLabel);
        add(euroLabel);
        add(balanceLabel);
        add(selectBtn);

        selectBtn.setBounds(0,0,610,200);
        selectBtn.setBackground(Color.white);
        selectBtn.setOpaque(false);
        selectBtn.setBorder(null);
        selectBtn.setContentAreaFilled(false);

        holderLabel.setFont( CustomFont.coolvetica(32) );
        holderLabel.setBounds(30,25,600,25);

        ibanLabel.setFont( CustomFont.coolvetica(32) );
        ibanLabel.setBounds(30,75,600,25);

        euroLabel.setFont( CustomFont.coolvetica(32) );
        euroLabel.setBounds(450,140,200,25);

        balanceLabel.setText("Current balance:");
        balanceLabel.setFont( CustomFont.coolvetica(32) );
        balanceLabel.setBounds(30,140,400,25);



    }

    @Override
    public void select() {
        setBackground("src\\main\\view\\images\\accountsSelected.png");
        for(Component data : this.getComponents())
        {
            data.setForeground(Color.white);
        }
        repaint();
        revalidate();
    }

    @Override
    public void unselect() {
        setBackground("src\\main\\view\\images\\accountsBG.png");
        for(Component data : this.getComponents())
        {
            data.setForeground(Color.black);
        }
        repaint();
        revalidate();
    }
}
