package main.controller;

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
    }

    public void events()
    {

    }
}
