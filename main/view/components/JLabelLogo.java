package main.view.components;

import javax.swing.*;

public class JLabelLogo extends JLabel
{
    public JLabelLogo(String path)
    {
        ImageIcon logo = new ImageIcon(path);
        setIcon(logo);
    }
}
