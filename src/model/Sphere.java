package model;

public class Sphere extends GeometricShape
{

    private double radius;

    public Sphere(int volume, double radius)
    {
        super(volume);
        this.radius = radius;
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
