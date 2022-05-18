package main.controller.events;

import main.view.components.CreditCard;
import main.view.GUI;
import main.view.components.JPanelBackground;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickNewCard implements ActionListener
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
            ((CreditCard) panel).deleteNewCardBtn();
            ((CreditCard) panel).select();
        }

        GUI.selectedPanel = panel;
    }
}
