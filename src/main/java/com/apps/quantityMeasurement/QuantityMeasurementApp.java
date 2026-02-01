package com.apps.quantityMeasurement;

import java.util.Objects;

public class QuantityMeasurementApp {

    public static class Feet {

        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != this.getClass()) return false;
            Feet feet = (Feet) obj;

            return Double.compare(feet.value, value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }

        public double toInches() {
            return value * 12;
        }
    }

    public static class Inches {

        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Inches inches = (Inches) o;
            return Double.compare(value, inches.value) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(value);
        }

        @Override
        public String toString() {
            return "Inches{" + "value=" + value + '}';
        }

        public double toInches() {
            return value;
        }

        static boolean compareInchesAndFeet(double feetValue, double inchValue) {
            Feet feet = new Feet(feetValue);
            Inches inches = new Inches(inchValue);
            return Double.compare(feet.toInches(), inches.toInches()) == 0;

        }
    }

    public static void demonstrateFeetEquality() {
        Feet feet = new Feet(7.0);
        Feet feet1 = new Feet(7.0);
        Feet feet2 = new Feet(8.0);

        System.out.println(feet.equals(feet1));
        System.out.println(feet1.equals(feet2));
    }

    public static void demonstrateInchesEquality(){

        System.out.println(Inches.compareInchesAndFeet(1.0, 24.0)+"nowwwww");

    }


    public static void main(String[] args) {

        QuantityMeasurementApp.demonstrateFeetEquality();
        QuantityMeasurementApp.demonstrateInchesEquality();

    }

}
