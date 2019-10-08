package model;

import java.util.Objects;

import static java.lang.Math.pow;

public class Cube implements GeometricShape
{
    private double sideLength;

    public Cube(double sideLength)
    {
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

    @Override
    public double getVolume()
    {
        return pow(sideLength, 3);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Cube)) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.getSideLength(), getSideLength()) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getSideLength());
    }
}
