package model;

import java.util.Objects;

public abstract class GeometricShape
{
    /**
     * In cubic centimeters
     */
    private int volume;
    private int id;
    private static int idSeed = 0;

    public GeometricShape(int volume)
    {
        this.volume = volume;
        this.id = idSeed++;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricShape that = (GeometricShape) o;
        return id == that.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
