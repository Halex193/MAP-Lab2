package model;

public class Cylinder extends GeometricShape
{
    private double height;
    private double radius;

    public Cylinder(int volume, double height, double radius)
    {
        super(volume);
        this.height = height;
        this.radius = radius;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
