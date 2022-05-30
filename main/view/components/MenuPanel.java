package main.view.components;

import main.view.fonts.CustomFont;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel
{

    public final JLabel connection = new JLabel("Last Connection :");
    public final JLabel lastConnection = new JLabel();
    public final JButton homeBtn = new JButton("Home");
    public final JButton statsBtn = new JButton("Statistics");
    public final JButton aboutBtn = new JButton("About");
    public final JButton logoutBtn = new JButton("Logout");

    public MenuPanel()
    {
        setBackground(Color.darkGray);
        setBorder( Borders.compound() );
        add(homeBtn);
        add(statsBtn);
        add(aboutBtn);
        add(logoutBtn);
        add(new JLabel());
        add(connection);
        add(lastConnection);


        for(Component c : this.getComponents())
        {
            c.setForeground(Color.white);
            c.setBackground(null);

            if(c instanceof JButton)
            {
                ((JButton) c).setBorder( Borders.compound() );
                ((JButton) c).setFocusPainted(false);
                c.setFont( CustomFont.coolvetica(18) );
            }

            if(c instanceof JLabel)
            {
                c.setFont( CustomFont.coolvetica(14) );
                ((JLabel) c).setHorizontalAlignment(JLabel.CENTER);
            }
        }
    }

}
