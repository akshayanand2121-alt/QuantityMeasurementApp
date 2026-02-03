package com.apps.quantityMeasurementApp.Test;

import com.apps.quantityMeasurement.Length;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality_SameValue() {
        Length oneFeet = new Length(1.0, Length.LengthUnit.FEET);
        Length anotherFeet = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(oneFeet, anotherFeet);
    }

    @Test
    public void testInchesEquality_SameValue() {
        Length oneFeet = new Length(1.0, Length.LengthUnit.INCHES);
        Length anotherFeet = new Length(1.0, Length.LengthUnit.INCHES);
        assertEquals(oneFeet, anotherFeet);
    }


    @Test
    public void testFeetEquality_NullComparison() {
        Length oneFeet = new Length(1.0, Length.LengthUnit.FEET);
        assertNotEquals(null, oneFeet);
    }

    @Test
    public void testInchToFeetEquality_EquivalentValue() {
        Length oneFeet = new Length(12.0, Length.LengthUnit.INCHES);
        Length anotherFeet = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(oneFeet, anotherFeet);
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        Length oneFeet = new Length(1.0, Length.LengthUnit.FEET);
        Length anotherFeet = new Length(5.0, Length.LengthUnit.FEET);
        assertNotEquals(oneFeet, anotherFeet);
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        Length oneFeet = new Length(1.0, Length.LengthUnit.INCHES);
        Length anotherFeet = new Length(3.0, Length.LengthUnit.INCHES);
        assertNotEquals(oneFeet, anotherFeet);
    }

    @Test
    public void testEquality_InvalidUnit() {
        Length oneFeet = new Length(1.0, Length.LengthUnit.INCHES);
        String s = "Hello";
        assertNotEquals(s, oneFeet);
    }

    @Test
    public void testEquality_NullUnit() {
        try{
            Length nullLengthUnit= new Length(1.0,null);
            Length oneInches = new Length(99.0, Length.LengthUnit.INCHES);
            assertNotEquals(nullLengthUnit,oneInches);
        }catch (Exception e){
            assertNotNull(e);
        }
    }

    @Test
    public void testInchesEquality_SameReference() {
        Length oneInches = new Length(1.0, Length.LengthUnit.INCHES);
        assertEquals(oneInches, oneInches);
    }

    @Test
    public void testInchesEquality_NullComparison() {
        Length oneFeet = new Length(1.0, Length.LengthUnit.INCHES);
        assertNotEquals(null, oneFeet);
    }


}
