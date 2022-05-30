package main.controller.events.loginEvents;

import main.controller.RefreshUserData;
import main.models.Model;
import main.view.frames.HomeFrame;
import main.view.frames.LoginFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickLogin implements ActionListener
{
    private final LoginFrame login;
    private final HomeFrame home;
    private final Model model;

    public EventClickLogin(HomeFrame home, LoginFrame login, Model model)
    {
        this.home = home;
        this.login = login;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = login.loginUserField.getText();
        String pass = login.loginPassField.getText();

        if(model.getDatabase().thereIsUser(user,pass))
        {
            home.setVisible(true);
            HomeFrame.userLogged = user;
            login.setVisible(false);
            RefreshUserData.account();
            RefreshUserData.creditCards();
        }
        else {
            JOptionPane.showMessageDialog(null,"Wrong credentials. Try again.");
        }
    }
}
