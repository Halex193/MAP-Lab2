package model;

import java.util.Objects;

public class Cylinder implements GeometricShape
{
    private double height;
    private double radius;

    public Cylinder(double height, double radius)
    {
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

    @Override
    public double getVolume()
    {
        return (22 * radius * radius * height) / 7;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Cylinder)) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.getHeight(), getHeight()) == 0 &&
                Double.compare(cylinder.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getHeight(), getRadius());
    }
}
