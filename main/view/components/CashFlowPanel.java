package main.view.components;

import main.view.fonts.CustomFont;

import javax.swing.*;
import java.awt.*;

public class CashFlowPanel extends JPanelBackground
{
    public JLabel titleLabel;

    public CashFlowPanel()
    {
        super("src\\main\\view\\images\\othersBG.png");
        setLayout( new FlowLayout(FlowLayout.LEFT,20,10));
        setBackground(Color.white);

        titleLabel = new JLabel("Cashflow");
        titleLabel.setFont( CustomFont.coolvetica(22) );
        add(titleLabel);
    }


}
