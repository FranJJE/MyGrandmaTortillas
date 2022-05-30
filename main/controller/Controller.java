package main.controller;

import main.controller.events.homeFrameEvents.*;
import main.controller.events.loginEvents.EventClickLogin;
import main.controller.events.loginFrameEvents.EventClickSignup;
import main.controller.events.signupFrameEvents.EventClickCancel;
import main.controller.events.signupFrameEvents.EventClickCreateUser;
import main.models.Model;
import main.view.frames.HomeFrame;
import main.view.frames.LoginFrame;
import main.view.frames.SignupFrame;


public class Controller
{
    private final Model model;
    private HomeFrame home;
    private LoginFrame login;
    private SignupFrame signup;

    public Controller()
    {
        model = new Model();
        model.getTodayDate();
        home = new HomeFrame();
        signup = new SignupFrame();
        login = new LoginFrame();
        eventsHome();
        eventsSignup();
        eventsLogin();
        RefreshUserData.setHome(home);
        RefreshUserData.setModel(model);

        /*home = new HomeFrame();
        home.userLogged = "77241533N";
        eventsHome();
        setCreditCardData();*/
    }

    public void eventsHome()
    {
        home.creditCardArr[0].newBtn.addActionListener( new EventClickNewCard(model));
        home.creditCardArr[1].newBtn.addActionListener( new EventClickNewCard(model));
        home.creditCardArr[2].newBtn.addActionListener( new EventClickNewCard(model));
        home.creditCardArr[3].newBtn.addActionListener( new EventClickNewCard(model));

        home.creditCardArr[0].selectCardBtn.addActionListener( new EventClickSelectCard());
        home.creditCardArr[1].selectCardBtn.addActionListener( new EventClickSelectCard());
        home.creditCardArr[2].selectCardBtn.addActionListener( new EventClickSelectCard());
        home.creditCardArr[3].selectCardBtn.addActionListener( new EventClickSelectCard());
        home.accountsPanel.selectBtn.addActionListener( new EventClickSelectCard());

        home.actionsPanel.transferBtn.addActionListener( new EventClickTransfer(model));
        home.actionsPanel.retireBtn.addActionListener( new EventClickRetire(model));
        home.actionsPanel.deleteCardBtn.addActionListener( new EventClickDeleteCard(model));

    }

    public void eventsLogin()
    {
        login.loginButton.addActionListener( new EventClickLogin(home,login,model));
        login.signupButton.addActionListener( new EventClickSignup(signup,login));
    }

    public void eventsSignup()
    {
        signup.createUserButton.addActionListener( new EventClickCreateUser(signup,login,model));
        signup.cancelButton.addActionListener( new EventClickCancel(signup,login));
    }



}
