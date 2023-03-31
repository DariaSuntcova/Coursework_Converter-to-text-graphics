package ru.netology.graphics.image;

public class ColorSchemaInText implements TextColorSchema {
    static final String DENSITY = "#$@%*+-'";
    //static final String DENSITY = "▇●◉◍◎○☉◌-";
    @Override
    public char convert(int color) {
        int charValue = (int) Math.round(DENSITY.length() / 255.0 * color);
        charValue = Math.max(charValue, 0);
        charValue = Math.min(charValue, DENSITY.length() - 1);
        return DENSITY.charAt(charValue);
    }
}
