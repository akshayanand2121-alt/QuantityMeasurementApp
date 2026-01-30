package com.apps.quantityMeasurement;
import java.util.Objects;

public class QuantityMeasurementApp {


    public static class Feet {

        private final double feet;

        public Feet(double feet) {
            this.feet = feet;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass()) return false;
            Feet feet1 = (Feet) o;
            return Double.compare(feet, feet1.feet) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(feet);
        }

        @Override
        public String toString() {
            return "Feet{" + "feet=" + feet + '}';
        }
    }

    public static void main(String[] args) {
        Feet f1 = new Feet(4.0);
        Feet f2 = new Feet(7.0);
        Feet f3 = new Feet(4.0);
        System.out.println("F1 is equals to F2:"+f1.equals(f2));
        System.out.println("F1 is equals to F3:"+f1.equals(f3));


    }
}
