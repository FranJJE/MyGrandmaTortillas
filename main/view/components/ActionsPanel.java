package main.view.components;

import main.utilities.ImageProcessing;
import main.view.fonts.CustomFont;

import javax.swing.*;
import java.awt.*;

public class ActionsPanel extends JPanelBackground
{
    public final JLabel titleLabel;
    public final JPanel buttonPanel;
        public final JButton transferBtn;
        public final JButton changeCoinBtn;
        public final JButton retireBtn;
        public final JButton deleteCardBtn;


    public ActionsPanel()
    {
        super("src\\main\\view\\images\\newsBG.png");
        setLayout( null );
        setOpaque( false );

        titleLabel = new JLabel("Actions");
        titleLabel.setBounds(20,10,300,50);
        titleLabel.setFont( CustomFont.coolvetica(22) );
        titleLabel.setForeground(Color.black);
        titleLabel.setIconTextGap(-85);

        transferBtn = new JButton("Transfer Money");
        transferBtn.setBounds(20,60,170,50);

        changeCoinBtn = new JButton("Change Coin");
        changeCoinBtn.setBounds(210,60,170,50);

        retireBtn = new JButton("Retire Money");
        retireBtn.setBounds(20,130,170,50);

        deleteCardBtn = new JButton("Delete Card");
        deleteCardBtn.setBounds(210,130,170,50);

        buttonPanel = new JPanel();

        ImageIcon bg = new ImageIcon("src\\main\\view\\images\\accountsBG.png");
        bg = new ImageProcessing().scaleImage(bg,100, 70);
        titleLabel.setIcon(bg);

        add(titleLabel);
        add(transferBtn);
        add(changeCoinBtn);
        add(retireBtn);
        add(deleteCardBtn);

        for(Component c : this.getComponents())
        {
            if(c instanceof JButton)
            {
                c.setForeground(Color.white);
                c.setBackground(Color.white);
                ((JButton) c).setOpaque(false);
                ((JButton) c).setFocusPainted(false);
                c.setFont( CustomFont.coolvetica(14) );
            }
        }

    }

}
