package com.apps.quantityMeasurement;

import java.util.Objects;

public class Length {

    private double value;
    private LengthUnit unit;

    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }

        public double toUnit(double value) {
            return value * conversionFactor;
        }
    }

    // Constructor to initialize length value and unit
    public Length(Double value, LengthUnit unit) {
//        if (value==null && unit== null){
//            System.out.println("Value cannot be null");
//        }
        this.value = value;
        this.unit = unit;
    }

    // Convert the length value to the base unit (inches)
    private double convertToBaseUnit() {
        return unit.toUnit(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Length)) return false;
        Length someObj = (Length) obj;
//        System.out.println(this.value + " both" + someObj.value);
//        System.out.println(this.convertToBaseUnit() + " both" + someObj.convertToBaseUnit());
        return Double.compare(this.convertToBaseUnit(), someObj.convertToBaseUnit()) == 0;

    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}