package main.controller.events;

import main.view.components.CreditCardPanel;
import main.view.frames.HomeFrame;
import main.view.components.JPanelBackground;

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

        if(HomeFrame.selectedPanel instanceof CreditCardPanel)
        {
            ((CreditCardPanel) HomeFrame.selectedPanel).unselect();
        }

        if(panel instanceof CreditCardPanel)
        {
            ((CreditCardPanel) panel).select();
        }

        HomeFrame.selectedPanel = panel;
    }
}
