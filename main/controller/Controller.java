package main.controller;

import main.controller.events.EventClickNewCard;
import main.controller.events.EventClickSelectCard;
import main.models.Model;
import main.view.GUI;

public class Controller
{
    private Model model;
    private GUI view;

    public Controller()
    {
        model = new Model();
        view = new GUI();

        events();
    }

    public void events()
    {
        view.cc1.newBtn.addActionListener( new EventClickNewCard());
        view.cc2.newBtn.addActionListener( new EventClickNewCard());
        view.cc3.newBtn.addActionListener( new EventClickNewCard());
        view.cc4.newBtn.addActionListener( new EventClickNewCard());

        view.cc1.selectCardBtn.addActionListener( new EventClickSelectCard());
        view.cc2.selectCardBtn.addActionListener( new EventClickSelectCard());
        view.cc3.selectCardBtn.addActionListener( new EventClickSelectCard());
        view.cc4.selectCardBtn.addActionListener( new EventClickSelectCard());
    }
}
