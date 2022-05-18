package main.controller;

import main.controller.events.EventClickNewCard;
import main.controller.events.EventClickSelectCard;
import main.models.Model;
import main.view.frames.HomeFrame;
import main.view.frames.LoginFrame;
import main.view.frames.SignupFrame;

public class Controller
{
    private Model model;
    private HomeFrame home;
    private LoginFrame login;
    private SignupFrame signup;

    public Controller()
    {
        model = new Model();
        login = new LoginFrame();
        signup = new SignupFrame();
        home = new HomeFrame();

        events();
    }

    public void events()
    {
        home.cc1.newBtn.addActionListener( new EventClickNewCard());
        home.cc2.newBtn.addActionListener( new EventClickNewCard());
        home.cc3.newBtn.addActionListener( new EventClickNewCard());
        home.cc4.newBtn.addActionListener( new EventClickNewCard());

        home.cc1.selectCardBtn.addActionListener( new EventClickSelectCard());
        home.cc2.selectCardBtn.addActionListener( new EventClickSelectCard());
        home.cc3.selectCardBtn.addActionListener( new EventClickSelectCard());
        home.cc4.selectCardBtn.addActionListener( new EventClickSelectCard());
    }
}
