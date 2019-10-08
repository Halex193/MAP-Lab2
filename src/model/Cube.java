package model;

public class Cube extends GeometricShape
{
    private double sideLength;

    public Cube(int volume, double sideLength)
    {
        super(volume);
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength)
    {
        this.sideLength = sideLength;
    }

    public double getSideLength()
    {
        return sideLength;
    }
}
