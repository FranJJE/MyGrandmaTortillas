package main.controller.events.homeFrameEvents;

import main.controller.RefreshUserData;
import main.models.Model;
import main.view.frames.HomeFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickRetire implements ActionListener {
    private final Model model;

    public EventClickRetire(Model model)
    {
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String quantity = JOptionPane.showInputDialog("How much money do you want to withdraw? ");
        model.setDatabase().retireFunds( HomeFrame.userLogged, Integer.parseInt(quantity) );
        RefreshUserData.account();
    }
}
