package main.controller.events.signupFrameEvents;

import main.view.frames.LoginFrame;
import main.view.frames.SignupFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickCancel implements ActionListener
{
    private final LoginFrame loginFrame;
    private final SignupFrame signupFrame;

    public EventClickCancel(SignupFrame signupFrame, LoginFrame loginFrame)
    {
        this.signupFrame = signupFrame;
        this.loginFrame = loginFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        signupFrame.setVisible(false);
        loginFrame.setVisible(true);
    }
}
