package main.view.components;

import main.utilities.ImageProcessing;

import javax.swing.*;

public class JLogoLabel extends JLabel
{
    public JLogoLabel(String path, int width, int height)
    {
        ImageIcon logo = new ImageIcon(path);
        logo = new ImageProcessing().scaleImage(logo,width, height);
        setIcon(logo);
    }
}
