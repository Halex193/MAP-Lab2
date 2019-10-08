package repository;

import model.GeometricShape;
import repository.exceptions.EntityAlreadyExistsException;
import repository.exceptions.EntityNotFoundException;
import repository.exceptions.OutOfSpaceException;

public interface Repository
{
    void add(GeometricShape geometricShape) throws OutOfSpaceException,
            EntityAlreadyExistsException;

    boolean remove(GeometricShape geometricShape);

    void update(GeometricShape geometricShape) throws EntityNotFoundException;

    GeometricShape[] getGeometricShapes();
}
