package main.view.components;

import main.utilities.ImageProcessing;

import javax.swing.*;
import java.awt.*;

public class ActionsPanel extends JPanel
{
    public final JLabel titleLabel;

    public ActionsPanel()
    {
        setLayout( new FlowLayout(FlowLayout.LEFT,20,10));
        setOpaque(false);

        titleLabel = new JLabel("Actions");
        titleLabel.setFont( new Font("SansSerif", Font.BOLD,18));
        titleLabel.setForeground(Color.black);
        titleLabel.setIconTextGap(-85);
        ImageIcon bg = new ImageIcon("src\\main\\view\\images\\accountsBG.png");
        bg = new ImageProcessing().scaleImage(bg,100, 70);
        titleLabel.setIcon(bg);

        add(titleLabel);
    }

}
