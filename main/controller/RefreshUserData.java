package main.controller;

import main.models.Model;
import main.view.frames.HomeFrame;

public class RefreshUserData
{
    private static HomeFrame home = null;
    private static Model model = null;

    public static void account()
    {
        String[] accountData = model.getDatabase().getAccountData( HomeFrame.userLogged );

        home.accountsPanel.ibanLabel.setText( accountData[0] );
        home.accountsPanel.holderLabel.setText( accountData[1] );
        home.accountsPanel.euroLabel.setText( accountData[2] );
    }

    public static void creditCards()
    {
        String[][] data = model.getDatabase().getCreditCardData( HomeFrame.userLogged );

        for(int i = 0; i < data.length; i++)
        {
            if(data[i][0] != null)
            {
                home.creditCardArr[i].deleteNewCardBtn();
                home.creditCardArr[i].expiryLabel.setText( data[i][0] );
                home.creditCardArr[i].cardnumLabel.setText( data[i][1] );
                home.creditCardArr[i].cvvLabel.setText( data[i][2] );
                home.creditCardArr[i].unselect();
            }
            else {
                home.creditCardArr[i].deleteCard();
            }

        }
    }

    public static void setHome(HomeFrame home) {
        RefreshUserData.home = home;
    }

    public static void setModel(Model model) {
        RefreshUserData.model = model;
    }
}
