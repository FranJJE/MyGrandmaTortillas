package main.models.interfaces;

import main.models.database.ReadDatabase;
import main.models.database.WriteDatabase;

public interface Database
{
    ReadDatabase getDatabase();
    WriteDatabase setDatabase();
}
