package main.controller.events;

import main.view.CreditCard;
import main.view.GUI;
import main.view.JPanelBackground;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickSelectCard implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton btn = (JButton) e.getSource();
        JPanelBackground panel = (JPanelBackground) btn.getParent();

        if(GUI.selectedPanel instanceof CreditCard)
        {
            ((CreditCard) GUI.selectedPanel).unselect();
        }

        if(panel instanceof CreditCard)
        {
            ((CreditCard) panel).select();
        }

        GUI.selectedPanel = panel;
    }
}
