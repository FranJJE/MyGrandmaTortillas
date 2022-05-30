package main.controller.events.homeFrameEvents;

import main.controller.RefreshUserData;
import main.models.Model;
import main.view.components.CreditCardPanel;
import main.view.frames.HomeFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickDeleteCard implements ActionListener
{
    private final Model model;

    public EventClickDeleteCard(Model model)
    {
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setDatabase().deleteCard( HomeFrame.selectedPanel );

        ((CreditCardPanel) HomeFrame.selectedPanel).deleteCard();
        HomeFrame.selectedPanel = null;
        RefreshUserData.creditCards();
    }
}
