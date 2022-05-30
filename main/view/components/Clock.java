package main.view.components;

import main.view.fonts.CustomFont;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Clock extends JLabel implements Runnable
{
    Thread timer = null;
    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    String timeString = "";

    public Clock()
    {
        timer = new Thread(this);
        timer.start();

        setFont( CustomFont.coolvetica(40) );
        setForeground(Color.white);
        setBackground(null);
    }

    public void run() {
        try {
            while (true) {

                Calendar cal = Calendar.getInstance();
                hours = cal.get( Calendar.HOUR_OF_DAY );
                if ( hours > 12 ) hours -= 12;
                minutes = cal.get( Calendar.MINUTE );
                seconds = cal.get( Calendar.SECOND );

                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                Date date = cal.getTime();
                timeString = formatter.format( date );

                printTime();

                timer.sleep( 1000 );
            }
        }
        catch (Exception e) { }
    }

    public void printTime(){
        setText(timeString);
    }
}
