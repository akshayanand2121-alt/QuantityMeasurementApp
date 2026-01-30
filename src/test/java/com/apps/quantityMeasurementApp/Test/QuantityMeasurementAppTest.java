package com.apps.quantityMeasurementApp.Test;
import com.apps.quantityMeasurement.QuantityMeasurementApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality_SameValue() {

        QuantityMeasurementApp.Feet F1=new QuantityMeasurementApp.Feet(0.0);
        QuantityMeasurementApp.Feet F2=new QuantityMeasurementApp.Feet(0.0);
        Assertions.assertEquals(F1, F2, "Double values should be exactly equal");
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.Feet F1=new QuantityMeasurementApp.Feet(0.0);
        QuantityMeasurementApp.Feet F2=new QuantityMeasurementApp.Feet(8.0);
        Assertions.assertNotEquals(F1, F2, "Double values should be exactly equal");
    }

    @Test
    public void testFeetEquality_NullComparison() {
        QuantityMeasurementApp.Feet F1=new QuantityMeasurementApp.Feet(0.0);
        Assertions.assertNotEquals(null, F1);;
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        QuantityMeasurementApp.Feet F1=new QuantityMeasurementApp.Feet(0.0);
        QuantityMeasurementApp.Feet F2=new QuantityMeasurementApp.Feet(8);
        Assertions.assertNotEquals(F1, F2, "Double values should be exactly equal");
    }

    @Test
    public void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet F1=new QuantityMeasurementApp.Feet(0.0);
        Assertions.assertEquals(F1,F1 ,"Double values should be exactly equal");
    }

}
