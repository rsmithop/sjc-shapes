import java.awt.*;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Square extends GeometricBaseShape
{
    private int size;

    /**
     * Create a new square at default position with default color.
     */
    public Square()
    {
        super();
        size = 30;
        xPosition = 60;
        yPosition = 50;
        color = "red";
    }


    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newSize)
    {
        erase();
        size = newSize;
        draw();
    }

/*
     * Draw the square with current specifications on screen.
     */
    protected void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                    new Rectangle(xPosition, yPosition, size, size));
            canvas.wait(10);
        }
    }
    

}
