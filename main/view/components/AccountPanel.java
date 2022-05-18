package main.view.components;

import main.models.Elegible;

import javax.swing.*;
import java.awt.*;

public class AccountPanel extends JPanel implements Elegible
{

    public JLabel titleLabel = new JLabel();
    public JPanel contentPanel = new JPanel();
        public JLabel holderLabel = new JLabel("Francisco Jesús Jimenez");
        public JLabel ibanLabel = new JLabel("ES30 4279 4328 4324 3443");
        public JLabel totalLabel = new JLabel("45.454 €");

    public AccountPanel()
    {
        initComponents();
    }

    public void initComponents()
    {
        setLayout(null);
        setBounds(0,0,610,200);
        setOpaque(false);
        add(titleLabel);
        add(contentPanel);

        titleLabel.setText("Account");
        titleLabel.setBounds(20,10,570,50);
        titleLabel.setFont( new Font("SansSerif", Font.BOLD,18));

        contentPanel.setLayout(null);
        contentPanel.setBounds(20,100,570,150);
        contentPanel.setOpaque(false);
        contentPanel.add(holderLabel);
        contentPanel.add(ibanLabel);
        contentPanel.add(totalLabel);

        holderLabel.setFont( new Font("SansSerif",Font.BOLD,18));
        holderLabel.setBounds(20,0,250,25);

        ibanLabel.setFont( new Font("SansSerif",Font.BOLD,18));
        ibanLabel.setBounds(20,40,250,25);

        totalLabel.setFont( new Font("SansSerif",Font.BOLD,28));
        totalLabel.setBounds(350,0,230,50);
    }

    @Override
    public void select() {

    }

    @Override
    public void unselect() {

    }
}
