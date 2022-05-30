package main.models.database;

import main.view.components.CreditCardPanel;
import main.view.frames.HomeFrame;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class WriteDatabase
{
    private Statement st;
    private ResultSet rs;

    public WriteDatabase() {
        try
        {
            Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancodb", "root", "almero23");
            st = ct.createStatement();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void createClient(ArrayList<String> userData)
    {
        StringBuilder query = new StringBuilder("insert into clients values (");
        for(String data : userData)
        {
            query.append("'").append(data).append("',");
        }
        query.setCharAt(query.length()-1, ')');

        System.out.println(query);
        try
        {
            st.executeUpdate(query.toString());
            createAccount(userData.get(0));
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void createAccount(String username)
    {
        StringBuilder query = new StringBuilder("insert into accounts (iban,FK_username,funds) values (");
        StringBuilder iban = new StringBuilder();

        iban.append("ES30");
        for(int i = 0; i < 4; i++)
        {
            iban.append(" ");
            for(int j = 0; j < 4; j++)
            {
                iban.append((int) (Math.random() * 9));
            }
        }
        query.append("'").append(iban).append("',");
        query.append("'").append(username).append("',");
        query.append("0").append(")");

        System.out.println(query);
        try
        {
            st.executeUpdate(query.toString());
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void createCreditCard(String username)
    {
        StringBuilder query = new StringBuilder("insert into creditcards (cardnum,FK_username,expiry,cvv,pin)values (");
        StringBuilder cardNumber = new StringBuilder();
        StringBuilder cvv = new StringBuilder();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-yy");
        LocalDateTime now = LocalDateTime.now();
        String[] date = dtf.format(now).split("-");
        int year = Integer.parseInt(date[1]);
        year +=5;
        date[1] = String.valueOf(year);

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                cardNumber.append((int) (Math.random() * 9));
            }
            cardNumber.append(" ");
        }

        for(int i = 0; i < 3; i++)
        {
            cvv.append((int) (Math.random() * 8)+1);
        }

        query.append("'").append(cardNumber).append("',");
        query.append("'").append(username).append("',");
        query.append("'").append(date[0]).append("/").append(date[1]).append("',");
        query.append(cvv).append(",");
        query.append(123).append(")");

        System.out.println(query);
        try
        {
            st.executeUpdate(query.toString());
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void transferFunds(String username, int quantity)
    {
        int funds = 0;

        try
        {
            rs = st.executeQuery("select funds from accounts where FK_username='"+ username +"'");
            if(rs.next())
            {
                funds = rs.getInt("funds");
            }

            st.executeUpdate("update accounts set funds="+(funds + quantity)+" where FK_username='"+ username +"';");
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void retireFunds(String username, int quantity)
    {
        int funds = 0;

        try
        {
            rs = st.executeQuery("select funds from accounts where FK_username='"+ username +"'");
            if(rs.next())
            {
                funds = rs.getInt("funds");
            }

            if(funds >= quantity)
            {
                st.executeUpdate("update accounts set funds="+(funds - quantity)+" where FK_username='"+ username +"';");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Insufficient funds to proceed with withdrawal");
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCard(JPanel panel)
    {
        try
        {
            if(HomeFrame.selectedPanel instanceof CreditCardPanel)
            {
                st.executeUpdate("DELETE FROM creditcards WHERE cardnum='"+((CreditCardPanel) panel).cardnumLabel.getText()+"'");
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
