package main.controller.events.homeFrameEvents;

import main.view.components.AccountPanel;
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

        if(HomeFrame.selectedPanel instanceof CreditCardPanel) {
            ((CreditCardPanel) HomeFrame.selectedPanel).unselect();
        }
        if(panel instanceof CreditCardPanel) {
            ((CreditCardPanel) panel).select();
        }

        if(HomeFrame.selectedPanel instanceof AccountPanel) {
            ((AccountPanel) HomeFrame.selectedPanel).unselect();
        }
        if(panel instanceof AccountPanel) {
            ((AccountPanel) panel).select();
        }

        HomeFrame.selectedPanel = panel;
    }
}
