package main.view.components;

import javax.swing.*;
import java.awt.*;

public class TitlePanel extends JPanel
{
    public final JLabelLogo logoLabel = new JLabelLogo("src\\main\\view\\images\\logo.png");
    public final Clock clockLabel = new Clock();

    public TitlePanel()
    {
        setBackground(Color.decode("#0026ca"));
        setBorder( Borders.compound() );
        add(logoLabel);
        add(clockLabel);

        logoLabel.setBounds(35,0,300,50);
        clockLabel.setBounds(1100,0,300,50);
    }
}
