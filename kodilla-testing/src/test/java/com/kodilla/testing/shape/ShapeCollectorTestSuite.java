package com.kodilla.testing.shape;
import org.junit.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testCaseAddFigure(){
    //Given
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
     //when
     shapeCollector.addFigure(circle);
     shapeCollector.addFigure(square);
     shapeCollector.addFigure(triangle);
     //then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
        Assert.assertEquals(square, shapeCollector.getFigure(1));
        Assert.assertEquals(triangle, shapeCollector.getFigure(2));



    }
    @Test
    public void testCaseremoveFigure(){
        //given
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        //when
        shapeCollector.addFigure(circle);

        shapeCollector.removeFigure(circle);
        //then
        //Assert.assertNotEquals(circle, shapeCollector.getFigure(0));


    }
    @Test
    public void testCaseGetFigure(){
        //given
        Shape circle = new Circle();
        Shape square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector();
        //when
        shapeCollector.addFigure(circle);
        shapeCollector.getFigure(0);
        //then
    }
}
