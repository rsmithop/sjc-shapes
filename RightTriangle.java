import java.awt.*;

/**
 * Write a description of class RightTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RightTriangle extends Triangle
{

    /*
     * Draw the triangle with current specifications on screen.
     */
    protected void draw()
    {
        //if(isVisible) 
        {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { xPosition, xPosition + width, xPosition + width };
            int[] ypoints = { yPosition, yPosition - height, yPosition  };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }


}
