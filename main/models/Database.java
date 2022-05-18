package main.models;

import java.sql.*;

public class Database
{
    private Connection ct;
    private Statement st;
    private ResultSet rs;

    public Database() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancodb","root","almero23");
            st = ct.createStatement();
            rs = st.executeQuery("select * from account");
            while(rs.next())
            {
                System.out.print("\nIBAN: " + rs.getString("iban"));
                System.out.print(", NAME: " + rs.getString("name"));
                System.out.print(", FUNDS: " + rs.getInt("funds"));
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
