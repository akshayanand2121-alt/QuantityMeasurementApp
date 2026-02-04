package com.apps.quantityMeasurement;

import static com.apps.quantityMeasurement.Length.*;


public class QuantityMeasurementApp {

    public static void demonstrateFeetAndInchesEquality() {
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(12.0, Length.LengthUnit.INCHES);
        System.out.println("Are lengths equal for Feet And Inches Equalty? " + length1.equals(length2)); // Should print true
    }

    public static void demonstrateFeetEquality() {
        Length length1 = new Length(12.0, Length.LengthUnit.FEET);
        Length length2 = new Length(12.0, Length.LengthUnit.FEET);
        System.out.println("Are lengths equal for Feet Equality? " + length1.equals(length2));
    }


    public static void demonstrateInchesEquality() {
        Length length1 = new Length(12.0, Length.LengthUnit.INCHES);
        Length length2 = new Length(12.0, Length.LengthUnit.INCHES);
        System.out.println("Are lengths equal for Inches Equality? " + length1.equals(length2));
    }

    public static void main(String[] args) {

//        demonstrateFeetEquality();
//        demonstrateInchesEquality();
//        demonstrateFeetAndInchesEquality();

        // Demonstrate Yard and Yard comparison
        demonstrateLengthComparison(1.0, LengthUnit.YARDS, 1.0, LengthUnit.YARDS);

        // Demonstrate Yards and Inches comparison
        demonstrateLengthComparison(1.0, Length.LengthUnit.YARDS, 36.0, Length.LengthUnit.INCHES);

        // Demonstrate Feet and Yards comparison
        demonstrateLengthComparison(3.0, Length.LengthUnit.FEET, 1.0, Length.LengthUnit.YARDS);

        // Demonstrate Feet and Inches comparison
        demonstrateLengthComparison(1.0, Length.LengthUnit.FEET, 12.0, Length.LengthUnit.INCHES);

        // Demonstrate Centimeters and Inches comparison
        demonstrateLengthComparison(100.0, Length.LengthUnit.CENTIMETERS, 39.3701, Length.LengthUnit.INCHES);

        // Demonstrate Centimeters and Feet comparison
        demonstrateLengthComparison(30.48, Length.LengthUnit.CENTIMETERS, 1.0, Length.LengthUnit.FEET);


        // Demonstrate Centimeters and Centimeters comparison
        demonstrateLengthComparison(30.48, Length.LengthUnit.CENTIMETERS, 30.48, LengthUnit.CENTIMETERS);

    }

    private static void demonstrateLengthComparison(double v, LengthUnit lengthUnit, double v1, LengthUnit lengthUnit1) {
        if (lengthUnit != null && lengthUnit1 != null) {
            boolean status = (new Length(v, lengthUnit).equals(new Length(v1, lengthUnit1))) ? true : false;
            System.out.println("Equality status for " + v + " " + lengthUnit + " and " + v1+ " " + lengthUnit1 + " : " + status);
        }
    }
}

