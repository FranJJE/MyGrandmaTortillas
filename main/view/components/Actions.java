package main.view.components;

import javax.swing.*;
import java.awt.*;

public class Actions extends JPanel
{
    public final JLabel titleLabel;

    public Actions()
    {
        setOpaque(false);

        titleLabel = new JLabel("Actions");
        titleLabel.setFont( new Font("SansSerif", Font.BOLD,18));
        titleLabel.setForeground(Color.white);
        add(titleLabel);
    }

}
