package com.apps.quantityMeasurement;

import static com.apps.quantityMeasurement.Length.*;

public class QuantityMeasurementApp {

    public static void demonstrateFeetAndInchesEquality () {
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(12.0, Length.LengthUnit.INCHES);
        System.out.println("Are lengths equal for Feet And Inches Equalty? " + length1.equals(length2)); // Should print true
    }

    public static void demonstrateFeetEquality () {
        Length length1 = new Length(12.0, Length.LengthUnit.FEET);
        Length length2 = new Length(12.0, Length.LengthUnit.FEET);
        System.out.println("Are lengths equal for Feet Equality? " + length1.equals(length2));
    }


    public static void demonstrateInchesEquality () {
        Length length1 = new Length(12.0, Length.LengthUnit.INCHES);
        Length length2 = new Length(12.0, Length.LengthUnit.INCHES);
        System.out.println("Are lengths equal for Inches Equality? " + length1.equals(length2));
    }

    public static void main(String[] args) {

        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetAndInchesEquality();
    }
}