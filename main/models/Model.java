package main.models;

import main.models.database.ReadDatabase;
import main.models.database.WriteDatabase;
import main.models.interfaces.Database;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Model implements Database
{
    ReadDatabase readDatabase;
    WriteDatabase writeDatabase;

    public Model()
    {
        readDatabase = new ReadDatabase();
        writeDatabase = new WriteDatabase();
    }

    /*public void validateUserData(ArrayList<String>)*/

    public void getTodayDate()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    @Override
    public ReadDatabase getDatabase() {
        return readDatabase;
    }

    @Override
    public WriteDatabase setDatabase() {
        return writeDatabase;
    }
}
