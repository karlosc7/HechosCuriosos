import android.graphics.Color;

import java.util.Random;
/**
 * Created by karlosc on 03/12/2014.
 */
public class ColorWheel {

    public static String [] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    public static int getRandomColor( ) {
        Random randomGenerator = new Random(); //Construct new Random number Generator
        int randomNumber = randomGenerator.nextInt(mColors.length); // limit to three
        return Color.parseColor(mColors[randomNumber]);
    }
}
