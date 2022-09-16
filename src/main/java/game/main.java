package game;

import com.badlogic.gdx.math.Vector2;

import javax.swing.*;
import java.awt.*;

import javax.vecmath.Vector2d;

public class main {
    public static void main(String[] args)
    {
        System.out.println("Hello");
        JFrame frame = new JFrame("Main frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(100, 200));
        frame.setVisible(true);

        // Example of Vector2d class from vecmath library
        Vector2d v1 = new Vector2d(1, 1);
        Vector2d v2 = new Vector2d(1, 1);

        Vector2d v3 = new Vector2d(v1) {{
            add(v2);
        }};

        // Example of Vector2 class from libGDX library
        // This library allows the chaining of function.
        Vector2 v11 = new Vector2(1, 1);
        Vector2 v22 = new Vector2(1, 1);
        Vector2 v33 = v11.add(v22);

    }
}
