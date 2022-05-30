package main.controller.events.signupFrameEvents;

import main.models.Model;
import main.view.frames.LoginFrame;
import main.view.frames.SignupFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EventClickCreateUser implements ActionListener
{
    private final LoginFrame loginFrame;
    private final SignupFrame signupFrame;
    private final Model model;

    public EventClickCreateUser(SignupFrame signupFrame, LoginFrame loginFrame, Model model)
    {
        this.signupFrame = signupFrame;
        this.loginFrame = loginFrame;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ArrayList<String> userData = new ArrayList<>();

        for(JTextField field : signupFrame.textFieldsArr)
        {
            userData.add(field.getText());
        }

        model.setDatabase().createClient(userData);
        signupFrame.setVisible(false);
        loginFrame.setVisible(true);
    }
}
