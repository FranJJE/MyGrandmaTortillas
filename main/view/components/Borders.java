package main.view.components;

import javax.swing.*;
import javax.swing.border.Border;

public class Borders
{
    private static final Border raisedBevel = BorderFactory.createRaisedBevelBorder();
    private static final Border loweredBevel = BorderFactory.createLoweredBevelBorder();

    public static Border compound()
    {
        return BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);
    }
}
