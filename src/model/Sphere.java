package model;

import java.util.Objects;

import static java.lang.Math.pow;

public class Sphere implements GeometricShape
{

    private double radius;

    public Sphere(double radius)
    {
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

    @Override
    public double getVolume()
    {
        return (4 * 22 * pow(radius, 3)) / (3 * 7);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Sphere)) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getRadius());
    }
}
