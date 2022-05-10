package main.view.components;

import javax.swing.*;
import java.awt.*;

public class Transaction extends JPanel
{
    public final JLabel titleLabel;

    public Transaction(String title)
    {
        setOpaque(false);

        titleLabel = new JLabel(title);
        titleLabel.setFont( new Font("SansSerif", Font.BOLD,18));
        add(titleLabel);
    }




}
