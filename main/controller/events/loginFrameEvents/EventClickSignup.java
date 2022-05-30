package main.controller.events.loginFrameEvents;

import main.view.frames.SignupFrame;
import main.view.frames.LoginFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventClickSignup implements ActionListener
{
    private final LoginFrame loginFrame;
    private final SignupFrame signupFrame;

    public EventClickSignup(SignupFrame signupFrame, LoginFrame loginFrame)
    {
        this.signupFrame = signupFrame;
        this.loginFrame = loginFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        loginFrame.setVisible(false);
        signupFrame.setVisible(true);
    }

}
