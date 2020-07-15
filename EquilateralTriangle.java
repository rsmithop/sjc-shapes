import java.awt.*;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle() {
        super();
        calcHeight();
    }

    /**
     * THis is called by the constructor and changeSize to override the height
     */
    private void calcHeight() {
        height=  Math.abs ((int) Math.round(width/2 *  Math.sqrt(3))) ;  //height is equal to side/2 x √3
    }

    /**
     * unique to this class... just assign the width and it will figure out the height
     * @param newWidth
     */
    public void changeWidth(int newWidth) {
        changeSize(0,newWidth);
    }


    /**
     * override the base method so we can calculate the height ourselves; not that this ignores whatever height you assign
     */
    public void changeSize(int newHeight, int newWidth)
    {
        erase();
        width = newWidth;
        calcHeight();
        draw();
    }


    /*
     * Draw the triangle with current specifications on screen.
     */
    protected void draw()
    {

        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { xPosition, xPosition + width/2, xPosition + width };
            int[] ypoints = { yPosition, yPosition - height, yPosition  };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }


    public static void main(String argsp[] ) {
        EquilateralTriangle et = new EquilateralTriangle();
        et.changeSize(180,110);
        et.setyPosition(100);
        et.makeVisible();
    }

}
