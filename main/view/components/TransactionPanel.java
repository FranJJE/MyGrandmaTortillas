package main.view.components;

import javax.swing.*;
import java.awt.*;

public class TransactionPanel extends JPanel
{
    public final JLabel titleLabel;

    public TransactionPanel(String title)
    {
        setLayout( new FlowLayout(FlowLayout.LEFT,20,10));
        setBackground(Color.white);

        titleLabel = new JLabel(title);
        titleLabel.setFont( new Font("SansSerif", Font.BOLD,18));
        add(titleLabel);
    }




}
