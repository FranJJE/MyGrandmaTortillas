package main.view.fonts;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CustomFont {

    public static Font coolvetica(int size) {
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File("src\\main\\view\\fonts\\coolvetica\\cool_plain.otf")).deriveFont(Font.PLAIN, size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
        } catch (FontFormatException| IOException e) {
        }
        return font;
    }
}
