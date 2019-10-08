package controller;

import java.util.Arrays;

import model.Cube;
import model.Cylinder;
import model.GeometricShape;
import model.Sphere;
import repository.Repository;
import repository.exceptions.EntityAlreadyExistsException;
import repository.exceptions.OutOfSpaceException;

public class Controller
{
    protected static final int MININUM_VOLUME = 25;
    private Repository repository;

    public Controller(Repository repository)
    {
        this.repository = repository;
    }

    public void addCube(double sideLength) throws OutOfSpaceException, EntityAlreadyExistsException
    {
        Cube cube = new Cube(sideLength);
        repository.add(cube);
    }

    public void addCylinder(double height, double radius) throws OutOfSpaceException, EntityAlreadyExistsException
    {
        Cylinder cylinder = new Cylinder(height, radius);
        repository.add(cylinder);
    }

    public void addSphere(double radius) throws OutOfSpaceException, EntityAlreadyExistsException
    {
        Sphere sphere = new Sphere(radius);
        repository.add(sphere);
    }

    public boolean removeCube(double sideLength)
    {
        Cube cube = new Cube(sideLength);
        return repository.remove(cube);
    }

    public boolean removeCylinder(double height, double radius)
    {
        Cylinder cylinder = new Cylinder(height, radius);
        return repository.remove(cylinder);
    }

    public boolean removeSphere(double radius)
    {
        Sphere sphere = new Sphere(radius);
        return repository.remove(sphere);
    }

    public GeometricShape[] getShapes()
    {
        return repository.getGeometricShapes();
    }

    public GeometricShape[] getFilteredShapes()
    {
        return Arrays.stream(repository.getGeometricShapes())
                     .filter((geometricShape) -> geometricShape.getVolume() > MININUM_VOLUME)
                     .toArray(GeometricShape[]::new);
    }
}
