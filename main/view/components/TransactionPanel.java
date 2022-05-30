package main.view.components;

import main.view.fonts.CustomFont;

import javax.swing.*;
import java.awt.*;

public class TransactionPanel extends JPanelBackground
{
    public final JLabel titleLabel;

    public TransactionPanel(String title)
    {
        super("src\\main\\view\\images\\transactionsBG.png");
        setLayout( new FlowLayout(FlowLayout.LEFT,20,10));
        setBackground(Color.white);

        titleLabel = new JLabel(title);
        titleLabel.setFont( CustomFont.coolvetica(22) );
        add(titleLabel);
    }




}
