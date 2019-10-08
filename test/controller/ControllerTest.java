package controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import repository.MemoryRepository;
import repository.Repository;
import repository.exceptions.EntityAlreadyExistsException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ControllerTest
{

    private Repository repository;
    private Controller controller;

    @BeforeEach
    void setUp() throws Exception
    {
        repository = new MemoryRepository();
        controller = new Controller(repository);

        controller.addCube(12);
        controller.addCube(24);
        controller.addSphere(43);
        controller.addCylinder(8, 5);
    }

    @Test
    void testAdd() throws Exception
    {
        controller.addCube(14);
        assertEquals(controller.getShapes().length, 5);
        controller.addSphere(47);
        assertEquals(controller.getShapes().length, 6);
        controller.addCylinder(8, 12);
        assertEquals(controller.getShapes().length, 7);

        assertThrows(EntityAlreadyExistsException.class, () -> controller.addCube(14));
        assertThrows(EntityAlreadyExistsException.class, () -> controller.addCylinder(8, 5));
        assertThrows(EntityAlreadyExistsException.class, () -> controller.addSphere(47));
    }

    @Test
    void testRemove() throws Exception
    {
        assertTrue(controller.removeCube(12));
        assertEquals(controller.getShapes().length, 3);
        assertTrue(controller.removeSphere(43));
        assertEquals(controller.getShapes().length, 2);
        assertTrue(controller.removeCylinder(8, 5));
        assertEquals(controller.getShapes().length, 1);
    }

    @AfterEach
    void tearDown() throws Exception
    {
        controller = null;
        repository = null;
    }
}