package main.view.components;

import javax.swing.*;
import java.awt.*;

public class CashFlow extends JPanel
{
    public JLabel titleLabel;

    public CashFlow()
    {
        setOpaque(false);

        titleLabel = new JLabel("Cashflow");
        titleLabel.setFont( new Font("SansSerif", Font.BOLD,18));
        add(titleLabel);
    }


}
