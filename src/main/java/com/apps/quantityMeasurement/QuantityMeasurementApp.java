package com.apps.quantityMeasurement;
import static com.apps.quantityMeasurement.Length.*;


public class QuantityMeasurementApp {

    public static void main(String[] args) {

        additionDemonstration(new Length(1, LengthUnit.FEET),new Length(12, Length.LengthUnit.INCHES));
        additionDemonstration(new Length(1, LengthUnit.FEET),new Length(2, Length.LengthUnit.INCHES));
        additionDemonstration(new Length(1, LengthUnit.FEET),new Length(12, Length.LengthUnit.INCHES));
        additionDemonstration(new Length(12, LengthUnit.FEET),new Length(1, Length.LengthUnit.INCHES));
        additionDemonstration(new Length(1, LengthUnit.FEET),new Length(3, Length.LengthUnit.INCHES));
        additionDemonstration(new Length(36, LengthUnit.FEET),new Length(1, Length.LengthUnit.INCHES));
        additionDemonstration(new Length(2.54, LengthUnit.FEET),new Length(1, Length.LengthUnit.INCHES));
        additionDemonstration(new Length(5, LengthUnit.FEET),new Length(0, Length.LengthUnit.INCHES));
        additionDemonstration(new Length(5, LengthUnit.FEET),new Length(-2.0, Length.LengthUnit.INCHES));



    }

    public static Length additionDemonstration(Length lengthOne, Length lengthTwo ) {
        Length result = Length.add(lengthOne,lengthTwo,lengthOne.getUnit());
        System.out.println("Addition of " + lengthOne.getValue() + " "+ lengthOne.getUnit() + " and " + lengthTwo.getValue() +" "+ lengthTwo.getUnit()+ " is " + result.getValue() + " "+result.getUnit());
        //  Length lengthResult = new Length(result,lengthOne.getUnit());
        return result;
    }
}