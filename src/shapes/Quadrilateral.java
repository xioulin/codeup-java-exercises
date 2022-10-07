package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    //
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength(double length) {
        return this.length;
    }

    public double getWidth(double width) {
        return this.width;
    }

    public abstract void setLength(double length);


    abstract public void setWidth(double width);



}
