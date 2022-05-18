package main.view.components;

import javax.swing.*;
import java.awt.*;

public class JPanelBackground extends JPanel
{
    private Image img;

    public JPanelBackground(String img)
    {
        this(new ImageIcon(img).getImage());
    }

    public JPanelBackground(Image img)
    {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    public void setBackground(String img)
    {
        this.img = new ImageIcon(img).getImage();
    }

    public void setBackground(Image img)
    {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        int width = this.getSize().width;
        int height = this.getSize().height;
        g.drawImage(img, 0, 0,width,height, null);
    }


    public ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if(icon.getIconWidth() > w)
        {
            nw = w;
            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if(nh > h)
        {
            nh = h;
            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }

}
