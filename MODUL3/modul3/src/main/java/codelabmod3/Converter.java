package codelabmod3;

public class Converter {
    protected double setValueToM(double value) {
        return value * 0.9144;
    }

    protected double setValueToCM(double value) {
        return value * 91.44;
    }

    protected double setValueToFeet(double value) {
        return value * 3;
    }

    protected double setValueToMiles(double value) {
        return value / 0.000568182;
    }
}