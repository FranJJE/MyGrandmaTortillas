package main.view.components;

import main.models.Elegible;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Account extends JPanel implements Elegible
{
    //public JButton transferBtn = new JButton("Transfer Money");
    public JLabel titleLabel;
    public JPanel contentPanel;
        public JLabel totalLabel = new JLabel("45.454 €");
        public JLabel holderLabel = new JLabel("Francisco Jesús Jimenez");
        public JLabel ibanLabel = new JLabel("ES30 4279 4328 4324 3443");
        public Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);


    public Account()
    {
        titleLabel = new JLabel("Account");
        titleLabel.setFont( new Font("SansSerif", Font.BOLD,18));

        contentPanel = new JPanel(null);
        contentPanel.add(holderLabel);
        contentPanel.add(ibanLabel);
        contentPanel.add(totalLabel);

        //setLayout(null);
        setOpaque(false);
        add(titleLabel);
        add(contentPanel);
    }

    public void initComponents()
    {

    }

    @Override
    public void select() {

    }

    @Override
    public void unselect() {

    }
}
