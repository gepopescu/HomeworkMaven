import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBasicAdd {


    static CalculatorBasic basicCalculator;

    static public void printMessage(String message) {
        System.out.println(message);
    }

    @BeforeClass
    static public void setUp() {
        basicCalculator = new CalculatorBasic();
        printMessage("SetUp");
    }

    @Before
    public void setUpTest() {
        printMessage("BeforeeachTest");
    }

    @Test
    public void testAddDouble() {
        CalculatorBasic basicCalculator = new CalculatorBasic();
        Double result = basicCalculator.add(2.5, 2.5);
        Assert.assertEquals("Message in case of failure", (Double) 5.0, result);

        Assert.assertNotNull("message-not null", result);
    }

    @Test
    public void expressionTest() {
        Assert.assertNotNull(basicCalculator);
    }

    @Test
    public void testAdd2MaxInts() {
        Integer result = basicCalculator.add(Integer.MAX_VALUE, Integer.MIN_VALUE);
        //Assert.fail();
    }

    @Test
    public void testAddASingleValue() {
        Integer result = basicCalculator.add(1);
        Assert.assertEquals((Integer) 1, result);

    }

    @Test
    public void testAddInt() {
        Integer result = basicCalculator.add(2, 2);
        Assert.assertEquals("Message in case of failure", (Integer) 4, result);
    }
    @Test
    public void testAddIntF() {
       // Integer result = basicCalculator.add(2, 2);
        Assert.assertFalse("Message in case of failure", (basicCalculator.add(2, 2) != 4));
    }

    @Test
    public void testAddLong() {
        long result = basicCalculator.add(10000000, 240000000);
        Assert.assertEquals("Message in case of failure", (long) 250000000, result);


    }

    @Test
    public void testAddLongF() {
       // long result = basicCalculator.add(10000000, 240000000);
        Assert.assertFalse("Message in case of failure", basicCalculator.add(10000000, 240000000)!=250000000);
    }


    @Test
    public void testSubstractInt() {
        Integer result = basicCalculator.substract(3, 2);
        Assert.assertNotEquals("Message in case of failure", (Integer) 2, result);
    }

    @Test
    public void testSubstractIntF() {
        Assert.assertNotNull("Message in case of failure", basicCalculator);
    }




    @Test
    public void testSubstractDouble() {
        Double result = basicCalculator.substract(2.5, 2);
        Assert.assertEquals("Message in case of failure", (Double) 0.5, result);

    }

    @Test
    public void testSubstractDoubleF() {
        ///CalculatorBasic basicCalculator = new CalculatorBasic();
        Double result = basicCalculator.substract(2.5, 2);
        Assert.assertFalse("Message in case of failure", result == 2);

    }

    @Test
    public void testSubstractLong() {
        long result = basicCalculator.substract(240000000, 10000000);
        Assert.assertEquals("Message in case of failure", (long) 230000000, result);
    }

    @Test
    public void testSubstractLongF() {
        long result = basicCalculator.substract(240000000, 10000000);
        Assert.assertNotEquals("Message in case of failure", (long) 240000000, result);
    }

    //multiply
    @Test
    public void testMultiplyInt() {
        Integer result = basicCalculator.multiply(3, 2);
        Assert.assertEquals("Message in case of failure", (Integer) 6, result);
    }

    @Test
    public void testMultiplyIntF() {
        Integer result = basicCalculator.multiply(3, 2);
        Assert.assertNotNull("message-not null", result);
    }

    @Test
    public void testMultiplyDouble() {

        CalculatorBasic basicCalculator = new CalculatorBasic();
        Double result = basicCalculator.multiply(2.5, 2.5);
        Assert.assertEquals("Message in case of failure", (Double)6.25, result);
    }

    @Test
    public void testMultiplyDoubleF() {

        CalculatorBasic basicCalculator = new CalculatorBasic();
        Double result = basicCalculator.multiply(2.5, 2.5);
        Assert.assertTrue("Message in case of failure", (Double)6.25!=result);
    }

    @Test
    public void testMultiplyLong() {
        long result = basicCalculator.multiply(24000000, 10);
        Assert.assertEquals("Message in case of failure", (long) 240000000, result);
    }

    @Test
    public void testMultiplyLongF() {
        long result = basicCalculator.multiply(24000000, 10);
        Assert.assertNotEquals("Message in case of failure", (long) 24000000, result);
    }

    //divide
    @Test
    public void testDivideInt() {
        Integer result = basicCalculator.divide(2, 2);
        Assert.assertEquals("Message in case of failure", (Integer) 1, result);
    }
 //divide negative test
    @Test
    public void testDivideIntF() {

        Integer result = basicCalculator.divide(3, 2);
        Assert.assertNotEquals("The result isn't integer", (Double) 1.0, result);
    }

    @Test
    public void testDivideDoubleF() {

        CalculatorBasic basicCalculator = new CalculatorBasic();
        Double result = basicCalculator.divide(3.1, 2);
        Assert.assertTrue("Message in case of failure", result==1.55);
    }

    @Test
    public void testDivideDouble() {

        Double result = basicCalculator.divide(3.1, 2);
        Assert.assertEquals("Message in case of failure", (Double)1.55, result);
    }


    @Test
    public void testDivideLong() {

        long result = basicCalculator.divide(24000000, 10);
        Assert.assertEquals("Message in case of failure", (long) 2400000, result);
    }

    @Test
    public void testDivideLongF() {

        long result = basicCalculator.divide(24000000, 10);
        Assert.assertNotEquals("Message in case of failure", (long) 200000, result);
    }

}