/**
 * This class creates two circles per Prop 1 and places an equilateral triangle in the middle.
 * The 3 points of the equilateral triangle seem to visually align with the intersecting points of the circles.
 * Is this a proof ?!?
 */
public class Proposition1 {
    private int yPos = 100;
    private int circle1X = 50;
    private int circle2x = 100;
    private int circleDiameter = 100;

    private Circle circle1 = new Circle();
    private Circle circle2 = new Circle();
    private EquilateralTriangle intersectTriangle = new EquilateralTriangle();


    public Proposition1() {
    }

    public Circle getCircle1() {
        return circle1;
    }

    public Circle getCircle2() {
        return circle2;
    }
    public EquilateralTriangle getIntersectTriangle() {
        return intersectTriangle;
    }

    public void initializeProof() {
        circle1.setxPosition(circle1X);
        circle1.setyPosition(yPos);
        circle1.changeSize(circleDiameter);

        circle2.setyPosition(yPos);
        circle2.changeSize(circleDiameter);
        circle2.setxPosition(circle2x);

        //equilateral triangle
        intersectTriangle.setColor("green");
        intersectTriangle.setyPosition(yPos + circleDiameter/2);
        intersectTriangle.setxPosition(circle1X + circleDiameter/2);
        intersectTriangle.changeWidth(circleDiameter/2);


        circle1.makeVisible();
        circle2.makeVisible();
        intersectTriangle.makeVisible();

        //QED ???
    }


    public final static void main(String args[]) {
        Proposition1 prop1 = new Proposition1();
        prop1.initializeProof();

    }

}
