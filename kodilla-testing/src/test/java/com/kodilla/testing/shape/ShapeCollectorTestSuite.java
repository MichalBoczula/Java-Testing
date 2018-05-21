package com.kodilla.testing.shape;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

    @Before
    public void before(){
        System.out.println("TestCase: Begin");
    }

    @After
    public void after(){
        System.out.println("TestCase: End");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("TestSuit: Begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("TestSuit: End");
    }

    @Test
    public void testAddShape() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        Square square = new Square(3);
        Triangle triangle = new Triangle(4, 2);

        //when
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //then
        System.out.println("Testing: AddShape");
        assertEquals(3, shapeCollector.showFigures().size());
    }

    @Test
    public void testRemoveShape() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        Square square = new Square(3);
        Triangle triangle = new Triangle(4, 2);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //when
        boolean resultCircle = shapeCollector.removeFigure(circle);
        boolean resultSquare =  shapeCollector.removeFigure(square);
        boolean resultTriangel = shapeCollector.removeFigure(triangle);

        //then
        System.out.println("Testing: RemoveShape");
        assertTrue(resultCircle);
        assertTrue(resultSquare);
        assertTrue(resultTriangel);
        assertEquals(0, shapeCollector.showFigures().size());
    }

    @Test
    public void testRemoveShapeWhenNotExisting() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        Square square = new Square(3);
        Triangle triangle = new Triangle(4, 2);

        //when
        boolean resultCircle = shapeCollector.removeFigure(circle);
        boolean resultSqare =  shapeCollector.removeFigure(square);
        boolean resultTriangel = shapeCollector.removeFigure(triangle);

        //then
        System.out.println("Testing: RemoveShapeWhenNotExisting");
        assertFalse(resultCircle);
        assertFalse(resultSqare);
        assertFalse(resultTriangel);
    }

    @Test
    public void testGetShape() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);

        //when
        Shape result= shapeCollector.getFigure(0);

        //then
        System.out.println("Testing: testGetShape");
        assertEquals(circle, result);
    }
    @Test
    public void testGetShapeWhenNotExisting() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Shape result = shapeCollector.getFigure(0);

        //then
        System.out.println("Testing: testGetShapeWhenNotExisting");
        assertNull(result);
    }
    @Test
    public void testGetAllFigures() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapesListToCompare = new ArrayList<>();
        Circle circle = new Circle(2);
        Square square = new Square(3);
        Triangle triangle = new Triangle(4, 2);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapesListToCompare.add(circle);
        shapesListToCompare.add(square);
        shapesListToCompare.add(triangle);

        //when
        List<Shape> resultShapesList = new ArrayList<>(shapeCollector.showFigures());

        //then
        System.out.println("Testing: testGetAllFigures");
        assertArrayEquals(shapesListToCompare.toArray(), resultShapesList.toArray());
    }

    @Test
    public void testGetAllFiguresWhenNotExisting() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapesListToCompare = new ArrayList<>();

        //when
        List<Shape> resultShapesList = new ArrayList<>(shapeCollector.showFigures());

        //then
        // Który test jest lepiej używać porównanie pustej listy to pustej listy,
        // czy sprawdzenie jej wymiaru???
        System.out.println("Testing: testGetAllFiguresWhenNotExisting");
        assertEquals(0, resultShapesList.size());
        assertArrayEquals(shapesListToCompare.toArray(), resultShapesList.toArray());
    }
}
