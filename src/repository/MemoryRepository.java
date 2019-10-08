package repository;

import model.GeometricShape;
import repository.exceptions.EntityNotFoundException;
import repository.exceptions.OutOfSpaceException;
import java.util.Arrays;

public class MemoryRepository implements Repository
{
    private static final int MAXIMUM_SIZE = 100;
    private GeometricShape[] storedShapes = new GeometricShape[MAXIMUM_SIZE];
    private int numberOfShapes;

    @Override
    public void add(GeometricShape geometricShape)
    {
        if (numberOfShapes == MAXIMUM_SIZE)
        {
            throw new OutOfSpaceException();
        }
        storedShapes[numberOfShapes++] = geometricShape;
    }

    @Override
    public boolean remove(GeometricShape geometricShape)
    {
        for (int i = 0; i < storedShapes.length; i++)
        {
            if (storedShapes[i].equals(geometricShape))
            {
                if (numberOfShapes - i >= 0)
                    System.arraycopy(storedShapes, i + 1, storedShapes, i, numberOfShapes - i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(GeometricShape geometricShape)
    {
        for (int i = 0; i < numberOfShapes; i++)
        {
            if (storedShapes[i].equals(geometricShape))
            {
                storedShapes[i] = geometricShape;
                return;
            }
        }
        throw new EntityNotFoundException();
    }

    @Override
    public GeometricShape[] getGeometricShapes()
    {
        return Arrays.copyOf(storedShapes, MAXIMUM_SIZE);
    }
}
