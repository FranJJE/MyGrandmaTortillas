package main.controller.events.homeFrameEvents;

import main.controller.RefreshUserData;
import main.models.Model;
import main.view.components.CreditCardPanel;
import main.view.frames.HomeFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickNewCard implements ActionListener
{
    private final Model model;
    public EventClickNewCard(Model model)
    {
        this.model = model;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton btn = (JButton) e.getSource();
        CreditCardPanel panel = (CreditCardPanel) btn.getParent();

        if(HomeFrame.selectedPanel != null)
        {
            CreditCardPanel actualSelected = (CreditCardPanel) HomeFrame.selectedPanel;
            actualSelected.unselect();
        }

        model.setDatabase().createCreditCard( HomeFrame.userLogged );
        panel.deleteNewCardBtn();
        RefreshUserData.creditCards();
        panel.select();
        HomeFrame.selectedPanel = panel;

    }
}
