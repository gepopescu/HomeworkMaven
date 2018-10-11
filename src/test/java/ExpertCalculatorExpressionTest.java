import org.junit.Assert;
import org.junit.Test;

import java.awt.geom.Arc2D;

public class ExpertCalculatorExpressionTest {

    static public CalculatorExpert expertCalculator = new CalculatorExpert();

    @Test
    public void expressionTest(){
        Assert.assertNotNull(expertCalculator);
        Integer result = expertCalculator.add((Integer)3);
        Assert.assertEquals((Integer)3,result);
      //  Assert.assertTrue(conditie);
    }

    @Test
    public void callPoweEpertcalculator(){
        Integer result = expertCalculator.pow((Integer)2,(Integer)10);
        Assert.assertEquals((Integer)1024,result);
    }

    @Test
    public void callPoweEpertcalculatorF(){
        int result = expertCalculator.pow((Integer)2,(Integer)10);
        Assert.assertTrue( result == 1024 );
    }


    @Test
    public void callPoweEpertcalculatorDF() {
        Double result = expertCalculator.pow((Double)2.3,(Double)2.0);
        Assert.assertFalse( result!=5.289999999999999);

    }

    @Test
    public void callPoweEpertcalculatorD() {
        Double result = expertCalculator.pow((Double)2.3,(Double)2.0);
        Assert.assertTrue( result==5.289999999999999);

    }

    @Test
    public void callPoweEpertcalculatorL() {
        long result = expertCalculator.pow((long)200,(long)2);
        Assert.assertEquals((long)40000,result);

    }

    @Test
    public void callPoweEpertcalculatorLF() {
        long result = expertCalculator.pow((long)200,(long)2);
        Assert.assertNotEquals((long)4000,result);

    }

    @Test
    public void callRootEpertcalculator(){
        float result = expertCalculator.root((Integer)4);
        Assert.assertTrue(result ==2.0f);
    }

    @Test
    public void callRootEpertcalculatorF(){
        float result = expertCalculator.root((Integer)4);
        Assert.assertFalse(result !=2.0f);
    }

    @Test
    public void callFact1Epertcalculator(){
        Integer result = expertCalculator.fact1((Integer)4);
        Assert.assertTrue(result ==(2*3*4));
    }

    @Test
    public void callfact1EpertcalculatorF(){
        Integer result = expertCalculator.fact1((Integer)4);
        Assert.assertFalse(result ==2.0f);
    }

    @Test
    public void callExpresieplus(){
        Double result = expertCalculator.Expresie("2+3");
        Assert.assertTrue(result ==5);
    }

    @Test
    public void callExpresiesub(){
        Double result = expertCalculator.Expresie("2-3");
        Assert.assertTrue(result ==-1);
    }

    @Test
    public void callExpresiesop(){
        Double result = expertCalculator.Expresie("2-3+1*3");
        Assert.assertTrue(result ==2);
    }

    @Test
    public void callExpresiesopF(){
        Double result = expertCalculator.Expresie("2-3+1*3");
        Assert.assertFalse(result == 0);
    }

}
