package repository;

import model.GeometricShape;

public interface Repository
{
    void add(GeometricShape geometricShape);

    boolean remove(GeometricShape geometricShape);

    void update(GeometricShape geometricShape);

    GeometricShape[] getGeometricShapes();
}
