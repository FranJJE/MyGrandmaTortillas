package main.models.database;

import java.sql.*;
import java.text.NumberFormat;

public class ReadDatabase
{
    private Connection ct;
    private Statement st;
    private ResultSet rs;

    public ReadDatabase() {
        try
        {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancodb","root","almero23");
            st = ct.createStatement();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public boolean thereIsUser(String username, String pass)
    {
        boolean exists = false;
        String query = "select username,password from clients where username='"+username+"' and password ='"+pass+"'";
        try
        {
            rs = st.executeQuery(query);
            if(rs.next())
            {
                exists = true;
            }
        }
        catch(SQLException ignored) {}

        return exists;
    }


    public String[] getAccountData(String username) {

        String query = "select a.iban,a.funds,c.name,c.lastname from clients c,accounts a where c.username='"+username+"' AND a.FK_username ='"+username+"'";
        String iban = "";
        String fullname = "";
        int funds = 0;
        String fundsStr = "";

        try {
            rs = st.executeQuery(query);
            while(rs.next())
            {
                iban = rs.getString("iban");
                fullname = rs.getString("name") + " " + rs.getString("lastname");
                funds = rs.getInt("funds");
            }
            fundsStr = NumberFormat.getInstance().format(funds);
            fundsStr += " €";

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return new String[]{iban,fullname,fundsStr};
    }


    public String[][] getCreditCardData(String username)
    {
        String query = "SELECT cardnum, expiry, cvv FROM creditcards WHERE FK_username='"+username+"' ORDER BY date ASC";
        String[][] data = new String[4][3];
        int i = 0;

        try {
            rs = st.executeQuery(query);
            while(rs.next())
            {
                data[i][0] = rs.getString("expiry");
                data[i][1] = rs.getString("cardnum");
                data[i][2] = String.valueOf( rs.getInt("cvv") );
                i++;
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return data;
    }
}
