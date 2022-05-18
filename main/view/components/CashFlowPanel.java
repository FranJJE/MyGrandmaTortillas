package main.view.components;

import javax.swing.*;
import java.awt.*;

public class CashFlowPanel extends JPanel
{
    public JLabel titleLabel;

    public CashFlowPanel()
    {
        setLayout( new FlowLayout(FlowLayout.LEFT,20,10));
        setBackground(Color.white);

        titleLabel = new JLabel("Cashflow");
        titleLabel.setFont( new Font("SansSerif", Font.BOLD,18));
        add(titleLabel);
    }


}
